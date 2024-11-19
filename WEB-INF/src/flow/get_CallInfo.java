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
 * Last generated by Orchestration Designer at: 2016年6月6日 上午10時24分37秒
 */
public class get_CallInfo extends com.avaya.sce.runtime.Data {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2016年6月6日 上午10時24分37秒
	 */
	public get_CallInfo() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the Next item which will forward application execution
	 * to the next form in the call flow.
	 * Last generated by Orchestration Designer at: 2024年11月19日 下午02時57分17秒
	 */
	public com.avaya.sce.runtime.Next getNext(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Next next = new com.avaya.sce.runtime.Next("DN_556020", "Default");
		next.setDebugId(1918);
		return next;
	}
	/**
	 * Create a list of local variables used by items in the data node.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2024年11月19日 下午02時57分17秒
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
	 * Last generated by Orchestration Designer at: 2024年11月19日 下午02時57分17秒
	 */
	public boolean executeDataActions(com.avaya.sce.runtimecommon.SCESession mySession) throws Exception {
		java.util.Collection actions = null;

		actions = new java.util.ArrayList(4);
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "#####轉出VDN#####", "CH_PROPERTIES:vdn").setDebugId(1901));
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "#####MIDDLEWARE__IP#####", "CH_PROPERTIES:middlewareIP").setDebugId(1902));
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "#####DBIP#####", "properties:DB_API_IP").setDebugId(1903));
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;
		try {
			actions = new java.util.ArrayList(1);

			//{{START:CODEGEN:EXTENSIONPOINT:com.avaya.sce.cti.ui.callInfo
			actions.add(com.avaya.sce.runtime.connectivity.cti.CTIOpFactory.createCallInfoInitialCallOperation(mySession));
			//}}END:CODEGEN:EXTENSIONPOINT:com.avaya.sce.cti.ui.callInfo

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

		actions = new java.util.ArrayList(5);
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CH_USERDATA:ANI", "cticallinfo:ani", false).setDebugId(1907));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CH_USERDATA:PhoneNumber", "cticallinfo:ani", false).setDebugId(1908));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CH_phonenum:phone", "CH_USERDATA:PhoneNumber", false).setDebugId(1910));
		actions.add(new com.avaya.sce.runtime.varoperations.Length("CH_phonenum:length", "CH_phonenum:phone").setDebugId(1911));
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition1", "CH_phonenum:length", com.avaya.sce.runtime.Expression.INT_GREATER_THEN_EQUAL, "9", false).setDebugId(1912)).evaluate(mySession)) {
			actions = new java.util.ArrayList(5);
			actions.add(new com.avaya.sce.runtime.varoperations.Subtract("CH_phonenum:from", "CH_phonenum:length", false, "9", true).setDebugId(1913));
			actions.add(new com.avaya.sce.runtime.varoperations.SubString("CH_USERDATA:PhoneNumber", "CH_phonenum:phone", "CH_phonenum:from", 9).setDebugId(1914));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CH_phonenum:zero", "0", true).setDebugId(1915));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("CH_phonenum:zero", "CH_USERDATA:PhoneNumber", false).setDebugId(1916));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CH_USERDATA:PhoneNumber", "CH_phonenum:zero", false).setDebugId(1917));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		}

		// return false if the evaluation of actions did not cause a servlet forward or redirect
		return false;
	}
}
