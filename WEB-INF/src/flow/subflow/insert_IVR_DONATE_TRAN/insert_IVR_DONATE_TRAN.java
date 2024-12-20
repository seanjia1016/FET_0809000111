package flow.subflow.insert_IVR_DONATE_TRAN;

import com.avaya.sce.runtimecommon.IComplexVariable;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.IVariable;
import com.avaya.sce.runtimecommon.IVariableField;

import flow.IProjectVariables;

/**
 * A basic servlet which allows a user to define their code, generate
 * any output, and to select where to transition to next.
 * Last generated by Orchestration Designer at: 2017年6月15日 下午07時33分56秒
 */
public class insert_IVR_DONATE_TRAN extends com.avaya.sce.runtime.BasicServlet {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年6月15日 下午07時33分56秒
	 */
	public insert_IVR_DONATE_TRAN() {
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
	 * Last generated by Orchestration Designer at: 2017年6月15日 下午07時33分56秒
	 */
	public void servletImplementation(com.avaya.sce.runtimecommon.SCESession mySession) {
		
		IVariable TIDVarible = mySession.getVariable(IProjectVariables.S__TID);
		IComplexVariable complexTID = TIDVarible.getComplexVariable();
		IVariableField TIDfield = complexTID.getField(IProjectVariables.S__TID_FIELD_TID);
		String TID = TIDfield.getStringValue();
		
		String insert_IVR_DONATE_TRAN = "";
		
		
		IVariable Varible = mySession.getVariable(IProjectVariables.IVR__DONATE__TRAN);
		IComplexVariable complexVarible = Varible.getComplexVariable();
		
		IVariableField ani_field = complexVarible.getField(IProjectVariables.IVR__DONATE__TRAN_FIELD_ANI);
		String ani = ani_field.getStringValue();
		
		IVariableField ApiReqDate_field = complexVarible.getField(IProjectVariables.IVR__DONATE__TRAN_FIELD_API__REQ__DATE);
		String ApiReqDate = ApiReqDate_field.getStringValue();
		
		IVariableField selectAmount_field = complexVarible.getField(IProjectVariables.IVR__DONATE__TRAN_FIELD_SELECT__AMOUNT);
		String selectAmount = selectAmount_field.getStringValue();

		IVariableField subType_field = complexVarible.getField(IProjectVariables.IVR__DONATE__TRAN_FIELD_SUB__TYPE);
		String subType = subType_field.getStringValue();
		
		IVariableField DONATE_CD_field = complexVarible.getField(IProjectVariables.IVR__DONATE__TRAN_FIELD_DONATE__CD);
		String DONATE_CD = DONATE_CD_field.getStringValue();
		
		IVariableField CYCLY_DATE_field = complexVarible.getField(IProjectVariables.IVR__DONATE__TRAN_FIELD_CYCLY__DATE);
		String CYCLY_DATE = CYCLY_DATE_field.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "CYCLY_DATE Response(TID:["+TID+"]"+insert_IVR_DONATE_TRAN+"):" +CYCLY_DATE);
		
		
		String SQL = "";
		String Table = "";
		
		if(DONATE_CD.equals("591939")){
			SQL = "INSERT INTO IVR_591939_DONATE_TRAN (DONATE_CD, MSISDN, DONATE_DATE, DONATE_AMT, CYCLY_DATE, BUSINESS_ENTITY, DONATE_TIME)" + 
					 "VALUES ('" + DONATE_CD + "', '"+ ani +"', '"+ApiReqDate+"', '" + selectAmount + "', '"+ CYCLY_DATE +"', '" + subType + "','')";
			
			Table = "IVR_591939_DONATE_TRAN";
			
			insert_IVR_DONATE_TRAN = "insert IVR_591939_DONATE_TRAN";
//		}else if(DONATE_CD.equals("591993")){
//			SQL = "INSERT INTO IVR_591993_DONATE_TRAN (DONATE_CD, MSISDN, DONATE_DATE, DONATE_AMT, CYCLY_DATE, BUSINESS_ENTITY, DONATE_TIME)" + 
//					 "VALUES ('" + DONATE_CD + "', '"+ ani +"', '"+ApiReqDate+"', '" + selectAmount + "', '"+ CYCLY_DATE +"', '" + subType + "','')";
//			
//			Table = "IVR_591993_DONATE_TRAN";
//			
//			insert_IVR_DONATE_TRAN = "insert IVR_591993_DONATE_TRAN";
//			
		}else{
			SQL = "INSERT INTO IVR_DONATE_TRAN (DONATE_CD, MSISDN, DONATE_DATE, DONATE_AMT, CYCLY_DATE, BUSINESS_ENTITY)" + 
					 "VALUES ('" + DONATE_CD + "', '"+ ani +"', '"+ApiReqDate+"', '" + selectAmount + "', '"+ CYCLY_DATE +"', '" + subType + "')";
			
			Table = "IVR_DONATE_TRAN";
			
			insert_IVR_DONATE_TRAN = "insert IVR_DONATE_TRAN";
		}	

		
		IVariableField SQL_varible = mySession.getVariableField(
						IProjectVariables.S__DB__API,
						IProjectVariables.S__DB__API_FIELD_SQL);
		SQL_varible.setValue(SQL);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "SQL Response(TID:["+TID+"]"+insert_IVR_DONATE_TRAN+"):" +SQL);
		
		
		IVariableField Table_varible = mySession.getVariableField(
						IProjectVariables.S__DB__API,
						IProjectVariables.S__DB__API_FIELD_TABLE);
		Table_varible.setValue(Table);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "Table Response(TID:["+TID+"]"+insert_IVR_DONATE_TRAN+"):" +Table);


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
<<<<<<< HEAD
	 * Last generated by Orchestration Designer at: 2024年11月22日 下午06時05分37秒
=======
	 * Last generated by Orchestration Designer at: 2024年11月22日 下午05時44分50秒
>>>>>>> 1ce24f429fccbcab12844b062c4f9e73875b8a9b
	 */
	public java.util.Collection getBranches(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Goto aGoto = null;
		list = new java.util.ArrayList(1);

		aGoto = new com.avaya.sce.runtime.Goto("insert_IVR_DONATE_TRAN-CF_insetDBAPI", 0, true, "Default");
		list.add(aGoto);

		return list;
	}
}
