package flow.subflow.CF_DonationToPaperWindmillTroupe;

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
 * Last generated by Orchestration Designer at: 2017年6月28日 下午03時05分31秒
 */
public class Get_015831 extends com.avaya.sce.runtime.Data {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年6月28日 下午03時05分31秒
	 */
	public Get_015831() {
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
		com.avaya.sce.runtime.Next next = new com.avaya.sce.runtime.Next("CF_DonationToPaperWindmillTroupe-insert_AIR_MENU_DETAIL", "Default");
		next.setDebugId(681);
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

		actions = new java.util.ArrayList(10);
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU:MENU_ID", "591939_015831", true).setDebugId(610));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_DETAIL:MENU_ID", "AIR_MENU:MENU_ID", false).setDebugId(611));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_MASTER:MENU_ID", "AIR_MENU:MENU_ID", false).setDebugId(612));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_DETAIL:MENU_TIME", "date:audio", false).setDebugId(613));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_MENU_DETAIL:MENU_TIME", "time:audio", false).setDebugId(614));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_DETAIL:STR_LOG", "MN_015831:utterance", false).setDebugId(615));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_DETAIL:TID", "S_TID:TID", false).setDebugId(616));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("CH_CIE:BOTTON", "MN_015831:utterance", false).setDebugId(877));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("CH_CIE:BOTTON", ",", true).setDebugId(878));
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		// return false if the evaluation of actions did not cause a servlet forward or redirect
		return false;
	}
}
