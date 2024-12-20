package flow.subflow.CF_Jointfundraising;

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
 * Last generated by Orchestration Designer at: 2017年10月19日 下午12時38分37秒
 */
public class get_CIEID extends com.avaya.sce.runtime.Data {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年10月19日 下午12時38分37秒
	 */
	public get_CIEID() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the Next item which will forward application execution
	 * to the next form in the call flow.
	 * Last generated by Orchestration Designer at: 2024年10月9日 下午05時54分46秒
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
	 * Last generated by Orchestration Designer at: 2024年10月9日 下午05時54分46秒
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
	 * Last generated by Orchestration Designer at: 2024年10月9日 下午05時54分46秒
	 */
	public boolean executeDataActions(com.avaya.sce.runtimecommon.SCESession mySession) throws Exception {
		java.util.Collection actions = null;

		actions = new java.util.ArrayList(2);
		com.avaya.sce.runtime.BooleanOperation bo1 = new com.avaya.sce.runtime.BooleanOperation(com.avaya.sce.runtime.BooleanOperation.AND);
		com.avaya.sce.runtime.Expression be1 = new com.avaya.sce.runtime.Expression("expression1", "FE_PARM_TBL:FE_PARM_VALUE", com.avaya.sce.runtime.Expression.STRING_EQUAL, "Y", false);
		bo1.addExpression(be1);
		com.avaya.sce.runtime.Expression be2 = new com.avaya.sce.runtime.Expression("expression2", "S_USERDATA:BPID", com.avaya.sce.runtime.Expression.NOT_EMPTY);
		bo1.addExpression(be2);
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CH_FE_PARM_TBL:FE_PARM_PARM", "NCP_Enable", true).setDebugId(2776));
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;
		try {
			actions = new java.util.ArrayList(1);

			//{{START:CODEGEN:EXTENSIONPOINT:com.avaya.sce.databaseoperations
			actions.add(new connectivity.db.operations.FE_PARM_TBL(mySession).setDebugId(2778));
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

		actions = new java.util.ArrayList(1);
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### Parm_Value:", "FE_PARM_TBL:FE_PARM_VALUE").setDebugId(2780));
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition").setDebugId(2781)).evaluate(mySession, bo1)) {
			actions = new java.util.ArrayList(19);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CIE_CreateService_Input:BpId", "S_USERDATA:BPID", false).setDebugId(2785));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CIE_CreateService_Input:cie_createDate", "date:audio", false).setDebugId(2786));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CIE_CreateService_Input:cie_endDate", "date:audio", false).setDebugId(2787));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("CIE_CreateService_Input:cie_endDate", "time:audio", false).setDebugId(2788));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CIE_CreateService_Input:cie_InOutbound", "I", true).setDebugId(2789));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CIE_CreateService_Input:cie_isNonFET", "N", true).setDebugId(2790));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CIE_CreateService_Input:cie_startDate", "date:audio", false).setDebugId(2791));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("CIE_CreateService_Input:cie_startDate", "time:audio", false).setDebugId(2792));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CIE_CreateService_Input:FlowName", "55135", true).setDebugId(2793));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CIE_CreateService_Input:msisdnNumber", "S_USERDATA:ANI", false).setDebugId(2794));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### CreateService_msisdn:", "CIE_CreateService_Input:msisdnNumber").setDebugId(2795));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### sessionId: ", "session:sessionid").setDebugId(2796));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CIE_CreateService_Input:sessionId", "session:sessionid", false).setDebugId(2797));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CIE_CreateService_Input:subscriber", "getCashSubscriberInfoByKey_Output:subscriberId", false).setDebugId(2798));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### CreateService_Subscriber", "CIE_CreateService_Input:subscriber").setDebugId(2799));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CIE_CreateService_Input:transPath", "IVR-55135", true).setDebugId(2800));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CH_CIE:CIE_Create_error", "CIE_Create_error", true).setDebugId(2801));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "#####CIE:CIE_Create_error_Before#####", "CH_CIE:CIE_Create_error").setDebugId(2802));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
			try {
				actions = new java.util.ArrayList(1);

				//{{START:CODEGEN:EXTENSIONPOINT:com.avaya.sce.webserviceoperations
				actions.add(new connectivity.ws.operations.CIE_CreateService(mySession).setDebugId(2804));
				//}}END:CODEGEN:EXTENSIONPOINT:com.avaya.sce.webserviceoperations

				if(evaluateActions(actions, mySession)) {
					return true;
				}
				actions = null;
			} catch (Exception e2) {
				actions = new java.util.ArrayList(1);
				actions.add(new com.avaya.sce.runtime.varoperations.CaptureException(e2).setDebugId(-1));
				if(evaluateActions(actions, mySession)) {
					return true;
				}
				actions = null;
			}

			actions = new java.util.ArrayList(9);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CH_CIE:CIE_Create_error", "", true).setDebugId(2806));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CH_CIE:CIEID", "CIE_CreateService_Output:cieId", false).setDebugId(2807));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CH_CIE:CIEDETAILID", "CIE_CreateService_Output:cieDetailId", false).setDebugId(2808));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CH_CIE:SUBSCRIBERCONTACTID", "CIE_CreateService_Output:subscriberContactId", false).setDebugId(2809));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "#####CIE_CreatService_Output_cieId#####", "CIE_CreateService_Output:cieId").setDebugId(2810));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "#####CIE_CreatService_Output_DetailId#####", "CIE_CreateService_Output:cieDetailId").setDebugId(2811));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "#####CIE_CreatService_Output_subscriberContactId#####", "CIE_CreateService_Output:subscriberContactId").setDebugId(2812));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "#####CIE:CIE_Create_error_After#####", "CH_CIE:CIE_Create_error").setDebugId(2813));
			actions.add(new com.avaya.sce.runtime.Next("CF_Jointfundraising-API_addCIE", "get CID").setDebugId(2814));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else {
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.Next("CF_Jointfundraising-InputAndCheckID", "no CID").setDebugId(2816));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		}


		// return false if the evaluation of actions did not cause a servlet forward or redirect
		return false;
	}
}
