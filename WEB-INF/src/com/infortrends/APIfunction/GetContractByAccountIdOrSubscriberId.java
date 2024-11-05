package com.infortrends.APIfunction;

import org.json.JSONArray;
import org.json.JSONObject;

import com.avaya.sce.runtimecommon.IComplexVariable;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.IVariable;
import com.avaya.sce.runtimecommon.IVariableField;
import com.avaya.sce.runtimecommon.SCESession;

import flow.IProjectVariables;

public class GetContractByAccountIdOrSubscriberId {

	public String ContainKeyAndGetJSON(JSONObject jsonObject, String key) {
		// check key
		if (jsonObject.has(key)) {
			Object val = jsonObject.get(key);
			// check json type

			if (val instanceof Integer) {
				return String.valueOf(val);
			} else {
				return val.toString();
			}
		}
		return null;
	}

	public JSONObject ContainKeyAndGetObject(JSONObject jsonObject, String key) {

		if (jsonObject.has(key)) {

			Object val = jsonObject.get(key);
			if (val instanceof JSONObject) {
				return jsonObject.getJSONObject(key);
			} else {

				return jsonObject;
			}
		}
		return jsonObject;
	}

	public void function(SCESession mySession, JSONObject ResponseJsonObject) {

		String Exception = null;
		String ID="";
		String birthday="";
		String Password="";
		String LastName="";
		String AddressLineOne="";
		String City="";
		String Region="";
		String AddressUsageType="";
		boolean RoleType21 = false;
		boolean RoleType31 = false;

		IVariable variable = mySession
				.getVariable(IProjectVariables.PROPERTIES);
		IComplexVariable complexVariable = variable.getComplexVariable();
		String testMode = complexVariable.getField(
				IProjectVariables.PROPERTIES_FIELD_TEST__MODE).getStringValue();
		if (testMode.equals("2")) {
			this.assignTestval(mySession, ResponseJsonObject);
		} else {

			if (ResponseJsonObject instanceof JSONObject) {
				
//				exectureGetContractByAccountIdOrSubscriberId db = new exectureGetContractByAccountIdOrSubscriberId();
				
					JSONObject data = this.ContainKeyAndGetObject(ResponseJsonObject, "Data");
					JSONObject Envelope = this.ContainKeyAndGetObject(data,"SOAP-ENV:Envelope");
					JSONObject Body = this.ContainKeyAndGetObject(Envelope,"SOAP-ENV:Body");
					JSONObject getContractByAccountIdOrSubscriberIdResponse = this.ContainKeyAndGetObject(Body,
									"ns0:getContractByAccountIdOrSubscriberIdResponse");
					JSONObject TCRMContractBObj = this.ContainKeyAndGetObject(getContractByAccountIdOrSubscriberIdResponse,"ns1:TCRMContractBObj");

					// check ReturnHeader type

					if (getContractByAccountIdOrSubscriberIdResponse.has("ns0:returnHeader")) {
						
						

						JSONObject returnHeader = this.ContainKeyAndGetObject(getContractByAccountIdOrSubscriberIdResponse,"ns0:returnHeader");
						
						this.assignRreturnHeader(mySession, returnHeader);
						// 取基本個資
						if (TCRMContractBObj.has("ns1:TCRMContractComponentBObj")
								&& (TCRMContractBObj.get("ns1:TCRMContractComponentBObj") instanceof JSONArray)) {
//							System.out.println("TCRMContractComponentBObj jsonarray " );
							out:for (int i = 0; i < TCRMContractBObj.length(); i++) {
								JSONObject TCRMContractComponentBObj = TCRMContractBObj.getJSONArray("ns1:TCRMContractComponentBObj").getJSONObject(i);
								
								if (TCRMContractComponentBObj.has("ns1:TCRMContractPartyRoleBObj")
										&& (TCRMContractComponentBObj.get("ns1:TCRMContractPartyRoleBObj") instanceof JSONArray)) {
									JSONArray TCRMContractPartyRoleBObjArray = TCRMContractComponentBObj.getJSONArray("ns1:TCRMContractPartyRoleBObj");
									
									System.out.println("TCRMContractPartyRoleBObjArray"+TCRMContractPartyRoleBObjArray);
									for (int j = 0; j < TCRMContractPartyRoleBObjArray.length(); j++) {
										JSONObject TCRMContractPartyRoleBObj = TCRMContractPartyRoleBObjArray.getJSONObject(j);
									
										
										String RoleType = this.ContainKeyAndGetJSON(TCRMContractPartyRoleBObj,"ns1:RoleType");

										//ID & Birthdate
										if (RoleType.equals("21")) {
											
//											System.out.println("RoleType"+RoleType);
											JSONObject TCRMPersonBObj = this.ContainKeyAndGetObject(TCRMContractPartyRoleBObj,"ns1:TCRMPersonBObj");
//											
											birthday =this.ContainKeyAndGetJSON(TCRMPersonBObj, "ns1:BirthDate");
											
											System.out.println("birthday:#####"+birthday);
											mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"birthday:#####" + birthday);

//											System.out.println("TCRMContractPartyRoleIdentifierBObj class:"+TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj").getClass());
											
											if (TCRMContractPartyRoleBObj.has("ns1:TCRMContractPartyRoleIdentifierBObj") && TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj") instanceof JSONArray) {
												JSONArray len = TCRMContractPartyRoleBObj.getJSONArray("ns1:TCRMContractPartyRoleIdentifierBObj");
												
												for (int l = 0; l <len.length() ; l++) {
													System.out.println("len.getJSONObject(l)"+len.getJSONObject(l));
													mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,
															"len.getJSONObject(l)"+len.getJSONObject(l));
													
													if (len.getJSONObject(l).toString().contains("\"ns1:Description\":\"F\"")) {
														
														
														String val = this.ContainKeyAndGetJSON(len.getJSONObject(l),"ns1:IdentifierId");
														JSONArray len2 = TCRMPersonBObj.getJSONArray("ns1:TCRMPartyIdentificationBObj");
															for (int k = 0; k < len2.length(); k++) {
																
																String val2 = this.ContainKeyAndGetJSON(len2.getJSONObject(k),"ns1:IdentificationIdPK");
																if (val.equals(val2)||RoleType21==false) {
																	 ID = this.ContainKeyAndGetJSON(len2.getJSONObject(k),"ns1:IdentificationNumber");
//																	 birthday =TCRMPersonBObj.get("ns1:BirthDate").toString();
																	 RoleType21=true;
																}else{
																	System.out.println("fail");
																	
																	mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"fail");
																}
																
															}
													}			
													}
											}else if(TCRMContractPartyRoleBObj.has("ns1:TCRMContractPartyRoleIdentifierBObj") && TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj") instanceof JSONObject){
												
												JSONObject TCRMContractPartyRoleIdentifierBObj = TCRMContractPartyRoleBObj.getJSONObject("ns1:TCRMContractPartyRoleIdentifierBObj") ;

												System.out.println("TCRMContractPartyRoleIdentifierBObj"+TCRMContractPartyRoleIdentifierBObj);
												mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"TCRMContractPartyRoleIdentifierBObj"+TCRMContractPartyRoleIdentifierBObj);
												if (TCRMContractPartyRoleIdentifierBObj.toString().contains("\"ns1:Description\":\"F\"")) {
													
													
													String val = this.ContainKeyAndGetJSON(TCRMContractPartyRoleIdentifierBObj,"ns1:IdentifierId");
													 JSONObject TCRMPartyIdentificationBObj = TCRMPersonBObj.getJSONObject("ns1:TCRMPartyIdentificationBObj");
													
															
															String val2 = this.ContainKeyAndGetJSON(TCRMPartyIdentificationBObj,"ns1:IdentificationIdPK");
															if (val.equals(val2)||RoleType21==false) {
																 ID = this.ContainKeyAndGetJSON(TCRMPartyIdentificationBObj,"ns1:IdentificationNumber");
//																 birthday =TCRMPersonBObj.get("ns1:BirthDate").toString();
																 RoleType21=true;
															}else{
																System.out.println("fail");
																mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"fail");
															}
															
												}
												
												
											}else{
												//System.out.println("TCRMContractPartyRoleIdentifierBObj"+TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj").getClass());
												mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"TCRMContractPartyRoleIdentifierBObj"+TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj").getClass());
												
											}
											
											
											
//											//20180606_新增取姓名
//											if (TCRMPersonBObj.has("ns1:TCRMPersonNameBObj") && TCRMPersonBObj.get("ns1:TCRMPersonNameBObj") instanceof JSONArray) {
//												JSONArray len = TCRMPersonBObj.getJSONArray("ns1:TCRMPersonNameBObj");
//												
//												for (int l = 0; l <len.length() ; l++) {
//													LastName = this.ContainKeyAndGetJSON(len.getJSONObject(l),"ns1:LastName");
//													mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"LastName: "+LastName);
//													
//												}
//											}else if(TCRMPersonBObj.has("ns1:TCRMPersonNameBObj") && TCRMPersonBObj.get("ns1:TCRMPersonNameBObj") instanceof JSONObject){
//												JSONObject TCRMPersonNameBObj = TCRMPersonBObj.getJSONObject("ns1:TCRMPersonNameBObj");
//												LastName = this.ContainKeyAndGetJSON(TCRMPersonNameBObj,"ns1:LastName");
//												mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"LastName: "+LastName);
//												
//											}else{
//												mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"get LastName fail");
//											}
											
											/////////////
											
										}else{
											
										}
										if (RoleType.equals("31")) {
											JSONObject TCRMExtension = this.ContainKeyAndGetObject(TCRMContractComponentBObj,"ns1:TCRMExtension");
											JSONObject XContractComponentBObjExt = this.ContainKeyAndGetObject(TCRMExtension,"ns1:XContractComponentBObjExt");
											Password = this.ContainKeyAndGetJSON(XContractComponentBObjExt, "ns1:Password");
											
											
											//20180606_新增取帳單地址
											JSONObject TCRMPersonBObj = this.ContainKeyAndGetObject(TCRMContractPartyRoleBObj,"ns1:TCRMPersonBObj");
											
											if (TCRMPersonBObj.has("ns1:TCRMPartyAddressBObj") && TCRMPersonBObj.get("ns1:TCRMPartyAddressBObj") instanceof JSONArray) {
												JSONArray len = TCRMPersonBObj.getJSONArray("ns1:TCRMPartyAddressBObj");
												
												for (int l = 0; l <len.length() ; l++) {
													AddressUsageType = this.ContainKeyAndGetJSON(len.getJSONObject(l),"ns1:AddressUsageType");
													
													if(AddressUsageType.equals("3")){
														JSONObject TCRMAddressBObj = len.getJSONObject(l).getJSONObject("ns1:TCRMAddressBObj");
														City = this.ContainKeyAndGetJSON(TCRMAddressBObj,"ns1:City");
														Region = this.ContainKeyAndGetJSON(TCRMAddressBObj,"ns1:Region");
														AddressLineOne = this.ContainKeyAndGetJSON(TCRMAddressBObj,"ns1:AddressLineOne");
														
														mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"City: "+City);
														mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"Region: "+Region);
														mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"AddressLineOne: "+AddressLineOne);
														
													}
													
													
													
												}
											}else if(TCRMPersonBObj.has("ns1:TCRMPartyAddressBObj") && TCRMPersonBObj.get("ns1:TCRMPartyAddressBObj") instanceof JSONObject){
												
												JSONObject TCRMPartyAddressBObj = TCRMPersonBObj.getJSONObject("ns1:TCRMPartyAddressBObj");
												
												AddressUsageType = this.ContainKeyAndGetJSON(TCRMPartyAddressBObj,"ns1:AddressUsageType");
												if(AddressUsageType.equals("3")){
													JSONObject TCRMAddressBObj = TCRMPartyAddressBObj.getJSONObject("ns1:TCRMAddressBObj");
													City = this.ContainKeyAndGetJSON(TCRMAddressBObj,"ns1:City");
													Region = this.ContainKeyAndGetJSON(TCRMAddressBObj,"ns1:Region");
													AddressLineOne = this.ContainKeyAndGetJSON(TCRMAddressBObj,"ns1:AddressLineOne");
													
													mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"City: "+City);
													mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"Region: "+Region);
													mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"AddressLineOne: "+AddressLineOne);
													
												}
												
												
											}else{
												
												mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"get Address fail");
												
											}
											
											//////////////
											
											
											//20180606_新增取姓名
											if (TCRMPersonBObj.has("ns1:TCRMPersonNameBObj") && TCRMPersonBObj.get("ns1:TCRMPersonNameBObj") instanceof JSONArray) {
												JSONArray len = TCRMPersonBObj.getJSONArray("ns1:TCRMPersonNameBObj");
												
												for (int l = 0; l <len.length() ; l++) {
													LastName = this.ContainKeyAndGetJSON(len.getJSONObject(l),"ns1:LastName");
													mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"LastName: "+LastName);
													
												}
											}else if(TCRMPersonBObj.has("ns1:TCRMPersonNameBObj") && TCRMPersonBObj.get("ns1:TCRMPersonNameBObj") instanceof JSONObject){
												JSONObject TCRMPersonNameBObj = TCRMPersonBObj.getJSONObject("ns1:TCRMPersonNameBObj");
												LastName = this.ContainKeyAndGetJSON(TCRMPersonNameBObj,"ns1:LastName");
												mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"LastName: "+LastName);
												
											}else{
												mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"get LastName fail");
											}
											
											////////////////
											
											RoleType31=true;
										}
										if (RoleType31==true && RoleType21==true) {
											break out;
										}
										
										
										
									}
									
									
								} else if (TCRMContractComponentBObj.has("ns1:TCRMContractPartyRoleBObj")){
									JSONObject TCRMContractPartyRoleBObj = this.ContainKeyAndGetObject(TCRMContractComponentBObj,"ns1:TCRMContractPartyRoleBObj");
									
									System.out.println("TCRMContractPartyRoleBObj jsonobject"+TCRMContractPartyRoleBObj);
									mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"TCRMContractPartyRoleBObj jsonobject"+TCRMContractPartyRoleBObj);
									String RoleType = this.ContainKeyAndGetJSON(TCRMContractPartyRoleBObj,"ns1:RoleType");
									
									
									//ID & Birthdate
									if (RoleType.equals("21")) {
										
										System.out.println("RoleType jsonobject "+RoleType);
										
										JSONObject TCRMPersonBObj = this.ContainKeyAndGetObject(TCRMContractPartyRoleBObj,"ns1:TCRMPersonBObj");
										//birthday =TCRMPersonBObj.get("ns1:BirthDate").toString();
										
//										birthday =TCRMPersonBObj.get("ns1:BirthDate").toString();
										
										birthday =this.ContainKeyAndGetJSON(TCRMPersonBObj, "ns1:BirthDate");
//										System.out.println("birthday###"+birthday);
										mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"birthday###"+birthday);
										if (TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj") instanceof JSONArray) {
											
											
											JSONArray len = TCRMContractPartyRoleBObj.getJSONArray("ns1:TCRMContractPartyRoleIdentifierBObj");
											for (int l = 0; l <len.length() ; l++) {
												if (len.getJSONObject(l).toString().contains("\"ns1:Description\":\"F\"")) {
													
													
													String val = this.ContainKeyAndGetJSON(len.getJSONObject(l),"ns1:IdentifierId");
													JSONArray len2 = TCRMPersonBObj.getJSONArray("ns1:TCRMPartyIdentificationBObj");
														for (int j = 0; j < len2.length(); j++) {
															
															String val2 = this.ContainKeyAndGetJSON(len2.getJSONObject(j),"ns1:IdentificationIdPK");
															if (val.equals(val2)||RoleType21==false) {
																 ID = this.ContainKeyAndGetJSON(len2.getJSONObject(j),"ns1:IdentificationNumber");
//																 birthday =TCRMPersonBObj.get("ns1:BirthDate").toString();
																 RoleType21=true;
															}else{
																System.out.println("fail");
																mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"fail");
															}
															
														}
												}			
												}
										}else{
											
											
											System.out.println("TCRMContractPartyRoleIdentifierBObj jsonObject");
											System.out.println("TCRMContractPartyRoleIdentifierBObj###"+TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj"));
											mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"TCRMContractPartyRoleIdentifierBObj jsonObject");
//											mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"TCRMContractPartyRoleIdentifierBObj###"+TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj");
											
											
											if (TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj").toString().contains("\"ns1:Description\":\"F\"")) {
												
												System.out.println("ns1:Description has ");
												mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"ns1:Description has ");
												 JSONObject len = TCRMContractPartyRoleBObj.getJSONObject("ns1:TCRMContractPartyRoleIdentifierBObj");
												
												String val = this.ContainKeyAndGetJSON(len,"ns1:IdentifierId");
												
												JSONObject len2 = this.ContainKeyAndGetObject(TCRMPersonBObj, "ns1:TCRMPartyIdentificationBObj");
												//JSONArray len2 = TCRMPersonBObj.getJSONArray("ns1:TCRMPartyIdentificationBObj");
