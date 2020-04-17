package com.wiser.smarttablayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TestFragment extends Fragment {
    public static final String PASS = "PASS";

    public static TestFragment getInstance(String test){
        TestFragment fragment = new TestFragment();
        Bundle bundle = new Bundle();
        bundle.putString(PASS,test);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test,container,false);
        TextView textView = view.findViewById(R.id.tv_content);
        textView.setText(getArguments() != null ? getArguments().getString(PASS) : "");
        return view;
    }
}
