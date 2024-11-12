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
 * Last generated by Orchestration Designer at: 2016年5月23日 上午11時27分30秒
 */
public class get_properties extends com.avaya.sce.runtime.BasicServlet {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2016年5月23日 上午11時27分30秒
	 */
	public get_properties() {
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
	 * Last generated by Orchestration Designer at: 2016年5月23日 上午11時27分30秒
	 */
	public void servletImplementation(com.avaya.sce.runtimecommon.SCESession mySession) {
		IVariable variableRef_did = mySession.getVariable(IProjectVariables.DOMAINID);
		IComplexVariable complexVariable_did = variableRef_did.getComplexVariable();
		IVariableField field_did = complexVariable_did.getField(IProjectVariables.DOMAINID_FIELD_ID);
		String DomainId = field_did.getStringValue();
		DomainId = DomainId.trim();
		
		String extPropFileLocation = "/wls/AAEP_projects/AAEP"+DomainId+"/FETIVR/FET_0809000811/";
		// String extPropFileLocation = "D:/";
		// Reload ddlog4j.properties from external location.
		String ddlog4j = extPropFileLocation + "ddlog4j.properties";

		InputStream is = null;
		try {
			is = new FileInputStream(new File(ddlog4j));
			Properties log4jProps = new Properties();

			log4jProps.load(is);

			PropertyConfigurator.configure(log4jProps);

		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException: " + ddlog4j
					+ " is not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		// ///############################ Config
				Properties props = new Properties();
				//File f = new File("C:\\AAOD7.0.1\\workspace\\FET_0809000811\\data\\config.properties");
				// /wls/AAEP_projects/AAEP/FETIVR/config.properties
				File f = new File("/wls/AAEP_projects/AAEP"+DomainId+"/FETIVR/FET_0809000811/config.properties");
				try {
					props.load(new FileInputStream(f));
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				String vdn = props.getProperty("FET_0809000811");
				IVariableField variable_vdn = mySession
						.getVariableField(
								IProjectVariables.CH__PROPERTIES,
								IProjectVariables.CH__PROPERTIES_FIELD_VDN);
				variable_vdn.setValue(vdn);
				mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "test_mode Response:" +vdn);
				

				String channel = props.getProperty("Channel");
				IVariableField variable_channel = mySession
						.getVariableField(
								IProjectVariables.CH__PROPERTIES,
								IProjectVariables.CH__PROPERTIES_FIELD_CHANNEL);
				variable_channel.setValue(channel);
				mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "Channel Response:" +channel);
				
				
				String MIDDLEWARE__IP = props.getProperty("MIDDLEWARE__IP");
				IVariableField variable_MIDDLEWARE__IP = mySession
						.getVariableField(
								IProjectVariables.CH__PROPERTIES,
								IProjectVariables.CH__PROPERTIES_FIELD_MIDDLEWARE_IP);
				variable_MIDDLEWARE__IP.setValue(MIDDLEWARE__IP);
				mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "MIDDLEWARE__IP Response:" +MIDDLEWARE__IP);
				
				
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
	 * Last generated by Orchestration Designer at: 2024年11月12日 上午09時43分44秒
	 */
	public java.util.Collection getBranches(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Goto aGoto = null;
		list = new java.util.ArrayList(1);

		aGoto = new com.avaya.sce.runtime.Goto("get_CallInfo", 0, true, "Default");
		list.add(aGoto);

		return list;
	}
}
