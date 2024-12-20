package flow.subflow.CF_DonationToChineseChristianReliefAssociation;

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
 * Last generated by Orchestration Designer at: 2017年8月30日 下午03時37分21秒
 */
public class insert_Menu_Log extends com.avaya.sce.runtime.Data {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年8月30日 下午03時37分21秒
	 */
	public insert_Menu_Log() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the Next item which will forward application execution
	 * to the next form in the call flow.
	 * Last generated by Orchestration Designer at: 2024年10月9日 下午05時54分44秒
	 */
	public com.avaya.sce.runtime.Next getNext(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Next next = new com.avaya.sce.runtime.Next("CF_DonationToChineseChristianReliefAssociation-insert_AIR_MENU_TBL", "Next");
		next.setDebugId(948);
		return next;
	}
	/**
	 * Create a list of local variables used by items in the data node.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2024年10月9日 下午05時54分44秒
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
	 * Last generated by Orchestration Designer at: 2024年10月9日 下午05時54分44秒
	 */
	public boolean executeDataActions(com.avaya.sce.runtimecommon.SCESession mySession) throws Exception {
		java.util.Collection actions = null;

		actions = new java.util.ArrayList(1);
		com.avaya.sce.runtime.BooleanOperation bo1 = new com.avaya.sce.runtime.BooleanOperation(com.avaya.sce.runtime.BooleanOperation.OR);
		com.avaya.sce.runtime.Expression be1 = new com.avaya.sce.runtime.Expression("expression1", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "80437039913", false);
		bo1.addExpression(be1);
		com.avaya.sce.runtime.Expression be2 = new com.avaya.sce.runtime.Expression("expression2", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "437039913", false);
		bo1.addExpression(be2);
		com.avaya.sce.runtime.Expression be3 = new com.avaya.sce.runtime.Expression("expression3", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "2149913", false);
		bo1.addExpression(be3);
		com.avaya.sce.runtime.Expression be4 = new com.avaya.sce.runtime.Expression("expression4", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "49913", false);
		bo1.addExpression(be4);
		com.avaya.sce.runtime.Expression be5 = new com.avaya.sce.runtime.Expression("expression5", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "2011136", false);
		bo1.addExpression(be5);
		com.avaya.sce.runtime.Expression be6 = new com.avaya.sce.runtime.Expression("expression6", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "21136", false);
		bo1.addExpression(be6);
		com.avaya.sce.runtime.BooleanOperation bo2 = new com.avaya.sce.runtime.BooleanOperation(com.avaya.sce.runtime.BooleanOperation.OR);
		com.avaya.sce.runtime.Expression be7 = new com.avaya.sce.runtime.Expression("expression7", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "80437039380", false);
		bo2.addExpression(be7);
		com.avaya.sce.runtime.Expression be8 = new com.avaya.sce.runtime.Expression("expression8", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "2149380", false);
		bo2.addExpression(be8);
		com.avaya.sce.runtime.Expression be9 = new com.avaya.sce.runtime.Expression("expression9", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "49380", false);
		bo2.addExpression(be9);
		com.avaya.sce.runtime.Expression be10 = new com.avaya.sce.runtime.Expression("expression10", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "2011137", false);
		bo2.addExpression(be10);
		com.avaya.sce.runtime.Expression be11 = new com.avaya.sce.runtime.Expression("expression11", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "21137", false);
		bo2.addExpression(be11);
		com.avaya.sce.runtime.BooleanOperation bo3 = new com.avaya.sce.runtime.BooleanOperation(com.avaya.sce.runtime.BooleanOperation.OR);
		com.avaya.sce.runtime.Expression be12 = new com.avaya.sce.runtime.Expression("expression12", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "80437039469", false);
		bo3.addExpression(be12);
		com.avaya.sce.runtime.Expression be13 = new com.avaya.sce.runtime.Expression("expression13", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "2149469", false);
		bo3.addExpression(be13);
		com.avaya.sce.runtime.Expression be14 = new com.avaya.sce.runtime.Expression("expression14", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "49469", false);
		bo3.addExpression(be14);
		com.avaya.sce.runtime.BooleanOperation bo4 = new com.avaya.sce.runtime.BooleanOperation(com.avaya.sce.runtime.BooleanOperation.OR);
		com.avaya.sce.runtime.Expression be15 = new com.avaya.sce.runtime.Expression("expression15", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "80437039467", false);
		bo4.addExpression(be15);
		com.avaya.sce.runtime.Expression be16 = new com.avaya.sce.runtime.Expression("expression16", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "437039467", false);
		bo4.addExpression(be16);
		com.avaya.sce.runtime.Expression be17 = new com.avaya.sce.runtime.Expression("expression17", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "2149467", false);
		bo4.addExpression(be17);
		com.avaya.sce.runtime.Expression be18 = new com.avaya.sce.runtime.Expression("expression18", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "49467", false);
		bo4.addExpression(be18);
		com.avaya.sce.runtime.BooleanOperation bo5 = new com.avaya.sce.runtime.BooleanOperation(com.avaya.sce.runtime.BooleanOperation.OR);
		com.avaya.sce.runtime.Expression be19 = new com.avaya.sce.runtime.Expression("expression19", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "80437039470", false);
		bo5.addExpression(be19);
		com.avaya.sce.runtime.Expression be20 = new com.avaya.sce.runtime.Expression("expression20", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "437039470", false);
		bo5.addExpression(be20);
		com.avaya.sce.runtime.Expression be21 = new com.avaya.sce.runtime.Expression("expression21", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "2149470", false);
		bo5.addExpression(be21);
		com.avaya.sce.runtime.Expression be22 = new com.avaya.sce.runtime.Expression("expression22", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "49470", false);
		bo5.addExpression(be22);
		com.avaya.sce.runtime.BooleanOperation bo6 = new com.avaya.sce.runtime.BooleanOperation(com.avaya.sce.runtime.BooleanOperation.OR);
		com.avaya.sce.runtime.Expression be23 = new com.avaya.sce.runtime.Expression("expression23", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "49465", false);
		bo6.addExpression(be23);
		com.avaya.sce.runtime.Expression be24 = new com.avaya.sce.runtime.Expression("expression24", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "80437039465", false);
		bo6.addExpression(be24);
		com.avaya.sce.runtime.Expression be25 = new com.avaya.sce.runtime.Expression("expression25", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "437039465", false);
		bo6.addExpression(be25);
		com.avaya.sce.runtime.Expression be26 = new com.avaya.sce.runtime.Expression("expression26", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "2149465", false);
		bo6.addExpression(be26);
		com.avaya.sce.runtime.BooleanOperation bo7 = new com.avaya.sce.runtime.BooleanOperation(com.avaya.sce.runtime.BooleanOperation.OR);
		com.avaya.sce.runtime.Expression be27 = new com.avaya.sce.runtime.Expression("expression27", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "49452", false);
		bo7.addExpression(be27);
		com.avaya.sce.runtime.Expression be28 = new com.avaya.sce.runtime.Expression("expression28", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "80437039452", false);
		bo7.addExpression(be28);
		com.avaya.sce.runtime.Expression be29 = new com.avaya.sce.runtime.Expression("expression29", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "437039452", false);
		bo7.addExpression(be29);
		com.avaya.sce.runtime.Expression be30 = new com.avaya.sce.runtime.Expression("expression30", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "2149452", false);
		bo7.addExpression(be30);
		com.avaya.sce.runtime.BooleanOperation bo8 = new com.avaya.sce.runtime.BooleanOperation(com.avaya.sce.runtime.BooleanOperation.OR);
		com.avaya.sce.runtime.Expression be31 = new com.avaya.sce.runtime.Expression("expression31", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "49453", false);
		bo8.addExpression(be31);
		com.avaya.sce.runtime.Expression be32 = new com.avaya.sce.runtime.Expression("expression32", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "80437039453", false);
		bo8.addExpression(be32);
		com.avaya.sce.runtime.Expression be33 = new com.avaya.sce.runtime.Expression("expression33", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "437039453", false);
		bo8.addExpression(be33);
		com.avaya.sce.runtime.Expression be34 = new com.avaya.sce.runtime.Expression("expression34", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "2149453", false);
		bo8.addExpression(be34);
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition").setDebugId(819)).evaluate(mySession, bo1)) {
			actions = new java.util.ArrayList(13);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_55135_MENU_TBL:AIR_55135_MENU_CELL_NUM", "S_USERDATA:ANI", false).setDebugId(827));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_55135_MENU_TBL:AIR_55135_MENU_Node_ID", "properties:Channel", false).setDebugId(828));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_55135_MENU_TBL:AIR_55135_MENU_CHANNEL", "cticallinfo:stationextension", false).setDebugId(829));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_55135_MENU_TBL:AIR_55135_MENU_Node_ID", "^", true).setDebugId(830));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_55135_MENU_TBL:AIR_55135_MENU_Node_ID", "AIR_55135_MENU_TBL:AIR_55135_MENU_CHANNEL", false).setDebugId(831));
			actions.add(new com.avaya.sce.runtime.varoperations.Add("AIR_55135_MENU_TBL:AIR_55135_MENU_INDX", "AIR_55135_MENU_TBL:AIR_55135_MENU_INDX", false, "1", true).setDebugId(832));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_55135_MENU_TBL:AIR_55135_MENU_DATE", "date:audio", false).setDebugId(833));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### 55135_Menu_Date ###", "AIR_55135_MENU_TBL:AIR_55135_MENU_DATE").setDebugId(834));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_55135_MENU_TBL:AIR_55135_MENU_STARTTIME", "insert_StartTime", false).setDebugId(835));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_55135_MENU_TBL:AIR_55135_MENU_ENDTIME", "time:audio", false).setDebugId(836));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_55135_MENU_TBL:AIR_55135_MENU_IN_VDN", "S_USERDATA:DNIS", false).setDebugId(837));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_55135_MENU_TBL:AIR_55135_MENU_IN_ENTERPRISE", "N", true).setDebugId(838));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition").setDebugId(839)).evaluate(mySession, bo2)) {
			actions = new java.util.ArrayList(15);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_380_MENU_TBL:AIR_380_MENU_CELL_NUM", "S_USERDATA:ANI", false).setDebugId(846));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_380_MENU_TBL:AIR_380_MENU_Node_ID", "properties:Channel", false).setDebugId(847));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_380_MENU_TBL:AIR_380_MENU_CHANNEL", "cticallinfo:stationextension", false).setDebugId(848));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_380_MENU_TBL:AIR_380_MENU_Node_ID", "^", true).setDebugId(849));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_380_MENU_TBL:AIR_380_MENU_Node_ID", "AIR_380_MENU_TBL:AIR_380_MENU_CHANNEL", false).setDebugId(850));
			actions.add(new com.avaya.sce.runtime.varoperations.Add("AIR_380_MENU_TBL:AIR_380_MENU_INDX", "AIR_380_MENU_TBL:AIR_380_MENU_INDX", false, "1", true).setDebugId(851));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_380_MENU_TBL:AIR_380_MENU_DATE", "date:audio", false).setDebugId(852));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### 380_Menu_Date ###", "AIR_380_MENU_TBL:AIR_380_MENU_DATE").setDebugId(853));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_380_MENU_TBL:AIR_380_MENU_STARTTIME", "insert_StartTime", false).setDebugId(854));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_380_MENU_TBL:AIR_380_MENU_ENDTIME", "time:audio", false).setDebugId(855));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_380_MENU_TBL:AIR_380_MENU_IN_VDN", "S_USERDATA:DNIS", false).setDebugId(856));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_380_MENU_TBL:AIR_380_MENU_IN_ENTERPRISE", "N", true).setDebugId(857));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### 380_SQL ###", "S_DB_API:SQL").setDebugId(858));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### 380_Table ###", "S_DB_API:Table").setDebugId(859));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition").setDebugId(860)).evaluate(mySession, bo3)) {
			actions = new java.util.ArrayList(13);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591933_MENU_TBL:AIR_591933_MENU_CELL_NUM", "S_USERDATA:ANI", false).setDebugId(865));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591933_MENU_TBL:AIR_591933_MENU_Node_ID", "properties:Channel", false).setDebugId(866));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591933_MENU_TBL:AIR_591933_MENU_CHANNEL", "cticallinfo:stationextension", false).setDebugId(867));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_591933_MENU_TBL:AIR_591933_MENU_Node_ID", "^", true).setDebugId(868));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_591933_MENU_TBL:AIR_591933_MENU_Node_ID", "AIR_591933_MENU_TBL:AIR_591933_MENU_CHANNEL", false).setDebugId(869));
			actions.add(new com.avaya.sce.runtime.varoperations.Add("AIR_591933_MENU_TBL:AIR_591933_MENU_INDX", "AIR_591933_MENU_TBL:AIR_591933_MENU_INDX", false, "1", true).setDebugId(870));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591933_MENU_TBL:AIR_591933_MENU_DATE", "date:audio", false).setDebugId(871));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### 591933_Menu_Date ###", "AIR_591933_MENU_TBL:AIR_591933_MENU_DATE").setDebugId(872));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591933_MENU_TBL:AIR_591933_MENU_STARTTIME", "insert_StartTime", false).setDebugId(873));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591933_MENU_TBL:AIR_591933_MENU_ENDTIME", "time:audio", false).setDebugId(874));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591933_MENU_TBL:AIR_591933_MENU_IN_VDN", "S_USERDATA:DNIS", false).setDebugId(875));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591933_MENU_TBL:AIR_591933_MENU_IN_ENTERPRISE", "N", true).setDebugId(876));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition").setDebugId(877)).evaluate(mySession, bo4)) {
			actions = new java.util.ArrayList(13);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591939_MENU_TBL:AIR_591939_MENU_CELL_NUM", "S_USERDATA:ANI", false).setDebugId(883));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591939_MENU_TBL:AIR_591939_MENU_Node_ID", "properties:Channel", false).setDebugId(884));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591939_MENU_TBL:AIR_591939_MENU_CHANNEL", "cticallinfo:stationextension", false).setDebugId(885));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_591939_MENU_TBL:AIR_591939_MENU_Node_ID", "^", true).setDebugId(886));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_591939_MENU_TBL:AIR_591939_MENU_Node_ID", "AIR_591939_MENU_TBL:AIR_591939_MENU_CHANNEL", false).setDebugId(887));
			actions.add(new com.avaya.sce.runtime.varoperations.Add("AIR_591939_MENU_TBL:AIR_591939_MENU_INDX", "AIR_591939_MENU_TBL:AIR_591939_MENU_INDX", false, "1", true).setDebugId(888));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591939_MENU_TBL:AIR_591939_MENU_DATE", "date:audio", false).setDebugId(889));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "", "AIR_591939_MENU_TBL:AIR_591939_MENU_DATE").setDebugId(890));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591939_MENU_TBL:AIR_591939_MENU_STARTTIME", "insert_StartTime", false).setDebugId(891));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591939_MENU_TBL:AIR_591939_MENU_ENDTIME", "time:audio", false).setDebugId(892));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591939_MENU_TBL:AIR_591939_MENU_IN_VDN", "S_USERDATA:DNIS", false).setDebugId(893));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591939_MENU_TBL:AIR_591939_MENU_IN_ENTERPRISE", "N", true).setDebugId(894));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition").setDebugId(895)).evaluate(mySession, bo5)) {
			actions = new java.util.ArrayList(13);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591980_MENU_TBL:AIR_591980_MENU_CELL_NUM", "S_USERDATA:ANI", false).setDebugId(901));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591980_MENU_TBL:AIR_591980_MENU_Node_ID", "properties:Channel", false).setDebugId(902));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591980_MENU_TBL:AIR_591980_MENU_CHANNEL", "cticallinfo:stationextension", false).setDebugId(903));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_591980_MENU_TBL:AIR_591980_MENU_Node_ID", "^", true).setDebugId(904));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_591980_MENU_TBL:AIR_591980_MENU_Node_ID", "AIR_591980_MENU_TBL:AIR_591980_MENU_CHANNEL", false).setDebugId(905));
			actions.add(new com.avaya.sce.runtime.varoperations.Add("AIR_591980_MENU_TBL:AIR_591980_MENU_INDX", "AIR_591980_MENU_TBL:AIR_591980_MENU_INDX", false, "1", true).setDebugId(906));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591980_MENU_TBL:AIR_591980_MENU_DATE", "date:audio", false).setDebugId(907));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### 591980_Menu_Date ###", "AIR_591980_MENU_TBL:AIR_591980_MENU_DATE").setDebugId(908));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591980_MENU_TBL:AIR_591980_MENU_STARTTIME", "insert_StartTime", false).setDebugId(909));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591980_MENU_TBL:AIR_591980_MENU_ENDTIME", "time:audio", false).setDebugId(910));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591980_MENU_TBL:AIR_591980_MENU_IN_VDN", "S_USERDATA:DNIS", false).setDebugId(911));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591980_MENU_TBL:AIR_591980_MENU_IN_ENTERPRISE", "N", true).setDebugId(912));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition").setDebugId(913)).evaluate(mySession, bo6)) {
			actions = new java.util.ArrayList(13);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591993_MENU_TBL:AIR_591993_MENU_CELL_NUM", "S_USERDATA:ANI", false).setDebugId(919));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591993_MENU_TBL:AIR_591993_MENU_Node_ID", "properties:Channel", false).setDebugId(920));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591993_MENU_TBL:AIR_591993_MENU_CHANNEL", "cticallinfo:stationextension", false).setDebugId(921));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_591993_MENU_TBL:AIR_591993_MENU_Node_ID", "^", true).setDebugId(922));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_591993_MENU_TBL:AIR_591993_MENU_Node_ID", "AIR_591993_MENU_TBL:AIR_591993_MENU_CHANNEL", false).setDebugId(923));
			actions.add(new com.avaya.sce.runtime.varoperations.Add("AIR_591993_MENU_TBL:AIR_591993_MENU_INDX", "AIR_591993_MENU_TBL:AIR_591993_MENU_INDX", false, "1", true).setDebugId(924));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591993_MENU_TBL:AIR_591993_MENU_DATE", "date:audio", false).setDebugId(925));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### 591993_Menu_Date ###", "AIR_591993_MENU_TBL:AIR_591993_MENU_DATE").setDebugId(926));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591993_MENU_TBL:AIR_591993_MENU_STARTTIME", "insert_StartTime", false).setDebugId(927));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591993_MENU_TBL:AIR_591993_MENU_ENDTIME", "time:audio", false).setDebugId(928));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591993_MENU_TBL:AIR_591993_MENU_IN_VDN", "S_USERDATA:DNIS", false).setDebugId(929));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591993_MENU_TBL:AIR_591993_MENU_IN_ENTERPRISE", "N", true).setDebugId(930));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition").setDebugId(931)).evaluate(mySession, bo7)) {
			actions = new java.util.ArrayList(13);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591999_MENU_TBL:AIR_591999_MENU_CELL_NUM", "S_USERDATA:ANI", false).setDebugId(934));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591999_MENU_TBL:AIR_591999_MENU_Node_ID", "properties:Channel", false).setDebugId(935));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591999_MENU_TBL:AIR_591999_MENU_CHANNEL", "cticallinfo:stationextension", false).setDebugId(936));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_591999_MENU_TBL:AIR_591999_MENU_Node_ID", "^", true).setDebugId(937));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_591999_MENU_TBL:AIR_591999_MENU_Node_ID", "AIR_591999_MENU_TBL:AIR_591999_MENU_CHANNEL", false).setDebugId(938));
			actions.add(new com.avaya.sce.runtime.varoperations.Add("AIR_591999_MENU_TBL:AIR_591999_MENU_INDX", "AIR_591999_MENU_TBL:AIR_591999_MENU_INDX", false, "1", true).setDebugId(939));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591999_MENU_TBL:AIR_591999_MENU_DATE", "date:audio", false).setDebugId(940));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### 591999_Menu_Date ###", "AIR_591999_MENU_TBL:AIR_591999_MENU_DATE").setDebugId(941));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591999_MENU_TBL:AIR_591999_MENU_STARTTIME", "insert_StartTime", false).setDebugId(942));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591999_MENU_TBL:AIR_591999_MENU_ENDTIME", "time:audio", false).setDebugId(943));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591999_MENU_TBL:AIR_591999_MENU_IN_VDN", "S_USERDATA:DNIS", false).setDebugId(944));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591999_MENU_TBL:AIR_591999_MENU_IN_ENTERPRISE", "N", true).setDebugId(945));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition").setDebugId(1121)).evaluate(mySession, bo8)) {
			actions = new java.util.ArrayList(13);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591919_MENU_TBL:AIR_591919_MENU_CELL_NUM", "S_USERDATA:ANI", false).setDebugId(1124));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591919_MENU_TBL:AIR_591919_MENU_Node_ID", "properties:Channel", false).setDebugId(1125));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591919_MENU_TBL:AIR_591919_MENU_CHANNEL", "cticallinfo:stationextension", false).setDebugId(1126));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_591919_MENU_TBL:AIR_591919_MENU_Node_ID", "^", true).setDebugId(1127));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_591919_MENU_TBL:AIR_591919_MENU_Node_ID", "AIR_591919_MENU_TBL:AIR_591919_MENU_CHANNEL", false).setDebugId(1128));
			actions.add(new com.avaya.sce.runtime.varoperations.Add("AIR_591919_MENU_TBL:AIR_591919_MENU_INDX", "AIR_591919_MENU_TBL:AIR_591919_MENU_INDX", false, "1", true).setDebugId(1129));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591919_MENU_TBL:AIR_591919_MENU_DATE", "date:audio", false).setDebugId(1130));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### 591919_Menu_Date ###", "AIR_591919_MENU_TBL:AIR_591919_MENU_DATE").setDebugId(1131));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591919_MENU_TBL:AIR_591919_MENU_STARTTIME", "insert_StartTime", false).setDebugId(1132));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591919_MENU_TBL:AIR_591919_MENU_ENDTIME", "time:audio", false).setDebugId(1133));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591919_MENU_TBL:AIR_591919_MENU_IN_VDN", "S_USERDATA:DNIS", false).setDebugId(1134));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591919_MENU_TBL:AIR_591919_MENU_IN_ENTERPRISE", "N", true).setDebugId(1135));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else {
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.Next("CF_DonationToChineseChristianReliefAssociation-end", "Default").setDebugId(947));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		}


		// return false if the evaluation of actions did not cause a servlet forward or redirect
		return false;
	}
}
