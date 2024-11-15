package flow.subflow.insert_AIR_MENU_MASTER;

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
 * Last generated by Orchestration Designer at: 2017年8月31日 下午04時47分26秒
 */
public class insert_Master_Log extends com.avaya.sce.runtime.Data {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年8月31日 下午04時47分26秒
	 */
	public insert_Master_Log() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the Next item which will forward application execution
	 * to the next form in the call flow.
	 * Last generated by Orchestration Designer at: 2024年11月15日 下午01時35分23秒
	 */
	public com.avaya.sce.runtime.Next getNext(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Next next = new com.avaya.sce.runtime.Next("insert_AIR_MENU_MASTER-insert_AIR_MENU_MASTER", "Default");
		next.setDebugId(7);
		return next;
	}
	/**
	 * Create a list of local variables used by items in the data node.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2024年11月15日 下午01時35分23秒
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
	 * Last generated by Orchestration Designer at: 2024年11月15日 下午01時35分23秒
	 */
	public boolean executeDataActions(com.avaya.sce.runtimecommon.SCESession mySession) throws Exception {
		java.util.Collection actions = null;

		actions = new java.util.ArrayList(14);
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_MASTER:TID", "S_TID:TID", false).setDebugId(9));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_MASTER:ANI", "S_USERDATA:ANI", false).setDebugId(10));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_MASTER:MSISDN", "S_USERDATA:ANI", false).setDebugId(11));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_MASTER:CHANNEL", "properties:Channel", false).setDebugId(12));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_MENU_MASTER:CHANNEL", "^", true).setDebugId(13));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_MENU_MASTER:CHANNEL", "cticallinfo:stationextension", false).setDebugId(14));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_MASTER:MENU_DATE", "date:audio", false).setDebugId(15));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_MASTER:START_TIME", "insert_StartTime", false).setDebugId(16));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_MASTER:END_TIME", "time:audio", false).setDebugId(17));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_MASTER:IVR_UCID", "cticallinfo:ucid", false).setDebugId(19));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_MASTER:IN_ENTERPRISE", "N", true).setDebugId(34));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_MASTER:LANG", "1", true).setDebugId(35));
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "## UCID ##", "AIR_MENU_MASTER:IVR_UCID").setDebugId(20));
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		// return false if the evaluation of actions did not cause a servlet forward or redirect
		return false;
	}
}
