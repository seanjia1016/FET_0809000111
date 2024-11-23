package flow.subflow.CF_Go_TransactionFor380;

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
 * Last generated by Orchestration Designer at: 2018年3月15日 下午04時22分37秒
 */
public class Transaction_hardCode extends com.avaya.sce.runtime.Data {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2018年3月15日 下午04時22分37秒
	 */
	public Transaction_hardCode() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the Next item which will forward application execution
	 * to the next form in the call flow.
	 * Last generated by Orchestration Designer at: 2024年11月23日 下午08時43分46秒
	 */
	public com.avaya.sce.runtime.Next getNext(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Next next = new com.avaya.sce.runtime.Next("CF_Go_TransactionFor380-API_createCharge", "Default");
		next.setDebugId(58);
		return next;
	}
	/**
	 * Create a list of local variables used by items in the data node.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2024年11月23日 下午08時43分46秒
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
	 * Last generated by Orchestration Designer at: 2024年11月23日 下午08時43分46秒
	 */
	public boolean executeDataActions(com.avaya.sce.runtimecommon.SCESession mySession) throws Exception {
		java.util.Collection actions = null;

		actions = new java.util.ArrayList(22);
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:paymentCategory", "POST", true).setDebugId(60));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:accountNoInfo", "FE_MSIS_CB2_TBL:FE_MSIS_CB_ACCOUNT_ID", false).setDebugId(61));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:serviceReciverId", "getCashSubscriberInfoByKey_Output:subscriberId", false).setDebugId(64));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:serviceReciverType", "S", true).setDebugId(63));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:reciverCustomerId", "FE_MSIS_CB2_TBL:FE_MSIS_CB_CUSTOMER_ID", false).setDebugId(65));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:chargeType", "83", true).setDebugId(66));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:businessEntityNumber", "110154", true).setDebugId(67));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:transChannelId", "properties:transChannelID", false).setDebugId(95));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:transUserId", "properties:transUserID", false).setDebugId(96));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:transPath", "properties:transPath", false).setDebugId(97));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:attributeName_0", "Activity code", true).setDebugId(77));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:attributeName_1", "Activity reason code", true).setDebugId(78));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:attributeName_2", "OC ID", true).setDebugId(79));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:attributeType_0", "64", true).setDebugId(80));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:attributeType_1", "64", true).setDebugId(81));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:attributeType_2", "64", true).setDebugId(82));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:mandatoryInd_0", "64", true).setDebugId(83));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:mandatoryInd_1", "64", true).setDebugId(84));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:mandatoryInd_2", "64", true).setDebugId(85));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:value_0", "OC", true).setDebugId(86));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:value_1", "CREQ", true).setDebugId(88));
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		// return false if the evaluation of actions did not cause a servlet forward or redirect
		return false;
	}
}
