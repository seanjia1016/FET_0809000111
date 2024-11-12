package flow;

import com.avaya.sce.runtimecommon.IVariableField;
import com.crm.utils.Utils;

/**
 * A basic servlet which allows a user to define their code, generate
 * any output, and to select where to transition to next.
 * Last generated by Orchestration Designer at: 2024年11月12日 上午09時43分44秒
 */
public class getUUI extends com.avaya.sce.runtime.BasicServlet {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2024年11月12日 上午09時43分44秒
	 */
	public getUUI() {
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
	 * It's important to design your callflow so that the voice browser (Experienve Portal/IR)
	 * is not waiting too long for a response as this can lead to a poor caller experience.
	 * Additionally, if the response to the client voice browser exceeds the configured
	 * timeout, the platform may throw an "error.badfetch". 
	 *
	 * Using this method, you have access to all session variables through the 
	 * SCESession object.
	 *
	 * The code generator will *** NOT *** overwrite this method in the future.
	 * Last generated by Orchestration Designer at: 2024年11月12日 上午09時43分44秒
	 */
	public void servletImplementation(com.avaya.sce.runtimecommon.SCESession mySession) {

		String ANI = Utils.getFieldString(mySession, IProjectVariables.CH__USERDATA, IProjectVariables.CH__USERDATA_FIELD_ANI);
		
		String VDN = Utils.getFieldString(mySession, IProjectVariables.CH__PROPERTIES, IProjectVariables.CH__PROPERTIES_FIELD_VDN);

		String MSISDN = Utils.getFieldString(mySession, IProjectVariables.CH__USERDATA, IProjectVariables.CH__USERDATA_FIELD_ANI);
		
		String IN_SURVERY_ID = "00000000000000000";
		
		String LastService = "Voice_556036";
		
		String CIEID = "0000000000000000000";
		
		String UUI = ANI + "," + VDN + "," + MSISDN + "," + IN_SURVERY_ID + "," + LastService + "," + CIEID ;
		
		int a = 120 - UUI.length();
		
		StringBuilder zeros = new StringBuilder();
		for (int i = 0; i < a; i++) {
		    zeros.append('0');
		}
		UUI = UUI + zeros.toString();
		
		IVariableField variable_uui = mySession
				.getVariableField(
						IProjectVariables.CH__USERDATA,
						IProjectVariables.CH__USERDATA_FIELD_UUI);
		variable_uui.setValue(UUI);
						
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
	 * Last generated by Orchestration Designer at: 2024年11月12日 上午11時12分37秒
	 */
	public java.util.Collection getBranches(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Goto aGoto = null;
		list = new java.util.ArrayList(1);

		aGoto = new com.avaya.sce.runtime.Goto("ToAgent", 0, true, "Default");
		list.add(aGoto);

		return list;
	}
}
