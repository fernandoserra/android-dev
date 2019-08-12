package com.program.codemobile.devapplication;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.program.codemobile.devapplication.model.Attributes;

public class RecyclerAttributesViewAdapter  extends RecyclerView.Adapter<RecyclerAttributesViewAdapter.ViewHolder>{

    private static final String TAG = "RecyclerAttribites";
    private Context context;
    private Attributes[] attributes;

    public RecyclerAttributesViewAdapter(Context context, Attributes[] attributes) {
        this.context = context;
        this.attributes = attributes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view1 = LayoutInflater.from(context).inflate(R.layout.recycler_detail_view,parent,false);
        RecyclerAttributesViewAdapter.ViewHolder viewHolder = new RecyclerAttributesViewAdapter.ViewHolder(view1);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.showAttributesName.setText(attributes[i].getName());
        viewHolder.showAttributesValue.setText(attributes[i].getValue());
        if((i % 2 == 0)){
            viewHolder.rowAttibutes.setBackgroundColor(Color.parseColor("#FFD6D6D6"));
        }else{
            viewHolder.rowAttibutes.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }
    }

    @Override
    public int getItemCount() {
        return attributes.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView showAttributesName;
        private TextView showAttributesValue;
        private RelativeLayout rowAttibutes;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            showAttributesName=(TextView) itemView.findViewById(R.id.showAttributesName);
            showAttributesValue=(TextView) itemView.findViewById(R.id.showAttributesValue);
            rowAttibutes=(RelativeLayout) itemView.findViewById(R.id.rowAttibutes);
        }
    }
}