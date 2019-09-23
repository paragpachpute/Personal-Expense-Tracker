package com.coditsuisse.team29.expensetracker;

/**
 * Created by Pranay on 9/11/2015.
 */
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Edwin on 15/02/2015.
 */
public class Tab2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.tab_2,container,false);
        final Context context = getActivity();
        Button b = (Button)v.findViewById(R.id.button_viewIncomeSourrce);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(context, ViewIncomeSourceActivity.class);
                startActivity(in);
                //(Activity)context.overridePendingTransition(R.anim.push_up_in, R.anim.push_up_out);
            }
        });
        FloatingActionButton fab = (FloatingActionButton) v.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Snackbar.make(v,"Floating button",Snackbar.LENGTH_SHORT).show();
                Snackbar.make(v, "", Snackbar.LENGTH_SHORT).setAction("Add Budget", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent in = new Intent(context, AddBudgetActivity.class);
                        startActivity(in);
                    }
                }).show();

            }
        });
        return v;
    }

}
