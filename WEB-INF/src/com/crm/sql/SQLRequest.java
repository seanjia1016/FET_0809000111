package com.crm.sql;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SQLRequest {

	@SerializedName("TABLE")
	@Expose
	private String tABLE;
	@SerializedName("SQL")
	@Expose
	private String sQL;
	@SerializedName("JNDINAME")
	@Expose
	private String jNDINAME;

	public String getTABLE() {
		return tABLE;
	}

	public void setTABLE(String tABLE) {
		this.tABLE = tABLE;
	}

	public SQLRequest withTABLE(String tABLE) {
		this.tABLE = tABLE;
		return this;
	}

	public String getSQL() {
		return sQL;
	}

	public void setSQL(String sQL) {
		this.sQL = sQL;
	}

	public SQLRequest withSQL(String sQL) {
		this.sQL = sQL;
		return this;
	}

	public String getJNDINAME() {
		return jNDINAME;
	}

	public void setJNDINAME(String jNDINAME) {
		this.jNDINAME = jNDINAME;
	}

	public SQLRequest withJNDINAME(String jNDINAME) {
		this.jNDINAME = jNDINAME;
		return this;
	}

}