//													for (int j = 0; j < len2.length(); j++) {
														
														String val2 = this.ContainKeyAndGetJSON(len2,"ns1:IdentificationIdPK");
														if (val.equals(val2)||RoleType21==false) {
															 ID = this.ContainKeyAndGetJSON(len2,"ns1:IdentificationNumber");
//															 birthday =TCRMPersonBObj.get("ns1:BirthDate").toString();
															 RoleType21=true;
														}else{
															System.out.println("fail");
															mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"fail");
															
														}
														
//													}
											}	
											
											
										}
										
										
										
//										//20180606_新增取姓名
//										if (TCRMPersonBObj.has("ns1:TCRMPersonNameBObj") && TCRMPersonBObj.get("ns1:TCRMPersonNameBObj") instanceof JSONArray) {
//											JSONArray len = TCRMPersonBObj.getJSONArray("ns1:TCRMPersonNameBObj");
//											
//											for (int l = 0; l <len.length() ; l++) {
//												LastName = this.ContainKeyAndGetJSON(len.getJSONObject(l),"ns1:LastName");
//												mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"LastName: "+LastName);
//												
//											}
//										}else if(TCRMPersonBObj.has("ns1:TCRMPersonNameBObj") && TCRMPersonBObj.get("ns1:TCRMPersonNameBObj") instanceof JSONObject){
//											JSONObject TCRMPersonNameBObj = TCRMPersonBObj.getJSONObject("ns1:TCRMPersonNameBObj");
//											LastName = this.ContainKeyAndGetJSON(TCRMPersonNameBObj,"ns1:LastName");
//											mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"LastName: "+LastName);
//											
//										}else{
//											mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"get LastName fail");
//										}
										
										/////////////
										
										
										
									}else{
										
									}
									if (RoleType.equals("31")) {
										JSONObject TCRMExtension = this.ContainKeyAndGetObject(TCRMContractComponentBObj,"ns1:TCRMExtension");
										JSONObject XContractComponentBObjExt = this.ContainKeyAndGetObject(TCRMExtension,"ns1:XContractComponentBObjExt");
										Password = this.ContainKeyAndGetJSON(XContractComponentBObjExt, "ns1:Password");
										
										
										//20180606_新增取帳單地址
										JSONObject TCRMPersonBObj = this.ContainKeyAndGetObject(TCRMContractPartyRoleBObj,"ns1:TCRMPersonBObj");
										
										if (TCRMPersonBObj.has("ns1:TCRMPartyAddressBObj") && TCRMPersonBObj.get("ns1:TCRMPartyAddressBObj") instanceof JSONArray) {
											JSONArray len = TCRMPersonBObj.getJSONArray("ns1:TCRMPartyAddressBObj");
											
											for (int l = 0; l <len.length() ; l++) {
												AddressUsageType = this.ContainKeyAndGetJSON(len.getJSONObject(l),"ns1:AddressUsageType");
												
												if(AddressUsageType.equals("3")){
													JSONObject TCRMAddressBObj = len.getJSONObject(l).getJSONObject("ns1:TCRMAddressBObj");
													City = this.ContainKeyAndGetJSON(TCRMAddressBObj,"ns1:City");
													Region = this.ContainKeyAndGetJSON(TCRMAddressBObj,"ns1:Region");
													AddressLineOne = this.ContainKeyAndGetJSON(TCRMAddressBObj,"ns1:AddressLineOne");
													
													mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"City: "+City);
													mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"Region: "+Region);
													mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"AddressLineOne: "+AddressLineOne);
													
												}
												
												
												
											}
										}else if(TCRMPersonBObj.has("ns1:TCRMPartyAddressBObj") && TCRMPersonBObj.get("ns1:TCRMPartyAddressBObj") instanceof JSONObject){
											
											JSONObject TCRMPartyAddressBObj = TCRMPersonBObj.getJSONObject("ns1:TCRMPartyAddressBObj");
											
											AddressUsageType = this.ContainKeyAndGetJSON(TCRMPartyAddressBObj,"ns1:AddressUsageType");
											if(AddressUsageType.equals("3")){
												JSONObject TCRMAddressBObj = TCRMPartyAddressBObj.getJSONObject("ns1:TCRMAddressBObj");
												City = this.ContainKeyAndGetJSON(TCRMAddressBObj,"ns1:City");
												Region = this.ContainKeyAndGetJSON(TCRMAddressBObj,"ns1:Region");
												AddressLineOne = this.ContainKeyAndGetJSON(TCRMAddressBObj,"ns1:AddressLineOne");
												
												mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"City: "+City);
												mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"Region: "+Region);
												mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"AddressLineOne: "+AddressLineOne);
												
											}
											
											
										}else{
											
											mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"get Address fail");
											
										}
										
										//////////////
										
										
										//20180606_新增取姓名
										if (TCRMPersonBObj.has("ns1:TCRMPersonNameBObj") && TCRMPersonBObj.get("ns1:TCRMPersonNameBObj") instanceof JSONArray) {
											JSONArray len = TCRMPersonBObj.getJSONArray("ns1:TCRMPersonNameBObj");
											
											for (int l = 0; l <len.length() ; l++) {
												LastName = this.ContainKeyAndGetJSON(len.getJSONObject(l),"ns1:LastName");
												mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"LastName: "+LastName);
												
											}
										}else if(TCRMPersonBObj.has("ns1:TCRMPersonNameBObj") && TCRMPersonBObj.get("ns1:TCRMPersonNameBObj") instanceof JSONObject){
											JSONObject TCRMPersonNameBObj = TCRMPersonBObj.getJSONObject("ns1:TCRMPersonNameBObj");
											LastName = this.ContainKeyAndGetJSON(TCRMPersonNameBObj,"ns1:LastName");
											mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"LastName: "+LastName);
											
										}else{
											mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"get LastName fail");
										}
										
										
										///////////////
										
										
										RoleType31=true;
									}
									if (RoleType31==true && RoleType21==true) {
										break out;
									}

								} else {
								
								}

							}
						}
						
						this.assignJsonval(mySession,birthday,ID,Password,LastName,City,Region,AddressLineOne);
						
						
						
//						JSONObject returnHeader = this.ContainKeyAndGetObject(getContractByAccountIdOrSubscriberIdResponse,"ns0:returnHeader");
//						this.assignRreturnHeader(mySession, returnHeader);
//						// 取基本個資
//						if (TCRMContractBObj.has("ns1:TCRMContractComponentBObj")
//								&& (TCRMContractBObj.get("ns1:TCRMContractComponentBObj") instanceof JSONArray)) {
//							
//							out:for (int i = 0; i < TCRMContractBObj.length(); i++) {
//								JSONObject TCRMContractComponentBObj = TCRMContractBObj
//										.getJSONArray("ns1:TCRMContractComponentBObj").getJSONObject(i);
//								
//								if (TCRMContractComponentBObj.has("ns1:TCRMContractPartyRoleBObj")
//										&& (TCRMContractComponentBObj.get("ns1:TCRMContractPartyRoleBObj") instanceof JSONArray)) {
//									JSONArray TCRMContractPartyRoleBObjArray = TCRMContractComponentBObj.getJSONArray("ns1:TCRMContractPartyRoleBObj");
//									
//									
//									for (int j = 0; j < TCRMContractPartyRoleBObjArray.length(); j++) {
//										JSONObject TCRMContractPartyRoleBObj = TCRMContractPartyRoleBObjArray.getJSONObject(j);
//										String RoleType = this.ContainKeyAndGetJSON(TCRMContractPartyRoleBObj,"ns1:RoleType");
//
//										
//
//										//ID & Birthdate
//										if (RoleType.equals("21")) {
//											JSONObject TCRMPersonBObj = this.ContainKeyAndGetObject(TCRMContractPartyRoleBObj,"ns1:TCRMPersonBObj");
//											if (TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj") instanceof JSONArray) {
//												JSONArray len = TCRMContractPartyRoleBObj.getJSONArray("ns1:TCRMContractPartyRoleIdentifierBObj");
//												for (int l = 0; l <len.length() ; l++) {
//													if (len.getJSONObject(l).toString().contains("\"ns1:Description\":\"F\"")) {
//														String val = this.ContainKeyAndGetJSON(len.getJSONObject(l),"ns1:IdentifierId");
//														JSONArray len2 = TCRMPersonBObj.getJSONArray("ns1:TCRMPartyIdentificationBObj");
//															for (int k = 0; k < len2.length(); k++) {
//																
//																String val2 = this.ContainKeyAndGetJSON(len2.getJSONObject(k),"ns1:IdentificationIdPK");
//																if (val.equals(val2)||RoleType21==false) {
//																	 ID = this.ContainKeyAndGetJSON(len2.getJSONObject(k),"ns1:IdentificationNumber");
//																	 birthday =TCRMPersonBObj.get("ns1:BirthDate").toString();
//																	 RoleType21=true;
//																}else{
//																	System.out.println("fail");
//																}
//																
//															}
//													}			
//													}
//											}else if(TCRMContractPartyRoleBObj.has("ns1:TCRMContractPartyRoleIdentifierBObj") && TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj") instanceof JSONObject){
//												
//												JSONObject TCRMContractPartyRoleIdentifierBObj = TCRMContractPartyRoleBObj.getJSONObject("ns1:TCRMContractPartyRoleIdentifierBObj") ;
//
//												System.out.println("TCRMContractPartyRoleIdentifierBObj"+TCRMContractPartyRoleIdentifierBObj);
//												if (TCRMContractPartyRoleIdentifierBObj.toString().contains("\"ns1:Description\":\"F\"")) {
//													
//													
//													String val = this.ContainKeyAndGetJSON(TCRMContractPartyRoleIdentifierBObj,"ns1:IdentifierId");
//													 JSONObject TCRMPartyIdentificationBObj = TCRMPersonBObj.getJSONObject("ns1:TCRMPartyIdentificationBObj");
//													
//															
//															String val2 = this.ContainKeyAndGetJSON(TCRMPartyIdentificationBObj,"ns1:IdentificationIdPK");
//															if (val.equals(val2)||RoleType21==false) {
//																 ID = this.ContainKeyAndGetJSON(TCRMPartyIdentificationBObj,"ns1:IdentificationNumber");
//																 birthday =TCRMPersonBObj.get("ns1:BirthDate").toString();
//																 RoleType21=true;
//															}else{
//																System.out.println("fail");
//															}
//															
//												}
//												
//												
//											}else{
//												
//												
//												
//												if (TCRMContractPartyRoleBObj.has("ns1:TCRMContractPartyRoleIdentifierBObj")) {
//													
//													mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"BirthDate Response:" + TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj"));
//													mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"BirthDate getClass:" + TCRMContractPartyRoleBObj.getClass());
//													mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"BirthDate Response:" + TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj"));
//
//													
//													
//												}else{
//													mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"TCRMContractPartyRoleIdentifierBObj not find key:" + TCRMContractPartyRoleBObj);
//
//													
//												}
//												
//																
//											}
//											
//										}else{
//											
//										}
//										if (RoleType.equals("31")) {
//											JSONObject TCRMExtension = this.ContainKeyAndGetObject(TCRMContractComponentBObj,"ns1:TCRMExtension");
//											JSONObject XContractComponentBObjExt = this.ContainKeyAndGetObject(TCRMExtension,"ns1:XContractComponentBObjExt");
//											Password = this.ContainKeyAndGetJSON(XContractComponentBObjExt, "ns1:Password");
//											RoleType31=true;
//										}
//										if (RoleType31==true && RoleType21==true) {
//											break out;
//										}
//
//										
//										
//									}
//									
//									
//								} else if (TCRMContractComponentBObj.has("ns1:TCRMContractPartyRoleBObj")){
//									JSONObject TCRMContractPartyRoleBObj = this.ContainKeyAndGetObject(TCRMContractComponentBObj,"ns1:TCRMContractPartyRoleBObj");
//									String RoleType = this.ContainKeyAndGetJSON(TCRMContractPartyRoleBObj,"ns1:RoleType");
//									
//									
//									//ID & Birthdate
//									if (RoleType.equals("21")) {
//										JSONObject TCRMPersonBObj = this.ContainKeyAndGetObject(TCRMContractPartyRoleBObj,"ns1:TCRMPersonBObj");
//										if (TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj") instanceof JSONArray) {
//											JSONArray len = TCRMContractPartyRoleBObj.getJSONArray("ns1:TCRMContractPartyRoleIdentifierBObj");
//											for (int l = 0; l <len.length() ; l++) {
//												if (len.getJSONObject(l).toString().contains("\"ns1:Description\":\"F\"")) {
//													String val = this.ContainKeyAndGetJSON(len.getJSONObject(l),"ns1:IdentifierId");
//													JSONArray len2 = TCRMPersonBObj.getJSONArray("ns1:TCRMPartyIdentificationBObj");
//														for (int j = 0; j < len2.length(); j++) {
//															
//															String val2 = this.ContainKeyAndGetJSON(len2.getJSONObject(j),"ns1:IdentificationIdPK");
//															if (val.equals(val2)||RoleType21==false) {
//																 ID = this.ContainKeyAndGetJSON(len2.getJSONObject(j),"ns1:IdentificationNumber");
//																 birthday =TCRMPersonBObj.get("ns1:BirthDate").toString();
////																
//																 RoleType21=true;
//															}else{
//																System.out.println("fail");
//															}
//															
//														}
//												}			
//												}
//										}
//										
//									}else{
//										
//									}
//									if (RoleType.equals("31")&&RoleType31==false) {
//										JSONObject TCRMExtension = this.ContainKeyAndGetObject(TCRMContractComponentBObj,"ns1:TCRMExtension");
//										JSONObject XContractComponentBObjExt = this.ContainKeyAndGetObject(TCRMExtension,"ns1:XContractComponentBObjExt");
//										Password = this.ContainKeyAndGetJSON(XContractComponentBObjExt, "ns1:Password");
//										RoleType31=true;
//									}
//									if (RoleType31==true && RoleType21==true) {
//										
//										break out;
//									}
//
//								} else {
//								
//								}
//
//							}
//						
//						this.assignJsonval(mySession,birthday,ID,Password);
//						
//						
//						}

					}
//					this.assignJsonval(mySession,birthday,ID,Password);

				}
		}

	}

	public void assignJsonval(SCESession mySession, String BirthDate ,String IdentificationNumber,String Password, String LastName, String City, String Region, String AddressLineOne) {


		IVariableField BirthDate_varible = mySession
				.getVariableField(
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT,
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_FIELD_BIRTH_DATE);
		BirthDate_varible.setValue(BirthDate);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"BirthDate Response:" + BirthDate);

		IVariableField IdentificationNumber_varible = mySession
				.getVariableField(
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT,
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_FIELD_IDENTIFICATION_NUMBER);
		IdentificationNumber_varible.setValue(IdentificationNumber);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"IdentificationNumber Response:" + IdentificationNumber);
	
		IVariableField Password_varible = mySession
				.getVariableField(
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT,
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_FIELD_PASSWORD);
		Password_varible.setValue(Password);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"Password Response:" + Password);
		
		
