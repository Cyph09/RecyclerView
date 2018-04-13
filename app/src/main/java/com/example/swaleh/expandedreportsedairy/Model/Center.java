package com.example.swaleh.expandedreportsedairy.Model;

/**
 * Created by Swaleh on 3/7/2018.
 */

public class Center {

    private String mCenterTitle;
    private double mTotalLtrs;
    private double mAcceptedLtrs;
    private double mRejectedLtrs;
    private int mTotalStations;

    public Center(String centerTitle, double totalLtrs, double acceptedLtrs, double regectedLtrs, int totalStations){
        this.mCenterTitle = centerTitle;
        this.mTotalLtrs = totalLtrs;
        this.mAcceptedLtrs = acceptedLtrs;
        this.mRejectedLtrs = regectedLtrs;
        this.mTotalStations = totalStations;
    }

    public String getCenterTitle() {
        return mCenterTitle;
    }

    public void setCenterTitle(String centerTitle) {
        this.mCenterTitle = centerTitle;
    }

    public double getTotalLtrs() {
        return mTotalLtrs;
    }

    public void setTotalLtrs(double totalLtrs) {
        this.mTotalLtrs = totalLtrs;
    }

    public double getAcceptedLtrs() {
        return mAcceptedLtrs;
    }

    public void setAcceptedLtrs(double acceptedLtrs) {
        this.mAcceptedLtrs = acceptedLtrs;
    }

    public double getRegectedLtrs() {
        return mRejectedLtrs;
    }

    public void setRegectedLtrs(double regectedLtrs) {
        this.mRejectedLtrs = regectedLtrs;
    }

    public int getTotalStations() {
        return mTotalStations;
    }

    public void setTotalStations(int totalStations) {
        this.mTotalStations = totalStations;
    }
}
