package com.crm.model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/*
TASK_888_TBL	REQ_STIME		VARCHAR2	6
TASK_888_TBL	REQ_TIME		VARCHAR2	6
TASK_888_TBL	STATUS			VARCHAR2	10
TASK_888_TBL	REQ_ETIME		VARCHAR2	6
TASK_888_TBL	AMT				VARCHAR2	10
TASK_888_TBL	REASON			VARCHAR2	100
TASK_888_TBL	BPID			VARCHAR2	100
TASK_888_TBL	TID				VARCHAR2	20
TASK_888_TBL	MSISDN			VARCHAR2	10
TASK_888_TBL	REQ_DATE		VARCHAR2	8
TASK_888_TBL	JOB				VARCHAR2	50
 */
public class TASK_888_TBL {

	public static class Column {

		@SerializedName("TID")
		@Expose
		public String TID;
		@SerializedName("MSISDN")
		@Expose
		public String MSISDN;
		@SerializedName("REQ_DATE")
		@Expose
		public String REQ_DATE;
		@SerializedName("REQ_TIME")
		@Expose
		public String REQ_TIME;
		@SerializedName("REQ_STIME")
		@Expose
		public String REQ_STIME;
		@SerializedName("REQ_ETIME")
		@Expose
		public String REQ_ETIME;
		@SerializedName("JOB")
		@Expose
		public String JOB;
		@SerializedName("STATUS")
		@Expose
		public String STATUS;
		@SerializedName("REASON")
		@Expose
		public String REASON;
		@SerializedName("AMT")
		@Expose
		public String AMT;
		@SerializedName("BPID")
		@Expose
		public String BPID;

		public String getTID() {
			return TID;
		}

		public void setTID(String tID) {
			this.TID = tID;
		}

		public Column withTID(String tID) {
			this.TID = tID;
			return this;
		}

		public String getMSISDN() {
			return MSISDN;
		}

		public void setMSISDN(String MSISDN) {
			this.MSISDN = MSISDN;
		}

		public Column withMSISDN(String MSISDN) {
			this.MSISDN = MSISDN;
			return this;
		}

		public String getREQDATE() {
			return REQ_DATE;
		}

		public void setREQDATE(String rEQDATE) {
			this.REQ_DATE = rEQDATE;
		}

		public Column withREQDATE(String rEQDATE) {
			this.REQ_DATE = rEQDATE;
			return this;
		}

		public String getREQTIME() {
			return REQ_TIME;
		}

		public void setREQTIME(String rEQTIME) {
			this.REQ_TIME = rEQTIME;
		}

		public Column withREQTIME(String rEQTIME) {
			this.REQ_TIME = rEQTIME;
			return this;
		}

		public String getREQSTIME() {
			return REQ_STIME;
		}

		public void setREQSTIME(String rEQSTIME) {
			this.REQ_STIME = rEQSTIME;
		}

		public Column withREQSTIME(String rEQSTIME) {
			this.REQ_STIME = rEQSTIME;
			return this;
		}

		public String getREQETIME() {
			return REQ_ETIME;
		}

		public void setREQETIME(String rEQETIME) {
			this.REQ_ETIME = rEQETIME;
		}

		public Column withREQETIME(String rEQETIME) {
			this.REQ_ETIME = rEQETIME;
			return this;
		}

		public String getJOB() {
			return JOB;
		}

		public void setJOB(String jOB) {
			this.JOB = jOB;
		}

		public Column withJOB(String jOB) {
			this.JOB = jOB;
			return this;
		}

		public String getSTATUS() {
			return STATUS;
		}

		public void setSTATUS(String sTATUS) {
			this.STATUS = sTATUS;
		}

		public Column withSTATUS(String sTATUS) {
			this.STATUS = sTATUS;
			return this;
		}

		public String getREASON() {
			return REASON;
		}

		public void setREASON(String rEASON) {
			this.REASON = rEASON;
		}

		public Column withREASON(String rEASON) {
			this.REASON = rEASON;
			return this;
		}

		public String getAMT() {
			return AMT;
		}

		public void setAMT(String aMT) {
			this.AMT = aMT;
		}

		public Column withAMT(String aMT) {
			this.AMT = aMT;
			return this;
		}
		public String getBPID() {
			return BPID;
		}

		public void setBPID(String BPID) {
			this.BPID = BPID;
		}

		public Column withBPID(String BPID) {
			this.BPID = BPID;
			return this;
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

	public TASK_888_TBL withCount(Integer count) {
		this.count = count;
		return this;
	}

	public List<Column> getData() {
		return data;
	}

	public void setData(List<Column> data) {
		this.data = data;
	}

	public TASK_888_TBL withData(List<Column> data) {
		this.data = data;
		return this;
	}
}
