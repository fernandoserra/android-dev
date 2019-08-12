package com.program.codemobile.devapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.DataHolder> {

    Context context;
    List<String> mData;

    public RecyclerAdapter(Context context, List<String> mData) {
        this.context = context;
        this.mData = mData;
    }

    @NonNull
    @Override
    public DataHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.navigation_recycler_view, parent, false);
        return new DataHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull DataHolder dataHolder, int i) {
        //dataHolder.country.setText(mData.get(position));
        dataHolder.nav.setText(mData.get(i));
    }

    @Override
    public int getItemCount() {
        return  mData.size();
    }

    public class DataHolder extends RecyclerView.ViewHolder {
        TextView nav;
        public DataHolder(@NonNull View itemView) {
            super(itemView);
            nav = (TextView) itemView.findViewById(R.id.nav);
        }
    }
}