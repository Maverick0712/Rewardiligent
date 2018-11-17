package com.electrodiligent.rewardiligent.model;

/**
 * Created by sumit on 24-02-2018.
 */

public class RewardItem {

    private String rewardID;
    private  String rewardTitle;
    private  String rewardTaskInitDate;
    private int rewardTaskProgress;

    public RewardItem() {
    }

    public RewardItem(String rewardID, String rewardTitle, String rewardTaskInitDate, int rewardTaskProgress) {
        this.rewardID = rewardID;
        this.rewardTitle = rewardTitle;
        this.rewardTaskInitDate = rewardTaskInitDate;
        this.rewardTaskProgress = rewardTaskProgress;
    }

    public String getRewardID() {
        return rewardID;
    }

    public void setRewardID(String rewardID) {
        this.rewardID = rewardID;
    }

    public String getRewardTitle() {
        return rewardTitle;
    }

    public void setRewardTitle(String rewardTitle) {
        this.rewardTitle = rewardTitle;
    }

    public String getRewardTaskInitDate() {
        return rewardTaskInitDate;
    }

    public void setRewardTaskInitDate(String rewardTaskInitDate) {
        this.rewardTaskInitDate = rewardTaskInitDate;
    }

    public int getRewardTaskProgress() {
        return rewardTaskProgress;
    }

    public String getRewardTaskProgressString() {
        return String.valueOf(rewardTaskProgress)+"%";
    }

    public void setRewardTaskProgress(int rewardTaskProgress) {
        this.rewardTaskProgress = rewardTaskProgress;
    }

    @Override
    public String toString() {
        return "RewardItem{" +
                "rewardID='" + rewardID + '\'' +
                ", rewardTitle='" + rewardTitle + '\'' +
                ", rewardTaskInitDate='" + rewardTaskInitDate + '\'' +
                ", rewardTaskProgress=" + rewardTaskProgress +
                '}';
    }
}
