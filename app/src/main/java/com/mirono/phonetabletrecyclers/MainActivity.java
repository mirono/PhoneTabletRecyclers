package com.mirono.phonetabletrecyclers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView phoneRecyclerView;
    RecyclerView tabletRightRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phoneRecyclerView = (RecyclerView) findViewById(R.id.phone_recycler_view);
        phoneRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        if(!isTablet()) {
            phoneRecyclerView.setAdapter(new PhoneRecyclerViewAdapter());
        } else {
            phoneRecyclerView.setAdapter(new TypeARecyclerViewAdapter());
            tabletRightRecyclerView = (RecyclerView) findViewById(R.id.right_recycler_view);
            tabletRightRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
            tabletRightRecyclerView.setAdapter(new TypeBRecyclerViewAdapter());
        }
    }

    private boolean isTablet() {
        return findViewById(R.id.right_recycler_view) != null;
    } }
