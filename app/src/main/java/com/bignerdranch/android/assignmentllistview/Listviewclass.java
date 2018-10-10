package com.bignerdranch.android.assignmentllistview;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class Listviewclass extends Fragment {

    String[] Versions = {"cupcake", "donut", "eclair", "froyo"};
    int[] Images = {R.drawable.cupcake, R.drawable.donut, R.drawable.eclair, R.drawable.froyo};

    ListView listView;
    CustomAdapter myCustomAdapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.listview_frag,container,false);

        listView = view.findViewById(R.id.myListView);
        myCustomAdapter = new CustomAdapter(Versions, Images, getActivity());
        listView.setAdapter(myCustomAdapter);
        return view;
    }
}
