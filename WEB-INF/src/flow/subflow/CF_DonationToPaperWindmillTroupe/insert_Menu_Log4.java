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
 * Last generated by Orchestration Designer at: 2017年8月30日 下午03時37分21秒
 */
public class insert_Menu_Log4 extends com.avaya.sce.runtime.Data {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年8月30日 下午03時37分21秒
	 */
	public insert_Menu_Log4() {
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
		com.avaya.sce.runtime.Next next = new com.avaya.sce.runtime.Next("CF_DonationToPaperWindmillTroupe-insert_AIR_MENU_TBL4", "Next");
		next.setDebugId(2076);
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
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition").setDebugId(1980)).evaluate(mySession, bo1)) {
			actions = new java.util.ArrayList(13);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_55135_MENU_TBL:AIR_55135_MENU_CELL_NUM", "S_USERDATA:ANI", false).setDebugId(1988));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_55135_MENU_TBL:AIR_55135_MENU_Node_ID", "properties:Channel", false).setDebugId(1989));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_55135_MENU_TBL:AIR_55135_MENU_CHANNEL", "cticallinfo:stationextension", false).setDebugId(1990));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_55135_MENU_TBL:AIR_55135_MENU_Node_ID", "^", true).setDebugId(1991));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_55135_MENU_TBL:AIR_55135_MENU_Node_ID", "AIR_55135_MENU_TBL:AIR_55135_MENU_CHANNEL", false).setDebugId(1992));
			actions.add(new com.avaya.sce.runtime.varoperations.Add("AIR_55135_MENU_TBL:AIR_55135_MENU_INDX", "AIR_55135_MENU_TBL:AIR_55135_MENU_INDX", false, "1", true).setDebugId(1993));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_55135_MENU_TBL:AIR_55135_MENU_DATE", "date:audio", false).setDebugId(1994));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### 55135_Menu_Date ###", "AIR_55135_MENU_TBL:AIR_55135_MENU_DATE").setDebugId(1995));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_55135_MENU_TBL:AIR_55135_MENU_STARTTIME", "insert_StartTime", false).setDebugId(1996));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_55135_MENU_TBL:AIR_55135_MENU_ENDTIME", "time:audio", false).setDebugId(1997));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_55135_MENU_TBL:AIR_55135_MENU_IN_VDN", "S_USERDATA:DNIS", false).setDebugId(1998));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_55135_MENU_TBL:AIR_55135_MENU_IN_ENTERPRISE", "N", true).setDebugId(1999));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition").setDebugId(2000)).evaluate(mySession, bo2)) {
			actions = new java.util.ArrayList(15);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_380_MENU_TBL:AIR_380_MENU_CELL_NUM", "S_USERDATA:ANI", false).setDebugId(2007));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_380_MENU_TBL:AIR_380_MENU_Node_ID", "properties:Channel", false).setDebugId(2008));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_380_MENU_TBL:AIR_380_MENU_CHANNEL", "cticallinfo:stationextension", false).setDebugId(2009));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_380_MENU_TBL:AIR_380_MENU_Node_ID", "^", true).setDebugId(2010));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_380_MENU_TBL:AIR_380_MENU_Node_ID", "AIR_380_MENU_TBL:AIR_380_MENU_CHANNEL", false).setDebugId(2011));
			actions.add(new com.avaya.sce.runtime.varoperations.Add("AIR_380_MENU_TBL:AIR_380_MENU_INDX", "AIR_380_MENU_TBL:AIR_380_MENU_INDX", false, "1", true).setDebugId(2012));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_380_MENU_TBL:AIR_380_MENU_DATE", "date:audio", false).setDebugId(2013));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### 380_Menu_Date ###", "AIR_380_MENU_TBL:AIR_380_MENU_DATE").setDebugId(2014));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_380_MENU_TBL:AIR_380_MENU_STARTTIME", "insert_StartTime", false).setDebugId(2015));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_380_MENU_TBL:AIR_380_MENU_ENDTIME", "time:audio", false).setDebugId(2016));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_380_MENU_TBL:AIR_380_MENU_IN_VDN", "S_USERDATA:DNIS", false).setDebugId(2017));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_380_MENU_TBL:AIR_380_MENU_IN_ENTERPRISE", "N", true).setDebugId(2018));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### 380_SQL ###", "S_DB_API:SQL").setDebugId(2019));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### 380_Table ###", "S_DB_API:Table").setDebugId(2020));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition").setDebugId(2021)).evaluate(mySession, bo3)) {
			actions = new java.util.ArrayList(13);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591933_MENU_TBL:AIR_591933_MENU_CELL_NUM", "S_USERDATA:ANI", false).setDebugId(2026));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591933_MENU_TBL:AIR_591933_MENU_Node_ID", "properties:Channel", false).setDebugId(2027));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591933_MENU_TBL:AIR_591933_MENU_CHANNEL", "cticallinfo:stationextension", false).setDebugId(2028));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_591933_MENU_TBL:AIR_591933_MENU_Node_ID", "^", true).setDebugId(2029));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_591933_MENU_TBL:AIR_591933_MENU_Node_ID", "AIR_591933_MENU_TBL:AIR_591933_MENU_CHANNEL", false).setDebugId(2030));
			actions.add(new com.avaya.sce.runtime.varoperations.Add("AIR_591933_MENU_TBL:AIR_591933_MENU_INDX", "AIR_591933_MENU_TBL:AIR_591933_MENU_INDX", false, "1", true).setDebugId(2031));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591933_MENU_TBL:AIR_591933_MENU_DATE", "date:audio", false).setDebugId(2032));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### 591933_Menu_Date ###", "AIR_591933_MENU_TBL:AIR_591933_MENU_DATE").setDebugId(2033));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591933_MENU_TBL:AIR_591933_MENU_STARTTIME", "insert_StartTime", false).setDebugId(2034));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591933_MENU_TBL:AIR_591933_MENU_ENDTIME", "time:audio", false).setDebugId(2035));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591933_MENU_TBL:AIR_591933_MENU_IN_VDN", "S_USERDATA:DNIS", false).setDebugId(2036));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591933_MENU_TBL:AIR_591933_MENU_IN_ENTERPRISE", "N", true).setDebugId(2037));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition").setDebugId(2038)).evaluate(mySession, bo4)) {
			actions = new java.util.ArrayList(13);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591939_MENU_TBL:AIR_591939_MENU_CELL_NUM", "S_USERDATA:ANI", false).setDebugId(2044));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591939_MENU_TBL:AIR_591939_MENU_Node_ID", "properties:Channel", false).setDebugId(2045));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591939_MENU_TBL:AIR_591939_MENU_CHANNEL", "cticallinfo:stationextension", false).setDebugId(2046));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_591939_MENU_TBL:AIR_591939_MENU_Node_ID", "^", true).setDebugId(2047));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_591939_MENU_TBL:AIR_591939_MENU_Node_ID", "AIR_591939_MENU_TBL:AIR_591939_MENU_CHANNEL", false).setDebugId(2048));
			actions.add(new com.avaya.sce.runtime.varoperations.Add("AIR_591939_MENU_TBL:AIR_591939_MENU_INDX", "AIR_591939_MENU_TBL:AIR_591939_MENU_INDX", false, "1", true).setDebugId(2049));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591939_MENU_TBL:AIR_591939_MENU_DATE", "date:audio", false).setDebugId(2050));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "", "AIR_591939_MENU_TBL:AIR_591939_MENU_DATE").setDebugId(2051));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591939_MENU_TBL:AIR_591939_MENU_STARTTIME", "insert_StartTime", false).setDebugId(2052));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591939_MENU_TBL:AIR_591939_MENU_ENDTIME", "time:audio", false).setDebugId(2053));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591939_MENU_TBL:AIR_591939_MENU_IN_VDN", "S_USERDATA:DNIS", false).setDebugId(2054));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591939_MENU_TBL:AIR_591939_MENU_IN_ENTERPRISE", "N", true).setDebugId(2055));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition").setDebugId(2056)).evaluate(mySession, bo5)) {
			actions = new java.util.ArrayList(13);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591980_MENU_TBL:AIR_591980_MENU_CELL_NUM", "S_USERDATA:ANI", false).setDebugId(2062));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591980_MENU_TBL:AIR_591980_MENU_Node_ID", "properties:Channel", false).setDebugId(2063));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591980_MENU_TBL:AIR_591980_MENU_CHANNEL", "cticallinfo:stationextension", false).setDebugId(2064));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_591980_MENU_TBL:AIR_591980_MENU_Node_ID", "^", true).setDebugId(2065));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_591980_MENU_TBL:AIR_591980_MENU_Node_ID", "AIR_591980_MENU_TBL:AIR_591980_MENU_CHANNEL", false).setDebugId(2066));
			actions.add(new com.avaya.sce.runtime.varoperations.Add("AIR_591980_MENU_TBL:AIR_591980_MENU_INDX", "AIR_591980_MENU_TBL:AIR_591980_MENU_INDX", false, "1", true).setDebugId(2067));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591980_MENU_TBL:AIR_591980_MENU_DATE", "date:audio", false).setDebugId(2068));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### 591980_Menu_Date ###", "AIR_591980_MENU_TBL:AIR_591980_MENU_DATE").setDebugId(2069));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591980_MENU_TBL:AIR_591980_MENU_STARTTIME", "insert_StartTime", false).setDebugId(2070));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591980_MENU_TBL:AIR_591980_MENU_ENDTIME", "time:audio", false).setDebugId(2071));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591980_MENU_TBL:AIR_591980_MENU_IN_VDN", "S_USERDATA:DNIS", false).setDebugId(2072));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591980_MENU_TBL:AIR_591980_MENU_IN_ENTERPRISE", "N", true).setDebugId(2073));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else {
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.Next("CF_DonationToPaperWindmillTroupe-End", "Default").setDebugId(2075));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		}


		// return false if the evaluation of actions did not cause a servlet forward or redirect
		return false;
	}
}
