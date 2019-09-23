package com.coditsuisse.team29.expensetracker;

/**
 * Created by Pranay on 9/11/2015.
 */
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.utils.PercentFormatter;
import com.github.mikephil.charting.data.Entry;

import java.util.ArrayList;

/**
 * Created by Edwin on 15/02/2015.
 */
public class Tab1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.tab_1,container,false);
        PieChart mChart = (PieChart)v.findViewById(R.id.piechart);
        //pi.setPinchZoom(true);
        mChart.setDrawHoleEnabled(true);
        mChart.setHoleColorTransparent(true);
       // mChart.setTransparentCircleColor(Color.WHITE);
        //mChart.setTransparentCircleAlpha(110);
        mChart.setHoleRadius(70f);
        mChart.setTransparentCircleRadius(0f);
        mChart.setDrawCenterText(true);
        mChart.setRotationAngle(0);
        mChart.setRotationEnabled(true);
        mChart.setCenterText("Summary");
        setData(3, 100, mChart);
        mChart.animateY(1500, Easing.EasingOption.EaseInOutQuad);
        return v;
    }
    private void setData(int count, float range, PieChart mChart) {

        float mult = range;
       // Typeface tf = Typeface.createFromAsset(getActivity().getAssets(), "OpenSans-Regular.ttf");

        ArrayList<Entry> yVals1 = new ArrayList<Entry>();

        // IMPORTANT: In a PieChart, no values (Entry) should have the same
        // xIndex (even if from different DataSets), since no values can be
        // drawn above each other.
        yVals1.add(new Entry((float)50, 0));
        yVals1.add(new Entry((float)20, 1));
        yVals1.add(new Entry((float)30, 2));

        ArrayList<String> xVals = new ArrayList<String>();
        xVals.add("Expenses");
        xVals.add("Liabalities");
        xVals.add("Savings");

        PieDataSet dataSet = new PieDataSet(yVals1, "     Current Status");
        dataSet.setValueTextColor(Color.WHITE);
        dataSet.setSliceSpace(3f);
        dataSet.setSelectionShift(5f);
        dataSet.setColor(Color.WHITE);



        // add a lot of colors

        ArrayList<Integer> colors = new ArrayList<Integer>();

        /*for (int c : ColorTemplate.VORDIPLOM_COLORS)
            colors.add(c);
*/
        /*for (int c : ColorTemplate.JOYFUL_COLORS)
            colors.add(c);*/

        /*for (int c : ColorTemplate.COLORFUL_COLORS)
            colors.add(c);*/

        /*for (int c : ColorTemplate.LIBERTY_COLORS)
            colors.add(c);*/

        /*for (int c : ColorTemplate.PASTEL_COLORS)
            colors.add(c);*/

        colors.add(Color.parseColor("#ad1457"));
        colors.add(Color.parseColor("#ec407a"));
        colors.add(Color.parseColor("#f48fb1"));

        colors.add(ColorTemplate.getHoloBlue());

        dataSet.setColors(colors);

        PieData data = new PieData(xVals, dataSet);
        data.setValueFormatter(new PercentFormatter());
        data.setValueTextSize(11f);
        data.setValueTextColor(Color.WHITE);
       // data.setValueTypeface(tf);
        mChart.setData(data);

        // undo all highlights
        mChart.highlightValues(null);

        mChart.invalidate();
    }


}
