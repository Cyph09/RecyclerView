package com.example.swaleh.expandedreportsedairy;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Swaleh on 3/7/2018.
 */

public class IndividualCenterReportAdapter extends RecyclerView.Adapter<IndividualCenterReportAdapter.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvSession;
        private TextView tvTotalLtrs;
        private TextView tvAcceptedLtrs;
        private TextView tvRejectedLtrs;
        private TextView tvTotalStations;
        public ViewHolder(View itemView){
            super(itemView);

            tvSession = (TextView) itemView.findViewById(R.id.tv_center_title);
            tvTotalLtrs    = (TextView) itemView.findViewById(R.id.tv_total_litres);
            tvAcceptedLtrs = (TextView) itemView.findViewById(R.id.tv_accepted_litres);
            tvRejectedLtrs = (TextView) itemView.findViewById(R.id.tv_rejected_litres);
            tvTotalStations= (TextView) itemView.findViewById(R.id.tv_total_stations);
        }
    }
    public IndividualCenterReportAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull IndividualCenterReportAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
