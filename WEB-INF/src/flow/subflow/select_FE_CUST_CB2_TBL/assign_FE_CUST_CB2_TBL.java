package flow.subflow.select_FE_CUST_CB2_TBL;

import com.avaya.sce.runtimecommon.IComplexVariable;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.IVariable;
import com.avaya.sce.runtimecommon.IVariableField;

import flow.IProjectVariables;

/**
 * A basic servlet which allows a user to define their code, generate
 * any output, and to select where to transition to next.
 * Last generated by Orchestration Designer at: 2017年5月25日 上午11時51分04秒
 */
public class assign_FE_CUST_CB2_TBL extends com.avaya.sce.runtime.BasicServlet {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年5月25日 上午11時51分04秒
	 */
	public assign_FE_CUST_CB2_TBL() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * This method allows for custom integration with other Java components.
	 * You may use Java for sophisticated logic or to integrate with custom
	 * connectors (i.e. JMS, custom web services, sockets, XML, JAXB, etc.)
	 *
	 * Any custom code added here should work as efficiently as possible to prevent delays.
	 * It's important to design your callflow so that the voice browser (Voice Portal/IR)
	 * is not waiting too long for a response as this can lead to a poor caller experience.
	 * Additionally, if the response to the client voice browser exceeds the configured
	 * timeout, the platform may throw an "error.badfetch". 
	 *
	 * Using this method, you have access to all session variables through the 
	 * SCESession object.
	 *
	 * The code generator will *** NOT *** overwrite this method in the future.
	 * Last generated by Orchestration Designer at: 2017年5月25日 上午11時51分04秒
	 */
	public void servletImplementation(com.avaya.sce.runtimecommon.SCESession mySession) {

		
		IVariable TIDVarible = mySession.getVariable(IProjectVariables.S__TID);
		IComplexVariable complexTID = TIDVarible.getComplexVariable();
			
		IVariableField TIDfield = complexTID.getField(IProjectVariables.S__TID_FIELD_TID);
		String TID = TIDfield.getStringValue();
		
		String Select_FE_CUST_CB2_TBL = "Select FE_CUST_CB2_TBL";

		IVariable FE_MSIS_CB2_TBLVarible = mySession.getVariable(IProjectVariables.FE__MSIS__CB_2__TBL);
		IComplexVariable complexVarible = FE_MSIS_CB2_TBLVarible.getComplexVariable();
		IVariableField anifield = complexVarible.getField(IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__CB__ACCOUNT__ID);
		String AccountID = anifield.getStringValue();
		
		
		String SQL="SELECT FE_CUST_DEMO_ID_TYPE, FE_CUST_SSN, FE_CUST_CUST_STATUS, FE_CUST_INVC_OUT_AMOUNT, FE_CUST_INVC_PAY_DUE_DAT, FE_CUST_LAST_BILLED, FE_CUST_PAY_AMOUNT, FE_CUST_PAY_MADE_DATE, FE_CUST_CURRENT_BALANCE, FE_CUST_INVOICE_CHECKSUM, fe_cust_BILL_NAME, FE_CUST_SOCIAL_NUM, FE_MKTG_MSG_ID, LPAD(FE_CUST_PAYMENT_RULE,2), TO_CHAR(FE_CUST_LAST_INVOICE), FE_CUST_CUSTOMER_TYPE FROM FE_CUST_CB2_TBL WHERE FE_ACCOUNT_CB_ID='"+AccountID+"'";
		
		String Table="FE_CUST_CB2_TBL";
		
		
		IVariableField SQL_varible = mySession
				.getVariableField(
						IProjectVariables.S__DB__API,
						IProjectVariables.S__DB__API_FIELD_SQL);
		SQL_varible.setValue(SQL);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "SQL Response(TID:["+TID+"]"+Select_FE_CUST_CB2_TBL+"):" +SQL);
		
		
		IVariableField Table_varible = mySession
				.getVariableField(
						IProjectVariables.S__DB__API,
						IProjectVariables.S__DB__API_FIELD_TABLE);
		Table_varible.setValue(Table);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "Table Response(TID:["+TID+"]"+Select_FE_CUST_CB2_TBL+"):" +Table);
		
		
		
		
		
		
	}
	/**
	 * Builds the list of branches that are defined for this servlet object.
	 * This list is built automatically by defining Goto nodes in the call flow editor.
	 * It is the programmer's responsibilty to provide at least one enabled Goto.<BR>
	 *
	 * The user should override updateBranches() to determine which Goto that the
	 * framework will activate.  If there is not at least one enabled Goto item, 
	 * the framework will throw a runtime exception.<BR>
	 *
	 * This method is generated automatically and changes to it may
	 * be overwritten next time code is generated.  To modify the list
	 * of branches for the flow item, override:
	 *     <code>updateBranches(Collection branches, SCESession mySession)</code>
	 *
	 * @return a Collection of <code>com.avaya.sce.runtime.Goto</code>
	 * objects that will be evaluated at runtime.  If there are no gotos
	 * defined in the Servlet node, then this returns null.
	 * Last generated by Orchestration Designer at: 2024年11月20日 下午04時42分47秒
	 */
	public java.util.Collection getBranches(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Goto aGoto = null;
		list = new java.util.ArrayList(1);

		aGoto = new com.avaya.sce.runtime.Goto("select_FE_CUST_CB2_TBL-CF_selectDBAPI", 0, true, "Default");
		list.add(aGoto);

		return list;
	}
}
