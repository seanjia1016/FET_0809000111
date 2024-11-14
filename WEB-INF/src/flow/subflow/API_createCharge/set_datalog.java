package flow.subflow.API_createCharge;

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
 * Last generated by Orchestration Designer at: 2017年10月13日 下午03時43分55秒
 */
public class set_datalog extends com.avaya.sce.runtime.Data {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年10月13日 下午03時43分55秒
	 */
	public set_datalog() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the Next item which will forward application execution
	 * to the next form in the call flow.
	 * Last generated by Orchestration Designer at: 2024年11月14日 下午06時19分15秒
	 */
	public com.avaya.sce.runtime.Next getNext(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Next next = new com.avaya.sce.runtime.Next("API_createCharge-Insert_FE_API_LOG_TBL", "Default");
		next.setDebugId(51);
		return next;
	}
	/**
	 * Create a list of local variables used by items in the data node.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2024年11月14日 下午06時19分15秒
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
	 * Last generated by Orchestration Designer at: 2024年11月14日 下午06時19分15秒
	 */
	public boolean executeDataActions(com.avaya.sce.runtimecommon.SCESession mySession) throws Exception {
		java.util.Collection actions = null;

		actions = new java.util.ArrayList(7);
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("FE_API_LOG_TBL:RESERVED1", "createCharge_Output:reserved1", false).setDebugId(52));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("FE_API_LOG_TBL:API", "CRMBILL0057", true).setDebugId(53));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("FE_API_LOG_TBL:RETURNCODE", "createCharge_Output:returnCode", false).setDebugId(54));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("FE_API_LOG_TBL:ORDERID", "", true).setDebugId(55));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("FE_API_LOG_TBL:STR_DATA", "", true).setDebugId(56));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("FE_API_LOG_TBL:ORDERSTATE", "", true).setDebugId(57));
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		// return false if the evaluation of actions did not cause a servlet forward or redirect
		return false;
	}
}
