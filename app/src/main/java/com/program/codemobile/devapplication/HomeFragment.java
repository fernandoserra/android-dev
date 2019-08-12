package com.program.codemobile.devapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.program.codemobile.devapplication.model.ProductModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private static final String TAG="HomeFragment";
    private Button linkDemo;

    RecyclerView recyclerView;
    RecyclerProductViewAdapter recyclerProductViewAdapter;
    List<ProductModel> productModels;

    public HomeFragment() {
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
        View view = inflater.inflate(R.layout.fragment_home, container, false);


        productModels = new ArrayList<>();
        //Electro
        ProductModel productModel1 = new ProductModel("LED 4K Ultra HD Smart TV","https://home.ripley.cl/store/Attachment/WOP/D171/2000371667503/2000371667503_2.jpg",279990,209990,"electro","2000371667503P","11223950");
        productModels.add(productModel1);
        ProductModel productModel2 = new ProductModel("Lavadora carga superior 15 kilos","https://home.ripley.cl/store/Attachment/WOP/D136/2000351773811/2000351773811_2.jpg",339990,229990,"electro","2000351773811P","1190613");
        productModels.add(productModel2);
        ProductModel productModel3 = new ProductModel("Robot aspirador","https://home.ripley.cl/store/Attachment/WOP/D122/2000369109855/2000369109855_2.jpg",399990,194990,"electro","2000369109855P","9334029");
        productModels.add(productModel3);
        ProductModel productModel4 = new ProductModel("Extractor de jugo","https://home.ripley.cl/store/Attachment/WOP/D122/2000366737198/2000366737198_2.jpg",199990,59990,"electro","2000366737198P","5538059");
        productModels.add(productModel4);
        ProductModel productModel5 = new ProductModel("Máquina de Coser","https://home.ripley.cl/store/Attachment/WOP/D122/2000372411631/2000372411631_2.jpg",249990,169990,"electro","2000372411631P","11780619");
        productModels.add(productModel5);

        //tecno
        ProductModel productModel6 = new ProductModel("Cámara réflex 18-55mm 18MP","https://home.ripley.cl/store/Attachment/WOP/D126/2000359329935/2000359329935_2.jpg",399990,379990,"tecno","2000359329935P","2077501");
        productModels.add(productModel6);
        ProductModel productModel7 = new ProductModel("Consola PS4 Bundle","https://home.ripley.cl/store/Attachment/WOP/D172/2000375421729/2000375421729_2.jpg",279990,229990,"tecno","2000375421729P","13486166");
        productModels.add(productModel7);
        ProductModel productModel8 = new ProductModel("ACER NITRO 5 AN515-42-R4KY","https://home.ripley.cl/store/Attachment/WOP/D113/2000372107077/2000372107077_2.jpg",599990,549990,"tecno","2000375421729P","13486166");
        productModels.add(productModel8);
        ProductModel productModel9 = new ProductModel("CAMARA GOPRO HERO7 BLACK","https://home.ripley.cl/store/Attachment/WOP/D126/2000371958953/2000371958953_2.jpg",349990,249990,"tecno","2000371958953P","11446224");
        productModels.add(productModel9);
        ProductModel productModel10 = new ProductModel("HUAWEI MATE 20","https://home.ripley.cl/store/Attachment/WOP/D191/2000373857964/2000373857964_2.jpg",169990,149990,"tecno","2000373857964P","12264501");
        productModels.add(productModel10);

        //decohogar
        ProductModel productModel11 = new ProductModel("JUEGO DE COMEDOR RIPLEY","https://home.ripley.cl/store/Attachment/WOP/D359/2000371827983/2000371827983_2.jpg",349990,249990,"decohogar","2000371827983P","12431080");
        productModels.add(productModel11);
        ProductModel productModel12 = new ProductModel("JUEGO DE CUBIERTOS","https://home.ripley.cl/store/Attachment/WOP/D361/2000374299572/2000374299572_2.jpg",16990,9990,"decohogar","2000374299572P","12773851");
        productModels.add(productModel12);
        ProductModel productModel13 = new ProductModel("ALFOMBRA DIB","https://home.ripley.cl/store/Attachment/WOP/D102/2000374310932/2000374310932_2.jpg",231990,79990,"decohogar","2000374310932P","12734724");
        productModels.add(productModel13);
        ProductModel productModel14 = new ProductModel("SET 2 MALETAS CAMBRIDGE","https://home.ripley.cl/store/Attachment/WOP/D369/2000368425048/2000368425048_2.jpg",129990,129990,"decohogar","2000368425048P","9322533");
        productModels.add(productModel14);
        ProductModel productModel15 = new ProductModel("CUADROS DECORATIVOS RIPLEY","https://home.ripley.cl/store/Attachment/WOP/D367/2000371915604/2000371915604_2.jpg",26990,21990,"decohogar","2000371915604P","12409117");
        productModels.add(productModel15);

        //deporte
        ProductModel productModel16 = new ProductModel("BICICLETA TREK MARLIN 5","https://home.ripley.cl/store/Attachment/WOP/D192/2000369989594/2000369989594_2.jpg",379990,289990,"deporte","2000369989594P","10128017");
        productModels.add(productModel16);
        ProductModel productModel17 = new ProductModel("SCOOTER ELECTRICO","http://ripleycl.imgix.net/https%3A%2F%2Fripley-prod.mirakl.net%2Fmmp%2Fmedia%2Fproduct-media%2F58911%2FFalabella%25201.jpg?w=750&h=555&ch=Width&auto=format&cs=strip&bg=FFFFFF&q=60&trimcolor=FFFFFF&trim=color&fit=fillmax&ixlib=js-1.1.0&s=fb80d9cbd5408cf0615a71e550fdbcdd",329990,309990,"deporte","MPM00002006512","11768504");
        productModels.add(productModel17);
        ProductModel productModel18 = new ProductModel("BICICLETA ESTÁTICA","https://home.ripley.cl/store/Attachment/WOP/D192/2000335659285/2000335659285_2.jpg",99990,89990,"deporte","2000335659285P","320034");
        productModels.add(productModel18);
        ProductModel productModel19 = new ProductModel("CARPA NATIONAL GEOGRAPHIC","https://home.ripley.cl/store/Attachment/WOP/D170/2000327637482/2000327637482_2.jpg",89990,54990,"deporte","2000327637482P","493501");
        productModels.add(productModel19);
        ProductModel productModel20 = new ProductModel("TROTADORA ELECTRICA","http://ripleycl.imgix.net/http%3A%2F%2Fs3.amazonaws.com%2Fimagenes-sellers-mercado-ripley%2F2019%2F07%2F22094411%2FARC-3421A.jpg?w=750&h=555&ch=Width&auto=format&cs=strip&bg=FFFFFF&q=60&trimcolor=FFFFFF&trim=color&fit=fillmax&ixlib=js-1.1.0&s=2a5ae55b9f8903faa978d95d2a3aecfe",329990,179990,"deporte","MPM00001075806","10144001");
        productModels.add(productModel20);

        //moda
        ProductModel productModel21 = new ProductModel("PARKA TATIENNE","https://home.ripley.cl/store/Attachment/WOP/D321/2000370840310/2000370840310_2.jpg",39990,16990,"moda","2000370840266","11755568");
        productModels.add(productModel21);
        ProductModel productModel22 = new ProductModel("PARKA","https://home.ripley.cl/store/Attachment/WOP/D129/2000371979576/2000371979576_2.jpg",34990,12990,"moda","2000371979422","11986727");
        productModels.add(productModel22);
        ProductModel productModel23 = new ProductModel("SWEATER SFERA","https://home.ripley.cl/store/Attachment/WOP/D388/2000373199514/2000373199514_2.jpg",14990,5990,"moda","2000373199514","13111833");
        productModels.add(productModel23);
        ProductModel productModel24 = new ProductModel("SWEATER CACHAREL","https://home.ripley.cl/store/Attachment/WOP/D320/2000373423961/2000373423961_2.jpg",21990,16990,"moda","2000373423879","13165378");
        productModels.add(productModel24);
        ProductModel productModel25 = new ProductModel("PIJAMA INDEX","https://home.ripley.cl/store/Attachment/WOP/D134/2000372471772/2000372471772_2.jpg",19990,4990,"moda","2000372471789","12647300");
        productModels.add(productModel25);

        //TODO Delete
        ArrayList<ProductModel> resultArrayList = new ArrayList<>();
        for(ProductModel searchItemMasterObj : productModels) {
            if(searchItemMasterObj.getCategory().contains("electro") || searchItemMasterObj.getCategory().contains("moda") ) {
                resultArrayList.add(searchItemMasterObj);
            }
        }

        Log.i(TAG,"resultArrayList cantidad: " + resultArrayList.size() );

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view1);
        RecyclerView.LayoutManager recyclerViewLayoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);
        recyclerProductViewAdapter= new RecyclerProductViewAdapter(productModels,getContext());
        recyclerView.setAdapter(recyclerProductViewAdapter);

        return  view;
    }

}