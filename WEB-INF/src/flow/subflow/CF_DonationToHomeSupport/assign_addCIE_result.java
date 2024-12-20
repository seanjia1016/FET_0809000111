package flow.subflow.CF_DonationToHomeSupport;

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
 * Last generated by Orchestration Designer at: 2024年8月20日 上午10時12分57秒
 */
public class assign_addCIE_result extends com.avaya.sce.runtime.Data {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2024年8月20日 上午10時12分57秒
	 */
	public assign_addCIE_result() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the Next item which will forward application execution
	 * to the next form in the call flow.
	 * Last generated by Orchestration Designer at: 2024年10月9日 下午05時54分45秒
	 */
	public com.avaya.sce.runtime.Next getNext(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Next next = new com.avaya.sce.runtime.Next("CF_DonationToHomeSupport-InputAndCheckID", "Default");
		next.setDebugId(2395);
		return next;
	}
	/**
	 * Create a list of local variables used by items in the data node.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2024年10月9日 下午05時54分45秒
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
	 * Last generated by Orchestration Designer at: 2024年10月9日 下午05時54分45秒
	 */
	public boolean executeDataActions(com.avaya.sce.runtimecommon.SCESession mySession) throws Exception {
		java.util.Collection actions = null;

		actions = new java.util.ArrayList(9);
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CH_CIE:CIE_Create_error", "", true).setDebugId(2387));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CH_CIE:CIEID", "CIE_CreateService_Output:cieId", false).setDebugId(2388));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CH_CIE:CIEDETAILID", "CIE_CreateService_Output:cieDetailId", false).setDebugId(2389));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CH_CIE:SUBSCRIBERCONTACTID", "CIE_CreateService_Output:subscriberContactId", false).setDebugId(2390));
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "#####CIE_CreatService_Output_cieId2", "CIE_CreateService_Output:cieId").setDebugId(2391));
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "#####CIE_CreatService_Output_DetailId2", "CIE_CreateService_Output:cieDetailId").setDebugId(2392));
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "#####CIE_CreatService_Output_subscriberContactId2", "CIE_CreateService_Output:subscriberContactId").setDebugId(2393));
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "#####CIE:CIE_Create_error_After2", "CH_CIE:CIE_Create_error").setDebugId(2394));
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		// return false if the evaluation of actions did not cause a servlet forward or redirect
		return false;
	}
}
