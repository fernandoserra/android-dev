package com.program.codemobile.devapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.program.codemobile.devapplication.api.ApiClient;
import com.program.codemobile.devapplication.api.ApiInterface;
import com.program.codemobile.devapplication.api.Constants;
import com.program.codemobile.devapplication.model.CartListModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BagFragment extends Fragment {

    private static final String TAG = "BagFragment";

    RecyclerView recyclerView;
    RecyclerCartViewAdapter recyclerCartViewAdapter;
    private TextView countProduct;
    private TextView totalPrice;
    private LinearLayout showLinearMsg;
    private LinearLayout showOptionBuy;
    private ImageView showImg;
    private TextView showMsg;
    private Button buy;

    private String share_card_id;
    private String share_customer_id;


    public BagFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_bag, container, false);
        countProduct  =  (TextView) view.findViewById(R.id.countProduct);
        totalPrice    =  (TextView) view.findViewById(R.id.totalPrice);
        showLinearMsg =  (LinearLayout) view.findViewById(R.id.showLinearMsg);
        showOptionBuy =  (LinearLayout) view.findViewById(R.id.showOptionBuy);
        showMsg       =  (TextView) view.findViewById(R.id.showMsg);
        showImg       =  (ImageView) view.findViewById(R.id.showImgResp);
        buy           =  (Button) view.findViewById(R.id.buy);

        ((MainActivity) getActivity()).hideFloatingActionButton();

        share_card_id     =SharedPrefManager.getInstance(getContext()).getCardID();
        share_customer_id =SharedPrefManager.getInstance(getContext()).getCustomeID();
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_cart_product);
        ApiInterface apiInterface =  ApiClient.getClient(Constants.ROOT_URL_CART).create(ApiInterface.class);
        Call<CartListModel> call = apiInterface.listCart(share_card_id,share_customer_id);
        call.enqueue(new Callback<CartListModel>() {
            @Override
            public void onResponse(Call<CartListModel> call, Response<CartListModel> response) {
                Log.i(TAG,"url consultando" + response.raw().request().url());
                Log.i(TAG,"response.code() : " + response.code() );
                if(response.code()!=200){
                    showImg.setImageDrawable(getResources().getDrawable(R.drawable.bagempty));
                    showMsg.setText("Tu bolsa está vacia");
                    showOptionBuy.setVisibility(View.GONE);
                }else{
                    CartListModel cartListModel =response.body();
                    Log.i(TAG,"Response: " + response.body());
                    Log.i(TAG,"Response cartListModel: " + cartListModel.toString());
                    RecyclerView.LayoutManager recyclerViewLayoutManager = new LinearLayoutManager(getContext());
                    recyclerView.setLayoutManager(recyclerViewLayoutManager);
                    recyclerCartViewAdapter= new RecyclerCartViewAdapter(getContext(),cartListModel.getProducts());
                    countProduct.setText(recyclerCartViewAdapter.getItemCount() + " productos");
                    Log.i(TAG,"Total: " + recyclerCartViewAdapter.getTotalPrice() );
                    recyclerView.setAdapter(recyclerCartViewAdapter);
                    totalPrice.setText("$ "+ recyclerCartViewAdapter.getTotalPrice() );
                }
            }

            @Override
            public void onFailure(Call<CartListModel> call, Throwable t) {

            }
        });


        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPrefManager.getInstance(getContext()).clearSharedPreferences();
                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                Fragment myFragment        = new SuccessFragment();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.content_main, myFragment).addToBackStack(null).commit();
            }
        });
        return view;
    }
    @Override
    public void onStop() {
        super.onStop();
        ((MainActivity) getActivity()).showFloatingActionButton();
    }

}