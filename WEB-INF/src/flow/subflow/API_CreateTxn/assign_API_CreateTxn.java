package flow.subflow.API_CreateTxn;

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
 * Last generated by Orchestration Designer at: 2017年10月30日 下午02時55分53秒
 */
public class assign_API_CreateTxn extends com.avaya.sce.runtime.Data {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年10月30日 下午02時55分53秒
	 */
	public assign_API_CreateTxn() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the Next item which will forward application execution
	 * to the next form in the call flow.
	 * Last generated by Orchestration Designer at: 2024年11月15日 上午10時14分38秒
	 */
	public com.avaya.sce.runtime.Next getNext(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Next next = new com.avaya.sce.runtime.Next("API_CreateTxn-excuteCreateTxnServlet", "Default");
		next.setDebugId(26);
		return next;
	}
	/**
	 * Create a list of local variables used by items in the data node.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2024年11月15日 上午10時14分38秒
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
	 * Last generated by Orchestration Designer at: 2024年11月15日 上午10時14分38秒
	 */
	public boolean executeDataActions(com.avaya.sce.runtimecommon.SCESession mySession) throws Exception {
		java.util.Collection actions = null;

		actions = new java.util.ArrayList(25);
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxn_Input:billSubscrId", "getCashSubscriberInfoByKey_Output:subscriberId", false).setDebugId(9));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxn_Input:channelForCfg", "properties:ChannelForCFG", false).setDebugId(10));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxn_Input:createAgentCd", "AIR_MENU_MASTER:IVRFLOW", false).setDebugId(11));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxn_Input:createChannel", "IVR", true).setDebugId(12));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxn_Input:createSystem", "IVR", true).setDebugId(13));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxn_Input:FlowName", "AIR_MENU_MASTER:IVRFLOW", false).setDebugId(14));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxn_Input:identifierNum", "getContractByAccountIdOrSubscriberId_Output:IdentificationNumber", false).setDebugId(15));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxn_Input:mobileGenerationCodel", "getCashSubscriberInfoByKey_Output:generationCode", false).setDebugId(16));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxn_Input:paymentCategory", "getCashSubscriberInfoByKey_Output:paymentCategory", false).setDebugId(17));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxn_Input:serviceProvider", "getCashSubscriberInfoByKey_Output:serviceProvider", false).setDebugId(18));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxn_Input:transBpId", "S_USERDATA:BPID", false).setDebugId(19));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxn_Input:txnCompleteDt", "date:audio", false).setDebugId(20));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxn_Input:txnTpCd", "101", true).setDebugId(21));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxn_Input:updateAgentCd", "AIR_MENU_MASTER:IVRFLOW", false).setDebugId(22));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxn_Input:txnStatusCd", "1", true).setDebugId(23));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxn_Input:changeItemCDType", "1", true).setDebugId(24));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxn_Input:temporalTPCDType", "2", true).setDebugId(25));
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "##CreateTX_Input_billSubscrId", "CreateTxn_Input:billSubscrId").setDebugId(33));
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "##CreateTX_Input_createAgentCd", "CreateTxn_Input:createAgentCd").setDebugId(34));
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "##CreateTX_Input_flowName", "CreateTxn_Input:FlowName").setDebugId(35));
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "##CreateTX_Input_identifierNum", "CreateTxn_Input:identifierNum").setDebugId(36));
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "##CreateTX_Input_mobileGenerationCodel", "CreateTxn_Input:mobileGenerationCodel").setDebugId(37));
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "##CreateTX_Input_paymentCategory", "CreateTxn_Input:paymentCategory").setDebugId(38));
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "##CreateTX_Input_serviceProvider", "CreateTxn_Input:serviceProvider").setDebugId(39));
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		// return false if the evaluation of actions did not cause a servlet forward or redirect
		return false;
	}
}
