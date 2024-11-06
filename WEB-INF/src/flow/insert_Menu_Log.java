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
	 * Last generated by Orchestration Designer at: 2024年11月6日 下午04時02分58秒
	 */
	public com.avaya.sce.runtime.Next getNext(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Next next = new com.avaya.sce.runtime.Next("insert_AIR_MENU_TBL", "Next");
		next.setDebugId(1536);
		return next;
	}
	/**
	 * Create a list of local variables used by items in the data node.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2024年11月6日 下午04時02分58秒
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
	 * Last generated by Orchestration Designer at: 2024年11月6日 下午04時02分58秒
	 */
	public boolean executeDataActions(com.avaya.sce.runtimecommon.SCESession mySession) throws Exception {
		java.util.Collection actions = null;

		actions = new java.util.ArrayList(1);
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		// switch start (1428)
		if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition1", "AIR_MENU_MASTER:IVRFLOW", com.avaya.sce.runtime.Expression.STRING_EQUAL, "380", false).setDebugId(1428)).evaluate(mySession)) {
			actions = new java.util.ArrayList(14);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_380_MENU_TBL:AIR_380_MENU_CELL_NUM", "S_USERDATA:ANI", false).setDebugId(1429));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_380_MENU_TBL:AIR_380_MENU_Node_ID", "properties:Channel", false).setDebugId(1430));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_380_MENU_TBL:AIR_380_MENU_CHANNEL", "cticallinfo:stationextension", false).setDebugId(1431));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_380_MENU_TBL:AIR_380_MENU_Node_ID", "^", true).setDebugId(1432));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_380_MENU_TBL:AIR_380_MENU_Node_ID", "AIR_380_MENU_TBL:AIR_380_MENU_CHANNEL", false).setDebugId(1433));
			actions.add(new com.avaya.sce.runtime.varoperations.Add("AIR_380_MENU_TBL:AIR_380_MENU_INDX", "AIR_380_MENU_TBL:AIR_380_MENU_INDX", false, "1", true).setDebugId(1434));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_380_MENU_TBL:AIR_380_MENU_DATE", "date:audio", false).setDebugId(1435));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### 380_Menu_Date ###", "AIR_380_MENU_TBL:AIR_380_MENU_DATE").setDebugId(1436));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_380_MENU_TBL:AIR_380_MENU_STARTTIME", "insert_StartTime", false).setDebugId(1437));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_380_MENU_TBL:AIR_380_MENU_ENDTIME", "time:audio", false).setDebugId(1438));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_380_MENU_TBL:AIR_380_MENU_IN_VDN", "S_USERDATA:DNIS", false).setDebugId(1439));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_380_MENU_TBL:AIR_380_MENU_IN_ENTERPRISE", "N", true).setDebugId(1440));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### 380_SQL ###", "S_DB_API:SQL").setDebugId(1441));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### 380_Table ###", "S_DB_API:Table").setDebugId(1442));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition2", "AIR_MENU_MASTER:IVRFLOW", com.avaya.sce.runtime.Expression.STRING_EQUAL, "55135", false).setDebugId(1443)).evaluate(mySession)) {
			actions = new java.util.ArrayList(12);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_55135_MENU_TBL:AIR_55135_MENU_CELL_NUM", "S_USERDATA:ANI", false).setDebugId(1444));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_55135_MENU_TBL:AIR_55135_MENU_Node_ID", "properties:Channel", false).setDebugId(1445));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_55135_MENU_TBL:AIR_55135_MENU_CHANNEL", "cticallinfo:stationextension", false).setDebugId(1446));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_55135_MENU_TBL:AIR_55135_MENU_Node_ID", "^", true).setDebugId(1447));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_55135_MENU_TBL:AIR_55135_MENU_Node_ID", "AIR_55135_MENU_TBL:AIR_55135_MENU_CHANNEL", false).setDebugId(1448));
			actions.add(new com.avaya.sce.runtime.varoperations.Add("AIR_55135_MENU_TBL:AIR_55135_MENU_INDX", "AIR_55135_MENU_TBL:AIR_55135_MENU_INDX", false, "1", true).setDebugId(1449));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_55135_MENU_TBL:AIR_55135_MENU_DATE", "date:audio", false).setDebugId(1450));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### 55135_Menu_Date ###", "AIR_55135_MENU_TBL:AIR_55135_MENU_DATE").setDebugId(1451));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_55135_MENU_TBL:AIR_55135_MENU_STARTTIME", "insert_StartTime", false).setDebugId(1452));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_55135_MENU_TBL:AIR_55135_MENU_ENDTIME", "time:audio", false).setDebugId(1453));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_55135_MENU_TBL:AIR_55135_MENU_IN_VDN", "S_USERDATA:DNIS", false).setDebugId(1454));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_55135_MENU_TBL:AIR_55135_MENU_IN_ENTERPRISE", "N", true).setDebugId(1455));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition3", "AIR_MENU_MASTER:IVRFLOW", com.avaya.sce.runtime.Expression.STRING_EQUAL, "591933", false).setDebugId(1456)).evaluate(mySession)) {
			actions = new java.util.ArrayList(12);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591933_MENU_TBL:AIR_591933_MENU_CELL_NUM", "S_USERDATA:ANI", false).setDebugId(1457));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591933_MENU_TBL:AIR_591933_MENU_Node_ID", "properties:Channel", false).setDebugId(1458));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591933_MENU_TBL:AIR_591933_MENU_CHANNEL", "cticallinfo:stationextension", false).setDebugId(1459));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_591933_MENU_TBL:AIR_591933_MENU_Node_ID", "^", true).setDebugId(1460));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_591933_MENU_TBL:AIR_591933_MENU_Node_ID", "AIR_591933_MENU_TBL:AIR_591933_MENU_CHANNEL", false).setDebugId(1461));
			actions.add(new com.avaya.sce.runtime.varoperations.Add("AIR_591933_MENU_TBL:AIR_591933_MENU_INDX", "AIR_591933_MENU_TBL:AIR_591933_MENU_INDX", false, "1", true).setDebugId(1462));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591933_MENU_TBL:AIR_591933_MENU_DATE", "date:audio", false).setDebugId(1463));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### 591933_Menu_Date ###", "AIR_591933_MENU_TBL:AIR_591933_MENU_DATE").setDebugId(1464));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591933_MENU_TBL:AIR_591933_MENU_STARTTIME", "insert_StartTime", false).setDebugId(1465));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591933_MENU_TBL:AIR_591933_MENU_ENDTIME", "time:audio", false).setDebugId(1466));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591933_MENU_TBL:AIR_591933_MENU_IN_VDN", "S_USERDATA:DNIS", false).setDebugId(1467));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591933_MENU_TBL:AIR_591933_MENU_IN_ENTERPRISE", "N", true).setDebugId(1468));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition4", "AIR_MENU_MASTER:IVRFLOW", com.avaya.sce.runtime.Expression.STRING_EQUAL, "591939", false).setDebugId(1469)).evaluate(mySession)) {
			actions = new java.util.ArrayList(12);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591939_MENU_TBL:AIR_591939_MENU_CELL_NUM", "S_USERDATA:ANI", false).setDebugId(1470));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591939_MENU_TBL:AIR_591939_MENU_Node_ID", "properties:Channel", false).setDebugId(1471));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591939_MENU_TBL:AIR_591939_MENU_CHANNEL", "cticallinfo:stationextension", false).setDebugId(1472));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_591939_MENU_TBL:AIR_591939_MENU_Node_ID", "^", true).setDebugId(1473));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_591939_MENU_TBL:AIR_591939_MENU_Node_ID", "AIR_591939_MENU_TBL:AIR_591939_MENU_CHANNEL", false).setDebugId(1474));
			actions.add(new com.avaya.sce.runtime.varoperations.Add("AIR_591939_MENU_TBL:AIR_591939_MENU_INDX", "AIR_591939_MENU_TBL:AIR_591939_MENU_INDX", false, "1", true).setDebugId(1475));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591939_MENU_TBL:AIR_591939_MENU_DATE", "date:audio", false).setDebugId(1476));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "", "AIR_591939_MENU_TBL:AIR_591939_MENU_DATE").setDebugId(1477));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591939_MENU_TBL:AIR_591939_MENU_STARTTIME", "insert_StartTime", false).setDebugId(1478));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591939_MENU_TBL:AIR_591939_MENU_ENDTIME", "time:audio", false).setDebugId(1479));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591939_MENU_TBL:AIR_591939_MENU_IN_VDN", "S_USERDATA:DNIS", false).setDebugId(1480));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591939_MENU_TBL:AIR_591939_MENU_IN_ENTERPRISE", "N", true).setDebugId(1481));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition5", "AIR_MENU_MASTER:IVRFLOW", com.avaya.sce.runtime.Expression.STRING_EQUAL, "591980", false).setDebugId(1482)).evaluate(mySession)) {
			actions = new java.util.ArrayList(12);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591980_MENU_TBL:AIR_591980_MENU_CELL_NUM", "S_USERDATA:ANI", false).setDebugId(1483));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591980_MENU_TBL:AIR_591980_MENU_Node_ID", "properties:Channel", false).setDebugId(1484));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591980_MENU_TBL:AIR_591980_MENU_CHANNEL", "cticallinfo:stationextension", false).setDebugId(1485));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_591980_MENU_TBL:AIR_591980_MENU_Node_ID", "^", true).setDebugId(1486));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_591980_MENU_TBL:AIR_591980_MENU_Node_ID", "AIR_591980_MENU_TBL:AIR_591980_MENU_CHANNEL", false).setDebugId(1487));
			actions.add(new com.avaya.sce.runtime.varoperations.Add("AIR_591980_MENU_TBL:AIR_591980_MENU_INDX", "AIR_591980_MENU_TBL:AIR_591980_MENU_INDX", false, "1", true).setDebugId(1488));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591980_MENU_TBL:AIR_591980_MENU_DATE", "date:audio", false).setDebugId(1489));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### 591980_Menu_Date ###", "AIR_591980_MENU_TBL:AIR_591980_MENU_DATE").setDebugId(1490));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591980_MENU_TBL:AIR_591980_MENU_STARTTIME", "insert_StartTime", false).setDebugId(1491));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591980_MENU_TBL:AIR_591980_MENU_ENDTIME", "time:audio", false).setDebugId(1492));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591980_MENU_TBL:AIR_591980_MENU_IN_VDN", "S_USERDATA:DNIS", false).setDebugId(1493));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591980_MENU_TBL:AIR_591980_MENU_IN_ENTERPRISE", "N", true).setDebugId(1494));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition6", "AIR_MENU_MASTER:IVRFLOW", com.avaya.sce.runtime.Expression.STRING_EQUAL, "591993", false).setDebugId(1495)).evaluate(mySession)) {
			actions = new java.util.ArrayList(12);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591993_MENU_TBL:AIR_591993_MENU_CELL_NUM", "S_USERDATA:ANI", false).setDebugId(1496));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591993_MENU_TBL:AIR_591993_MENU_Node_ID", "properties:Channel", false).setDebugId(1497));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591993_MENU_TBL:AIR_591993_MENU_CHANNEL", "cticallinfo:stationextension", false).setDebugId(1498));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_591993_MENU_TBL:AIR_591993_MENU_Node_ID", "^", true).setDebugId(1499));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_591993_MENU_TBL:AIR_591993_MENU_Node_ID", "AIR_591993_MENU_TBL:AIR_591993_MENU_CHANNEL", false).setDebugId(1500));
			actions.add(new com.avaya.sce.runtime.varoperations.Add("AIR_591993_MENU_TBL:AIR_591993_MENU_INDX", "AIR_591993_MENU_TBL:AIR_591993_MENU_INDX", false, "1", true).setDebugId(1501));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591993_MENU_TBL:AIR_591993_MENU_DATE", "date:audio", false).setDebugId(1502));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### 591933_Menu_Date ###", "AIR_591980_MENU_TBL:AIR_591980_MENU_DATE").setDebugId(1503));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591993_MENU_TBL:AIR_591993_MENU_STARTTIME", "insert_StartTime", false).setDebugId(1504));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591993_MENU_TBL:AIR_591993_MENU_ENDTIME", "time:audio", false).setDebugId(1505));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591993_MENU_TBL:AIR_591993_MENU_IN_VDN", "S_USERDATA:DNIS", false).setDebugId(1506));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591993_MENU_TBL:AIR_591993_MENU_IN_ENTERPRISE", "N", true).setDebugId(1507));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition7", "AIR_MENU_MASTER:IVRFLOW", com.avaya.sce.runtime.Expression.STRING_EQUAL, "591999", false).setDebugId(1508)).evaluate(mySession)) {
			actions = new java.util.ArrayList(12);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591999_MENU_TBL:AIR_591999_MENU_CELL_NUM", "S_USERDATA:ANI", false).setDebugId(1509));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591999_MENU_TBL:AIR_591999_MENU_Node_ID", "properties:Channel", false).setDebugId(1510));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591999_MENU_TBL:AIR_591999_MENU_CHANNEL", "cticallinfo:stationextension", false).setDebugId(1511));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_591999_MENU_TBL:AIR_591999_MENU_Node_ID", "^", true).setDebugId(1512));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_591999_MENU_TBL:AIR_591999_MENU_Node_ID", "AIR_591999_MENU_TBL:AIR_591999_MENU_CHANNEL", false).setDebugId(1513));
			actions.add(new com.avaya.sce.runtime.varoperations.Add("AIR_591999_MENU_TBL:AIR_591999_MENU_INDX", "AIR_591999_MENU_TBL:AIR_591999_MENU_INDX", false, "1", true).setDebugId(1514));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591999_MENU_TBL:AIR_591999_MENU_DATE", "date:audio", false).setDebugId(1515));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### 591999_Menu_Date ###", "AIR_591999_MENU_TBL:AIR_591999_MENU_DATE").setDebugId(1516));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591999_MENU_TBL:AIR_591999_MENU_STARTTIME", "insert_StartTime", false).setDebugId(1517));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591999_MENU_TBL:AIR_591999_MENU_ENDTIME", "time:audio", false).setDebugId(1518));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591999_MENU_TBL:AIR_591999_MENU_IN_VDN", "S_USERDATA:DNIS", false).setDebugId(1519));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591999_MENU_TBL:AIR_591999_MENU_IN_ENTERPRISE", "N", true).setDebugId(1520));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition8", "AIR_MENU_MASTER:IVRFLOW", com.avaya.sce.runtime.Expression.STRING_EQUAL, "591919", false).setDebugId(1521)).evaluate(mySession)) {
			actions = new java.util.ArrayList(12);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591919_MENU_TBL:AIR_591919_MENU_CELL_NUM", "S_USERDATA:ANI", false).setDebugId(1522));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591919_MENU_TBL:AIR_591919_MENU_Node_ID", "properties:Channel", false).setDebugId(1523));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591919_MENU_TBL:AIR_591919_MENU_CHANNEL", "cticallinfo:stationextension", false).setDebugId(1524));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_591919_MENU_TBL:AIR_591919_MENU_Node_ID", "^", true).setDebugId(1525));
			actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("AIR_591919_MENU_TBL:AIR_591919_MENU_Node_ID", "AIR_591919_MENU_TBL:AIR_591919_MENU_CHANNEL", false).setDebugId(1526));
			actions.add(new com.avaya.sce.runtime.varoperations.Add("AIR_591919_MENU_TBL:AIR_591919_MENU_INDX", "AIR_591919_MENU_TBL:AIR_591919_MENU_INDX", false, "1", true).setDebugId(1527));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591919_MENU_TBL:AIR_591919_MENU_DATE", "date:audio", false).setDebugId(1528));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### 591919_Menu_Date ###", "AIR_591919_MENU_TBL:AIR_591919_MENU_DATE").setDebugId(1529));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591919_MENU_TBL:AIR_591919_MENU_STARTTIME", "insert_StartTime", false).setDebugId(1530));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591919_MENU_TBL:AIR_591919_MENU_ENDTIME", "time:audio", false).setDebugId(1531));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591919_MENU_TBL:AIR_591919_MENU_IN_VDN", "S_USERDATA:DNIS", false).setDebugId(1532));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_591919_MENU_TBL:AIR_591919_MENU_IN_ENTERPRISE", "N", true).setDebugId(1533));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else {
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.Next("End", "Default").setDebugId(1535));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		}


		// return false if the evaluation of actions did not cause a servlet forward or redirect
		return false;
	}
}
