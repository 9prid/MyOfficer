package com.example.prid.myofficer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by vcb on 3/19/2017.
 */

public class MyAdaper extends BaseAdapter{

    private Context context;
    private String[] nameStrings, imageStrings;
    private ImageView imageView;
    private TextView textView;

    public MyAdaper(Context context,
                    String[] nameStrings,
                    String[] imageStrings) {
        this.context = context;
        this.nameStrings = nameStrings;
        this.imageStrings = imageStrings;
    }

    @Override
    public int getCount() {
        return nameStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.my_listview, viewGroup, false);
        imageView = (ImageView) view1.findViewById(R.id.imvIcon);
        textView = (TextView) view1.findViewById(R.id.txtOfficer);

        textView.setText(nameStrings[i]);

        Picasso.with(context).load(imageStrings[i]).into(imageView);


        return null;
    }
}   //Main Class
