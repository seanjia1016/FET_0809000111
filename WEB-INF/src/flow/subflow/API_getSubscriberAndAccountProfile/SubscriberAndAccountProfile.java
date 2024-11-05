package flow.subflow.API_getSubscriberAndAccountProfile;

import com.crm.DTO.AuthInfo;
import com.crm.DTO.TransInfo;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SubscriberAndAccountProfile {

    public static class SearchInfo {

        @SerializedName("getAccountInfoInd")
        @Expose
        private String getAccountInfoInd;
        @SerializedName("getAccountProfileInd")
        @Expose
        private String getAccountProfileInd;
        @SerializedName("getAgentProfileInd")
        @Expose
        private String getAgentProfileInd;
        @SerializedName("getAuthorizerXProfileInd")
        @Expose
        private String getAuthorizerXProfileInd;
        @SerializedName("getAuthorizerYProfileInd")
        @Expose
        private String getAuthorizerYProfileInd;
        @SerializedName("getAuthorizerZProfileInd")
        @Expose
        private String getAuthorizerZProfileInd;
        @SerializedName("getGuaranterProfileInd")
        @Expose
        private String getGuaranterProfileInd;
        @SerializedName("getLegalAgentBProfileInd")
        @Expose
        private String getLegalAgentBProfileInd;
        @SerializedName("getLegalAgentProfileInd")
        @Expose
        private String getLegalAgentProfileInd;
        @SerializedName("getSubscriberInfoInd")
        @Expose
        private String getSubscriberInfoInd;
        @SerializedName("getSubscriberProfileInd")
        @Expose
        private String getSubscriberProfileInd;
        @SerializedName("msisdn")
        @Expose
        private String msisdn;

        public String getGetAccountInfoInd() {
            return getAccountInfoInd;
        }

        public void setGetAccountInfoInd(String getAccountInfoInd) {
            this.getAccountInfoInd = getAccountInfoInd;
        }

        public String getGetAccountProfileInd() {
            return getAccountProfileInd;
        }

        public void setGetAccountProfileInd(String getAccountProfileInd) {
            this.getAccountProfileInd = getAccountProfileInd;
        }

        public String getGetAgentProfileInd() {
            return getAgentProfileInd;
        }

        public void setGetAgentProfileInd(String getAgentProfileInd) {
            this.getAgentProfileInd = getAgentProfileInd;
        }

        public String getGetAuthorizerXProfileInd() {
            return getAuthorizerXProfileInd;
        }

        public void setGetAuthorizerXProfileInd(String getAuthorizerXProfileInd) {
            this.getAuthorizerXProfileInd = getAuthorizerXProfileInd;
        }

        public String getGetAuthorizerYProfileInd() {
            return getAuthorizerYProfileInd;
        }

        public void setGetAuthorizerYProfileInd(String getAuthorizerYProfileInd) {
            this.getAuthorizerYProfileInd = getAuthorizerYProfileInd;
        }

        public String getGetAuthorizerZProfileInd() {
            return getAuthorizerZProfileInd;
        }

        public void setGetAuthorizerZProfileInd(String getAuthorizerZProfileInd) {
            this.getAuthorizerZProfileInd = getAuthorizerZProfileInd;
        }

        public String getGetGuaranterProfileInd() {
            return getGuaranterProfileInd;
        }

        public void setGetGuaranterProfileInd(String getGuaranterProfileInd) {
            this.getGuaranterProfileInd = getGuaranterProfileInd;
        }

        public String getGetLegalAgentBProfileInd() {
            return getLegalAgentBProfileInd;
        }

        public void setGetLegalAgentBProfileInd(String getLegalAgentBProfileInd) {
            this.getLegalAgentBProfileInd = getLegalAgentBProfileInd;
        }

        public String getGetLegalAgentProfileInd() {
            return getLegalAgentProfileInd;
        }

        public void setGetLegalAgentProfileInd(String getLegalAgentProfileInd) {
            this.getLegalAgentProfileInd = getLegalAgentProfileInd;
        }

        public String getGetSubscriberInfoInd() {
            return getSubscriberInfoInd;
        }

        public void setGetSubscriberInfoInd(String getSubscriberInfoInd) {
            this.getSubscriberInfoInd = getSubscriberInfoInd;
        }

        public String getGetSubscriberProfileInd() {
            return getSubscriberProfileInd;
        }

        public void setGetSubscriberProfileInd(String getSubscriberProfileInd) {
            this.getSubscriberProfileInd = getSubscriberProfileInd;
        }

        public String getMsisdn() {
            return msisdn;
        }

        public void setMsisdn(String msisdn) {
            this.msisdn = msisdn;
        }

    }

    @SerializedName("authInfo")
    @Expose
    private AuthInfo authInfo;
    @SerializedName("searchInfo")
    @Expose
    private SearchInfo searchInfo;
    @SerializedName("transInfo")
    @Expose
    private TransInfo transInfo;

    public AuthInfo getAuthInfo() {
        return authInfo;
    }

    public void setAuthInfo(AuthInfo authInfo) {
        this.authInfo = authInfo;
    }

    public SearchInfo getSearchInfo() {
        return searchInfo;
    }

    public void setSearchInfo(SearchInfo searchInfo) {
        this.searchInfo = searchInfo;
    }

    public TransInfo getTransInfo() {
        return transInfo;
    }

    public void setTransInfo(TransInfo transInfo) {
        this.transInfo = transInfo;
    }

}
