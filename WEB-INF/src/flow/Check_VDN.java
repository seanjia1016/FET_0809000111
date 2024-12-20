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
 * Last generated by Orchestration Designer at: 2017年6月27日 下午01時55分09秒
 */
public class Check_VDN extends com.avaya.sce.runtime.Data {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年6月27日 下午01時55分09秒
	 */
	public Check_VDN() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the Next item which will forward application execution
	 * to the next form in the call flow.
	 * Last generated by Orchestration Designer at: 2024年11月6日 下午04時05分46秒
	 */
	public com.avaya.sce.runtime.Next getNext(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Next next = null;
		return next;
	}
	/**
	 * Create a list of local variables used by items in the data node.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2024年11月6日 下午04時05分46秒
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
	 * Last generated by Orchestration Designer at: 2024年11月6日 下午04時05分46秒
	 */
	public boolean executeDataActions(com.avaya.sce.runtimecommon.SCESession mySession) throws Exception {
		java.util.Collection actions = null;

		actions = new java.util.ArrayList(2);
		com.avaya.sce.runtime.BooleanOperation bo1 = new com.avaya.sce.runtime.BooleanOperation(com.avaya.sce.runtime.BooleanOperation.OR);
		com.avaya.sce.runtime.Expression be1 = new com.avaya.sce.runtime.Expression("expression1", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "80437039380", false);
		bo1.addExpression(be1);
		com.avaya.sce.runtime.Expression be2 = new com.avaya.sce.runtime.Expression("expression2", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "2149380", false);
		bo1.addExpression(be2);
		com.avaya.sce.runtime.Expression be3 = new com.avaya.sce.runtime.Expression("expression3", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "49380", false);
		bo1.addExpression(be3);
		com.avaya.sce.runtime.Expression be4 = new com.avaya.sce.runtime.Expression("expression4", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "2011137", false);
		bo1.addExpression(be4);
		com.avaya.sce.runtime.Expression be5 = new com.avaya.sce.runtime.Expression("expression5", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "21137", false);
		bo1.addExpression(be5);
		com.avaya.sce.runtime.BooleanOperation bo2 = new com.avaya.sce.runtime.BooleanOperation(com.avaya.sce.runtime.BooleanOperation.OR);
		com.avaya.sce.runtime.Expression be6 = new com.avaya.sce.runtime.Expression("expression6", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "80437039913", false);
		bo2.addExpression(be6);
		com.avaya.sce.runtime.Expression be7 = new com.avaya.sce.runtime.Expression("expression7", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "437039913", false);
		bo2.addExpression(be7);
		com.avaya.sce.runtime.Expression be8 = new com.avaya.sce.runtime.Expression("expression8", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "2149913", false);
		bo2.addExpression(be8);
		com.avaya.sce.runtime.Expression be9 = new com.avaya.sce.runtime.Expression("expression9", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "49913", false);
		bo2.addExpression(be9);
		com.avaya.sce.runtime.Expression be10 = new com.avaya.sce.runtime.Expression("expression10", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "2011136", false);
		bo2.addExpression(be10);
		com.avaya.sce.runtime.Expression be11 = new com.avaya.sce.runtime.Expression("expression11", "S_USERDATA:DNIS", com.avaya.sce.runtime.Expression.INT_EQUAL, "21136", false);
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
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_INFO, "### UserData_DNIS", "S_USERDATA:DNIS").setDebugId(840));
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition").setDebugId(1161)).evaluate(mySession, bo1)) {
			actions = new java.util.ArrayList(16);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("properties:FlowName", "FlowName:DonationToChildWelfareLeague", false).setDebugId(453));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:chargeCode", "3GOC11163", true).setDebugId(552));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:chargeOrigin", "3GOC11163", true).setDebugId(553));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:value_2", "3GOC11163", true).setDebugId(554));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:description", "IVR380捐款", true).setDebugId(555));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("insert_tableName", "air_380_menu_tbl", true).setDebugId(575));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("IVR_DONATE_TRAN:DONATE_CD", "380kid", true).setDebugId(696));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_MASTER:IVRFLOW", "380", true).setDebugId(702));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_DETAIL:IVRFLOW", "380", true).setDebugId(723));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("IVR_OPERATION_CTRL_INPUT:OPERATION_CTRL_TYPE", "IVR_380_Donate", true).setDebugId(836));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU:MENU_ID", "380", true).setDebugId(844));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_MASTER:IN_VDN", "cticallinfo:dnis", false).setDebugId(1157));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("S_OD:DetailTemp", "380", true).setDebugId(1423));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("S_USERDATA:FlowName", "380", true).setDebugId(1565));
			actions.add(new com.avaya.sce.runtime.Next("DonationToChildWelfareLeague", "ChildWelfareLeague").setDebugId(417));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition").setDebugId(1162)).evaluate(mySession, bo2)) {
			actions = new java.util.ArrayList(16);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("properties:FlowName", "FlowName:DonationToRedCrossByPhone", false).setDebugId(452));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:chargeCode", "3GOC11116", true).setDebugId(547));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:chargeOrigin", "3GOC11116", true).setDebugId(548));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:value_2", "3GOC11116", true).setDebugId(549));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:description", "IVR55135捐款", true).setDebugId(550));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("insert_tableName", "air_55135_menu_tbl", true).setDebugId(574));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("IVR_DONATE_TRAN:DONATE_CD", "", true).setDebugId(697));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_MASTER:IVRFLOW", "55135", true).setDebugId(701));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_DETAIL:IVRFLOW", "55135", true).setDebugId(842));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("IVR_OPERATION_CTRL_INPUT:OPERATION_CTRL_TYPE", "IVR55135", true).setDebugId(835));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU:MENU_ID", "55135", true).setDebugId(843));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_MASTER:IN_VDN", "cticallinfo:dnis", false).setDebugId(1151));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("S_OD:DetailTemp", "55135", true).setDebugId(1422));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("S_USERDATA:FlowName", "55135", true).setDebugId(1564));
			actions.add(new com.avaya.sce.runtime.Next("DonationToRedCross", "RedCross").setDebugId(415));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition").setDebugId(1163)).evaluate(mySession, bo3)) {
			actions = new java.util.ArrayList(16);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("properties:FlowName", "FlowName:FarEastOneSmallAmount", false).setDebugId(454));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:chargeCode", "3GOC11164", true).setDebugId(564));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:chargeOrigin", "3GOC11164", true).setDebugId(565));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:value_2", "3GOC11164", true).setDebugId(566));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:description", "IVR591933捐款", true).setDebugId(567));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("insert_tableName", "air_591933_menu_tbl", true).setDebugId(578));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("IVR_DONATE_TRAN:DONATE_CD", "5919", true).setDebugId(700));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_MASTER:IVRFLOW", "591933", true).setDebugId(705));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_DETAIL:IVRFLOW", "591933", true).setDebugId(727));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("IVR_OPERATION_CTRL_INPUT:OPERATION_CTRL_TYPE", "IVR591933", true).setDebugId(839));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU:MENU_ID", "591933", true).setDebugId(847));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_MASTER:IN_VDN", "cticallinfo:dnis", false).setDebugId(1160));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("S_OD:DetailTemp", "591933", true).setDebugId(1421));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("S_USERDATA:FlowName", "591933", true).setDebugId(1563));
			actions.add(new com.avaya.sce.runtime.Next("FarEastOneSmallAmount", "FarEastOne").setDebugId(423));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition").setDebugId(1164)).evaluate(mySession, bo4)) {
			actions = new java.util.ArrayList(16);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("properties:FlowName", "FlowName:DonationToPaperWindmillTroupe", false).setDebugId(455));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:chargeCode", "3GOC11165", true).setDebugId(556));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:chargeOrigin", "3GOC11165", true).setDebugId(557));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:value_2", "3GOC11165", true).setDebugId(558));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:description", "IVR591939捐款", true).setDebugId(559));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("insert_tableName", "air_591939_menu_tbl", true).setDebugId(576));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("IVR_DONATE_TRAN:DONATE_CD", "591939", true).setDebugId(698));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_MASTER:IVRFLOW", "591939", true).setDebugId(703));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_DETAIL:IVRFLOW", "591939", true).setDebugId(725));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("IVR_OPERATION_CTRL_INPUT:OPERATION_CTRL_TYPE", "IVR591939", true).setDebugId(837));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU:MENU_ID", "591939", true).setDebugId(845));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_MASTER:IN_VDN", "cticallinfo:dnis", false).setDebugId(1158));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("S_OD:DetailTemp", "591939", true).setDebugId(1420));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("S_USERDATA:FlowName", "591939", true).setDebugId(1562));
			actions.add(new com.avaya.sce.runtime.Next("DonationToPaperWindmillTroupe", "PaperWindmillTroupe").setDebugId(419));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition").setDebugId(1165)).evaluate(mySession, bo5)) {
			actions = new java.util.ArrayList(16);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("properties:FlowName", "FlowName:DonationToTeacherChang", false).setDebugId(456));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:chargeCode", "3GOC11221", true).setDebugId(560));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:chargeOrigin", "3GOC11221", true).setDebugId(561));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:value_2", "3GOC11221", true).setDebugId(562));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:description", "IVR591980捐款", true).setDebugId(563));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("insert_tableName", "air_591980_menu_tbl", true).setDebugId(577));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("IVR_DONATE_TRAN:DONATE_CD", "591980", true).setDebugId(699));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_MASTER:IVRFLOW", "591980", true).setDebugId(704));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_DETAIL:IVRFLOW", "591980", true).setDebugId(726));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("IVR_OPERATION_CTRL_INPUT:OPERATION_CTRL_TYPE", "IVR591980", true).setDebugId(838));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU:MENU_ID", "591980", true).setDebugId(846));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_MASTER:IN_VDN", "cticallinfo:dnis", false).setDebugId(1159));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("S_OD:DetailTemp", "591980", true).setDebugId(1419));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("S_USERDATA:FlowName", "591980", true).setDebugId(1561));
			actions.add(new com.avaya.sce.runtime.Next("DonationToTeacherChang", "TeacherChang").setDebugId(421));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition").setDebugId(1248)).evaluate(mySession, bo6)) {
			actions = new java.util.ArrayList(17);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("properties:FlowName", "FlowName:DonationToHomeSupport", false).setDebugId(1255));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:chargeCode", "OC11408", true).setDebugId(1256));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:chargeOrigin", "OC11408", true).setDebugId(1257));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:value_2", "OC11408", true).setDebugId(1258));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:description", "IVR591993捐款", true).setDebugId(1259));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("insert_tableName", "air_591993_menu_tbl", true).setDebugId(1260));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("IVR_5919_DONATE_TRAN:DONATE_CD", "591993", true).setDebugId(1261));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_MASTER:IVRFLOW", "591993", true).setDebugId(1262));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_DETAIL:IVRFLOW", "591993", true).setDebugId(1263));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("IVR_OPERATION_CTRL_INPUT:OPERATION_CTRL_TYPE", "IVR591993", true).setDebugId(1264));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU:MENU_ID", "591993", true).setDebugId(1265));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_MASTER:IN_VDN", "cticallinfo:dnis", false).setDebugId(1266));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("S_OD:DetailTemp", "591993", true).setDebugId(1418));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("S_USERDATA:FlowName", "591993", true).setDebugId(1560));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("IVR_DONATE_TRAN:DONATE_CD", "591993", true).setDebugId(1577));
			actions.add(new com.avaya.sce.runtime.Next("DonationToHomeSupport", "HomeSupport").setDebugId(1280));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition").setDebugId(1320)).evaluate(mySession, bo7)) {
			actions = new java.util.ArrayList(17);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("properties:FlowName", "FlowName:Jointfundraising", false).setDebugId(1326));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:chargeCode", "OC11220_99", true).setDebugId(1327));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:chargeOrigin", "OC11220_99", true).setDebugId(1328));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:value_2", "OC11220_99", true).setDebugId(1329));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:description", "591999_聯合勸募捐款活動", true).setDebugId(1330));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("insert_tableName", "AIR_591999_MENU_TBL", true).setDebugId(1331));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("IVR_5919_DONATE_TRAN:DONATE_CD", "591999", true).setDebugId(1332));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_MASTER:IVRFLOW", "591999", true).setDebugId(1333));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_DETAIL:IVRFLOW", "591999", true).setDebugId(1334));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("IVR_OPERATION_CTRL_INPUT:OPERATION_CTRL_TYPE", "IVR591999", true).setDebugId(1335));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU:MENU_ID", "591999", true).setDebugId(1336));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_MASTER:IN_VDN", "cticallinfo:dnis", false).setDebugId(1337));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("S_OD:DetailTemp", "591999", true).setDebugId(1417));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("S_USERDATA:FlowName", "591999", true).setDebugId(1559));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("IVR_DONATE_TRAN:DONATE_CD", "591999", true).setDebugId(1576));
			actions.add(new com.avaya.sce.runtime.Next("Jointfundraising", "Jointfundraising").setDebugId(1338));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition").setDebugId(1339)).evaluate(mySession, bo8)) {
			actions = new java.util.ArrayList(17);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("properties:FlowName", "FlowName:DonationToHomeSupport", false).setDebugId(1342));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:chargeCode", "OC11220_19", true).setDebugId(1343));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:chargeOrigin", "OC11220_19", true).setDebugId(1344));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:value_2", "OC11220_19", true).setDebugId(1345));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("createCharge_Input:description", "IVR591919捐款", true).setDebugId(1346));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("insert_tableName", "air_591919_menu_tbl", true).setDebugId(1347));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("IVR_5919_DONATE_TRAN:DONATE_CD", "591919", true).setDebugId(1348));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_MASTER:IVRFLOW", "591919", true).setDebugId(1349));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_DETAIL:IVRFLOW", "591919", true).setDebugId(1350));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("S_OD:DetailTemp", "591919", true).setDebugId(1416));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("IVR_OPERATION_CTRL_INPUT:OPERATION_CTRL_TYPE", "IVR591919", true).setDebugId(1351));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU:MENU_ID", "591919", true).setDebugId(1352));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("AIR_MENU_MASTER:IN_VDN", "cticallinfo:dnis", false).setDebugId(1353));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("S_USERDATA:FlowName", "591919", true).setDebugId(1558));
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("IVR_DONATE_TRAN:DONATE_CD", "591919", true).setDebugId(1575));
			actions.add(new com.avaya.sce.runtime.Next("DonationToChineseChristianReliefAssociation", "DonationToChineseChristianReliefAssociation").setDebugId(1354));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else {
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.Next("null", "Default").setDebugId(425));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		}


		// return false if the evaluation of actions did not cause a servlet forward or redirect
		return false;
	}
}
