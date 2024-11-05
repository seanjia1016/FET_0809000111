package com.crm.DTO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TransInfo {

    @SerializedName("transBPID")
    @Expose
    private String transBPID;
    @SerializedName("transChannel")
    @Expose
    private String transChannel;
    @SerializedName("transPath")
    @Expose
    private String transPath;
    @SerializedName("transSubChannel")
    @Expose
    private String transSubChannel;
    @SerializedName("transUserId")
    @Expose
    private String transUserId;

    public String getTransBPID() {
        return transBPID;
    }

    public void setTransBPID(String transBPID) {
        this.transBPID = transBPID;
    }

    public String getTransChannel() {
        return transChannel;
    }

    public void setTransChannel(String transChannel) {
        this.transChannel = transChannel;
    }

    public String getTransPath() {
        return transPath;
    }

    public void setTransPath(String transPath) {
        this.transPath = transPath;
    }

    public String getTransSubChannel() {
        return transSubChannel;
    }

    public void setTransSubChannel(String transSubChannel) {
        this.transSubChannel = transSubChannel;
    }

    public String getTransUserId() {
        return transUserId;
    }

    public void setTransUserId(String transUserId) {
        this.transUserId = transUserId;
    }

}