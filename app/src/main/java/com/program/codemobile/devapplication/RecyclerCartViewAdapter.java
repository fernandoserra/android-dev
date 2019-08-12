package com.program.codemobile.devapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.program.codemobile.devapplication.model.CartProduct;
import com.squareup.picasso.Picasso;

import java.util.List;

public class RecyclerCartViewAdapter extends RecyclerView.Adapter<RecyclerCartViewAdapter.ViewHolder> {

    private static final String TAG = "RecyclerCart";
    private Context context;
    List<CartProduct> cartProductList;

    private Double totalPrice=0.0;

    public RecyclerCartViewAdapter(Context context, List<CartProduct> cartProductList) {
        this.context = context;
        this.cartProductList = cartProductList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view1 = LayoutInflater.from(context).inflate(R.layout.cart_recycler_view,parent,false);
        RecyclerCartViewAdapter.ViewHolder viewHolder1 = new RecyclerCartViewAdapter.ViewHolder(view1);
        return viewHolder1;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.nameProduct.setText(cartProductList.get(i).getDescription());
        viewHolder.showSKU.setText(cartProductList.get(i).getSku());
        viewHolder.showPrice.setText("$" + cartProductList.get(i).getPrice());
        Picasso.with(context).load("https://home.ripley.cl/minisitios/ban_cont/home_icono_tienda.png").into(viewHolder.showImagen);
        totalPrice=totalPrice+Double.valueOf(cartProductList.get(i).getPrice());
    }

    @Override
    public int getItemCount() {
        return cartProductList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView nameProduct;
        private TextView showSKU;
        private TextView showPrice;
        private ImageView showImagen;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nameProduct =(TextView) itemView.findViewById(R.id.nameProduct);
            showSKU     =(TextView) itemView.findViewById(R.id.showSKU);
            showPrice   =(TextView) itemView.findViewById(R.id.showPrice);
            showImagen  =(ImageView) itemView.findViewById(R.id.showImagen);
        }
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
