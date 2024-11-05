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
 * Last generated by Orchestration Designer at: 2017年9月1日 上午10時21分45秒
 */
public class Distributor_016003 extends com.avaya.sce.runtime.Data {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年9月1日 上午10時21分45秒
	 */
	public Distributor_016003() {
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
		com.avaya.sce.runtime.Next next = null;
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

		actions = new java.util.ArrayList(2);
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### 016003_utterance", "MN_016003:utterance").setDebugId(1636));
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		// switch start (1638)
		if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition1", "MN_016003:utterance", com.avaya.sce.runtime.Expression.STRING_EQUAL, "1", false).setDebugId(1638)).evaluate(mySession)) {
			actions = new java.util.ArrayList(2);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591993_MENU_TBL:AIR_591993_MENU_L2", "1", true).setDebugId(1639));
			actions.add(new com.avaya.sce.runtime.Next("CF_DonationToHomeSupport-Go_Transaction", "1").setDebugId(1640));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition2", "MN_016003:utterance", com.avaya.sce.runtime.Expression.STRING_EQUAL, "*", false).setDebugId(1641)).evaluate(mySession)) {
			actions = new java.util.ArrayList(2);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591993_MENU_TBL:AIR_591993_MENU_L2", "*", true).setDebugId(1663));
			actions.add(new com.avaya.sce.runtime.Next("CF_DonationToHomeSupport-insert_Menu_Log", "*").setDebugId(1643));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition3", "MN_016003:utterance", com.avaya.sce.runtime.Expression.STRING_EQUAL, "#", false).setDebugId(1644)).evaluate(mySession)) {
			actions = new java.util.ArrayList(2);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591993_MENU_TBL:AIR_591993_MENU_L2", "#", true).setDebugId(1664));
			actions.add(new com.avaya.sce.runtime.Next("CF_DonationToHomeSupport-insert_Menu_Log", "#").setDebugId(1646));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		}

		// return false if the evaluation of actions did not cause a servlet forward or redirect
		return false;
	}
}
