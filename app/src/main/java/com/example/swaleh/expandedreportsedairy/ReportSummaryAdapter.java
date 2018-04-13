package com.example.swaleh.expandedreportsedairy;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.swaleh.expandedreportsedairy.Model.Center;

import java.util.List;

/**
 * Created by Swaleh on 3/6/2018.
 */

public class ReportSummaryAdapter extends RecyclerView.Adapter<ReportSummaryAdapter.ViewHolder> {
    private Context mContext;
    private List<Center> centersList;

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvCenterTitle;
        private TextView tvTotalLtrs;
        private TextView tvAcceptedLtrs;
        private TextView tvRejectedLtrs;
        private TextView tvTotalStations;

        public ViewHolder(View itemView) {
            super(itemView);

            tvCenterTitle = (TextView) itemView.findViewById(R.id.tv_center_title);
            tvTotalLtrs    = (TextView) itemView.findViewById(R.id.tv_total_litres);
            tvAcceptedLtrs = (TextView) itemView.findViewById(R.id.tv_accepted_litres);
            tvRejectedLtrs = (TextView) itemView.findViewById(R.id.tv_rejected_litres);
            tvTotalStations= (TextView) itemView.findViewById(R.id.tv_total_stations);
        }
    }

    public ReportSummaryAdapter(Context context, List<Center>centersList){
        this.mContext = context;
        this.centersList = centersList;
    }

    public ReportSummaryAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        int layoutIdForListItems = R.layout.report_summary_details;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItems, viewGroup,shouldAttachToParentImmediately);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    //Bind data to the views
    @Override
    public void onBindViewHolder(ReportSummaryAdapter.ViewHolder holder, int position) {
    Center center = centersList.get(position);
    String totalLtrs = Double.toString(center.getTotalLtrs());
    String acceptedLtrs = Double.toString(center.getAcceptedLtrs());
    String rejectedLtrs = Double.toString(center.getRegectedLtrs());
    String totalStations = Integer.toString(center.getTotalStations());
    holder.tvCenterTitle.setText(center.getCenterTitle());
    holder.tvTotalLtrs.setText(totalLtrs);
    holder.tvAcceptedLtrs.setText(acceptedLtrs);
    holder.tvRejectedLtrs.setText(rejectedLtrs);
    holder.tvTotalStations.setText(totalStations);
    }

    //Return number of items to display
    @Override
    public int getItemCount() {
        return centersList.size();
    }
}
