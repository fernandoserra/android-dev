package com.program.codemobile.devapplication;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.program.codemobile.devapplication.api.ApiClient;
import com.program.codemobile.devapplication.api.ApiInterface;
import com.program.codemobile.devapplication.api.Constants;
import com.program.codemobile.devapplication.model.CartCreateModel;
import com.program.codemobile.devapplication.model.CartInserModel;
import com.program.codemobile.devapplication.model.CartInsertProduct;
import com.program.codemobile.devapplication.model.CartResponseModel;
import com.program.codemobile.devapplication.model.MyPojo;

import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProductDetailFragment extends Fragment {

    private static final String TAG ="ProductDetailFragment";
    Button addBag;
    TextView name;
    private String sku;
    private String namePro;
    private String uniqueID;
    private String pricePro;

    RecyclerView recyclerView;
    RecyclerAttributesViewAdapter recyclerAttributesViewAdapter;

    public ProductDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            sku     = getArguments().getString("sku");
            namePro = getArguments().getString("namePro");
            uniqueID= getArguments().getString("uniqueID");
            pricePro= getArguments().getString("pricePro");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_product_detail, container, false);
        addBag  =(Button) view.findViewById(R.id.addBag);
        name    =(TextView) view.findViewById(R.id.name);
        addBag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addBagApp(uniqueID,sku,namePro,pricePro);
            }
        });


        final ViewPager viewPager = view.findViewById(R.id.view_pager);

        final ProgressDialog progressDialog = new ProgressDialog(getContext());
        progressDialog.setTitle(R.string.app_name);
        progressDialog.setMessage("Loading...");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.show(); // Display Progress Dialog
        progressDialog.setCancelable(false);
        Log.i(TAG,"Buscando SKU: " + sku );
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_detail_product);
        ApiInterface apiInterface =  ApiClient.getClient(Constants.ROOT_URL).create(ApiInterface.class);
        Call<MyPojo> call = apiInterface.products(sku);
        call.enqueue(new Callback<MyPojo>() {
            @Override
            public void onResponse(Call<MyPojo> call, Response<MyPojo> response) {
                Log.i(TAG,"Response: " + response.body().toString() );
                MyPojo myPojo =response.body();
                name.setText(myPojo.getName());
                Log.i(TAG,"myPojo.getName() : " + myPojo.getImages().length );
                Log.i(TAG,"myPojo.getAttributes() : " + myPojo.getAttributes().length);
                RecyclerView.LayoutManager recyclerViewLayoutManager = new LinearLayoutManager(getContext());
                recyclerView.setLayoutManager(recyclerViewLayoutManager);
                recyclerAttributesViewAdapter= new RecyclerAttributesViewAdapter(getContext(),myPojo.getAttributes());
                recyclerView.setAdapter(recyclerAttributesViewAdapter);
                ViewPagerAdapter adapter = new ViewPagerAdapter(getContext(),  myPojo.getImages());
                viewPager.setAdapter(adapter);
                progressDialog.dismiss();
            }

            @Override
            public void onFailure(Call<MyPojo> call, Throwable t) {
                Log.i(TAG,"Error: " + t.toString());
            }
        });

        return view;
    }

    private void addBagApp(final String uniqueID, final String sku, final String namePro, final String pricePro) {
        Log.i(TAG,"Ejecutando Metodo addBagApp() " + uniqueID);
        final String share_card_id     =SharedPrefManager.getInstance(getContext()).getCardID();
        final String share_customer_id =SharedPrefManager.getInstance(getContext()).getCustomeID();
        if( (share_card_id==null) || (share_customer_id==null)){
            Log.i(TAG,"No tiene bolsa creada");

            CartCreateModel cartCreateModel = new CartCreateModel(uniqueID);
            ApiInterface apiInterface =  ApiClient.getClient(Constants.ROOT_URL_CART).create(ApiInterface.class);
            Call<CartResponseModel> call = apiInterface.newCart(cartCreateModel);
            call.enqueue(new Callback<CartResponseModel>() {
                @Override
                public void onResponse(Call<CartResponseModel> call, Response<CartResponseModel> response) {
                    CartResponseModel cartNewModel= response.body();
                    if(response.code()!=200){
                        Toast.makeText(getContext(), "Error", Toast.LENGTH_SHORT).show();
                    }else{
                        Log.i(TAG,"Response body(): " +  response.code());
                        Log.i(TAG,"Response body(): " +  response.body());
                        Log.i(TAG,"cartNewModel.toString(): " +  cartNewModel.toString());
                        Log.i(TAG,"Response body(): " +  response.raw().request().url());
                        Log.i(TAG,"cartNewModel.getCart_id(): " +  cartNewModel.getCart_id());
                        Log.i(TAG,"cartNewModel.getCustomer_id(): " +  cartNewModel.getCustomer_id());
                        SharedPrefManager.getInstance(getContext()).storeCard(cartNewModel.getCart_id(),cartNewModel.getCustomer_id());
                        insertProduct(cartNewModel.getCart_id(), cartNewModel.getCustomer_id(), uniqueID ,sku ,namePro,pricePro);
                    }

                }
                @Override
                public void onFailure(Call<CartResponseModel> call, Throwable t) {
                    Log.i(TAG,"Error al crear el cart: " + t.toString());
                }
            });

        }else{
            Log.i(TAG,"Si Tiene una bolsa creada");
            insertProduct(share_card_id, share_customer_id, uniqueID,sku,namePro,pricePro);
        }
    }

    public void insertProduct(String cart_id,String customer_id, String uniqueID, String sku, String namePro, String pricePro){
        CartInsertProduct cartInsertProduct= new CartInsertProduct(pricePro,0,0,namePro,0,sku);
        List<CartInsertProduct> cartProductList = new ArrayList<>();
        cartProductList.add(cartInsertProduct);

        CartInserModel cartInserModel = new CartInserModel(customer_id,cart_id, cartProductList);
        ApiInterface apiInterface =  ApiClient.getClient(Constants.ROOT_URL_CART).create(ApiInterface.class);
        Call<ResponseBody> call = apiInterface.insertCart(cartInserModel);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                Log.i(TAG,"Response url():  " +  response.raw().request().url());
                Log.i(TAG,"Response code(): " +  response.code());
                Log.i(TAG,"Response body(): " +  response.body());
                if(response.code()==200){
                    Toast.makeText(getContext(), "Se agrego el producto a la bolsa", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getContext(), "Error al agregar el producto a la bolsa", Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.i(TAG,"Error : " + t.toString());
            }
        });
    }

}