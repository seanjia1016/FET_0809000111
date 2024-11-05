package com.crm.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SMSConfig {

	public static class Column {

		@SerializedName("sms_config_value")
		@Expose
		private String smsConfigValue;

		public String getSmsConfigValue() {
			return smsConfigValue;
		}

		public void setSmsConfigValue(String smsConfigValue) {
			this.smsConfigValue = smsConfigValue;
		}

		public Column withSmsConfigValue(String smsConfigValue) {
			this.smsConfigValue = smsConfigValue;
			return this;
		}
		
		@SerializedName("sms_config_name")
		@Expose
		private String smsConfigName;

		public String getSmsConfigName() {
			return smsConfigName;
		}

		public void setSmsConfigName(String smsConfigName) {
			this.smsConfigName = smsConfigName;
		}

		public Column withSmsConfigName(String smsConfigName) {
			this.smsConfigName = smsConfigName;
			return this;
		}
		
		@SerializedName("sms_config_type")
		@Expose
		private String smsConfigType;

		public String getSmsConfigType() {
			return smsConfigType;
		}

		public void setSmsConfigType(String smsConfigType) {
			this.smsConfigType = smsConfigType;
		}

		public Column withSmsConfigType(String smsConfigType) {
			this.smsConfigType = smsConfigType;
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

	public SMSConfig withCount(Integer count) {
		this.count = count;
		return this;
	}

	public List<Column> getData() {
		return data;
	}

	public void setData(List<Column> data) {
		this.data = data;
	}

	public SMSConfig withData(List<Column> data) {
		this.data = data;
		return this;
	}

}