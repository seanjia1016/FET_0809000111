package flow.subflow.select_IVR_DONATE_TRAN;

import com.avaya.sce.runtimecommon.IComplexVariable;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.IVariable;
import com.avaya.sce.runtimecommon.IVariableField;

import flow.IProjectVariables;

/**
 * A basic servlet which allows a user to define their code, generate
 * any output, and to select where to transition to next.
 * Last generated by Orchestration Designer at: 2017年8月16日 下午01時58分55秒
 */
public class Assign_select_IVR_DONATE_TRAN extends com.avaya.sce.runtime.BasicServlet {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年8月16日 下午01時58分55秒
	 */
	public Assign_select_IVR_DONATE_TRAN() {
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
	 * Last generated by Orchestration Designer at: 2017年8月16日 下午01時58分55秒
	 */
	public void servletImplementation(com.avaya.sce.runtimecommon.SCESession mySession) {

		
		IVariable TIDVarible = mySession.getVariable(IProjectVariables.S__TID);
		IComplexVariable complexTID = TIDVarible.getComplexVariable();
		
		IVariableField TIDfield = complexTID.getField(IProjectVariables.S__TID_FIELD_TID);
		String TID = TIDfield.getStringValue();
		
		String select_IVR_DONATE_TRAN = "Select IVR_DONATE_TRAN";

		IVariable S__UserDataVarible = mySession.getVariable(IProjectVariables.S__USERDATA);
		IComplexVariable complexVarible = S__UserDataVarible.getComplexVariable();
		
		IVariableField ani_field = complexVarible.getField(IProjectVariables.S__USERDATA_FIELD_ANI);
		String ani = ani_field.getStringValue();
		
		
		IVariable ivrOperationCtrlVarible = mySession.getVariable(IProjectVariables.IVR__OPERATION__CTRL);
		IComplexVariable ivrOperatioComplexVarible = ivrOperationCtrlVarible.getComplexVariable();
		
		IVariableField startDate_field = ivrOperatioComplexVarible.getField(IProjectVariables.IVR__OPERATION__CTRL_FIELD_CTRL__START__DATE);
		String startDate = startDate_field.getStringValue();
		
		startDate = startDate.substring(0, 8);

		IVariableField finishDate_field = ivrOperatioComplexVarible.getField(IProjectVariables.IVR__OPERATION__CTRL_FIELD_CTRL__FINISH__DATE);
		String finishDate = finishDate_field.getStringValue();
		
		finishDate = finishDate.substring(0, 8);
		
		String SQL = "SELECT COUNT(msisdn)count_Donation FROM IVR_DONATE_TRAN WHERE msisdn ='" + ani + "' AND donate_cd='380kid' AND TO_DATE(SUBSTR(donate_date,1,8),'yyyy/mm/dd') BETWEEN TO_DATE('" + startDate + "','yyyy/mm/dd') AND TO_DATE('" + finishDate + "','yyyy/mm/dd')";
		
		String Table = "IVR_DONATE_TRAN";
		
		
		IVariableField SQL_varible = mySession.getVariableField(
						IProjectVariables.S__DB__API,
						IProjectVariables.S__DB__API_FIELD_SQL);
		SQL_varible.setValue(SQL);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "selsect_Donate_tran SQL Response(TID:["+TID+"]"+select_IVR_DONATE_TRAN+"):" +SQL);
		
		
		IVariableField Table_varible = mySession.getVariableField(
						IProjectVariables.S__DB__API,
						IProjectVariables.S__DB__API_FIELD_TABLE);
		Table_varible.setValue(Table);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "selsect_Donate_tran Table Response(TID:["+TID+"]"+select_IVR_DONATE_TRAN+"):" +Table);
		

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
	 * Last generated by Orchestration Designer at: 2024年11月22日 下午06時51分01秒
	 */
	public java.util.Collection getBranches(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Goto aGoto = null;
		list = new java.util.ArrayList(1);

		aGoto = new com.avaya.sce.runtime.Goto("select_IVR_DONATE_TRAN-CF_selectDBAPI", 0, true, "Default");
		list.add(aGoto);

		return list;
	}
}
