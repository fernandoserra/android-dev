package com.program.codemobile.devapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class SuccessFragment extends Fragment {

    private ImageView showImgSu;
    private TextView showMsgSu;
    public SuccessFragment() {
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
        View view=  inflater.inflate(R.layout.fragment_success, container, false);
        ((MainActivity) getActivity()).hideFloatingActionButton();
        showImgSu =(ImageView) view.findViewById(R.id.showImgRespSu);
        showMsgSu =(TextView) view.findViewById(R.id.showMsgSu);
        showImgSu.setImageDrawable(getResources().getDrawable(R.drawable.success));
        showMsgSu.setText("¡Compra exitosa!");
        return view;
    }

    @Override
    public void onStop() {
        super.onStop();
        ((MainActivity) getActivity()).showFloatingActionButton();
    }
}