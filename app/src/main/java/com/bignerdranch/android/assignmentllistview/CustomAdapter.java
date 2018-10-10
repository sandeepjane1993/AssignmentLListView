package com.bignerdranch.android.assignmentllistview;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    String[] Versions;
    int[] Images;
    Context ctx;
    ImageView iv;
    TextView tv;


    public CustomAdapter(String[] Versions, int[] Images, Context ctx) {
        this.Versions = Versions;
        this.Images = Images;
        this.ctx = ctx;
    }
    @Override
    public int getCount() {
        return Versions.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item_layout, null);
        iv = view.findViewById(R.id.imageView2);
        tv = view.findViewById(R.id.textView);

        iv.setImageResource(Images[position]);
        tv.setText(Versions[position]);

        Bundle bundle2 = new Bundle();
        bundle2.putInt("key", position);

        final FragmentImage fragment_img = new FragmentImage();

        fragment_img.setArguments(bundle2);

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) ctx).getFragmentManager().beginTransaction().replace(R.id.mymainLayout, fragment_img).addToBackStack(null).commit();
            }
        });

        Bundle bundle = new Bundle();
        bundle.putString("key", Versions[position]);

        final FragmentText fragment_text = new FragmentText();

        fragment_text.setArguments(bundle);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) ctx).getFragmentManager().beginTransaction().replace(R.id.mymainLayout, fragment_text).addToBackStack(null).commit();
            }
        });
        return view;


    }
}
