package com.program.codemobile.devapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.program.codemobile.devapplication.model.ProductModel;
import com.squareup.picasso.Picasso;

import java.util.List;

public class RecyclerProductViewAdapter extends RecyclerView.Adapter<RecyclerProductViewAdapter.ViewHolder>{

    private static final String TAG = "RecyclerProduct";

    private Context context1;
    List<ProductModel> productModels;

    public RecyclerProductViewAdapter(List<ProductModel> productModels, Context context1) {
        this.productModels = productModels;
        this.context1 = context1;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view1 = LayoutInflater.from(context1).inflate(R.layout.recycler_view_items,parent,false);
        ViewHolder viewHolder1 = new ViewHolder(view1);
        return viewHolder1;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder,  int i) {
        Log.i(TAG,"Ejecutando RecyclerProductViewAdapter  " + productModels.get(i).getThumbnailImage());
        Picasso.with(context1).load(productModels.get(i).getThumbnailImage()).into(viewHolder.showImage);

        viewHolder.textView.setText(productModels.get(i).getName());
        final  double price= productModels.get(i).getPriceCardPrice();
        viewHolder.showPriceProduct.setText("$ " + price );
        final String sku      = productModels.get(i).getSku();
        final String namePro  = productModels.get(i).getName();
        final String uniqueID = productModels.get(i).getUniqueID();
        final String pricePro = String.valueOf((int)productModels.get(i).getPriceListPrice());
        Log.i(TAG,"pricePro pricePro:::" + pricePro);
        viewHolder.cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG,"Se presiona el producto");
                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                Fragment myFragment        = new ProductDetailFragment();
                Bundle bundle = new Bundle();
                bundle.putSerializable("sku"     ,  sku );
                bundle.putSerializable("namePro" ,  namePro );
                bundle.putSerializable("uniqueID",  uniqueID );
                bundle.putSerializable("pricePro",  pricePro );
                myFragment.setArguments(bundle);
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.content_main, myFragment).addToBackStack(null).commit();
            }
        });
    }

    @Override
    public int getItemCount() {
        //return values.length;
        return  productModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardview1;
        private TextView textView;
        private TextView showPriceProduct;
        private ImageView showImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardview1 = (CardView) itemView.findViewById(R.id.cardview1);
            textView  = (TextView) itemView.findViewById(R.id.textview1);
            showImage = (ImageView) itemView.findViewById(R.id.showImage);
            showPriceProduct =(TextView) itemView.findViewById(R.id.showPriceProduct);
        }
    }
}
