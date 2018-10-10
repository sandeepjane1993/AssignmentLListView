package com.bignerdranch.android.assignmentllistview;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class FragmentImage extends Fragment {

    int[] Images = {R.drawable.cupcake, R.drawable.donut, R.drawable.eclair, R.drawable.froyo};
    ImageView imageView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.image,container,false);
        imageView = view.findViewById(R.id.imageView2);

        Bundle bundle = getArguments();
        int position = bundle.getInt("key");
        imageView.setImageResource(Images[position]);

        return view;
    }
}
