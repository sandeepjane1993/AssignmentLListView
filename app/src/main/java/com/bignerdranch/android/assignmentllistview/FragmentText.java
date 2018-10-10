package com.bignerdranch.android.assignmentllistview;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentText extends Fragment {

    TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.text,container,false);

        textView = view.findViewById(R.id.textView2);

        Bundle bundle = getArguments();
        String data = bundle.getString("key");
        textView.setText(data);
        return view;
    }
}
