package flow.subflow.Insert_FE_API_LOG_TBL;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import com.avaya.sce.runtimecommon.IComplexVariable;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.IVariable;
import com.avaya.sce.runtimecommon.IVariableField;

import flow.IProjectVariables;

/**
 * A basic servlet which allows a user to define their code, generate
 * any output, and to select where to transition to next.
 * Last generated by Orchestration Designer at: 2017年9月5日 上午11時30分14秒
 */
public class Set_FE_API_LOG_TBL extends com.avaya.sce.runtime.BasicServlet {

	private static SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss", Locale.CHINESE); 

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年9月5日 上午11時30分14秒
	 */
	public Set_FE_API_LOG_TBL() {
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
	 * Last generated by Orchestration Designer at: 2017年9月5日 上午11時30分14秒
	 */
	
	public void servletImplementation(com.avaya.sce.runtimecommon.SCESession mySession) {
		
        String APIlog = "APILog";
		
		IVariable TIDVarible = mySession.getVariable(IProjectVariables.S__TID);
		IComplexVariable complexTID = TIDVarible.getComplexVariable();
		
		IVariableField TIDfield = complexTID.getField(IProjectVariables.S__TID_FIELD_TID);
		String TID = TIDfield.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "API Log TID:" +TID);
		
		
		IVariable Varible_UserData = mySession.getVariable(IProjectVariables.S__USERDATA);
		IComplexVariable complex_UserData = Varible_UserData.getComplexVariable();
		
		IVariableField ANIfield = complex_UserData.getField(IProjectVariables.S__USERDATA_FIELD_ANI);
		String ANI = ANIfield.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "API Log ANI:" +ANI);
		
		IVariable SUBVarible = mySession.getVariable(IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT);
		IComplexVariable complexSUB = SUBVarible.getComplexVariable();
		
		
		IVariableField SUBfield = complexSUB.getField(IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_SUBSCRIBER_ID);
		String SUBSCRIBER = SUBfield.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "API Log SUBSCRIBER:" +SUBSCRIBER);
		
		
		IVariable BPIDVarible = mySession.getVariable(IProjectVariables.S__USERDATA);
		IComplexVariable complexBPID = BPIDVarible.getComplexVariable();
		
		
		IVariableField BPIDfield = complexBPID.getField(IProjectVariables.S__USERDATA_FIELD_BPID);
		String BPID = BPIDfield.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "API Log BPID:" +BPID);
		
		
		IVariable masterVarible = mySession.getVariable(IProjectVariables.AIR__MENU__MASTER);
		IComplexVariable complexMaster = masterVarible.getComplexVariable();
		
		
		IVariableField flowNamefield = complex_UserData.getField(IProjectVariables.S__USERDATA_FIELD_FLOW_NAME);
		String IVR = flowNamefield.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "API Log IVR:" +IVR);
		
		
		IVariable FE_LOGVarible = mySession.getVariable(IProjectVariables.FE__API__LOG__TBL);
		IComplexVariable complexFE_LOG = FE_LOGVarible.getComplexVariable();
		
		IVariableField APIfield = complexFE_LOG.getField(IProjectVariables.FE__API__LOG__TBL_FIELD_API);
		String API = APIfield.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "API Log API:" +API);
		
		IVariableField RT_Codefield = complexFE_LOG.getField(IProjectVariables.FE__API__LOG__TBL_FIELD_RETURNCODE);
		String RETURNCODE = RT_Codefield.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "API Log RETURNCODE:" +RETURNCODE);
		
		IVariableField RESERVED1field = complexFE_LOG.getField(IProjectVariables.FE__API__LOG__TBL_FIELD_RESERVED_1);
		String RESERVED1 = RESERVED1field.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "RESERVED1LEN:" +RESERVED1.length());
	
		IVariableField ORDERIDfield = complexFE_LOG.getField(IProjectVariables.FE__API__LOG__TBL_FIELD_ORDERID);
		String ORDERID = ORDERIDfield.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "API Log ORDERID:" +ORDERID);
		
		IVariableField STR_DATAfield = complexFE_LOG.getField(IProjectVariables.FE__API__LOG__TBL_FIELD_STR__DATA);
		String STR_DATA = STR_DATAfield.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "API Log STR_DATA:" +STR_DATA);
		
		IVariableField ORDERSTATEfield = complexFE_LOG.getField(IProjectVariables.FE__API__LOG__TBL_FIELD_ORDERSTATE);
		String ORDERSTATE= ORDERSTATEfield.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "API Log ORDERSTATE:" +ORDERSTATE);
		
		IVariableField STIMEfield = complexFE_LOG.getField(IProjectVariables.FE__API__LOG__TBL_FIELD_STIME);
		String STIME = STIMEfield.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "API Log STIME:" +STIME);
		
		Date day=Calendar.getInstance().getTime();
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss",Locale.CHINESE);
		String MENU_TIME=df.format(day);
		String sdate=MENU_TIME.substring(0, 8);
		String etime=MENU_TIME.substring(8, 14);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "API Log sdate:" +sdate);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "API Log etime:" +etime);
		
		Calendar API_Edate = Calendar.getInstance();
		API_Edate.add(Calendar.SECOND, 0);
//		String API_EDATETIME = sdf.format(API_Edate.getTime()).toString();
		
		//避免轉換錯誤
		long starttimelong = (STIME != null && !STIME.isEmpty()) ? Long.parseLong(STIME) : 0;
		
		long endtimelong = API_Edate.getTimeInMillis();
		
		long timelong=endtimelong-starttimelong;
		
		String SEC = String.valueOf(timelong / 1000);
		
	    
		String s = "'";
		
	    String SQL = " INSERT INTO FE_API_LOG_TBL (IVR,API,MSISDN,SUBSCRIBER,BPID,SDATE,ETIME,RETURNCODE,RESERVED1,ORDERID,STR_DATA,ORDERSTATE,SEC)   VALUES ("+s+IVR+s+","+s+API+s+","+s+ANI+s+","+s+SUBSCRIBER+s+","+s+BPID+s+","+s+sdate+s+","+s+etime+s+","+s+RETURNCODE+s+","+s+RESERVED1+s+","+s+ORDERID+s+","+s+STR_DATA+s+","+s+ORDERSTATE+s+","+s+SEC+s+")";
		
		String Table = "FE_API_LOG_TBL";
		
		
		IVariableField SQL_varible = mySession.getVariableField(
						IProjectVariables.S__DB__API,
						IProjectVariables.S__DB__API_FIELD_SQL);
		
		SQL_varible.setValue(SQL);
		
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "SQL Response(TID:["+TID+"]"+APIlog+"):" +SQL);
		
		
		IVariableField Table_varible = mySession.getVariableField(
						IProjectVariables.S__DB__API,
						IProjectVariables.S__DB__API_FIELD_TABLE);
		
		Table_varible.setValue(Table);
		
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "Table Response(TID:["+TID+"]"+APIlog+"):" +Table);

		
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
	 * Last generated by Orchestration Designer at: 2024年11月14日 下午01時33分02秒
	 */
	public java.util.Collection getBranches(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Goto aGoto = null;
		list = new java.util.ArrayList(1);

		aGoto = new com.avaya.sce.runtime.Goto("Insert_FE_API_LOG_TBL-CF_insetDBAPI", 0, true, "Default");
		list.add(aGoto);

		return list;
	}
	
	public static void main(String args[]){
		Date day=Calendar.getInstance().getTime();
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss",Locale.CHINESE);
		String MENU_TIME=df.format(day);
		
		System.out.println(MENU_TIME);
	}
}
