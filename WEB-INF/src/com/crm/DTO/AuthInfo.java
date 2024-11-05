package com.crm.DTO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AuthInfo {

    @SerializedName("channelID")
    @Expose
    private String channelID;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("userID")
    @Expose
    private String userID;

    public String getChannelID() {
        return channelID;
    }

    public void setChannelID(String channelID) {
        this.channelID = channelID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

}