//		IVariableField LastName_varible = mySession
//				.getVariableField(
//						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT,
//						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_FIELD_LAST_NAME);
//		LastName_varible.setValue(LastName);
//		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"LastName Response:" + LastName);
//		
//		
		
	}

	public void assignRreturnHeader(SCESession mySession,
			JSONObject returnHeaderval) {

		JSONObject returnCode = this.ContainKeyAndGetObject(returnHeaderval,
				"ns1:returnCode");
		String returnCode_content = this.ContainKeyAndGetJSON(returnCode,
				"content");
		IVariableField returnCode_varible = mySession
				.getVariableField(
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT,
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_FIELD_RETURN_CODE);
		returnCode_varible.setValue(returnCode_content);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,
				"returnCode_content Response:" + returnCode_content);

		JSONObject processName = this.ContainKeyAndGetObject(returnHeaderval,
				"ns1:processName");
		String processName_content = this.ContainKeyAndGetJSON(returnCode,
				"content");
		IVariableField processName_varible = mySession
				.getVariableField(
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT,
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_FIELD_PROCESS_NAME);
		processName_varible.setValue(processName_content);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,
				"processName_content Response:" + processName_content);

		JSONObject legacyCode = this.ContainKeyAndGetObject(returnHeaderval,
				"ns1:legacyCode");
		String legacyCode_content = this.ContainKeyAndGetJSON(returnCode,
				"content");
		IVariableField legacyCode_varible = mySession
				.getVariableField(
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT,
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_FIELD_LEGACY_CODE);
		legacyCode_varible.setValue(legacyCode_content);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,
				"legacyCode_content Response:" + legacyCode_content);

		JSONObject returnMesg = this.ContainKeyAndGetObject(returnHeaderval,
				"ns1:returnMesg");
		String returnMesg_content = this.ContainKeyAndGetJSON(returnCode,
				"content");
		IVariableField returnMesg_varible = mySession
				.getVariableField(
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT,
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_FIELD_RETURN_MESG);
		returnMesg_varible.setValue(returnMesg_content);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,
				"returnMesg_content Response:" + returnMesg_content);

		JSONObject processID = this.ContainKeyAndGetObject(returnHeaderval,
				"ns1:processID");
		String processID_content = this.ContainKeyAndGetJSON(returnCode,
				"content");
		IVariableField processID_varible = mySession
				.getVariableField(
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT,
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_FIELD_PROCESS_ID);
		processID_varible.setValue(processID_content);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,
				"processID_content Response:" + processID_content);

	}

	public void assignTestval(SCESession mySession, JSONObject TCRMPersonBObj) {

		// PROPERTIES
		IVariable variableRef_input = mySession
				.getVariable(IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_TEST);
		IComplexVariable complexVariable = variableRef_input
				.getComplexVariable();

		String BirthDate = complexVariable
				.getField(
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_TEST_FIELD_BIRTH_DATE)
				.getStringValue();
		IVariableField BirthDate_varible = mySession
				.getVariableField(
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT,
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_FIELD_BIRTH_DATE);
		BirthDate_varible.setValue(BirthDate);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,
				"BirthDate Response:" + BirthDate);

		String IdentificationNumber = complexVariable
				.getField(
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_TEST_FIELD_IDENTIFICATION_NUMBER)
				.getStringValue();
		IVariableField IdentificationNumber_varible = mySession
				.getVariableField(
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT,
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_FIELD_IDENTIFICATION_NUMBER);
		IdentificationNumber_varible.setValue(IdentificationNumber);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,
				"IdentificationNumber Response:" + IdentificationNumber);

		String returnCode_content = complexVariable
				.getField(
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_TEST_FIELD_RETURN_CODE)
				.getStringValue();
		IVariableField returnCode_varible = mySession
				.getVariableField(
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT,
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_FIELD_RETURN_CODE);
		returnCode_varible.setValue(returnCode_content);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,
				"returnCode_content Response:" + returnCode_content);

		String processName_content = complexVariable
				.getField(
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_TEST_FIELD_PROCESS_NAME)
				.getStringValue();
		IVariableField processName_varible = mySession
				.getVariableField(
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT,
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_FIELD_PROCESS_NAME);
		processName_varible.setValue(processName_content);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,
				"processName_content Response:" + processName_content);

		String legacyCode_content = complexVariable
				.getField(
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_TEST_FIELD_LEGACY_CODE)
				.getStringValue();
		IVariableField legacyCode_varible = mySession
				.getVariableField(
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT,
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_FIELD_LEGACY_CODE);
		legacyCode_varible.setValue(legacyCode_content);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,
				"legacyCode_content Response:" + legacyCode_content);

		String returnMesg_content = complexVariable
				.getField(
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_TEST_FIELD_RETURN_MESG)
				.getStringValue();
		IVariableField returnMesg_varible = mySession
				.getVariableField(
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT,
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_FIELD_RETURN_MESG);
		returnMesg_varible.setValue(returnMesg_content);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,
				"returnMesg_content Response:" + returnMesg_content);

		String processID_content = complexVariable
				.getField(
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_TEST_FIELD_PROCESS_ID)
				.getStringValue();
		IVariableField processID_varible = mySession
				.getVariableField(
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT,
						IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_FIELD_PROCESS_ID);
		processID_varible.setValue(processID_content);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,
				"processID_content Response:" + processID_content);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args){
//	
//	//prod_data
////	JSONObject ResponseJsonObject = new JSONObject("{\"Exception\":\"\",\"Data\":{\"SOAP-ENV:Envelope\":{\"SOAP-ENV:Body\":{\"ns0:getContractByAccountIdOrSubscriberIdResponse\":{\"ns0:returnHeader\":{\"ns1:returnCode\":{\"content\":\"Cust-006-028-01000\",\"xmlns:ns1\":\"http://www.fet.com.tw/ITSOA/schemas/Common-Domain/SharedResources/XSD/Base/Schema.xsd2\"},\"ns1:processName\":{\"content\":\"CRM-ReadinessBizServices/MDM/Processes/CRMCustBizService/Impl/getContractByAccountIdOrSubscriberId.process\",\"xmlns:ns1\":\"http://www.fet.com.tw/ITSOA/schemas/Common-Domain/SharedResources/XSD/Base/Schema.xsd2\"},\"ns1:legacyCode\":{\"content\":\"SUCCESS\",\"xmlns:ns1\":\"http://www.fet.com.tw/ITSOA/schemas/Common-Domain/SharedResources/XSD/Base/Schema.xsd2\"},\"ns1:returnMesg\":{\"content\":\"SUCCESS\",\"xmlns:ns1\":\"http://www.fet.com.tw/ITSOA/schemas/Common-Domain/SharedResources/XSD/Base/Schema.xsd2\"},\"ns1:processID\":{\"content\":577830412,\"xmlns:ns1\":\"http://www.fet.com.tw/ITSOA/schemas/Common-Domain/SharedResources/XSD/Base/Schema.xsd2\"}},\"ns1:ResponseControl\":{\"ns1:ResultCode\":\"SUCCESS\",\"ns1:DWLControl\":{\"ns1:clientSystemName\":\"IVR\",\"ns1:sessionId\":\"3172c788-0f11-433c-9eaa-df70526f0\",\"ns1:requesterLanguage\":500,\"ns1:pageStartIndex\":1,\"ns1:requesterName\":\"IVR\",\"ns1:requestOrigin\":\"IVR-MDMCS-MDMParty\",\"ns1:pageEndIndex\":50,\"ns1:requesterLocale\":\"zh_TW\"},\"ns1:ServiceTime\":270,\"xmlns:ns1\":\"http://services.mdm.fet.com/XSD/MDMSchema\"},\"ns1:TCRMContractBObj\":{\"ns1:TCRMContractComponentBObj\":[{\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XContractComponentBObjExt\",\"ns1:XContractComponentBObjExt\":{\"ns1:COHSubscriberStatusType\":1,\"ns1:PaymentDeductSMSIndicator\":\"Y\",\"ns1:DealerCode\":1805526,\"ns1:PaymentCategory\":\"PS\",\"ns1:BillingSubscriberStatusType\":1,\"ns1:InitialActiveDate\":\"2016-04-28 00:44:50.0\",\"ns1:COHDistinguishNameId\":\"MR340369730\",\"ns1:PrimResourceCategory\":\"4GMDN\",\"ns1:ServiceProvider\":\"FET\",\"ns1:NPOperator\":\"FET\",\"ns1:BillingSubscriberStatusValue\":\"A\",\"ns1:SubscriberStatusLastActivity\":\"SL_NEW_SUB_ACTIVATION\",\"ns1:SubscriberStatusReason\":\"M32\",\"ns1:SubscriberStatusLastUpdateDt\":\"2016-04-28 00:44:50.0\",\"ns1:AgentCode\":5526,\"ns1:ProductMigrationOriginalActiveDate\":\"2009-12-31 00:00:00.0\",\"ns1:MobileGenerationCode\":4,\"ns1:IVRLanguagePreferenceValue\":\"M\",\"ns1:PromotionSMSIndicator\":\"N\",\"ns1:ImageCode\":640004242480,\"ns1:ServiceSMSIndicator\":\"Y\",\"ns1:COHSubscriberStatusValue\":\"A\",\"ns1:ComponentID\":501046177551764004,\"ns1:ResourceStartDate\":\"2016-04-28 00:44:50.0\",\"ns1:IVRLanguagePreferenceType\":6}},\"ns1:ContractComponentType\":9,\"ns1:TCRMAdminNativeKeyBObj\":[{\"ns1:AdminFieldNameType\":120,\"ns1:AdminContractId\":340369730,\"ns1:ContractComponentIndicator\":\"Y\",\"ns1:AdminFieldNameValue\":\"SUBSCRIBER_ID\",\"ns1:AdminNativeKeyIdPK\":506346177551776804,\"ns1:ContractId\":501046177551764004},{\"ns1:AdminFieldNameType\":150,\"ns1:AdminContractId\":\"0929310810\",\"ns1:ContractComponentIndicator\":\"Y\",\"ns1:AdminFieldNameValue\":\"MSISDN\",\"ns1:AdminNativeKeyIdPK\":504446177551779304,\"ns1:ContractId\":501046177551764004},{\"ns1:AdminFieldNameType\":190,\"ns1:AdminContractId\":340339142,\"ns1:ContractComponentIndicator\":\"Y\",\"ns1:AdminFieldNameValue\":\"MIGRATION_ID\",\"ns1:AdminNativeKeyIdPK\":2331224448772177203,\"ns1:ContractId\":501046177551764004}],\"ns1:ProductValue\":\"精密工具\",\"ns1:ContractComponentValue\":\"L\",\"ns1:TCRMContractPartyRoleBObj\":[{\"ns1:StartDate\":\"2016-04-28 00:45:17.724\",\"ns1:PartyId\":1506231745456800434,\"ns1:ContractRoleIdPK\":503946177551772504,\"ns1:ComponentID\":1001257,\"ns1:RoleValue\":\"用戶\",\"ns1:TCRMContractPartyRoleIdentifierBObj\":[{\"ns1:Description\":\"F\",\"ns1:ContractPartyRoleIdentifierIdPK\":501346177551775004,\"ns1:IdentifierId\":1506231937117982072,\"ns1:ContractRoleId\":503946177551772504},{\"ns1:Description\":\"S\",\"ns1:ContractPartyRoleIdentifierIdPK\":506546177551775604,\"ns1:IdentifierId\":1506231935607353507,\"ns1:ContractRoleId\":503946177551772504}],\"ns1:TCRMContractRoleLocationBObj\":[{\"ns1:ContractRoleLocationIdPK\":503646177551772704,\"ns1:StartDate\":\"2016-04-28 00:45:17.726\",\"ns1:LocationGroupId\":1506240228142607958,\"ns1:TCRMPartyAddressBObj\":{\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XAddressGroupBObjExt\",\"ns1:XAddressGroupBObjExt\":\"\"},\"ns1:AddressUsageValue\":\"聯絡地址\",\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:AddressUsageType\":2,\"ns1:ComponentID\":1000196,\"ns1:PartyAddressIdPK\":1506240228142607958,\"ns1:TCRMAddressBObj\":{\"ns1:AddressIdPK\":1506232329487183580,\"ns1:ProvinceStateValue\":\"中華民國\",\"ns1:ProvinceStateType\":294,\"ns1:Region\":\"仁武區\",\"ns1:CountryValue\":\"中華民國\",\"ns1:StandardFormatingIndicator\":\"Y\",\"ns1:CountryType\":294,\"ns1:ZipPostalCode\":81450,\"ns1:City\":\"高雄市\",\"ns1:AddressLineOne\":\"文館路１號\"},\"ns1:AddressId\":1506232329487183580},\"ns1:ContractRoleId\":503946177551772504},{\"ns1:ContractRoleLocationIdPK\":502246177551774204,\"ns1:StartDate\":\"2016-04-28 00:45:17.741\",\"ns1:LocationGroupId\":1506240230326259556,\"ns1:TCRMPartyAddressBObj\":{\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XAddressGroupBObjExt\",\"ns1:XAddressGroupBObjExt\":\"\"},\"ns1:AddressUsageValue\":\"戶籍地址\",\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:AddressUsageType\":1,\"ns1:ComponentID\":1000196,\"ns1:PartyAddressIdPK\":1506240230326259556,\"ns1:TCRMAddressBObj\":{\"ns1:AddressIdPK\":1506232329487183580,\"ns1:ProvinceStateValue\":\"中華民國\",\"ns1:ProvinceStateType\":294,\"ns1:Region\":\"仁武區\",\"ns1:CountryValue\":\"中華民國\",\"ns1:StandardFormatingIndicator\":\"Y\",\"ns1:CountryType\":294,\"ns1:ZipPostalCode\":81450,\"ns1:City\":\"高雄市\",\"ns1:AddressLineOne\":\"文館路１號\"},\"ns1:AddressId\":1506232329487183580},\"ns1:ContractRoleId\":503946177551772504},{\"ns1:ContractRoleLocationIdPK\":502746177551774404,\"ns1:StartDate\":\"2016-04-28 00:45:17.743\",\"ns1:LocationGroupId\":508046173327020003,\"ns1:TCRMPartyContactMethodBObj\":{\"ns1:PartyContactMethodIdPK\":508046173327020003,\"ns1:ContactMethodUsageValue\":\"電話（住家）\",\"ns1:ContactMethodId\":504446173327018803,\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:TCRMContactMethodBObj\":{\"ns1:ContactMethodValue\":\"電話\",\"ns1:ContactMethodType\":1,\"ns1:ReferenceNumber\":\"07-3732707\",\"ns1:ContactMethodIdPK\":504446173327018803},\"ns1:ContactMethodUsageType\":11},\"ns1:ContractRoleId\":503946177551772504}],\"ns1:TCRMPersonBObj\":{\"ns1:MaritalStatusValue\":\"已婚\",\"ns1:CreatedDate\":\"2012-11-27 00:00:00.0\",\"ns1:CitizenshipType\":294,\"ns1:PartyActiveIndicator\":\"Y\",\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:PartyId\":1506231745456800434,\"ns1:TCRMPartyAddressBObj\":{\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XAddressGroupBObjExt\",\"ns1:XAddressGroupBObjExt\":\"\"},\"ns1:AddressUsageValue\":\"戶籍地址\",\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:AddressUsageType\":1,\"ns1:ComponentID\":1000196,\"ns1:PartyAddressIdPK\":1506240230326259556,\"ns1:TCRMAddressBObj\":{\"ns1:AddressIdPK\":1506232329487183580,\"ns1:ProvinceStateValue\":\"中華民國\",\"ns1:ProvinceStateType\":294,\"ns1:Region\":\"仁武區\",\"ns1:CountryValue\":\"中華民國\",\"ns1:StandardFormatingIndicator\":\"Y\",\"ns1:CountryType\":294,\"ns1:ZipPostalCode\":81450,\"ns1:City\":\"高雄市\",\"ns1:AddressLineOne\":\"文館路１號\"},\"ns1:AddressId\":1506232329487183580},\"ns1:TCRMPartyContactMethodBObj\":{\"ns1:PartyContactMethodIdPK\":508046173327020003,\"ns1:ContactMethodUsageValue\":\"電話（住家）\",\"ns1:ContactMethodId\":504446173327018803,\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:TCRMContactMethodBObj\":{\"ns1:ContactMethodValue\":\"電話\",\"ns1:ContactMethodType\":1,\"ns1:ReferenceNumber\":\"07-3732707\",\"ns1:ContactMethodIdPK\":504446173327018803},\"ns1:ContactMethodUsageType\":11},\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XPersonBObjExt\",\"ns1:XPersonBObjExt\":{\"ns1:JobType\":14,\"ns1:JobValue\":\"其它\",\"ns1:CustomerType\":\"I\",\"ns1:JobTitleType\":11,\"ns1:JobTitleValue\":\"其他\"}},\"ns1:TCRMPersonNameBObj\":{\"ns1:NameUsageType\":11,\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:LastName\":\"莊美幸\",\"ns1:PrefixValue\":\"小姐\",\"ns1:PrefixType\":1,\"ns1:StdLastName\":\"莊美幸\",\"ns1:NameUsageValue\":\"自然人全名（中文）\",\"ns1:LastUpdatedBy\":\"Catchup\",\"ns1:PersonPartyId\":1506231745456800434,\"ns1:PersonNameIdPK\":1506231958186896320},\"ns1:PartyType\":\"P\",\"ns1:MaritalStatusType\":1,\"ns1:DisplayName\":\"莊美幸\",\"ns1:TCRMPartyIdentificationBObj\":{\"ns1:IdentificationDescription\":\"F\",\"ns1:IdentificationType\":1,\"ns1:IdentificationIdPK\":1506231937117982072,\"ns1:IdentificationValue\":\"國民身分證\",\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:IdentificationNumber\":\"X220240574\"},\"ns1:ComponentID\":1000010,\"ns1:BirthDate\":\"1969-06-16 00:00:00.0\",\"ns1:CitizenshipValue\":\"中華民國\",\"ns1:PersonPartyId\":1506231745456800434},\"ns1:RoleType\":21,\"ns1:ContractComponentId\":501046177551764004},{\"ns1:StartDate\":\"2016-04-28 00:45:17.655\",\"ns1:PartyId\":1506231745456800434,\"ns1:ContractRoleIdPK\":506946177551765604,\"ns1:ComponentID\":1001257,\"ns1:RoleValue\":\"代理人\",\"ns1:TCRMContractPartyRoleIdentifierBObj\":{\"ns1:Description\":\"F\",\"ns1:ContractPartyRoleIdentifierIdPK\":508346177551769704,\"ns1:IdentifierId\":1506231937117982072,\"ns1:ContractRoleId\":506946177551765604},\"ns1:TCRMContractRoleLocationBObj\":[{\"ns1:ContractRoleLocationIdPK\":506446177551768004,\"ns1:StartDate\":\"2016-04-28 00:45:17.679\",\"ns1:LocationGroupId\":1506240230326259556,\"ns1:TCRMPartyAddressBObj\":{\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XAddressGroupBObjExt\",\"ns1:XAddressGroupBObjExt\":\"\"},\"ns1:AddressUsageValue\":\"戶籍地址\",\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:AddressUsageType\":1,\"ns1:ComponentID\":1000196,\"ns1:PartyAddressIdPK\":1506240230326259556,\"ns1:TCRMAddressBObj\":{\"ns1:AddressIdPK\":1506232329487183580,\"ns1:ProvinceStateValue\":\"中華民國\",\"ns1:ProvinceStateType\":294,\"ns1:Region\":\"仁武區\",\"ns1:CountryValue\":\"中華民國\",\"ns1:StandardFormatingIndicator\":\"Y\",\"ns1:CountryType\":294,\"ns1:ZipPostalCode\":81450,\"ns1:City\":\"高雄市\",\"ns1:AddressLineOne\":\"文館路１號\"},\"ns1:AddressId\":1506232329487183580},\"ns1:ContractRoleId\":506946177551765604},{\"ns1:ContractRoleLocationIdPK\":505246177551769004,\"ns1:StartDate\":\"2016-04-28 00:45:17.689\",\"ns1:LocationGroupId\":508046173327020003,\"ns1:TCRMPartyContactMethodBObj\":{\"ns1:PartyContactMethodIdPK\":508046173327020003,\"ns1:ContactMethodUsageValue\":\"電話（住家）\",\"ns1:ContactMethodId\":504446173327018803,\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:TCRMContactMethodBObj\":{\"ns1:ContactMethodValue\":\"電話\",\"ns1:ContactMethodType\":1,\"ns1:ReferenceNumber\":\"07-3732707\",\"ns1:ContactMethodIdPK\":504446173327018803},\"ns1:ContactMethodUsageType\":11},\"ns1:ContractRoleId\":506946177551765604}],\"ns1:TCRMPersonBObj\":{\"ns1:MaritalStatusValue\":\"已婚\",\"ns1:CreatedDate\":\"2012-11-27 00:00:00.0\",\"ns1:CitizenshipType\":294,\"ns1:PartyActiveIndicator\":\"Y\",\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:PartyId\":1506231745456800434,\"ns1:TCRMPartyAddressBObj\":{\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XAddressGroupBObjExt\",\"ns1:XAddressGroupBObjExt\":\"\"},\"ns1:AddressUsageValue\":\"戶籍地址\",\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:AddressUsageType\":1,\"ns1:ComponentID\":1000196,\"ns1:PartyAddressIdPK\":1506240230326259556,\"ns1:TCRMAddressBObj\":{\"ns1:AddressIdPK\":1506232329487183580,\"ns1:ProvinceStateValue\":\"中華民國\",\"ns1:ProvinceStateType\":294,\"ns1:Region\":\"仁武區\",\"ns1:CountryValue\":\"中華民國\",\"ns1:StandardFormatingIndicator\":\"Y\",\"ns1:CountryType\":294,\"ns1:ZipPostalCode\":81450,\"ns1:City\":\"高雄市\",\"ns1:AddressLineOne\":\"文館路１號\"},\"ns1:AddressId\":1506232329487183580},\"ns1:TCRMPartyContactMethodBObj\":{\"ns1:PartyContactMethodIdPK\":508046173327020003,\"ns1:ContactMethodUsageValue\":\"電話（住家）\",\"ns1:ContactMethodId\":504446173327018803,\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:TCRMContactMethodBObj\":{\"ns1:ContactMethodValue\":\"電話\",\"ns1:ContactMethodType\":1,\"ns1:ReferenceNumber\":\"07-3732707\",\"ns1:ContactMethodIdPK\":504446173327018803},\"ns1:ContactMethodUsageType\":11},\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XPersonBObjExt\",\"ns1:XPersonBObjExt\":{\"ns1:JobType\":14,\"ns1:JobValue\":\"其它\",\"ns1:CustomerType\":\"I\",\"ns1:JobTitleType\":11,\"ns1:JobTitleValue\":\"其他\"}},\"ns1:TCRMPersonNameBObj\":{\"ns1:NameUsageType\":11,\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:LastName\":\"莊美幸\",\"ns1:PrefixValue\":\"小姐\",\"ns1:PrefixType\":1,\"ns1:StdLastName\":\"莊美幸\",\"ns1:NameUsageValue\":\"自然人全名（中文）\",\"ns1:LastUpdatedBy\":\"Catchup\",\"ns1:PersonPartyId\":1506231745456800434,\"ns1:PersonNameIdPK\":1506231958186896320},\"ns1:PartyType\":\"P\",\"ns1:MaritalStatusType\":1,\"ns1:DisplayName\":\"莊美幸\",\"ns1:TCRMPartyIdentificationBObj\":{\"ns1:IdentificationDescription\":\"F\",\"ns1:IdentificationType\":1,\"ns1:IdentificationIdPK\":1506231937117982072,\"ns1:IdentificationValue\":\"國民身分證\",\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:IdentificationNumber\":\"X220240574\"},\"ns1:ComponentID\":1000010,\"ns1:BirthDate\":\"1969-06-16 00:00:00.0\",\"ns1:CitizenshipValue\":\"中華民國\",\"ns1:PersonPartyId\":1506231745456800434},\"ns1:RoleType\":51,\"ns1:ContractComponentId\":501046177551764004}],\"ns1:ContractStatusType\":1,\"ns1:ContractStatusValue\":\"A\",\"ns1:ComponentID\":1000438,\"ns1:ContractId\":506446173327123303,\"ns1:ProductType\":1,\"ns1:ContractComponentIdPK\":501046177551764004},{\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XContractComponentBObjExt\",\"ns1:XContractComponentBObjExt\":{\"ns1:dynamicValue\":{\"ns1:description\":\"小額帳款合併帳註記\",\"ns1:key\":\"PaymentConsolidationInd\",\"ns1:value\":\"D\"},\"ns1:BillFormatValue\":\"一般帳單\",\"ns1:BillDeliveryMethodType\":1,\"ns1:PaymentCategory\":\"PS\",\"ns1:ComponentID\":502846173327123803,\"ns1:BillDeliveryMethodValue\":\"書面帳單\",\"ns1:ServiceProvider\":\"FET\",\"ns1:BillFormatType\":1}},\"ns1:TCRMAdminNativeKeyBObj\":[{\"ns1:AdminFieldNameType\":130,\"ns1:AdminContractId\":414839358,\"ns1:ContractComponentIndicator\":\"Y\",\"ns1:AdminFieldNameValue\":\"ACCOUNT_ID\",\"ns1:AdminNativeKeyIdPK\":503746173327131603,\"ns1:ContractId\":502846173327123803},{\"ns1:AdminFieldNameType\":140,\"ns1:AdminContractId\":201031075,\"ns1:ContractComponentIndicator\":\"Y\",\"ns1:AdminFieldNameValue\":\"BEN_ID\",\"ns1:AdminNativeKeyIdPK\":97068003,\"ns1:ContractId\":502846173327123803}],\"ns1:ProductValue\":\"精密工具\",\"ns1:TCRMContractPartyRoleBObj\":{\"ns1:StartDate\":\"2016-04-27 13:01:11.242\",\"ns1:PartyId\":1506231745456800434,\"ns1:ContractRoleIdPK\":501146173327124303,\"ns1:ComponentID\":1001257,\"ns1:RoleValue\":\"帳戶\",\"ns1:TCRMContractPartyRoleIdentifierBObj\":[{\"ns1:Description\":\"F\",\"ns1:ContractPartyRoleIdentifierIdPK\":503046173327129803,\"ns1:IdentifierId\":1506231937117982072,\"ns1:ContractRoleId\":501146173327124303},{\"ns1:Description\":\"S\",\"ns1:ContractPartyRoleIdentifierIdPK\":503946173327131103,\"ns1:IdentifierId\":501046173327119103,\"ns1:ContractRoleId\":501146173327124303}],\"ns1:TCRMContractRoleLocationBObj\":[{\"ns1:ContractRoleLocationIdPK\":507846173327126203,\"ns1:StartDate\":\"2016-04-27 13:01:11.261\",\"ns1:LocationGroupId\":1506240228142607958,\"ns1:TCRMPartyAddressBObj\":{\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XAddressGroupBObjExt\",\"ns1:XAddressGroupBObjExt\":\"\"},\"ns1:AddressUsageValue\":\"聯絡地址\",\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:AddressUsageType\":2,\"ns1:ComponentID\":1000196,\"ns1:PartyAddressIdPK\":1506240228142607958,\"ns1:TCRMAddressBObj\":{\"ns1:AddressIdPK\":1506232329487183580,\"ns1:ProvinceStateValue\":\"中華民國\",\"ns1:ProvinceStateType\":294,\"ns1:Region\":\"仁武區\",\"ns1:CountryValue\":\"中華民國\",\"ns1:StandardFormatingIndicator\":\"Y\",\"ns1:CountryType\":294,\"ns1:ZipPostalCode\":81450,\"ns1:City\":\"高雄市\",\"ns1:AddressLineOne\":\"文館路１號\"},\"ns1:AddressId\":1506232329487183580},\"ns1:ContractRoleId\":501146173327124303},{\"ns1:ContractRoleLocationIdPK\":503446173327127403,\"ns1:StartDate\":\"2016-04-27 13:01:11.273\",\"ns1:LocationGroupId\":1506240230326259556,\"ns1:TCRMPartyAddressBObj\":{\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XAddressGroupBObjExt\",\"ns1:XAddressGroupBObjExt\":\"\"},\"ns1:AddressUsageValue\":\"戶籍地址\",\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:AddressUsageType\":1,\"ns1:ComponentID\":1000196,\"ns1:PartyAddressIdPK\":1506240230326259556,\"ns1:TCRMAddressBObj\":{\"ns1:AddressIdPK\":1506232329487183580,\"ns1:ProvinceStateValue\":\"中華民國\",\"ns1:ProvinceStateType\":294,\"ns1:Region\":\"仁武區\",\"ns1:CountryValue\":\"中華民國\",\"ns1:StandardFormatingIndicator\":\"Y\",\"ns1:CountryType\":294,\"ns1:ZipPostalCode\":81450,\"ns1:City\":\"高雄市\",\"ns1:AddressLineOne\":\"文館路１號\"},\"ns1:AddressId\":1506232329487183580},\"ns1:ContractRoleId\":501146173327124303},{\"ns1:ContractRoleLocationIdPK\":509846173327128803,\"ns1:StartDate\":\"2016-04-27 13:01:11.287\",\"ns1:LocationGroupId\":508046173327020003,\"ns1:TCRMPartyContactMethodBObj\":{\"ns1:PartyContactMethodIdPK\":508046173327020003,\"ns1:ContactMethodUsageValue\":\"電話（住家）\",\"ns1:ContactMethodId\":504446173327018803,\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:TCRMContactMethodBObj\":{\"ns1:ContactMethodValue\":\"電話\",\"ns1:ContactMethodType\":1,\"ns1:ReferenceNumber\":\"07-3732707\",\"ns1:ContactMethodIdPK\":504446173327018803},\"ns1:ContactMethodUsageType\":11},\"ns1:ContractRoleId\":501146173327124303},{\"ns1:ContractRoleLocationIdPK\":1921022848419287253,\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:LocationGroupId\":1506240210183630513,\"ns1:TCRMPartyAddressBObj\":{\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XAddressGroupBObjExt\",\"ns1:XAddressGroupBObjExt\":\"\"},\"ns1:AddressUsageValue\":\"帳單地址\",\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:AddressUsageType\":3,\"ns1:ComponentID\":1000196,\"ns1:PartyAddressIdPK\":1506240210183630513,\"ns1:TCRMAddressBObj\":{\"ns1:AddressIdPK\":1506232329487183580,\"ns1:ProvinceStateValue\":\"中華民國\",\"ns1:ProvinceStateType\":294,\"ns1:Region\":\"仁武區\",\"ns1:CountryValue\":\"中華民國\",\"ns1:StandardFormatingIndicator\":\"Y\",\"ns1:CountryType\":294,\"ns1:ZipPostalCode\":81450,\"ns1:City\":\"高雄市\",\"ns1:AddressLineOne\":\"文館路１號\"},\"ns1:AddressId\":1506232329487183580},\"ns1:ContractRoleId\":501146173327124303}],\"ns1:TCRMPersonBObj\":{\"ns1:MaritalStatusValue\":\"已婚\",\"ns1:CreatedDate\":\"2012-11-27 00:00:00.0\",\"ns1:CitizenshipType\":294,\"ns1:PartyActiveIndicator\":\"Y\",\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:PartyId\":1506231745456800434,\"ns1:TCRMPartyAddressBObj\":[{\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XAddressGroupBObjExt\",\"ns1:XAddressGroupBObjExt\":\"\"},\"ns1:AddressUsageValue\":\"聯絡地址\",\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:AddressUsageType\":2,\"ns1:ComponentID\":1000196,\"ns1:PartyAddressIdPK\":1506240228142607958,\"ns1:TCRMAddressBObj\":{\"ns1:AddressIdPK\":1506232329487183580,\"ns1:ProvinceStateValue\":\"中華民國\",\"ns1:ProvinceStateType\":294,\"ns1:Region\":\"仁武區\",\"ns1:CountryValue\":\"中華民國\",\"ns1:StandardFormatingIndicator\":\"Y\",\"ns1:CountryType\":294,\"ns1:ZipPostalCode\":81450,\"ns1:City\":\"高雄市\",\"ns1:AddressLineOne\":\"文館路１號\"},\"ns1:AddressId\":1506232329487183580},{\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XAddressGroupBObjExt\",\"ns1:XAddressGroupBObjExt\":\"\"},\"ns1:AddressUsageValue\":\"戶籍地址\",\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:AddressUsageType\":1,\"ns1:ComponentID\":1000196,\"ns1:PartyAddressIdPK\":1506240230326259556,\"ns1:TCRMAddressBObj\":{\"ns1:AddressIdPK\":1506232329487183580,\"ns1:ProvinceStateValue\":\"中華民國\",\"ns1:ProvinceStateType\":294,\"ns1:Region\":\"仁武區\",\"ns1:CountryValue\":\"中華民國\",\"ns1:StandardFormatingIndicator\":\"Y\",\"ns1:CountryType\":294,\"ns1:ZipPostalCode\":81450,\"ns1:City\":\"高雄市\",\"ns1:AddressLineOne\":\"文館路１號\"},\"ns1:AddressId\":1506232329487183580},{\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XAddressGroupBObjExt\",\"ns1:XAddressGroupBObjExt\":\"\"},\"ns1:AddressUsageValue\":\"帳單地址\",\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:AddressUsageType\":3,\"ns1:ComponentID\":1000196,\"ns1:PartyAddressIdPK\":1506240210183630513,\"ns1:TCRMAddressBObj\":{\"ns1:AddressIdPK\":1506232329487183580,\"ns1:ProvinceStateValue\":\"中華民國\",\"ns1:ProvinceStateType\":294,\"ns1:Region\":\"仁武區\",\"ns1:CountryValue\":\"中華民國\",\"ns1:StandardFormatingIndicator\":\"Y\",\"ns1:CountryType\":294,\"ns1:ZipPostalCode\":81450,\"ns1:City\":\"高雄市\",\"ns1:AddressLineOne\":\"文館路１號\"},\"ns1:AddressId\":1506232329487183580}],\"ns1:TCRMPartyContactMethodBObj\":{\"ns1:PartyContactMethodIdPK\":508046173327020003,\"ns1:ContactMethodUsageValue\":\"電話（住家）\",\"ns1:ContactMethodId\":504446173327018803,\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:TCRMContactMethodBObj\":{\"ns1:ContactMethodValue\":\"電話\",\"ns1:ContactMethodType\":1,\"ns1:ReferenceNumber\":\"07-3732707\",\"ns1:ContactMethodIdPK\":504446173327018803},\"ns1:ContactMethodUsageType\":11},\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XPersonBObjExt\",\"ns1:XPersonBObjExt\":{\"ns1:JobType\":14,\"ns1:JobValue\":\"其它\",\"ns1:CustomerType\":\"I\",\"ns1:JobTitleType\":11,\"ns1:JobTitleValue\":\"其他\"}},\"ns1:TCRMPersonNameBObj\":{\"ns1:NameUsageType\":11,\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:LastName\":\"莊美幸\",\"ns1:PrefixValue\":\"小姐\",\"ns1:PrefixType\":1,\"ns1:StdLastName\":\"莊美幸\",\"ns1:NameUsageValue\":\"自然人全名（中文）\",\"ns1:LastUpdatedBy\":\"Catchup\",\"ns1:PersonPartyId\":1506231745456800434,\"ns1:PersonNameIdPK\":1506231958186896320},\"ns1:PartyType\":\"P\",\"ns1:MaritalStatusType\":1,\"ns1:DisplayName\":\"莊美幸\",\"ns1:TCRMPartyIdentificationBObj\":[{\"ns1:IdentificationDescription\":\"F\",\"ns1:IdentificationType\":1,\"ns1:IdentificationIdPK\":1506231937117982072,\"ns1:IdentificationValue\":\"國民身分證\",\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:IdentificationNumber\":\"X220240574\"},{\"ns1:IdentificationDescription\":\"S\",\"ns1:IdentificationType\":2,\"ns1:IdentificationIdPK\":501046173327119103,\"ns1:IdentificationValue\":\"統一編號\",\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:IdentificationNumber\":\"000008463118\"}],\"ns1:ComponentID\":1000010,\"ns1:BirthDate\":\"1969-06-16 00:00:00.0\",\"ns1:CitizenshipValue\":\"中華民國\",\"ns1:PersonPartyId\":1506231745456800434},\"ns1:RoleType\":31,\"ns1:ContractComponentId\":502846173327123803},\"ns1:ContractStatusType\":1,\"ns1:BaseIndicator\":\"Y\",\"ns1:ContractStatusValue\":\"A\",\"ns1:ComponentID\":1000438,\"ns1:ContractId\":506446173327123303,\"ns1:ProductType\":1,\"ns1:ContractComponentIdPK\":502846173327123803}],\"xmlns:ns1\":\"http://services.mdm.fet.com/XSD/MDMSchema\"},\"ns1:TxResult\":{\"ns1:ResultCode\":\"SUCCESS\",\"xmlns:ns1\":\"http://services.mdm.fet.com/XSD/MDMSchema\"},\"xmlns:ns0\":\"http://www.example.org/CRMCustBizService\"}},\"xmlns:SOAP-ENV\":\"http://schemas.xmlsoap.org/soap/envelope/\"}}}");
//	
//	//test02_data
//	JSONObject ResponseJsonObject = new JSONObject("{\"Exception\":\"\",\"Data\":{\"SOAP-ENV:Envelope\":{\"SOAP-ENV:Body\":{\"ns0:getContractByAccountIdOrSubscriberIdResponse\":{\"ns0:returnHeader\":{\"ns1:returnCode\":{\"content\":\"Cust-006-028-01000\",\"xmlns:ns1\":\"http://www.fet.com.tw/ITSOA/schemas/Common-Domain/SharedResources/XSD/Base/Schema.xsd2\"},\"ns1:processName\":{\"content\":\"CRM-ReadinessBizServices/MDM/Processes/CRMCustBizService/Impl/getContractByAccountIdOrSubscriberId.process\",\"xmlns:ns1\":\"http://www.fet.com.tw/ITSOA/schemas/Common-Domain/SharedResources/XSD/Base/Schema.xsd2\"},\"ns1:legacyCode\":{\"content\":\"SUCCESS\",\"xmlns:ns1\":\"http://www.fet.com.tw/ITSOA/schemas/Common-Domain/SharedResources/XSD/Base/Schema.xsd2\"},\"ns1:returnMesg\":{\"content\":\"SUCCESS\",\"xmlns:ns1\":\"http://www.fet.com.tw/ITSOA/schemas/Common-Domain/SharedResources/XSD/Base/Schema.xsd2\"},\"ns1:processID\":{\"content\":6840324,\"xmlns:ns1\":\"http://www.fet.com.tw/ITSOA/schemas/Common-Domain/SharedResources/XSD/Base/Schema.xsd2\"}},\"ns1:ResponseControl\":{\"ns1:ResultCode\":\"SUCCESS\",\"ns1:DWLControl\":{\"ns1:clientSystemName\":\"IVR\",\"ns1:sessionId\":\"3172c788-0f11-433c-9eaa-df70526f0\",\"ns1:requesterLanguage\":500,\"ns1:pageStartIndex\":1,\"ns1:requesterName\":\"IVR\",\"ns1:requestOrigin\":\"IVR-MDMCS-MDMParty\",\"ns1:pageEndIndex\":50,\"ns1:requesterLocale\":\"zh_TW\"},\"ns1:ServiceTime\":356,\"xmlns:ns1\":\"http://services.mdm.fet.com/XSD/MDMSchema\"},\"ns1:TCRMContractBObj\":{\"ns1:TCRMContractComponentBObj\":[{\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XContractComponentBObjExt\",\"ns1:XContractComponentBObjExt\":{\"ns1:COHSubscriberStatusType\":1,\"ns1:PaymentDeductSMSIndicator\":\"Y\",\"ns1:DealerCode\":1805526,\"ns1:PaymentCategory\":\"PS\",\"ns1:BillingSubscriberStatusType\":1,\"ns1:InitialActiveDate\":\"2016-04-28 00:44:50.0\",\"ns1:COHDistinguishNameId\":\"MR340369730\",\"ns1:PrimResourceCategory\":\"4GMDN\",\"ns1:ServiceProvider\":\"FET\",\"ns1:NPOperator\":\"FET\",\"ns1:BillingSubscriberStatusValue\":\"A\",\"ns1:SubscriberStatusLastActivity\":\"SL_NEW_SUB_ACTIVATION\",\"ns1:SubscriberStatusReason\":\"M32\",\"ns1:SubscriberStatusLastUpdateDt\":\"2016-04-28 00:44:50.0\",\"ns1:AgentCode\":5526,\"ns1:ProductMigrationOriginalActiveDate\":\"2009-12-31 00:00:00.0\",\"ns1:MobileGenerationCode\":4,\"ns1:IVRLanguagePreferenceValue\":\"M\",\"ns1:PromotionSMSIndicator\":\"N\",\"ns1:ImageCode\":640004242480,\"ns1:ServiceSMSIndicator\":\"Y\",\"ns1:COHSubscriberStatusValue\":\"A\",\"ns1:ComponentID\":501046177551764004,\"ns1:ResourceStartDate\":\"2016-04-28 00:44:50.0\",\"ns1:IVRLanguagePreferenceType\":6}},\"ns1:ContractComponentType\":9,\"ns1:TCRMAdminNativeKeyBObj\":[{\"ns1:AdminFieldNameType\":120,\"ns1:AdminContractId\":340369730,\"ns1:ContractComponentIndicator\":\"Y\",\"ns1:AdminFieldNameValue\":\"SUBSCRIBER_ID\",\"ns1:AdminNativeKeyIdPK\":506346177551776804,\"ns1:ContractId\":501046177551764004},{\"ns1:AdminFieldNameType\":150,\"ns1:AdminContractId\":\"0929310810\",\"ns1:ContractComponentIndicator\":\"Y\",\"ns1:AdminFieldNameValue\":\"MSISDN\",\"ns1:AdminNativeKeyIdPK\":504446177551779304,\"ns1:ContractId\":501046177551764004},{\"ns1:AdminFieldNameType\":190,\"ns1:AdminContractId\":340339142,\"ns1:ContractComponentIndicator\":\"Y\",\"ns1:AdminFieldNameValue\":\"MIGRATION_ID\",\"ns1:AdminNativeKeyIdPK\":2331224448772177203,\"ns1:ContractId\":501046177551764004}],\"ns1:ProductValue\":\"精密工具\",\"ns1:ContractComponentValue\":\"L\",\"ns1:TCRMContractPartyRoleBObj\":[{\"ns1:StartDate\":\"2016-04-28 00:45:17.724\",\"ns1:PartyId\":1506231745456800434,\"ns1:ContractRoleIdPK\":503946177551772504,\"ns1:ComponentID\":1001257,\"ns1:RoleValue\":\"用戶\",\"ns1:TCRMContractPartyRoleIdentifierBObj\":[{\"ns1:Description\":\"F\",\"ns1:ContractPartyRoleIdentifierIdPK\":501346177551775004,\"ns1:IdentifierId\":1506231937117982072,\"ns1:ContractRoleId\":503946177551772504},{\"ns1:Description\":\"S\",\"ns1:ContractPartyRoleIdentifierIdPK\":506546177551775604,\"ns1:IdentifierId\":1506231935607353507,\"ns1:ContractRoleId\":503946177551772504}],\"ns1:TCRMContractRoleLocationBObj\":[{\"ns1:ContractRoleLocationIdPK\":503646177551772704,\"ns1:StartDate\":\"2016-04-28 00:45:17.726\",\"ns1:LocationGroupId\":1506240228142607958,\"ns1:TCRMPartyAddressBObj\":{\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XAddressGroupBObjExt\",\"ns1:XAddressGroupBObjExt\":\"\"},\"ns1:AddressUsageValue\":\"聯絡地址\",\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:AddressUsageType\":2,\"ns1:ComponentID\":1000196,\"ns1:PartyAddressIdPK\":1506240228142607958,\"ns1:TCRMAddressBObj\":{\"ns1:AddressIdPK\":1506232329487183580,\"ns1:ProvinceStateValue\":\"中華民國\",\"ns1:ProvinceStateType\":294,\"ns1:Region\":\"仁武區\",\"ns1:CountryValue\":\"中華民國\",\"ns1:StandardFormatingIndicator\":\"Y\",\"ns1:CountryType\":294,\"ns1:ZipPostalCode\":81450,\"ns1:City\":\"高雄市\",\"ns1:AddressLineOne\":\"四川路一段20393264號\"},\"ns1:AddressId\":1506232329487183580},\"ns1:ContractRoleId\":503946177551772504},{\"ns1:ContractRoleLocationIdPK\":502246177551774204,\"ns1:StartDate\":\"2016-04-28 00:45:17.741\",\"ns1:LocationGroupId\":1506240230326259556,\"ns1:TCRMPartyAddressBObj\":{\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XAddressGroupBObjExt\",\"ns1:XAddressGroupBObjExt\":\"\"},\"ns1:AddressUsageValue\":\"戶籍地址\",\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:AddressUsageType\":1,\"ns1:ComponentID\":1000196,\"ns1:PartyAddressIdPK\":1506240230326259556,\"ns1:TCRMAddressBObj\":{\"ns1:AddressIdPK\":1506232329487183580,\"ns1:ProvinceStateValue\":\"中華民國\",\"ns1:ProvinceStateType\":294,\"ns1:Region\":\"仁武區\",\"ns1:CountryValue\":\"中華民國\",\"ns1:StandardFormatingIndicator\":\"Y\",\"ns1:CountryType\":294,\"ns1:ZipPostalCode\":81450,\"ns1:City\":\"高雄市\",\"ns1:AddressLineOne\":\"四川路一段20393264號\"},\"ns1:AddressId\":1506232329487183580},\"ns1:ContractRoleId\":503946177551772504},{\"ns1:ContractRoleLocationIdPK\":502746177551774404,\"ns1:StartDate\":\"2016-04-28 00:45:17.743\",\"ns1:LocationGroupId\":508046173327020003,\"ns1:TCRMPartyContactMethodBObj\":{\"ns1:PartyContactMethodIdPK\":508046173327020003,\"ns1:ContactMethodUsageValue\":\"電話（住家）\",\"ns1:ContactMethodId\":504446173327018803,\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:TCRMContactMethodBObj\":{\"ns1:ContactMethodValue\":\"電話\",\"ns1:ContactMethodType\":1,\"ns1:ReferenceNumber\":\"02-32354679\",\"ns1:ContactMethodIdPK\":504446173327018803},\"ns1:ContactMethodUsageType\":11},\"ns1:ContractRoleId\":503946177551772504}],\"ns1:TCRMPersonBObj\":{\"ns1:MaritalStatusValue\":\"已婚\",\"ns1:CreatedDate\":\"2012-11-27 00:00:00.0\",\"ns1:CitizenshipType\":294,\"ns1:PartyActiveIndicator\":\"Y\",\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:PartyId\":1506231745456800434,\"ns1:TCRMPartyAddressBObj\":[{\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XAddressGroupBObjExt\",\"ns1:XAddressGroupBObjExt\":\"\"},\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:AddressUsageValue\":\"聯絡地址\",\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:AddressUsageType\":2,\"ns1:ComponentID\":1000196,\"ns1:PartyAddressIdPK\":1506240228142607958,\"ns1:TCRMAddressBObj\":{\"ns1:AddressIdPK\":1506232329487183580,\"ns1:ProvinceStateValue\":\"中華民國\",\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:ProvinceStateType\":294,\"ns1:Region\":\"仁武區\",\"ns1:CountryValue\":\"中華民國\",\"ns1:StandardFormatingIndicator\":\"Y\",\"ns1:CountryType\":294,\"ns1:ZipPostalCode\":81450,\"ns1:City\":\"高雄市\",\"ns1:AddressLineOne\":\"四川路一段20393264號\"},\"ns1:AddressId\":1506232329487183580},{\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XAddressGroupBObjExt\",\"ns1:XAddressGroupBObjExt\":\"\"},\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:AddressUsageValue\":\"戶籍地址\",\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:AddressUsageType\":1,\"ns1:ComponentID\":1000196,\"ns1:PartyAddressIdPK\":1506240230326259556,\"ns1:TCRMAddressBObj\":{\"ns1:AddressIdPK\":1506232329487183580,\"ns1:ProvinceStateValue\":\"中華民國\",\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:ProvinceStateType\":294,\"ns1:Region\":\"仁武區\",\"ns1:CountryValue\":\"中華民國\",\"ns1:StandardFormatingIndicator\":\"Y\",\"ns1:CountryType\":294,\"ns1:ZipPostalCode\":81450,\"ns1:City\":\"高雄市\",\"ns1:AddressLineOne\":\"四川路一段20393264號\"},\"ns1:AddressId\":1506232329487183580}],\"ns1:TCRMPartyContactMethodBObj\":{\"ns1:PartyContactMethodIdPK\":508046173327020003,\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:ContactMethodUsageValue\":\"電話（住家）\",\"ns1:ContactMethodId\":504446173327018803,\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:TCRMContactMethodBObj\":{\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:ContactMethodValue\":\"電話\",\"ns1:ContactMethodType\":1,\"ns1:ReferenceNumber\":\"02-32354679\",\"ns1:ContactMethodIdPK\":504446173327018803},\"ns1:ContactMethodUsageType\":11},\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XPersonBObjExt\",\"ns1:XPersonBObjExt\":{\"ns1:JobType\":14,\"ns1:JobValue\":\"其它\",\"ns1:CustomerType\":\"I\",\"ns1:JobTitleType\":11,\"ns1:JobTitleValue\":\"其他\"}},\"ns1:TCRMPersonNameBObj\":{\"ns1:NameUsageType\":11,\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:LastName\":\"莊*幸\",\"ns1:PrefixValue\":\"小姐\",\"ns1:PrefixType\":1,\"ns1:StdLastName\":\"莊*幸\",\"ns1:NameUsageValue\":\"自然人全名（中文）\",\"ns1:LastUpdatedBy\":\"Catchup\",\"ns1:PersonPartyId\":1506231745456800434,\"ns1:PersonNameIdPK\":1506231958186896320},\"ns1:PartyType\":\"P\",\"ns1:MaritalStatusType\":1,\"ns1:DisplayName\":\"莊*幸\",\"ns1:TCRMPartyIdentificationBObj\":[{\"ns1:IdentificationDescription\":\"F\",\"ns1:IdentificationType\":1,\"ns1:IdentificationIdPK\":1506231937117982072,\"ns1:IdentificationValue\":\"國民身分證\",\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:IdentificationNumber\":\"X220240574\"},{\"ns1:IdentificationDescription\":\"S\",\"ns1:IdentificationType\":5,\"ns1:IdentificationIdPK\":1506231935607353507,\"ns1:IdentificationValue\":\"全民健保卡\",\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:IdentificationNumber\":\"000008463118\"}],\"ns1:ComponentID\":1000010,\"ns1:BirthDate\":\"1971-06-21 00:00:00.0\",\"ns1:CitizenshipValue\":\"中華民國\",\"ns1:PersonPartyId\":1506231745456800434},\"ns1:RoleType\":21,\"ns1:ContractComponentId\":501046177551764004},{\"ns1:StartDate\":\"2016-04-28 00:45:17.655\",\"ns1:PartyId\":1506231745456800434,\"ns1:ContractRoleIdPK\":506946177551765604,\"ns1:ComponentID\":1001257,\"ns1:RoleValue\":\"代理人\",\"ns1:TCRMContractPartyRoleIdentifierBObj\":{\"ns1:Description\":\"F\",\"ns1:ContractPartyRoleIdentifierIdPK\":508346177551769704,\"ns1:IdentifierId\":1506231937117982072,\"ns1:ContractRoleId\":506946177551765604},\"ns1:TCRMContractRoleLocationBObj\":[{\"ns1:ContractRoleLocationIdPK\":506446177551768004,\"ns1:StartDate\":\"2016-04-28 00:45:17.679\",\"ns1:LocationGroupId\":1506240230326259556,\"ns1:TCRMPartyAddressBObj\":{\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XAddressGroupBObjExt\",\"ns1:XAddressGroupBObjExt\":\"\"},\"ns1:AddressUsageValue\":\"戶籍地址\",\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:AddressUsageType\":1,\"ns1:ComponentID\":1000196,\"ns1:PartyAddressIdPK\":1506240230326259556,\"ns1:TCRMAddressBObj\":{\"ns1:AddressIdPK\":1506232329487183580,\"ns1:ProvinceStateValue\":\"中華民國\",\"ns1:ProvinceStateType\":294,\"ns1:Region\":\"仁武區\",\"ns1:CountryValue\":\"中華民國\",\"ns1:StandardFormatingIndicator\":\"Y\",\"ns1:CountryType\":294,\"ns1:ZipPostalCode\":81450,\"ns1:City\":\"高雄市\",\"ns1:AddressLineOne\":\"四川路一段20393264號\"},\"ns1:AddressId\":1506232329487183580},\"ns1:ContractRoleId\":506946177551765604},{\"ns1:ContractRoleLocationIdPK\":505246177551769004,\"ns1:StartDate\":\"2016-04-28 00:45:17.689\",\"ns1:LocationGroupId\":508046173327020003,\"ns1:TCRMPartyContactMethodBObj\":{\"ns1:PartyContactMethodIdPK\":508046173327020003,\"ns1:ContactMethodUsageValue\":\"電話（住家）\",\"ns1:ContactMethodId\":504446173327018803,\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:TCRMContactMethodBObj\":{\"ns1:ContactMethodValue\":\"電話\",\"ns1:ContactMethodType\":1,\"ns1:ReferenceNumber\":\"02-32354679\",\"ns1:ContactMethodIdPK\":504446173327018803},\"ns1:ContactMethodUsageType\":11},\"ns1:ContractRoleId\":506946177551765604}],\"ns1:TCRMPersonBObj\":{\"ns1:MaritalStatusValue\":\"已婚\",\"ns1:CreatedDate\":\"2012-11-27 00:00:00.0\",\"ns1:CitizenshipType\":294,\"ns1:PartyActiveIndicator\":\"Y\",\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:PartyId\":1506231745456800434,\"ns1:TCRMPartyAddressBObj\":{\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XAddressGroupBObjExt\",\"ns1:XAddressGroupBObjExt\":\"\"},\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:AddressUsageValue\":\"戶籍地址\",\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:AddressUsageType\":1,\"ns1:ComponentID\":1000196,\"ns1:PartyAddressIdPK\":1506240230326259556,\"ns1:TCRMAddressBObj\":{\"ns1:AddressIdPK\":1506232329487183580,\"ns1:ProvinceStateValue\":\"中華民國\",\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:ProvinceStateType\":294,\"ns1:Region\":\"仁武區\",\"ns1:CountryValue\":\"中華民國\",\"ns1:StandardFormatingIndicator\":\"Y\",\"ns1:CountryType\":294,\"ns1:ZipPostalCode\":81450,\"ns1:City\":\"高雄市\",\"ns1:AddressLineOne\":\"四川路一段20393264號\"},\"ns1:AddressId\":1506232329487183580},\"ns1:TCRMPartyContactMethodBObj\":{\"ns1:PartyContactMethodIdPK\":508046173327020003,\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:ContactMethodUsageValue\":\"電話（住家）\",\"ns1:ContactMethodId\":504446173327018803,\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:TCRMContactMethodBObj\":{\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:ContactMethodValue\":\"電話\",\"ns1:ContactMethodType\":1,\"ns1:ReferenceNumber\":\"02-32354679\",\"ns1:ContactMethodIdPK\":504446173327018803},\"ns1:ContactMethodUsageType\":11},\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XPersonBObjExt\",\"ns1:XPersonBObjExt\":{\"ns1:JobType\":14,\"ns1:JobValue\":\"其它\",\"ns1:CustomerType\":\"I\",\"ns1:JobTitleType\":11,\"ns1:JobTitleValue\":\"其他\"}},\"ns1:TCRMPersonNameBObj\":{\"ns1:NameUsageType\":11,\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:LastName\":\"莊*幸\",\"ns1:PrefixValue\":\"小姐\",\"ns1:PrefixType\":1,\"ns1:StdLastName\":\"莊*幸\",\"ns1:NameUsageValue\":\"自然人全名（中文）\",\"ns1:LastUpdatedBy\":\"Catchup\",\"ns1:PersonPartyId\":1506231745456800434,\"ns1:PersonNameIdPK\":1506231958186896320},\"ns1:PartyType\":\"P\",\"ns1:MaritalStatusType\":1,\"ns1:DisplayName\":\"莊*幸\",\"ns1:TCRMPartyIdentificationBObj\":{\"ns1:IdentificationDescription\":\"F\",\"ns1:IdentificationType\":1,\"ns1:IdentificationIdPK\":1506231937117982072,\"ns1:IdentificationValue\":\"國民身分證\",\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:IdentificationNumber\":\"X220240574\"},\"ns1:ComponentID\":1000010,\"ns1:BirthDate\":\"1971-06-21 00:00:00.0\",\"ns1:CitizenshipValue\":\"中華民國\",\"ns1:PersonPartyId\":1506231745456800434},\"ns1:RoleType\":51,\"ns1:ContractComponentId\":501046177551764004}],\"ns1:ContractStatusType\":4,\"ns1:ContractStatusValue\":\"C\",\"ns1:ComponentID\":1000438,\"ns1:ContractId\":506446173327123303,\"ns1:ProductType\":1,\"ns1:ContractComponentIdPK\":501046177551764004},{\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XContractComponentBObjExt\",\"ns1:XContractComponentBObjExt\":{\"ns1:dynamicValue\":{\"ns1:description\":\"小額帳款合併帳註記\",\"ns1:key\":\"PaymentConsolidationInd\",\"ns1:value\":\"D\"},\"ns1:BillFormatValue\":\"一般帳單\",\"ns1:BillDeliveryMethodType\":1,\"ns1:PaymentCategory\":\"PS\",\"ns1:ComponentID\":502846173327123803,\"ns1:BillDeliveryMethodValue\":\"書面帳單\",\"ns1:ServiceProvider\":\"FET\",\"ns1:BillFormatType\":1}},\"ns1:TCRMAdminNativeKeyBObj\":[{\"ns1:AdminFieldNameType\":130,\"ns1:AdminContractId\":414839358,\"ns1:ContractComponentIndicator\":\"Y\",\"ns1:AdminFieldNameValue\":\"ACCOUNT_ID\",\"ns1:AdminNativeKeyIdPK\":503746173327131603,\"ns1:ContractId\":502846173327123803},{\"ns1:AdminFieldNameType\":140,\"ns1:AdminContractId\":201031075,\"ns1:ContractComponentIndicator\":\"Y\",\"ns1:AdminFieldNameValue\":\"BEN_ID\",\"ns1:AdminNativeKeyIdPK\":97068003,\"ns1:ContractId\":502846173327123803}],\"ns1:ProductValue\":\"精密工具\",\"ns1:TCRMContractPartyRoleBObj\":{\"ns1:StartDate\":\"2016-04-27 13:01:11.242\",\"ns1:PartyId\":1506231745456800434,\"ns1:ContractRoleIdPK\":501146173327124303,\"ns1:ComponentID\":1001257,\"ns1:RoleValue\":\"帳戶\",\"ns1:TCRMContractPartyRoleIdentifierBObj\":[{\"ns1:Description\":\"F\",\"ns1:ContractPartyRoleIdentifierIdPK\":503046173327129803,\"ns1:IdentifierId\":1506231937117982072,\"ns1:ContractRoleId\":501146173327124303},{\"ns1:Description\":\"S\",\"ns1:ContractPartyRoleIdentifierIdPK\":503946173327131103,\"ns1:IdentifierId\":501046173327119103,\"ns1:ContractRoleId\":501146173327124303}],\"ns1:TCRMContractRoleLocationBObj\":[{\"ns1:ContractRoleLocationIdPK\":507846173327126203,\"ns1:StartDate\":\"2016-04-27 13:01:11.261\",\"ns1:LocationGroupId\":1506240228142607958,\"ns1:TCRMPartyAddressBObj\":{\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XAddressGroupBObjExt\",\"ns1:XAddressGroupBObjExt\":\"\"},\"ns1:AddressUsageValue\":\"聯絡地址\",\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:AddressUsageType\":2,\"ns1:ComponentID\":1000196,\"ns1:PartyAddressIdPK\":1506240228142607958,\"ns1:TCRMAddressBObj\":{\"ns1:AddressIdPK\":1506232329487183580,\"ns1:ProvinceStateValue\":\"中華民國\",\"ns1:ProvinceStateType\":294,\"ns1:Region\":\"仁武區\",\"ns1:CountryValue\":\"中華民國\",\"ns1:StandardFormatingIndicator\":\"Y\",\"ns1:CountryType\":294,\"ns1:ZipPostalCode\":81450,\"ns1:City\":\"高雄市\",\"ns1:AddressLineOne\":\"四川路一段20393264號\"},\"ns1:AddressId\":1506232329487183580},\"ns1:ContractRoleId\":501146173327124303},{\"ns1:ContractRoleLocationIdPK\":503446173327127403,\"ns1:StartDate\":\"2016-04-27 13:01:11.273\",\"ns1:LocationGroupId\":1506240230326259556,\"ns1:TCRMPartyAddressBObj\":{\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XAddressGroupBObjExt\",\"ns1:XAddressGroupBObjExt\":\"\"},\"ns1:AddressUsageValue\":\"戶籍地址\",\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:AddressUsageType\":1,\"ns1:ComponentID\":1000196,\"ns1:PartyAddressIdPK\":1506240230326259556,\"ns1:TCRMAddressBObj\":{\"ns1:AddressIdPK\":1506232329487183580,\"ns1:ProvinceStateValue\":\"中華民國\",\"ns1:ProvinceStateType\":294,\"ns1:Region\":\"仁武區\",\"ns1:CountryValue\":\"中華民國\",\"ns1:StandardFormatingIndicator\":\"Y\",\"ns1:CountryType\":294,\"ns1:ZipPostalCode\":81450,\"ns1:City\":\"高雄市\",\"ns1:AddressLineOne\":\"四川路一段20393264號\"},\"ns1:AddressId\":1506232329487183580},\"ns1:ContractRoleId\":501146173327124303},{\"ns1:ContractRoleLocationIdPK\":509846173327128803,\"ns1:StartDate\":\"2016-04-27 13:01:11.287\",\"ns1:LocationGroupId\":508046173327020003,\"ns1:TCRMPartyContactMethodBObj\":{\"ns1:PartyContactMethodIdPK\":508046173327020003,\"ns1:ContactMethodUsageValue\":\"電話（住家）\",\"ns1:ContactMethodId\":504446173327018803,\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:TCRMContactMethodBObj\":{\"ns1:ContactMethodValue\":\"電話\",\"ns1:ContactMethodType\":1,\"ns1:ReferenceNumber\":\"02-32354679\",\"ns1:ContactMethodIdPK\":504446173327018803},\"ns1:ContactMethodUsageType\":11},\"ns1:ContractRoleId\":501146173327124303},{\"ns1:ContractRoleLocationIdPK\":1921022848419287253,\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:LocationGroupId\":1506240210183630513,\"ns1:TCRMPartyAddressBObj\":{\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XAddressGroupBObjExt\",\"ns1:XAddressGroupBObjExt\":\"\"},\"ns1:AddressUsageValue\":\"帳單地址\",\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:AddressUsageType\":3,\"ns1:ComponentID\":1000196,\"ns1:PartyAddressIdPK\":1506240210183630513,\"ns1:TCRMAddressBObj\":{\"ns1:AddressIdPK\":1506232329487183580,\"ns1:ProvinceStateValue\":\"中華民國\",\"ns1:ProvinceStateType\":294,\"ns1:Region\":\"仁武區\",\"ns1:CountryValue\":\"中華民國\",\"ns1:StandardFormatingIndicator\":\"Y\",\"ns1:CountryType\":294,\"ns1:ZipPostalCode\":81450,\"ns1:City\":\"高雄市\",\"ns1:AddressLineOne\":\"四川路一段20393264號\"},\"ns1:AddressId\":1506232329487183580},\"ns1:ContractRoleId\":501146173327124303}],\"ns1:TCRMPersonBObj\":{\"ns1:MaritalStatusValue\":\"已婚\",\"ns1:CreatedDate\":\"2012-11-27 00:00:00.0\",\"ns1:CitizenshipType\":294,\"ns1:PartyActiveIndicator\":\"Y\",\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:PartyId\":1506231745456800434,\"ns1:TCRMPartyAddressBObj\":[{\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XAddressGroupBObjExt\",\"ns1:XAddressGroupBObjExt\":\"\"},\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:AddressUsageValue\":\"聯絡地址\",\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:AddressUsageType\":2,\"ns1:ComponentID\":1000196,\"ns1:PartyAddressIdPK\":1506240228142607958,\"ns1:TCRMAddressBObj\":{\"ns1:AddressIdPK\":1506232329487183580,\"ns1:ProvinceStateValue\":\"中華民國\",\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:ProvinceStateType\":294,\"ns1:Region\":\"仁武區\",\"ns1:CountryValue\":\"中華民國\",\"ns1:StandardFormatingIndicator\":\"Y\",\"ns1:CountryType\":294,\"ns1:ZipPostalCode\":81450,\"ns1:City\":\"高雄市\",\"ns1:AddressLineOne\":\"四川路一段20393264號\"},\"ns1:AddressId\":1506232329487183580},{\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XAddressGroupBObjExt\",\"ns1:XAddressGroupBObjExt\":\"\"},\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:AddressUsageValue\":\"戶籍地址\",\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:AddressUsageType\":1,\"ns1:ComponentID\":1000196,\"ns1:PartyAddressIdPK\":1506240230326259556,\"ns1:TCRMAddressBObj\":{\"ns1:AddressIdPK\":1506232329487183580,\"ns1:ProvinceStateValue\":\"中華民國\",\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:ProvinceStateType\":294,\"ns1:Region\":\"仁武區\",\"ns1:CountryValue\":\"中華民國\",\"ns1:StandardFormatingIndicator\":\"Y\",\"ns1:CountryType\":294,\"ns1:ZipPostalCode\":81450,\"ns1:City\":\"高雄市\",\"ns1:AddressLineOne\":\"四川路一段20393264號\"},\"ns1:AddressId\":1506232329487183580},{\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XAddressGroupBObjExt\",\"ns1:XAddressGroupBObjExt\":\"\"},\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:AddressUsageValue\":\"帳單地址\",\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:AddressUsageType\":3,\"ns1:ComponentID\":1000196,\"ns1:PartyAddressIdPK\":1506240210183630513,\"ns1:TCRMAddressBObj\":{\"ns1:AddressIdPK\":1506232329487183580,\"ns1:ProvinceStateValue\":\"中華民國\",\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:ProvinceStateType\":294,\"ns1:Region\":\"仁武區\",\"ns1:CountryValue\":\"中華民國\",\"ns1:StandardFormatingIndicator\":\"Y\",\"ns1:CountryType\":294,\"ns1:ZipPostalCode\":81450,\"ns1:City\":\"高雄市\",\"ns1:AddressLineOne\":\"四川路一段20393264號\"},\"ns1:AddressId\":1506232329487183580}],\"ns1:TCRMPartyContactMethodBObj\":{\"ns1:PartyContactMethodIdPK\":508046173327020003,\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:ContactMethodUsageValue\":\"電話（住家）\",\"ns1:ContactMethodId\":504446173327018803,\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:TCRMContactMethodBObj\":{\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:ContactMethodValue\":\"電話\",\"ns1:ContactMethodType\":1,\"ns1:ReferenceNumber\":\"02-32354679\",\"ns1:ContactMethodIdPK\":504446173327018803},\"ns1:ContactMethodUsageType\":11},\"ns1:TCRMExtension\":{\"ns1:ExtendedObject\":\"XPersonBObjExt\",\"ns1:XPersonBObjExt\":{\"ns1:JobType\":14,\"ns1:JobValue\":\"其它\",\"ns1:CustomerType\":\"I\",\"ns1:JobTitleType\":11,\"ns1:JobTitleValue\":\"其他\"}},\"ns1:TCRMPersonNameBObj\":{\"ns1:NameUsageType\":11,\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:LastName\":\"莊*幸\",\"ns1:PrefixValue\":\"小姐\",\"ns1:PrefixType\":1,\"ns1:StdLastName\":\"莊*幸\",\"ns1:NameUsageValue\":\"自然人全名（中文）\",\"ns1:LastUpdatedBy\":\"Catchup\",\"ns1:PersonPartyId\":1506231745456800434,\"ns1:PersonNameIdPK\":1506231958186896320},\"ns1:PartyType\":\"P\",\"ns1:MaritalStatusType\":1,\"ns1:DisplayName\":\"莊*幸\",\"ns1:TCRMPartyIdentificationBObj\":[{\"ns1:IdentificationDescription\":\"F\",\"ns1:IdentificationType\":1,\"ns1:IdentificationIdPK\":1506231937117982072,\"ns1:IdentificationValue\":\"國民身分證\",\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:IdentificationNumber\":\"X220240574\"},{\"ns1:IdentificationDescription\":\"S\",\"ns1:IdentificationType\":2,\"ns1:IdentificationIdPK\":501046173327119103,\"ns1:IdentificationValue\":\"統一編號\",\"ns1:DWLStatus\":{\"ns1:Status\":0},\"ns1:StartDate\":\"2000-01-01 00:00:00.0\",\"ns1:PartyId\":1506231745456800434,\"ns1:IdentificationNumber\":\"000008463118\"}],\"ns1:ComponentID\":1000010,\"ns1:BirthDate\":\"1971-06-21 00:00:00.0\",\"ns1:CitizenshipValue\":\"中華民國\",\"ns1:PersonPartyId\":1506231745456800434},\"ns1:RoleType\":31,\"ns1:ContractComponentId\":502846173327123803},\"ns1:ContractStatusType\":1,\"ns1:BaseIndicator\":\"Y\",\"ns1:ContractStatusValue\":\"A\",\"ns1:ComponentID\":1000438,\"ns1:ContractId\":506446173327123303,\"ns1:ProductType\":1,\"ns1:ContractComponentIdPK\":502846173327123803}],\"xmlns:ns1\":\"http://services.mdm.fet.com/XSD/MDMSchema\"},\"ns1:TxResult\":{\"ns1:ResultCode\":\"SUCCESS\",\"xmlns:ns1\":\"http://services.mdm.fet.com/XSD/MDMSchema\"},\"xmlns:ns0\":\"http://www.example.org/CRMCustBizService\"}},\"xmlns:SOAP-ENV\":\"http://schemas.xmlsoap.org/soap/envelope/\"}}}");
//	
//	GetContractByAccountIdOrSubscriberId gcas = new GetContractByAccountIdOrSubscriberId(); 
//	
//	
//	String Exception = null;
//	String ID="";
//	String birthday="";
//	String Password="";
//	String testMode="0";
//	String LastName="";
//	String AddressUsageValue="";
//	String AddressLineOne="";
//	String City="";
//	String Region="";
//	String AddressUsageType="";
//	boolean RoleType21 = false;
//	boolean RoleType31 = false;
//	
//	
//	if (testMode.equals("2")) {
////		this.assignTestval(mySession, ResponseJsonObject);
//	} else {
//
//		if (ResponseJsonObject instanceof JSONObject) {
//			
////			exectureGetContractByAccountIdOrSubscriberId db = new exectureGetContractByAccountIdOrSubscriberId();
//			
//				JSONObject data = gcas.ContainKeyAndGetObject(ResponseJsonObject, "Data");
//				JSONObject Envelope = gcas.ContainKeyAndGetObject(data,"SOAP-ENV:Envelope");
//				JSONObject Body = gcas.ContainKeyAndGetObject(Envelope,"SOAP-ENV:Body");
//				JSONObject getContractByAccountIdOrSubscriberIdResponse = gcas.ContainKeyAndGetObject(Body,
//								"ns0:getContractByAccountIdOrSubscriberIdResponse");
//				JSONObject TCRMContractBObj = gcas.ContainKeyAndGetObject(getContractByAccountIdOrSubscriberIdResponse,"ns1:TCRMContractBObj");
//
//				// check ReturnHeader type
//
//				if (getContractByAccountIdOrSubscriberIdResponse.has("ns0:returnHeader")) {
//					
//					
//
//					JSONObject returnHeader = gcas.ContainKeyAndGetObject(getContractByAccountIdOrSubscriberIdResponse,"ns0:returnHeader");
//					
////					gcas.assignRreturnHeader(mySession, returnHeader);
//					// 取基本個資
//					if (TCRMContractBObj.has("ns1:TCRMContractComponentBObj")
//							&& (TCRMContractBObj.get("ns1:TCRMContractComponentBObj") instanceof JSONArray)) {
////						System.out.println("TCRMContractComponentBObj jsonarray " );
//						out:for (int i = 0; i < TCRMContractBObj.length(); i++) {
//							JSONObject TCRMContractComponentBObj = TCRMContractBObj.getJSONArray("ns1:TCRMContractComponentBObj").getJSONObject(i);
//							
//							if (TCRMContractComponentBObj.has("ns1:TCRMContractPartyRoleBObj")
//									&& (TCRMContractComponentBObj.get("ns1:TCRMContractPartyRoleBObj") instanceof JSONArray)) {
//								JSONArray TCRMContractPartyRoleBObjArray = TCRMContractComponentBObj.getJSONArray("ns1:TCRMContractPartyRoleBObj");
//								
//								System.out.println("TCRMContractPartyRoleBObjArray"+TCRMContractPartyRoleBObjArray);
//								for (int j = 0; j < TCRMContractPartyRoleBObjArray.length(); j++) {
//									JSONObject TCRMContractPartyRoleBObj = TCRMContractPartyRoleBObjArray.getJSONObject(j);
//								
//									
//									String RoleType = gcas.ContainKeyAndGetJSON(TCRMContractPartyRoleBObj,"ns1:RoleType");
//
//									//ID & Birthdate
//									if (RoleType.equals("21")) {
//										
////										System.out.println("RoleType"+RoleType);
//										JSONObject TCRMPersonBObj = gcas.ContainKeyAndGetObject(TCRMContractPartyRoleBObj,"ns1:TCRMPersonBObj");
////										
//										birthday =gcas.ContainKeyAndGetJSON(TCRMPersonBObj, "ns1:BirthDate");
//										
//										System.out.println("birthday:#####"+birthday);
////										mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"birthday:#####" + birthday);
//
////										System.out.println("TCRMContractPartyRoleIdentifierBObj class:"+TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj").getClass());
//										
////										if (TCRMContractPartyRoleBObj.has("ns1:TCRMContractPartyRoleIdentifierBObj") && TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj") instanceof JSONArray) {
////											JSONArray len = TCRMContractPartyRoleBObj.getJSONArray("ns1:TCRMContractPartyRoleIdentifierBObj");
////											
////											for (int l = 0; l <len.length() ; l++) {
////												System.out.println("len.getJSONObject(l)"+len.getJSONObject(l));
//////												mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"len.getJSONObject(l)"+len.getJSONObject(l));
////												
////												if (len.getJSONObject(l).toString().contains("\"ns1:Description\":\"F\"")) {
////													
////													
////													String val = gcas.ContainKeyAndGetJSON(len.getJSONObject(l),"ns1:IdentifierId");
////													if (TCRMPersonBObj.has("ns1:TCRMPartyIdentificationBObj") && TCRMPersonBObj.get("ns1:TCRMPartyIdentificationBObj") instanceof JSONArray) {
////														JSONArray len2 = TCRMPersonBObj.getJSONArray("ns1:TCRMPartyIdentificationBObj");
////														for (int k = 0; k < len2.length(); k++) {
////															
////															String val2 = gcas.ContainKeyAndGetJSON(len2.getJSONObject(k),"ns1:IdentificationIdPK");
////															if (val.equals(val2)||RoleType21==false) {
////																 ID = gcas.ContainKeyAndGetJSON(len2.getJSONObject(k),"ns1:IdentificationNumber");
//////																 birthday =TCRMPersonBObj.get("ns1:BirthDate").toString();
////																 RoleType21=true;
////															}else{
////																System.out.println("fail");
////																
//////																mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"fail");
////															}
////															
////														}
////														
////														
////													}else if(TCRMPersonBObj.has("ns1:TCRMPartyIdentificationBObj") && TCRMPersonBObj.get("ns1:TCRMPartyIdentificationBObj") instanceof JSONObject){
////														JSONObject len2 = TCRMPersonBObj.getJSONObject("ns1:TCRMPartyIdentificationBObj");
////														
////														String val2 = gcas.ContainKeyAndGetJSON(len2,"ns1:IdentificationIdPK");
////														if (val.equals(val2)||RoleType21==false) {
////															 ID = gcas.ContainKeyAndGetJSON(len2,"ns1:IdentificationNumber");
//////															 birthday =TCRMPersonBObj.get("ns1:BirthDate").toString();
////															 RoleType21=true;
////														}else{
////															System.out.println("fail");
////															
//////															mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"fail");
////														}
////														
////													}else{
////														
////													}
////													
//////													JSONArray len2 = TCRMPersonBObj.getJSONArray("ns1:TCRMPartyIdentificationBObj");
////
////												}			
////												}
////										}else if(TCRMContractPartyRoleBObj.has("ns1:TCRMContractPartyRoleIdentifierBObj") && TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj") instanceof JSONObject){
////											
////											JSONObject TCRMContractPartyRoleIdentifierBObj = TCRMContractPartyRoleBObj.getJSONObject("ns1:TCRMContractPartyRoleIdentifierBObj") ;
////
////											System.out.println("TCRMContractPartyRoleIdentifierBObj"+TCRMContractPartyRoleIdentifierBObj);
//////											mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"TCRMContractPartyRoleIdentifierBObj"+TCRMContractPartyRoleIdentifierBObj);
////											if (TCRMContractPartyRoleIdentifierBObj.toString().contains("\"ns1:Description\":\"F\"")) {
////												
////												
////												String val = gcas.ContainKeyAndGetJSON(TCRMContractPartyRoleIdentifierBObj,"ns1:IdentifierId");
////												if (TCRMPersonBObj.has("ns1:TCRMPartyIdentificationBObj") && TCRMPersonBObj.get("ns1:TCRMPartyIdentificationBObj") instanceof JSONArray) {
////													JSONArray len2 = TCRMPersonBObj.getJSONArray("ns1:TCRMPartyIdentificationBObj");
////													for (int k = 0; k < len2.length(); k++) {
////														
////														String val2 = gcas.ContainKeyAndGetJSON(len2.getJSONObject(k),"ns1:IdentificationIdPK");
////														if (val.equals(val2)||RoleType21==false) {
////															 ID = gcas.ContainKeyAndGetJSON(len2.getJSONObject(k),"ns1:IdentificationNumber");
//////															 birthday =TCRMPersonBObj.get("ns1:BirthDate").toString();
////															 RoleType21=true;
////														}else{
////															System.out.println("fail");
////															
//////															mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"fail");
////														}
////														
////													}
////													
////													
////												}else if(TCRMPersonBObj.has("ns1:TCRMPartyIdentificationBObj") && TCRMPersonBObj.get("ns1:TCRMPartyIdentificationBObj") instanceof JSONObject){
////													JSONObject len2 = TCRMPersonBObj.getJSONObject("ns1:TCRMPartyIdentificationBObj");
////													
////													String val2 = gcas.ContainKeyAndGetJSON(len2,"ns1:IdentificationIdPK");
////													if (val.equals(val2)||RoleType21==false) {
////														 ID = gcas.ContainKeyAndGetJSON(len2,"ns1:IdentificationNumber");
//////														 birthday =TCRMPersonBObj.get("ns1:BirthDate").toString();
////														 RoleType21=true;
////													}else{
////														System.out.println("fail");
////														
//////														mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"fail");
////													}
////													
////												}else{
////													
////												}
////											}
////											
////											
////										}else{
////											
////										}	
//											
//											
//											
//											////////////////
//											if (TCRMPersonBObj.has("ns1:TCRMPersonNameBObj") && TCRMPersonBObj.get("ns1:TCRMPersonNameBObj") instanceof JSONArray) {
//												JSONArray len = TCRMPersonBObj.getJSONArray("ns1:TCRMPersonNameBObj");
//												
//												for (int l = 0; l <len.length() ; l++) {
////													System.out.println("len.getJSONObject(l)"+len.getJSONObject(l));
////													mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"len.getJSONObject(l)"+len.getJSONObject(l));
//													LastName = gcas.ContainKeyAndGetJSON(len.getJSONObject(l),"ns1:LastName");
////													mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"LastName: "+LastName);
//													System.out.println("LastName: "+LastName);
//													
//
//													
//												}
//											}else if(TCRMPersonBObj.has("ns1:TCRMPersonNameBObj") && TCRMPersonBObj.get("ns1:TCRMPersonNameBObj") instanceof JSONObject){
//												
//												JSONObject TCRMPersonNameBObj = TCRMPersonBObj.getJSONObject("ns1:TCRMPersonNameBObj");
////												System.out.println("TCRMContractPartyRoleIdentifierBObj"+TCRMContractPartyRoleIdentifierBObj);
////												mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"TCRMContractPartyRoleIdentifierBObj"+TCRMPersonNameBObj);
//												LastName = gcas.ContainKeyAndGetJSON(TCRMPersonNameBObj,"ns1:LastName");
////												mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"LastName: "+LastName);
//												System.out.println("LastName: "+LastName);
//												
//												
//											}else{
//												
//												
//												
//												//System.out.println("TCRMContractPartyRoleIdentifierBObj"+TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj").getClass());
////												mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"TCRMContractPartyRoleIdentifierBObj"+TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj").getClass());
//												
//											}
//											
//											//////////////
//
//											
//											//System.out.println("TCRMContractPartyRoleIdentifierBObj"+TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj").getClass());
////											mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"TCRMContractPartyRoleIdentifierBObj"+TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj").getClass());
////											System.out.println("LastName: "+LastName);
//										
//										
//									}else{
//										
//									}
//									
//									
//									
//									
//									if (RoleType.equals("31")) {
//										JSONObject TCRMExtension = gcas.ContainKeyAndGetObject(TCRMContractComponentBObj,"ns1:TCRMExtension");
//										JSONObject XContractComponentBObjExt = gcas.ContainKeyAndGetObject(TCRMExtension,"ns1:XContractComponentBObjExt");
//										Password = gcas.ContainKeyAndGetJSON(XContractComponentBObjExt, "ns1:Password");
//										System.out.println("Password: "+Password);
//										
//										////////////////
//										JSONObject TCRMPersonBObj = gcas.ContainKeyAndGetObject(TCRMContractPartyRoleBObj,"ns1:TCRMPersonBObj");
//										
//										if (TCRMPersonBObj.has("ns1:TCRMPartyAddressBObj") && TCRMPersonBObj.get("ns1:TCRMPartyAddressBObj") instanceof JSONArray) {
//											JSONArray len = TCRMPersonBObj.getJSONArray("ns1:TCRMPartyAddressBObj");
//											
//											for (int l = 0; l <len.length() ; l++) {
////												System.out.println("len.getJSONObject(l)"+len.getJSONObject(l));
////												mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"len.getJSONObject(l)"+len.getJSONObject(l));
//												AddressUsageType = gcas.ContainKeyAndGetJSON(len.getJSONObject(l),"ns1:AddressUsageType");
//												System.out.println("AddressUsageType1: "+AddressUsageType);
//												if(AddressUsageType.equals("3")){
//													JSONObject TCRMAddressBObj = len.getJSONObject(l).getJSONObject("ns1:TCRMAddressBObj");
//													City = gcas.ContainKeyAndGetJSON(TCRMAddressBObj,"ns1:City");
//													Region = gcas.ContainKeyAndGetJSON(TCRMAddressBObj,"ns1:Region");
//													AddressLineOne = gcas.ContainKeyAndGetJSON(TCRMAddressBObj,"ns1:AddressLineOne");
//													System.out.println("City: "+City);
//													System.out.println("Region: "+Region);
//													System.out.println("AddressLineOne: "+AddressLineOne);
//												}
//												
////												mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"LastName: "+LastName);
//
//												
//
//												
//											}
//										}else if(TCRMPersonBObj.has("ns1:TCRMPartyAddressBObj") && TCRMPersonBObj.get("ns1:TCRMPartyAddressBObj") instanceof JSONObject){
//											
//											JSONObject TCRMPartyAddressBObj = TCRMPersonBObj.getJSONObject("ns1:TCRMPartyAddressBObj");
//											
//											AddressUsageType = gcas.ContainKeyAndGetJSON(TCRMPartyAddressBObj,"ns1:AddressUsageType");
//											System.out.println("AddressUsageType2: "+AddressUsageType);
//											if(AddressUsageType.equals("3")){
//												JSONObject TCRMAddressBObj = TCRMPartyAddressBObj.getJSONObject("ns1:TCRMAddressBObj");
//												City = gcas.ContainKeyAndGetJSON(TCRMAddressBObj,"ns1:City");
//												Region = gcas.ContainKeyAndGetJSON(TCRMAddressBObj,"ns1:Region");
//												AddressLineOne = gcas.ContainKeyAndGetJSON(TCRMAddressBObj,"ns1:AddressLineOne");
//												System.out.println("City: "+City);
//												System.out.println("Region: "+Region);
//												System.out.println("AddressLineOne: "+AddressLineOne);
//											}
//											
//											
//										}else{
//											
//											
//											
//										}
//										
//										//////////////
//										
//										
//										
//										
//										RoleType31=true;
//									}
//									if (RoleType31==true && RoleType21==true) {
//										break out;
//									}
//
//									
//									
//								}
//								
//								
//							} else if (TCRMContractComponentBObj.has("ns1:TCRMContractPartyRoleBObj")){
//								JSONObject TCRMContractPartyRoleBObj = gcas.ContainKeyAndGetObject(TCRMContractComponentBObj,"ns1:TCRMContractPartyRoleBObj");
//								
//								System.out.println("TCRMContractPartyRoleBObj jsonobject"+TCRMContractPartyRoleBObj);
////								mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"TCRMContractPartyRoleBObj jsonobject"+TCRMContractPartyRoleBObj);
//								String RoleType = gcas.ContainKeyAndGetJSON(TCRMContractPartyRoleBObj,"ns1:RoleType");
//								
//								
//								//ID & Birthdate
//								if (RoleType.equals("21")) {
//									
//									System.out.println("RoleType jsonobject "+RoleType);
//									
//									JSONObject TCRMPersonBObj = gcas.ContainKeyAndGetObject(TCRMContractPartyRoleBObj,"ns1:TCRMPersonBObj");
//									//birthday =TCRMPersonBObj.get("ns1:BirthDate").toString();
//									
////									birthday =TCRMPersonBObj.get("ns1:BirthDate").toString();
//									
//									birthday =gcas.ContainKeyAndGetJSON(TCRMPersonBObj, "ns1:BirthDate");
////									System.out.println("birthday###"+birthday);
////									mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"birthday###"+birthday);
//									if (TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj") instanceof JSONArray) {
//										
//										
//										JSONArray len = TCRMContractPartyRoleBObj.getJSONArray("ns1:TCRMContractPartyRoleIdentifierBObj");
//										for (int l = 0; l <len.length() ; l++) {
//											if (len.getJSONObject(l).toString().contains("\"ns1:Description\":\"F\"")) {
//												
//												
//												String val = gcas.ContainKeyAndGetJSON(len.getJSONObject(l),"ns1:IdentifierId");
//												JSONArray len2 = TCRMPersonBObj.getJSONArray("ns1:TCRMPartyIdentificationBObj");
//													for (int j = 0; j < len2.length(); j++) {
//														
//														String val2 = gcas.ContainKeyAndGetJSON(len2.getJSONObject(j),"ns1:IdentificationIdPK");
//														if (val.equals(val2)||RoleType21==false) {
//															 ID = gcas.ContainKeyAndGetJSON(len2.getJSONObject(j),"ns1:IdentificationNumber");
////															 birthday =TCRMPersonBObj.get("ns1:BirthDate").toString();
//															 RoleType21=true;
//														}else{
//															System.out.println("fail");
////															mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"fail");
//														}
//														
//													}
//											}			
//											}
//									}else{
//										
//										
//										System.out.println("TCRMContractPartyRoleIdentifierBObj jsonObject");
//										System.out.println("TCRMContractPartyRoleIdentifierBObj###"+TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj"));
////										mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"TCRMContractPartyRoleIdentifierBObj jsonObject");
////										mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"TCRMContractPartyRoleIdentifierBObj###"+TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj");
//										
//										
//										if (TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj").toString().contains("\"ns1:Description\":\"F\"")) {
//											
//											System.out.println("ns1:Description has ");
////											mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"ns1:Description has ");
//											 JSONObject len = TCRMContractPartyRoleBObj.getJSONObject("ns1:TCRMContractPartyRoleIdentifierBObj");
//											
//											String val = gcas.ContainKeyAndGetJSON(len,"ns1:IdentifierId");
//											
//											JSONObject len2 = gcas.ContainKeyAndGetObject(TCRMPersonBObj, "ns1:TCRMPartyIdentificationBObj");
//											//JSONArray len2 = TCRMPersonBObj.getJSONArray("ns1:TCRMPartyIdentificationBObj");
////												for (int j = 0; j < len2.length(); j++) {
//													
//													String val2 = gcas.ContainKeyAndGetJSON(len2,"ns1:IdentificationIdPK");
//													if (val.equals(val2)||RoleType21==false) {
//														 ID = gcas.ContainKeyAndGetJSON(len2,"ns1:IdentificationNumber");
////														 birthday =TCRMPersonBObj.get("ns1:BirthDate").toString();
//														 RoleType21=true;
//													}else{
//														System.out.println("fail");
////														mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"fail");
//														
//													}
//													
////												}
//										}	
//										
//										
//										////////////////
//										if (TCRMContractPartyRoleBObj.has("ns1:TCRMPersonNameBObj") && TCRMContractPartyRoleBObj.get("ns1:TCRMPersonNameBObj") instanceof JSONArray) {
//											JSONArray len = TCRMContractPartyRoleBObj.getJSONArray("ns1:TCRMPersonNameBObj");
//											
//											for (int l = 0; l <len.length() ; l++) {
////												System.out.println("len.getJSONObject(l)"+len.getJSONObject(l));
////												mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"len.getJSONObject(l)"+len.getJSONObject(l));
//												LastName = gcas.ContainKeyAndGetJSON(len.getJSONObject(l),"ns1:LastName");
////												mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"LastName: "+LastName);
//												System.out.println("LastName: "+LastName);
//												
//											}
//										}else if(TCRMContractPartyRoleBObj.has("ns1:TCRMPersonNameBObj") && TCRMContractPartyRoleBObj.get("ns1:TCRMPersonNameBObj") instanceof JSONObject){
//											
//											JSONObject TCRMPersonNameBObj = TCRMContractPartyRoleBObj.getJSONObject("ns1:TCRMPersonNameBObj") ;
////											System.out.println("TCRMContractPartyRoleIdentifierBObj"+TCRMContractPartyRoleIdentifierBObj);
////											mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"TCRMContractPartyRoleIdentifierBObj"+TCRMPersonNameBObj);
//											LastName = gcas.ContainKeyAndGetJSON(TCRMPersonNameBObj,"ns1:LastName");
////											mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"LastName: "+LastName);
//											System.out.println("LastName: "+LastName);
//											
//											
//										}else{
//											
//											
//											
//											//System.out.println("TCRMContractPartyRoleIdentifierBObj"+TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj").getClass());
////											mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"TCRMContractPartyRoleIdentifierBObj"+TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj").getClass());
//											
//										}
//										
//										//////////////
//										
////										System.out.println("LastName: "+LastName);
//										
//										
//										
//										
//										
//										
//										
//									}
//									
//								}else{
//									
//								}
//								
//								
//								
//								if (RoleType.equals("31")) {
//									JSONObject TCRMExtension = gcas.ContainKeyAndGetObject(TCRMContractComponentBObj,"ns1:TCRMExtension");
//									JSONObject XContractComponentBObjExt = gcas.ContainKeyAndGetObject(TCRMExtension,"ns1:XContractComponentBObjExt");
//									Password = gcas.ContainKeyAndGetJSON(XContractComponentBObjExt, "ns1:Password");
//									System.out.println("Password: "+Password);
//									
//									////////////////
//									JSONObject TCRMPersonBObj = gcas.ContainKeyAndGetObject(TCRMContractPartyRoleBObj,"ns1:TCRMPersonBObj");
//									
//									if (TCRMPersonBObj.has("ns1:TCRMPartyAddressBObj") && TCRMPersonBObj.get("ns1:TCRMPartyAddressBObj") instanceof JSONArray) {
//										JSONArray len = TCRMPersonBObj.getJSONArray("ns1:TCRMPartyAddressBObj");
//										
//										for (int l = 0; l <len.length() ; l++) {
////											System.out.println("len.getJSONObject(l)"+len.getJSONObject(l));
////											mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"len.getJSONObject(l)"+len.getJSONObject(l));
//											AddressUsageType = gcas.ContainKeyAndGetJSON(len.getJSONObject(l),"ns1:AddressUsageType");
//											System.out.println("AddressUsageType1: "+AddressUsageType);
//											if(AddressUsageType.equals("3")){
//												JSONObject TCRMAddressBObj = len.getJSONObject(l).getJSONObject("ns1:TCRMAddressBObj");
//												City = gcas.ContainKeyAndGetJSON(TCRMAddressBObj,"ns1:City");
//												Region = gcas.ContainKeyAndGetJSON(TCRMAddressBObj,"ns1:Region");
//												AddressLineOne = gcas.ContainKeyAndGetJSON(TCRMAddressBObj,"ns1:AddressLineOne");
//												System.out.println("City: "+City);
//												System.out.println("Region: "+Region);
//												System.out.println("AddressLineOne: "+AddressLineOne);
//											}
//											
////											mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"LastName: "+LastName);
//
//											
//
//											
//										}
//									}else if(TCRMPersonBObj.has("ns1:TCRMPartyAddressBObj") && TCRMPersonBObj.get("ns1:TCRMPartyAddressBObj") instanceof JSONObject){
//										
//										JSONObject TCRMPartyAddressBObj = TCRMPersonBObj.getJSONObject("ns1:TCRMPartyAddressBObj");
//										
//										AddressUsageType = gcas.ContainKeyAndGetJSON(TCRMPartyAddressBObj,"ns1:AddressUsageType");
//										System.out.println("AddressUsageType2: "+AddressUsageType);
//										if(AddressUsageType.equals("3")){
//											JSONObject TCRMAddressBObj = TCRMPartyAddressBObj.getJSONObject("ns1:TCRMAddressBObj");
//											City = gcas.ContainKeyAndGetJSON(TCRMAddressBObj,"ns1:City");
//											Region = gcas.ContainKeyAndGetJSON(TCRMAddressBObj,"ns1:Region");
//											AddressLineOne = gcas.ContainKeyAndGetJSON(TCRMAddressBObj,"ns1:AddressLineOne");
//											System.out.println("City: "+City);
//											System.out.println("Region: "+Region);
//											System.out.println("AddressLineOne: "+AddressLineOne);
//										}
//										
//										
//									}else{
//										
//										
//										
//									}
//									
//									//////////////
//
//									
//									
//									
//									
//									
//									RoleType31=true;
//								}
//								if (RoleType31==true && RoleType21==true) {
//									break out;
//								}
//
//							} else {
//							
//							}
//
//						}
//					}
//
////					gcas.assignJsonval(mySession,birthday,ID,Password);
//					System.out.println(birthday);
//					System.out.println(ID);
//					System.out.println(Password);
//					
//					
////					JSONObject returnHeader = this.ContainKeyAndGetObject(getContractByAccountIdOrSubscriberIdResponse,"ns0:returnHeader");
////					this.assignRreturnHeader(mySession, returnHeader);
////					// 取基本個資
////					if (TCRMContractBObj.has("ns1:TCRMContractComponentBObj")
////							&& (TCRMContractBObj.get("ns1:TCRMContractComponentBObj") instanceof JSONArray)) {
////						
////						out:for (int i = 0; i < TCRMContractBObj.length(); i++) {
////							JSONObject TCRMContractComponentBObj = TCRMContractBObj
////									.getJSONArray("ns1:TCRMContractComponentBObj").getJSONObject(i);
////							
////							if (TCRMContractComponentBObj.has("ns1:TCRMContractPartyRoleBObj")
////									&& (TCRMContractComponentBObj.get("ns1:TCRMContractPartyRoleBObj") instanceof JSONArray)) {
////								JSONArray TCRMContractPartyRoleBObjArray = TCRMContractComponentBObj.getJSONArray("ns1:TCRMContractPartyRoleBObj");
////								
////								
////								for (int j = 0; j < TCRMContractPartyRoleBObjArray.length(); j++) {
////									JSONObject TCRMContractPartyRoleBObj = TCRMContractPartyRoleBObjArray.getJSONObject(j);
////									String RoleType = this.ContainKeyAndGetJSON(TCRMContractPartyRoleBObj,"ns1:RoleType");
////
////									
////
////									//ID & Birthdate
////									if (RoleType.equals("21")) {
////										JSONObject TCRMPersonBObj = this.ContainKeyAndGetObject(TCRMContractPartyRoleBObj,"ns1:TCRMPersonBObj");
////										if (TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj") instanceof JSONArray) {
////											JSONArray len = TCRMContractPartyRoleBObj.getJSONArray("ns1:TCRMContractPartyRoleIdentifierBObj");
////											for (int l = 0; l <len.length() ; l++) {
////												if (len.getJSONObject(l).toString().contains("\"ns1:Description\":\"F\"")) {
////													String val = this.ContainKeyAndGetJSON(len.getJSONObject(l),"ns1:IdentifierId");
////													JSONArray len2 = TCRMPersonBObj.getJSONArray("ns1:TCRMPartyIdentificationBObj");
////														for (int k = 0; k < len2.length(); k++) {
////															
////															String val2 = this.ContainKeyAndGetJSON(len2.getJSONObject(k),"ns1:IdentificationIdPK");
////															if (val.equals(val2)||RoleType21==false) {
////																 ID = this.ContainKeyAndGetJSON(len2.getJSONObject(k),"ns1:IdentificationNumber");
////																 birthday =TCRMPersonBObj.get("ns1:BirthDate").toString();
////																 RoleType21=true;
////															}else{
////																System.out.println("fail");
////															}
////															
////														}
////												}			
////												}
////										}else if(TCRMContractPartyRoleBObj.has("ns1:TCRMContractPartyRoleIdentifierBObj") && TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj") instanceof JSONObject){
////											
////											JSONObject TCRMContractPartyRoleIdentifierBObj = TCRMContractPartyRoleBObj.getJSONObject("ns1:TCRMContractPartyRoleIdentifierBObj") ;
////
////											System.out.println("TCRMContractPartyRoleIdentifierBObj"+TCRMContractPartyRoleIdentifierBObj);
////											if (TCRMContractPartyRoleIdentifierBObj.toString().contains("\"ns1:Description\":\"F\"")) {
////												
////												
////												String val = this.ContainKeyAndGetJSON(TCRMContractPartyRoleIdentifierBObj,"ns1:IdentifierId");
////												 JSONObject TCRMPartyIdentificationBObj = TCRMPersonBObj.getJSONObject("ns1:TCRMPartyIdentificationBObj");
////												
////														
////														String val2 = this.ContainKeyAndGetJSON(TCRMPartyIdentificationBObj,"ns1:IdentificationIdPK");
////														if (val.equals(val2)||RoleType21==false) {
////															 ID = this.ContainKeyAndGetJSON(TCRMPartyIdentificationBObj,"ns1:IdentificationNumber");
////															 birthday =TCRMPersonBObj.get("ns1:BirthDate").toString();
////															 RoleType21=true;
////														}else{
////															System.out.println("fail");
////														}
////														
////											}
////											
////											
////										}else{
////											
////											
////											
////											if (TCRMContractPartyRoleBObj.has("ns1:TCRMContractPartyRoleIdentifierBObj")) {
////												
////												mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"BirthDate Response:" + TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj"));
////												mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"BirthDate getClass:" + TCRMContractPartyRoleBObj.getClass());
////												mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"BirthDate Response:" + TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj"));
////
////												
////												
////											}else{
////												mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"TCRMContractPartyRoleIdentifierBObj not find key:" + TCRMContractPartyRoleBObj);
////
////												
////											}
////											
////															
////										}
////										
////									}else{
////										
////									}
////									if (RoleType.equals("31")) {
////										JSONObject TCRMExtension = this.ContainKeyAndGetObject(TCRMContractComponentBObj,"ns1:TCRMExtension");
////										JSONObject XContractComponentBObjExt = this.ContainKeyAndGetObject(TCRMExtension,"ns1:XContractComponentBObjExt");
////										Password = this.ContainKeyAndGetJSON(XContractComponentBObjExt, "ns1:Password");
////										RoleType31=true;
////									}
////									if (RoleType31==true && RoleType21==true) {
////										break out;
////									}
////
////									
////									
////								}
////								
////								
////							} else if (TCRMContractComponentBObj.has("ns1:TCRMContractPartyRoleBObj")){
////								JSONObject TCRMContractPartyRoleBObj = this.ContainKeyAndGetObject(TCRMContractComponentBObj,"ns1:TCRMContractPartyRoleBObj");
////								String RoleType = this.ContainKeyAndGetJSON(TCRMContractPartyRoleBObj,"ns1:RoleType");
////								
////								
////								//ID & Birthdate
////								if (RoleType.equals("21")) {
////									JSONObject TCRMPersonBObj = this.ContainKeyAndGetObject(TCRMContractPartyRoleBObj,"ns1:TCRMPersonBObj");
////									if (TCRMContractPartyRoleBObj.get("ns1:TCRMContractPartyRoleIdentifierBObj") instanceof JSONArray) {
////										JSONArray len = TCRMContractPartyRoleBObj.getJSONArray("ns1:TCRMContractPartyRoleIdentifierBObj");
////										for (int l = 0; l <len.length() ; l++) {
////											if (len.getJSONObject(l).toString().contains("\"ns1:Description\":\"F\"")) {
////												String val = this.ContainKeyAndGetJSON(len.getJSONObject(l),"ns1:IdentifierId");
////												JSONArray len2 = TCRMPersonBObj.getJSONArray("ns1:TCRMPartyIdentificationBObj");
////													for (int j = 0; j < len2.length(); j++) {
////														
////														String val2 = this.ContainKeyAndGetJSON(len2.getJSONObject(j),"ns1:IdentificationIdPK");
////														if (val.equals(val2)||RoleType21==false) {
////															 ID = this.ContainKeyAndGetJSON(len2.getJSONObject(j),"ns1:IdentificationNumber");
////															 birthday =TCRMPersonBObj.get("ns1:BirthDate").toString();
//////															
////															 RoleType21=true;
////														}else{
////															System.out.println("fail");
////														}
////														
////													}
////											}			
////											}
////									}
////									
////								}else{
////									
////								}
////								if (RoleType.equals("31")&&RoleType31==false) {
////									JSONObject TCRMExtension = this.ContainKeyAndGetObject(TCRMContractComponentBObj,"ns1:TCRMExtension");
////									JSONObject XContractComponentBObjExt = this.ContainKeyAndGetObject(TCRMExtension,"ns1:XContractComponentBObjExt");
////									Password = this.ContainKeyAndGetJSON(XContractComponentBObjExt, "ns1:Password");
////									RoleType31=true;
////								}
////								if (RoleType31==true && RoleType21==true) {
////									
////									break out;
////								}
////
////							} else {
////							
////							}
////
////						}
////					
////					this.assignJsonval(mySession,birthday,ID,Password);
////					
////					
////					}
//
//				}
////				this.assignJsonval(mySession,birthday,ID,Password);
//
//			}
//	}
//
//
//}

	
	
	
	
	
	
}
