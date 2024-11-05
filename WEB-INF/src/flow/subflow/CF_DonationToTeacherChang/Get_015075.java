package flow.subflow.CF_DonationToTeacherChang;

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
 * Last generated by Orchestration Designer at: 2017年6月28日 下午07時15分56秒
 */
public class Get_015075 extends com.avaya.sce.runtime.Data {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年6月28日 下午07時15分56秒
	 */
	public Get_015075() {
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
		com.avaya.sce.runtime.Next next = new com.avaya.sce.runtime.Next("CF_DonationToTeacherChang-insert_AIR_MENU_DETAIL5", "Default");
		next.setDebugId(592);
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

		actions = new java.util.ArrayList(11);
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU:MENU_ID", "591980_015075", true).setDebugId(482));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_DETAIL:MENU_ID", "AIR_MENU:MENU_ID", false).setDebugId(483));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_MASTER:MENU_ID", "AIR_MENU:MENU_ID", false).setDebugId(484));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_DETAIL:MENU_TIME", "date:audio", false).setDebugId(485));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_MENU_DETAIL:MENU_TIME", "time:audio", false).setDebugId(486));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_DETAIL:STR_LOG", "MN_015075:utterance", false).setDebugId(487));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_DETAIL:TID", "S_TID:TID", false).setDebugId(488));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("IVR_DONATE_TRAN:select_amount", "1000", true).setDebugId(623));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("CH_CIE:BOTTON", "MN_015075:utterance", false).setDebugId(728));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("CH_CIE:BOTTON", ",", true).setDebugId(729));
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		// return false if the evaluation of actions did not cause a servlet forward or redirect
		return false;
	}
}
