package flow.subflow.insert_TASK_380_TBL;

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
 * Last generated by Orchestration Designer at: 2017年10月19日 下午10時14分11秒
 */
public class insert_TASK_380_LOG extends com.avaya.sce.runtime.Data {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年10月19日 下午10時14分11秒
	 */
	public insert_TASK_380_LOG() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the Next item which will forward application execution
	 * to the next form in the call flow.
	 * Last generated by Orchestration Designer at: 2024年11月22日 下午01時33分12秒
	 */
	public com.avaya.sce.runtime.Next getNext(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Next next = new com.avaya.sce.runtime.Next("insert_TASK_380_TBL-assignSQL_Task_380_TBL", "Default");
		next.setDebugId(18);
		return next;
	}
	/**
	 * Create a list of local variables used by items in the data node.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2024年11月22日 下午01時33分12秒
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
	 * Last generated by Orchestration Designer at: 2024年11月22日 下午01時33分12秒
	 */
	public boolean executeDataActions(com.avaya.sce.runtimecommon.SCESession mySession) throws Exception {
		java.util.Collection actions = null;

		actions = new java.util.ArrayList(8);
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("TASK_380_TBL:TID", "S_TID:START_TIME", false).setDebugId(21));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("TASK_380_TBL:MSISDN", "S_USERDATA:ANI", false).setDebugId(22));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("TASK_380_TBL:REQ_Date", "date:audio", false).setDebugId(23));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("TASK_380_TBL:REQ_STIME", "time:audio", false).setDebugId(24));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("TASK_380_TBL:REQ_ETIME", "time:audio", false).setDebugId(25));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("TASK_380_TBL:JOB", "DONATE", true).setDebugId(26));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("TASK_380_TBL:AMT", "createCharge_Input:amount", false).setDebugId(29));
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition1", "TASK_380_TBL:REASON", com.avaya.sce.runtime.Expression.IS_EMPTY).setDebugId(30)).evaluate(mySession)) {

			if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition2", "CIE_RecordService_Output:ciechangeReturncode", com.avaya.sce.runtime.Expression.STRING_EQUAL, "ESB-006-028-03000", false).setDebugId(34)).evaluate(mySession)) {
				actions = new java.util.ArrayList(1);
				actions.add(new com.avaya.sce.runtime.varoperations.Assign("TASK_380_TBL:REASON", "", true).setDebugId(36));
				if(evaluateActions(actions, mySession)) {
					return true;
				}
				actions = null;

			} else {
				actions = new java.util.ArrayList(1);
				actions.add(new com.avaya.sce.runtime.varoperations.Assign("TASK_380_TBL:REASON", "F PREPAID", true).setDebugId(27));
				if(evaluateActions(actions, mySession)) {
					return true;
				}
				actions = null;
			}


		}


		if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition3", "TASK_380_TBL:STATUS", com.avaya.sce.runtime.Expression.IS_EMPTY).setDebugId(32)).evaluate(mySession)) {
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("TASK_380_TBL:STATUS", "", true).setDebugId(28));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		}

		// return false if the evaluation of actions did not cause a servlet forward or redirect
		return false;
	}
}
