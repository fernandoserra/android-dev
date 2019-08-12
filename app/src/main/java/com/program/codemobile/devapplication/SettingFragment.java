package com.program.codemobile.devapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Locale;

public class SettingFragment extends Fragment {

    private static final String TAG = "SettingFragment";
    private TextView showLG;
    Locale myLocale;

    public SettingFragment() {
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
        View view= inflater.inflate(R.layout.fragment_setting, container, false);
        showLG =(TextView) view.findViewById(R.id.showLG);
        showLG.setText(Locale.getDefault().getDisplayLanguage());
        return view;
    }

}