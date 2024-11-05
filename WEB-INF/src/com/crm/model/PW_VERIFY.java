package com.crm.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PW_VERIFY {

	public static class Column {
		@SerializedName("MSISDN")
		@Expose
		private String MSISDN;
		@SerializedName("DATE_OUT")
		@Expose
		private String DATE_OUT;
		@SerializedName("TIME_OUT")
		@Expose
		private String TIME_OUT;
		@SerializedName("FLAG")
		@Expose
		private String FLAG;

		public String getMSISDN() {
			return MSISDN;
		}

		public void setMSISDN(String mSISDN) {
			this.MSISDN = mSISDN;
		}

		public String getDATEOUT() {
			return DATE_OUT;
		}

		public void setDATEOUT(String dATEOUT) {
			this.DATE_OUT = dATEOUT;
		}

		public String getTIMEOUT() {
			return TIME_OUT;
		}

		public void setTIMEOUT(String tIMEOUT) {
			this.TIME_OUT = tIMEOUT;
		}

		public String getFLAG() {
			return FLAG;
		}

		public void setFLAG(String fLAG) {
			this.FLAG = fLAG;
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

	public PW_VERIFY withCount(Integer count) {
		this.count = count;
		return this;
	}

	public List<Column> getData() {
		return data;
	}

	public void setData(List<Column> data) {
		this.data = data;
	}

	public PW_VERIFY withData(List<Column> data) {
		this.data = data;
		return this;
	}
}
