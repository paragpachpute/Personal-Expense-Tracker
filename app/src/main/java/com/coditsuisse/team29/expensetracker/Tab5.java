package com.coditsuisse.team29.expensetracker;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * Created by Pranay on 9/12/2015.
 */
public class Tab5 extends Fragment {
    GridView gridView;
    ArrayList<Item> gridArray = new ArrayList<Item>();
    CustomGridViewAdapter customGridAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.tab_5, container, false);
        Bitmap homeIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.income);
        //Bitmap userIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.personal);

        gridArray.add(new Item(homeIcon,"Home"));
        gridArray.add(new Item(homeIcon,"User"));
        gridArray.add(new Item(homeIcon,"House"));
        gridArray.add(new Item(homeIcon,"Friend"));
        gridArray.add(new Item(homeIcon,"Home"));
        gridArray.add(new Item(homeIcon,"Personal"));
        gridArray.add(new Item(homeIcon,"Home"));
        gridArray.add(new Item(homeIcon,"User"));
        gridArray.add(new Item(homeIcon, "Building"));
        gridArray.add(new Item(homeIcon,"User"));
        gridArray.add(new Item(homeIcon,"Home"));
        gridArray.add(new Item(homeIcon,"xyz"));

        gridView = (GridView) v.findViewById(R.id.gridView1);
        customGridAdapter = new CustomGridViewAdapter(getActivity(), R.layout.row_grid, gridArray);
        gridView.setAdapter(customGridAdapter);
        return v;
    }
}
