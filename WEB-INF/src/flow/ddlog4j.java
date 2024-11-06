package flow;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;

import com.avaya.sce.runtimecommon.IComplexVariable;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.IVariable;
import com.avaya.sce.runtimecommon.IVariableField;

/**
 * A basic servlet which allows a user to define their code, generate
 * any output, and to select where to transition to next.
 * Last generated by Orchestration Designer at: 2017年8月23日 上午11時20分58秒
 */
public class ddlog4j extends com.avaya.sce.runtime.BasicServlet {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年8月23日 上午11時20分58秒
	 */
	public ddlog4j() {
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
	 * Last generated by Orchestration Designer at: 2017年8月23日 上午11時20分58秒
	 */
	public void servletImplementation(com.avaya.sce.runtimecommon.SCESession mySession) {


		IVariable variableRef_did = mySession.getVariable(IProjectVariables.DOMAINID); 
		  IComplexVariable complexVariable_did = variableRef_did.getComplexVariable(); 
		  IVariableField field_did = complexVariable_did.getField(IProjectVariables.DOMAINID_FIELD_ID); 
		  String DomainId = field_did.getStringValue(); 
		  DomainId = DomainId.trim(); 
		   
		  String extPropFileLocation = "/wls/AAEP_projects/AAEP"+DomainId+"/FETIVR/FET_Donation/"; 
		  String ddlog4j = extPropFileLocation + "ddlog4j.properties"; 

//			String extPropFileLocation = "C:/AAOD7.0.1/workspace/DonationActivitiesLog/";
//			String ddlog4j = extPropFileLocation + "ddlog4j.properties";
												
		  
		  InputStream is = null; 
		  try { 
		   is = new FileInputStream(new File(ddlog4j)); 
		   Properties log4jProps = new Properties();

		   log4jProps.load(is); 

		   PropertyConfigurator.configure(log4jProps); 

		  } catch (FileNotFoundException e) { 
		   System.out.println("FileNotFoundException: " + ddlog4j + " is not found"); 
		  } catch (IOException e) { 

		   e.printStackTrace(); 
		  } finally { 
		   try { 
		    is.close(); 
		   } catch (Exception e2) { 
		   } 
		  } 
		   
		  
		  Properties props = new Properties(); 
		   
		  File f = new File("/wls/AAEP_projects/AAEP"+DomainId+"/FETIVR/FET_Donation/config.properties"); 

//			File f = new File("C:/AAOD7.0.1/workspace/DonationActivitiesLog/config.properties");
			
		  try { 
		   props.load(new FileInputStream(f)); 
		  } catch (FileNotFoundException e) { 
		   e.printStackTrace(); 
		  } catch (IOException e) { 
		   e.printStackTrace(); 
		  } 
		   
		   
		  String test_mode = props.getProperty("test_mode"); 
		  IVariableField variable_test_mode = mySession .getVariableField( 
		      IProjectVariables.PROPERTIES, 
		      IProjectVariables.PROPERTIES_FIELD_TEST__MODE); 
		  variable_test_mode.setValue(test_mode); 	   
		  
		  String channel = props.getProperty("Channel"); 
		  IVariableField variable_channel = mySession .getVariableField( 
		      IProjectVariables.PROPERTIES, 
		      IProjectVariables.PROPERTIES_FIELD_CHANNEL); 
		  variable_channel.setValue(channel); 

		  String timeout = props.getProperty("timeout"); 
		  IVariableField variable_timeout = mySession.getVariableField( 
		    IProjectVariables.PROPERTIES, 
		    IProjectVariables.PROPERTIES_FIELD_TIMEOUT); 
		  variable_timeout.setValue(timeout); 

		  //DB API IP  
		  String DB_API_IP = props.getProperty("DB_API_IP"); 
		  IVariableField variable_PREPAID_IP = mySession.getVariableField( 
		    IProjectVariables.PROPERTIES, 
		    IProjectVariables.PROPERTIES_FIELD_DB__API__IP); 
		  variable_PREPAID_IP.setValue(DB_API_IP); 
		  
		  //MIDDLEWARE__IP 
		  String MIDDLEWARE__IP = props.getProperty("MIDDLEWARE__IP"); 
		  IVariableField variable_MIDDLEWARE__IP = mySession.getVariableField( 
		    IProjectVariables.PROPERTIES, 
		    IProjectVariables.PROPERTIES_FIELD_MIDDLEWARE____IP); 
		  variable_MIDDLEWARE__IP.setValue(MIDDLEWARE__IP); 
		   
		    String channelForCfg = props.getProperty("channelForCfg"); 
		    IVariableField variable_channelForCfg = mySession.getVariableField( 
		      IProjectVariables.PROPERTIES, 
		      IProjectVariables.PROPERTIES_FIELD_CHANNEL_FOR_CFG); 
		    variable_channelForCfg.setValue(channelForCfg); 

		    String password = props.getProperty("password"); 
		    IVariableField variable_password = mySession.getVariableField( 
		      IProjectVariables.PROPERTIES, 
		      IProjectVariables.PROPERTIES_FIELD_PASSWORD); 
		    variable_password.setValue(password); 
		     
		    String userID = props.getProperty("userID"); 
		    IVariableField variable_userID = mySession.getVariableField( 
		      IProjectVariables.PROPERTIES, 
		      IProjectVariables.PROPERTIES_FIELD_USER_ID); 
		    variable_userID.setValue(userID);     
		    
		    String transSubChannel = props.getProperty("transSubChannel"); 
		    IVariableField variable_transSubChannel = mySession.getVariableField( 
		      IProjectVariables.PROPERTIES, 
		      IProjectVariables.PROPERTIES_FIELD_TRANS_SUB_CHANNEL); 
		    variable_transSubChannel.setValue(transSubChannel);  
		    
		    String transUserId = props.getProperty("transUserId"); 
		    IVariableField variable_transUserId = mySession.getVariableField( 
		      IProjectVariables.PROPERTIES, 
		      IProjectVariables.PROPERTIES_FIELD_TRANS_USER_ID); 
		    variable_transUserId.setValue(transUserId);  
		    
		    
		    String transChannelId = props.getProperty("transChannelId"); 
		    IVariableField variable_transChannelId = mySession.getVariableField( 
		      IProjectVariables.PROPERTIES, 
		      IProjectVariables.PROPERTIES_FIELD_TRANS_CHANNEL_ID); 
		    variable_transChannelId.setValue(transChannelId);  
		    
		    
		    String transPath = props.getProperty("transPath"); 
		    IVariableField variable_transPath = mySession.getVariableField( 
		      IProjectVariables.PROPERTIES, 
		      IProjectVariables.PROPERTIES_FIELD_TRANS_PATH); 
		    variable_transPath.setValue(transPath);  
		    
		    
			  //JNDINAME 
		    String JNDINAME = props.getProperty("JNDINAME"); 
		    IVariableField variable_JNDINAME = mySession.getVariableField( 
		      IProjectVariables.S__DB__API, 
		      IProjectVariables.S__DB__API_FIELD_JNDINAME); 
			variable_JNDINAME.setValue(JNDINAME); 
			mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "JNDINAME Response:" +JNDINAME); 
			
//			String FloWName = props.getProperty("FloWName"); 
//			IVariableField variable_FloWName = mySession.getVariableField( 
//				IProjectVariables.PROPERTIES, 
//				IProjectVariables.PROPERTIES_FIELD_FLOW_NAME); 
//			variable_FloWName.setValue(FloWName); 
//			mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FloWName Response:" +FloWName); 
			
			String IdType = props.getProperty("IdType"); 
			IVariableField variable_IdType = mySession.getVariableField( 
					IProjectVariables.PROPERTIES, 
					IProjectVariables.PROPERTIES_FIELD_ID_TYPE); 
			variable_IdType.setValue(IdType); 
			mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "IdType Response:" +IdType);
			
			
			String DonationToRedCrossByPhone = props.getProperty("DonationToRedCrossByPhone"); 
			IVariableField variable_DonationToRedCrossByPhone = mySession.getVariableField( 
					IProjectVariables.FLOW_NAME, 
				IProjectVariables.FLOW_NAME_FIELD_DONATION_TO_RED_CROSS_BY_PHONE); 
			variable_DonationToRedCrossByPhone.setValue(DonationToRedCrossByPhone); 
			mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "DonationToRedCrossByPhone Response:" +DonationToRedCrossByPhone);
			
			
			String DonationToChildWelfareLeague = props.getProperty("DonationToChildWelfareLeague"); 
			IVariableField variable_DonationToChildWelfareLeague = mySession.getVariableField( 
					IProjectVariables.FLOW_NAME, 
					IProjectVariables.FLOW_NAME_FIELD_DONATION_TO_CHILD_WELFARE_LEAGUE); 
			variable_DonationToChildWelfareLeague.setValue(DonationToChildWelfareLeague); 
			mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "DonationToChildWelfareLeague Response:" +DonationToChildWelfareLeague);
			
			
			String DonationToPaperWindmillTroupe = props.getProperty("DonationToPaperWindmillTroupe"); 
			IVariableField variable_DonationToPaperWindmillTroupe = mySession.getVariableField( 
					IProjectVariables.FLOW_NAME, 
					IProjectVariables.FLOW_NAME_FIELD_DONATION_TO_PAPER_WINDMILL_TROUPE); 
			variable_DonationToPaperWindmillTroupe.setValue(DonationToPaperWindmillTroupe); 
			mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "DonationToPaperWindmillTroupe Response:" +DonationToPaperWindmillTroupe);
			
			
			String DonationToTeacherChang = props.getProperty("DonationToTeacherChang"); 
			IVariableField variable_DonationToTeacherChang = mySession.getVariableField( 
					IProjectVariables.FLOW_NAME, 
					IProjectVariables.FLOW_NAME_FIELD_DONATION_TO_TEACHER_CHANG); 
			variable_DonationToTeacherChang.setValue(DonationToTeacherChang); 
			mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "DonationToTeacherChang Response:" +DonationToTeacherChang);
			
			
			String FarEastOneSmallAmount = props.getProperty("FarEastOneSmallAmount"); 
			IVariableField variable_FarEastOneSmallAmount = mySession.getVariableField( 
					IProjectVariables.FLOW_NAME, 
					IProjectVariables.FLOW_NAME_FIELD_FAR_EAST_ONE_SMALL_AMOUNT); 
			variable_FarEastOneSmallAmount.setValue(FarEastOneSmallAmount); 
			mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FarEastOneSmallAmount Response:" +FarEastOneSmallAmount);
			
			
			
			
			String DonationToHomeSupport = props.getProperty("DonationToHomeSupport"); 
			IVariableField variable_DonationToHomeSupport = mySession.getVariableField( 
					IProjectVariables.FLOW_NAME, 
					IProjectVariables.FLOW_NAME_FIELD_DONATION_TO_HOME_SUPPORT); 
			variable_DonationToHomeSupport.setValue(DonationToHomeSupport); 
			mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "DonationToHomeSupport Response:" +DonationToHomeSupport);

			String Jointfundraising = props.getProperty("Jointfundraising"); 
			IVariableField variable_Jointfundraising = mySession.getVariableField( 
					IProjectVariables.FLOW_NAME, 
					IProjectVariables.FLOW_NAME_FIELD_JOINTFUNDRAISING); 
			variable_Jointfundraising.setValue(Jointfundraising); 
			mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "Jointfundraising Response:" +Jointfundraising);
			
			String DonationToChineseChristianReliefAssociation = props.getProperty("DonationToChineseChristianReliefAssociation"); 
			IVariableField variable_DonationToChineseChristianReliefAssociation = mySession.getVariableField( 
					IProjectVariables.FLOW_NAME, 
					IProjectVariables.FLOW_NAME_FIELD_DONATION_TO_CHINESE_CHRISTIAN_RELIEF_ASSOCIATION); 
			variable_DonationToChineseChristianReliefAssociation.setValue(DonationToChineseChristianReliefAssociation); 
			mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "DonationToChineseChristianReliefAssociation Response:" +DonationToChineseChristianReliefAssociation);
			

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
	 * Last generated by Orchestration Designer at: 2024年11月6日 下午12時16分56秒
	 */
	public java.util.Collection getBranches(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Goto aGoto = null;
		list = new java.util.ArrayList(1);

		aGoto = new com.avaya.sce.runtime.Goto("insert_StartTime", 0, true, "Default");
		list.add(aGoto);

		return list;
	}
}
