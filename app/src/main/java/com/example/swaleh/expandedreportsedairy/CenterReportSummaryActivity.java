package com.example.swaleh.expandedreportsedairy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.swaleh.expandedreportsedairy.Model.Center;

import java.util.ArrayList;
import java.util.List;

public class CenterReportSummaryActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ReportSummaryAdapter mReportSummaryAdapter;
    private List<Center> mCenterList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_center_report_summary);

        mRecyclerView = (RecyclerView) findViewById(R.id.rv_center_summary);

        mCenterList = new ArrayList<>();

        LinearLayoutManager layoutManager = new LinearLayoutManager(
                this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(layoutManager);

        mRecyclerView.setHasFixedSize(true);

        mReportSummaryAdapter = new ReportSummaryAdapter(this, mCenterList);

        mRecyclerView.setAdapter(mReportSummaryAdapter);

        prepareCenters();
    }

    private void prepareCenters() {

        Center center = new Center("Isange", 2345.5, 2340.0, 5.5, 32);
        mCenterList.add(center);
        center = new Center("Njombe", 1700.0, 1700.0, 0, 18 );
        mCenterList.add(center);
        center = new Center("Rungwe-KK", 3459.0, 3459.0, 0, 41);
        mCenterList.add(center);
        center = new Center("Tukuyu", 2410.5, 2300.5, 110.0, 19);
        mCenterList.add(center);
        mReportSummaryAdapter.notifyDataSetChanged();
    }
}
