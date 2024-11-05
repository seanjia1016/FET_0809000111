package com.crm.DTO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RedeemCondition {

    public class InsightQueryParam {

        @SerializedName("channel")
        @Expose
        private String channel;
        @SerializedName("msisdn")
        @Expose
        private String msisdn;
        @SerializedName("paymentCategory")
        @Expose
        private String paymentCategory;
        @SerializedName("subscriberId")
        @Expose
        private String subscriberId;
        @SerializedName("subscriberType")
        @Expose
        private String subscriberType;
        @SerializedName("ivrCode")
        @Expose
        private String ivrCode;
        @SerializedName("serviceProvider")
        @Expose
        private String serviceProvider;

        public String getChannel() {
            return channel;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public String getMsisdn() {
            return msisdn;
        }

        public void setMsisdn(String msisdn) {
            this.msisdn = msisdn;
        }

        public String getPaymentCategory() {
            return paymentCategory;
        }

        public void setPaymentCategory(String paymentCategory) {
            this.paymentCategory = paymentCategory;
        }

        public String getSubscriberId() {
            return subscriberId;
        }

        public void setSubscriberId(String subscriberId) {
            this.subscriberId = subscriberId;
        }

        public String getSubscriberType() {
            return subscriberType;
        }

        public void setSubscriberType(String subscriberType) {
            this.subscriberType = subscriberType;
        }

        public String getIvrCode() {
            return ivrCode;
        }

        public void setIvrCode(String ivrCode) {
            this.ivrCode = ivrCode;
        }

        public String getServiceProvider() {
            return serviceProvider;
        }

        public void setServiceProvider(String serviceProvider) {
            this.serviceProvider = serviceProvider;
        }

    }

    @SerializedName("authInfo")
    @Expose
    private AuthInfo authInfo;
    @SerializedName("insightQueryParam")
    @Expose
    private InsightQueryParam insightQueryParam;
    @SerializedName("transInfo")
    @Expose
    private TransInfo transInfo;

    public AuthInfo getAuthInfo() {
        return authInfo;
    }

    public void setAuthInfo(AuthInfo authInfo) {
        this.authInfo = authInfo;
    }

    public InsightQueryParam getInsightQueryParam() {
        return insightQueryParam;
    }

    public void setInsightQueryParam(InsightQueryParam insightQueryParam) {
        this.insightQueryParam = insightQueryParam;
    }

    public TransInfo getTransInfo() {
        return transInfo;
    }

    public void setTransInfo(TransInfo transInfo) {
        this.transInfo = transInfo;
    }

}
