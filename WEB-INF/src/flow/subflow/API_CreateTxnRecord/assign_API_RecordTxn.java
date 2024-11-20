package flow.subflow.API_CreateTxnRecord;

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
 * Last generated by Orchestration Designer at: 2017年10月30日 下午04時27分46秒
 */
public class assign_API_RecordTxn extends com.avaya.sce.runtime.Data {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年10月30日 下午04時27分46秒
	 */
	public assign_API_RecordTxn() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the Next item which will forward application execution
	 * to the next form in the call flow.
	 * Last generated by Orchestration Designer at: 2024年11月20日 上午11時40分38秒
	 */
	public com.avaya.sce.runtime.Next getNext(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Next next = new com.avaya.sce.runtime.Next("API_CreateTxnRecord-changeCIE_Txn", "Default");
		next.setDebugId(37);
		return next;
	}
	/**
	 * Create a list of local variables used by items in the data node.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2024年11月20日 上午11時40分38秒
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
	 * Last generated by Orchestration Designer at: 2024年11月20日 上午11時40分38秒
	 */
	public boolean executeDataActions(com.avaya.sce.runtimecommon.SCESession mySession) throws Exception {
		java.util.Collection actions = null;

		actions = new java.util.ArrayList(12);
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxnRecord_Input:serviceProvider", "FET", true).setDebugId(26));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxnRecord_Input:topics", "系統測試", true).setDebugId(27));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxnRecord_Input:remark", "系統測試", true).setDebugId(28));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxnRecord_Input:contactItemTypeCode", "20003001000", true).setDebugId(29));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxnRecord_Input:contactItemTypeName", "系統測試", true).setDebugId(30));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxnRecord_Input:contactItemGroupName", "系統測試", true).setDebugId(31));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxnRecord_Input:contactItemGroupCode", "20000000000", true).setDebugId(32));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxnRecord_Input:cieTxnLastUpdateUser", "IVR", true).setDebugId(33));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxnRecord_Input:cieChangeItemType", "11", true).setDebugId(34));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxnRecord_Input:oldValue", "系統測試", true).setDebugId(35));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxnRecord_Input:newValue", "系統測試", true).setDebugId(36));
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition1", "createCharge_Output:returnCode", com.avaya.sce.runtime.Expression.STRING_EQUAL, "ESB-006-038-02000", false).setDebugId(41)).evaluate(mySession)) {

			if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition2", "AIR_MENU_MASTER:IVRFLOW", com.avaya.sce.runtime.Expression.INT_EQUAL, "55135", false).setDebugId(42)).evaluate(mySession)) {
				actions = new java.util.ArrayList(3);
				actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxnRecord_Input:remark", "IVR-55135-捐款-", true).setDebugId(43));
				actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("CreateTxnRecord_Input:remark", "IVR_DONATE_TRAN:select_amount", false).setDebugId(44));
				actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("CreateTxnRecord_Input:remark", "-Successed", true).setDebugId(45));
				if(evaluateActions(actions, mySession)) {
					return true;
				}
				actions = null;

			} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition3", "AIR_MENU_MASTER:IVRFLOW", com.avaya.sce.runtime.Expression.INT_EQUAL, "380", false).setDebugId(46)).evaluate(mySession)) {
				actions = new java.util.ArrayList(3);
				actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxnRecord_Input:remark", "IVR-380-捐款-", true).setDebugId(47));
				actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("CreateTxnRecord_Input:remark", "IVR_DONATE_TRAN:select_amount", false).setDebugId(48));
				actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("CreateTxnRecord_Input:remark", "-Successed", true).setDebugId(49));
				if(evaluateActions(actions, mySession)) {
					return true;
				}
				actions = null;

			} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition4", "AIR_MENU_MASTER:IVRFLOW", com.avaya.sce.runtime.Expression.INT_EQUAL, "591939", false).setDebugId(50)).evaluate(mySession)) {
				actions = new java.util.ArrayList(3);
				actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxnRecord_Input:remark", "IVR-591939-捐款-", true).setDebugId(51));
				actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("CreateTxnRecord_Input:remark", "IVR_DONATE_TRAN:select_amount", false).setDebugId(52));
				actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("CreateTxnRecord_Input:remark", "-Successed", true).setDebugId(53));
				if(evaluateActions(actions, mySession)) {
					return true;
				}
				actions = null;

			} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition5", "AIR_MENU_MASTER:IVRFLOW", com.avaya.sce.runtime.Expression.INT_EQUAL, "591980", false).setDebugId(54)).evaluate(mySession)) {
				actions = new java.util.ArrayList(3);
				actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxnRecord_Input:remark", "IVR-591980-捐款-", true).setDebugId(55));
				actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("CreateTxnRecord_Input:remark", "IVR_DONATE_TRAN:select_amount", false).setDebugId(56));
				actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("CreateTxnRecord_Input:remark", "-Successed", true).setDebugId(57));
				if(evaluateActions(actions, mySession)) {
					return true;
				}
				actions = null;

			} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition6", "AIR_MENU_MASTER:IVRFLOW", com.avaya.sce.runtime.Expression.INT_EQUAL, "591933", false).setDebugId(58)).evaluate(mySession)) {
				actions = new java.util.ArrayList(3);
				actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxnRecord_Input:remark", "IVR-591933-捐款-", true).setDebugId(59));
				actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("CreateTxnRecord_Input:remark", "IVR_DONATE_TRAN:select_amount", false).setDebugId(60));
				actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("CreateTxnRecord_Input:remark", "-Successed", true).setDebugId(61));
				if(evaluateActions(actions, mySession)) {
					return true;
				}
				actions = null;

			}

		} else {
			actions = new java.util.ArrayList(5);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CreateTxnRecord_Input:remark", "IVR-", true).setDebugId(63));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("CreateTxnRecord_Input:remark", "AIR_MENU_MASTER:IVRFLOW", false).setDebugId(64));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("CreateTxnRecord_Input:remark", "-捐款-", true).setDebugId(65));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("CreateTxnRecord_Input:remark", "IVR_DONATE_TRAN:select_amount", false).setDebugId(66));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("CreateTxnRecord_Input:remark", "-Failed", true).setDebugId(67));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		}


		actions = new java.util.ArrayList(1);
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "##CreateTxnRecord_Input", "CreateTxnRecord_Input:remark").setDebugId(68));
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		// return false if the evaluation of actions did not cause a servlet forward or redirect
		return false;
	}
}
