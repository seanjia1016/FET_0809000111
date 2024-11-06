package flow;

/**
 * The Data class handles many types of server-side operations including data
 * collection (from a data sources such as a database, or web service), variable
 * assignments and operations (like copying variable values, performing mathematic
 * operations, and collection iteration), conditional evaluation to control callflow
 * execution based on variable values, and logging/tracing statements.
 * 
 * Items created in the getDataActions() method are executed/evaluated in order
 * and if a condional branch condition evaluates to "true" then the branch is
 * activated and the execution of data actions is halted.  If no "true" conditions
 * are encountered, then all data actions will be executed/evaluated and the 
 * application will proceed to the "Default" servlet.
 * Last generated by Orchestration Designer at: 2017年10月17日 下午05時30分28秒
 */
public class insert_CIE_Record_log2 extends com.avaya.sce.runtime.Data {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年10月17日 下午05時30分28秒
	 */
	public insert_CIE_Record_log2() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the Next item which will forward application execution
	 * to the next form in the call flow.
	 * Last generated by Orchestration Designer at: 2024年11月6日 下午12時16分56秒
	 */
	public com.avaya.sce.runtime.Next getNext(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Next next = null;
		return next;
	}
	/**
	 * Create a list of local variables used by items in the data node.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2024年11月6日 下午12時16分56秒
	 */
	public java.util.Collection<VariableInfo> getLocalVariables(){
		java.util.Collection<VariableInfo> variables = new java.util.ArrayList<VariableInfo>();

		return variables;
	}
	/**
	 * Creates and conditionally executes operations that have been configured
	 * in the Callflow.  This method will build a collection of operations and
	 * have the framework execute the operations by calling evaluateActions().
	 * If the evaluation causes the framework to forward to a different servlet
	 * then execution stops.
	 * Returning true from this method means that the framework has forwarded the
	 * request to a different servlet.  Returning false means that the default
	 * Next will be invoked.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2024年11月6日 下午12時16分56秒
	 */
	public boolean executeDataActions(com.avaya.sce.runtimecommon.SCESession mySession) throws Exception {
		java.util.Collection actions = null;

		actions = new java.util.ArrayList(2);
		com.avaya.sce.runtime.BooleanOperation bo1 = new com.avaya.sce.runtime.BooleanOperation(com.avaya.sce.runtime.BooleanOperation.AND);
		com.avaya.sce.runtime.Expression be1 = new com.avaya.sce.runtime.Expression("expression1", "FE_PARM_TBL:FE_PARM_VALUE", com.avaya.sce.runtime.Expression.STRING_EQUAL, "Y", false);
		bo1.addExpression(be1);
		com.avaya.sce.runtime.Expression be2 = new com.avaya.sce.runtime.Expression("expression2", "getCashSubscriberInfoByKey_Output:subscriberId", com.avaya.sce.runtime.Expression.NOT_EMPTY);
		bo1.addExpression(be2);
		com.avaya.sce.runtime.Expression be3 = new com.avaya.sce.runtime.Expression("expression3", "CIE_CreateService_Output:exception", com.avaya.sce.runtime.Expression.STRING_NOT_EQUAL, "99999", false);
		bo1.addExpression(be3);
		com.avaya.sce.runtime.Expression be4 = new com.avaya.sce.runtime.Expression("expression4", "CIE_CreateService_Output:cieId", com.avaya.sce.runtime.Expression.NOT_EMPTY);
		bo1.addExpression(be4);
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### BOTTON_1", "CH_CIE:BOTTON").setDebugId(1066));
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition1", "AIR_MENU_DETAIL:MENU_ID", com.avaya.sce.runtime.Expression.NOT_EMPTY).setDebugId(1067)).evaluate(mySession)) {
			actions = new java.util.ArrayList(4);
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("CH_CIE:BOTTON", "NONE", true).setDebugId(1068));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("CH_CIE:BOTTON", ",", true).setDebugId(1069));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CIE_RecordService_Input:MenuIDs", "CH_CIE:CIE", false).setDebugId(1070));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CIE_RecordService_Input:STR_LOGs", "CH_CIE:BOTTON", false).setDebugId(1071));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else {
			actions = new java.util.ArrayList(3);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CIE_RecordService_Input:MenuIDs", "CH_CIE:CIE", false).setDebugId(1073));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CIE_RecordService_Input:STR_LOGs", "CH_CIE:BOTTON", false).setDebugId(1074));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "BOTTON_2", "CH_CIE:BOTTON").setDebugId(1075));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		}


		actions = new java.util.ArrayList(2);
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CH_FE_PARM_TBL:FE_PARM_PARM", "NCP_CIE_IVR_Trace", true).setDebugId(1077));
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;
		try {
			actions = new java.util.ArrayList(1);

			//{{START:CODEGEN:EXTENSIONPOINT:com.avaya.sce.databaseoperations
			actions.add(new connectivity.db.operations.FE_PARM_TBL(mySession).setDebugId(1079));
			//}}END:CODEGEN:EXTENSIONPOINT:com.avaya.sce.databaseoperations

			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		} catch (Exception e1) {
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.varoperations.CaptureException(e1).setDebugId(-1));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		}

		actions = new java.util.ArrayList(3);
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### Parm_value", "FE_PARM_TBL:FE_PARM_VALUE").setDebugId(1081));
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### CreateService_exception", "CIE_CreateService_Output:exception").setDebugId(1082));
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_DEBUG, "### UserData_subscriberNo", "getCashSubscriberInfoByKey_Output:subscriberId").setDebugId(1083));
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition").setDebugId(1084)).evaluate(mySession, bo1)) {
			actions = new java.util.ArrayList(31);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CIE_RecordService_Input:BpId", "CIE_CreateService_Input:BpId", false).setDebugId(1089));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CIE_RecordService_Input:cie_cieDetailId", "CH_CIE:CIEDETAILID", false).setDebugId(1090));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CIE_RecordService_Input:cie_cieId", "CH_CIE:CIEID", false).setDebugId(1091));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CIE_RecordService_Input:cie_createDate", "CIE_CreateService_Input:cie_createDate", false).setDebugId(1092));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CIE_RecordService_Input:cie_startDate", "CIE_CreateService_Input:cie_startDate", false).setDebugId(1093));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CIE_RecordService_Input:cie_endDate", "date:audio", false).setDebugId(1094));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("CIE_RecordService_Input:cie_endDate", "time:audio", false).setDebugId(1095));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CIE_RecordService_Input:cie_subscriberContactId", "CH_CIE:SUBSCRIBERCONTACTID", false).setDebugId(1096));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CIE_RecordService_Input:FlowName", "AIR_MENU_MASTER:IVRFLOW", false).setDebugId(1097));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CIE_RecordService_Input:msisdnNumber", "S_USERDATA:ANI", false).setDebugId(1098));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CIE_RecordService_Input:sessionId", "session:sessionid", false).setDebugId(1099));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CIE_RecordService_Input:subscriber", "getCashSubscriberInfoByKey_Output:subscriberId", false).setDebugId(1100));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CIE_RecordService_Input:TID", "S_TID:TID", false).setDebugId(1101));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CIE_RecordService_Input:transPath", "IVR-", true).setDebugId(1102));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("CIE_RecordService_Input:transPath", "AIR_MENU_MASTER:IVRFLOW", false).setDebugId(1103));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CH_CIE:CIE_Record_error", "CIE_Record_error", true).setDebugId(1104));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### CIE_Record_Input_bpid", "CIE_RecordService_Input:BpId").setDebugId(1105));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "###CIE_RecordService_Input_cieDetailId", "CIE_RecordService_Input:cie_cieDetailId").setDebugId(1106));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "###CIE_RecordService_Input_CIEID", "CIE_RecordService_Input:cie_cieId").setDebugId(1107));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "###CIE_RecordService_Input_createDate", "CIE_RecordService_Input:cie_createDate").setDebugId(1108));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "###CIE_RecordService_Input_startDate", "CIE_RecordService_Input:cie_startDate").setDebugId(1109));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "###CIE_RecordService_Input_endDate", "CIE_RecordService_Input:cie_endDate").setDebugId(1110));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "###CIE_RecordService_Input_subscriberContactID", "CIE_RecordService_Input:cie_subscriberContactId").setDebugId(1111));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "###CIE_RecordService_Input_flowName", "CIE_RecordService_Input:FlowName").setDebugId(1112));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "###CIE_RecordService_Input_msisdnNumber", "CIE_RecordService_Input:msisdnNumber").setDebugId(1113));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "###CIE_RecordService_Input_sessionId", "CIE_RecordService_Input:sessionId").setDebugId(1114));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "###CIE_RecordService_Input_suscriber", "CIE_RecordService_Input:subscriber").setDebugId(1115));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "###CIE_RecordService_Input_TID", "CIE_RecordService_Input:TID").setDebugId(1116));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### CIE_Record_transPath", "CIE_RecordService_Input:transPath").setDebugId(1117));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "###CIE:CIE_Record_error_Before", "CH_CIE:CIE_Record_error").setDebugId(1118));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		}


		if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition2", "CIE_RecordService_Output:ciechangeReturncode", com.avaya.sce.runtime.Expression.STRING_EQUAL, "Cust-006-028-03000", false).setDebugId(1126)).evaluate(mySession)) {
			actions = new java.util.ArrayList(2);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CH_CIE:CIE_Record_error", "", true).setDebugId(1127));
			actions.add(new com.avaya.sce.runtime.Next("API_changeCIE2", "CIE Pass").setDebugId(1128));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else {
			actions = new java.util.ArrayList(3);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("TASK_380_TBL:REASON", "ADD MEMO FAIL", true).setDebugId(1130));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("TASK_380_TBL:STATUS", "Y", true).setDebugId(1131));
			actions.add(new com.avaya.sce.runtime.Next("Disconnect", "CIE Fail").setDebugId(1132));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		}


		// return false if the evaluation of actions did not cause a servlet forward or redirect
		return false;
	}
}
