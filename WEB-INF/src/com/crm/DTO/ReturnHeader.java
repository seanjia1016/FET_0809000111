package com.crm.DTO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReturnHeader {

    @SerializedName("returnCode")
    @Expose
    private String returnCode;
    @SerializedName("returnMesg")
    @Expose
    private String returnMesg;
    @SerializedName("processID")
    @Expose
    private String processID;
    @SerializedName("processName")
    @Expose
    private String processName;

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMesg() {
        return returnMesg;
    }

    public void setReturnMesg(String returnMesg) {
        this.returnMesg = returnMesg;
    }

    public String getProcessID() {
        return processID;
    }

    public void setProcessID(String processID) {
        this.processID = processID;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

}
