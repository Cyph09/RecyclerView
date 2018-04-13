package com.example.swaleh.expandedreportsedairy;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.swaleh.expandedreportsedairy.Model.Center;

import java.util.ArrayList;
import java.util.List;

public class SelectCriteriaActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_criteria);

    }
    public void BtnViewReport(View view){
        Context context = this;
        Class destinationClass = CenterReportSummaryActivity.class;
        Intent intentToStartCenterReportSummaryActivity = new Intent(context, destinationClass);
        startActivity(intentToStartCenterReportSummaryActivity);
    }
}
