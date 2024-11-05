package com.crm.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FE_API_LOG_TBL {

	public static class Column {
		@SerializedName("IVR")
		@Expose
		private String IVR;
		@SerializedName("API")
		@Expose
		private String API;
		@SerializedName("MSISDN")
		@Expose
		private String MSISDN;
		@SerializedName("SUBSCRIBER")
		@Expose
		private String SUBSCRIBER;
		@SerializedName("BPID")
		@Expose
		private String BPID;
		@SerializedName("SDATE")
		@Expose
		private String SDATE;
		@SerializedName("ETIME")
		@Expose
		private String ETIME;
		@SerializedName("HTTP_RETCODE")
		@Expose
		private String HTTP_RETCODE;
		@SerializedName("RETURNCODE")
		@Expose
		private String RETURNCODE;
		@SerializedName("RESERVED1")
		@Expose
		private String RESERVED1;
		@SerializedName("ORDERID")
		@Expose
		private String ORDERID;
		@SerializedName("STR_DATA")
		@Expose
		private String STR_DATA;
		@SerializedName("ORDERSTATE")
		@Expose
		private String ORDERSTATE;
		@SerializedName("SEC")
		@Expose
		private String SEC;

		public String getIVR() {
			return IVR;
		}

		public void setIVR(String iVR) {
			this.IVR = iVR;
		}

		public String getAPI() {
			return API;
		}

		public void setAPI(String aPI) {
			this.API = aPI;
		}

		public String getMSISDN() {
			return MSISDN;
		}

		public void setMSISDN(String mSISDN) {
			this.MSISDN = mSISDN;
		}

		public String getSUBSCRIBER() {
			return SUBSCRIBER;
		}

		public void setSUBSCRIBER(String sUBSCRIBER) {
			this.SUBSCRIBER = sUBSCRIBER;
		}

		public String getBPID() {
			return BPID;
		}

		public void setBPID(String bPID) {
			this.BPID = bPID;
		}

		public String getSDATE() {
			return SDATE;
		}

		public void setSDATE(String sDATE) {
			this.SDATE = sDATE;
		}

		public String getETIME() {
			return ETIME;
		}

		public void setETIME(String eTIME) {
			this.ETIME = eTIME;
		}

		public String getHTTPRETCODE() {
			return HTTP_RETCODE;
		}

		public void setHTTPRETCODE(String hTTPRETCODE) {
			this.HTTP_RETCODE = hTTPRETCODE;
		}

		public String getRETURNCODE() {
			return RETURNCODE;
		}

		public void setRETURNCODE(String rETURNCODE) {
			this.RETURNCODE = rETURNCODE;
		}

		public String getRESERVED1() {
			return RESERVED1;
		}

		public void setRESERVED1(String rESERVED1) {
			this.RESERVED1 = (rESERVED1.getBytes().length > 20)? "系統訊息過長": rESERVED1;
		}

		public String getORDERID() {
			return ORDERID;
		}

		public void setORDERID(String oRDERID) {
			this.ORDERID = oRDERID;
		}

		public String getSTRDATA() {
			return STR_DATA;
		}

		public void setSTRDATA(String sTRDATA) {
			this.STR_DATA = (sTRDATA.getBytes().length > 20)? "系統訊息過長" : sTRDATA;
		}

		public String getORDERSTATE() {
			return ORDERSTATE;
		}

		public void setORDERSTATE(String oRDERSTATE) {
			this.ORDERSTATE = oRDERSTATE;
		}

		public String getSEC() {
			return SEC;
		}

		public void setSEC(String sEC) {
			this.SEC = sEC;
		}
	}

	@SerializedName("count")
	@Expose
	private Integer count;
	@SerializedName("data")
	@Expose
	private List<Column> data = null;

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public FE_API_LOG_TBL withCount(Integer count) {
		this.count = count;
		return this;
	}

	public List<Column> getData() {
		return data;
	}

	public void setData(List<Column> data) {
		this.data = data;
	}

	public FE_API_LOG_TBL withData(List<Column> data) {
		this.data = data;
		return this;
	}
}
