package flow.subflow.CF_FarEastOneSmallAmount;

/**
 * This servlet is used to forward the request to the entry point of a
 * project callflow (subflow).
 * Last generated by Orchestration Designer at: 2017年6月29日 上午10時31分07秒
 */
public class InputAndCheckID extends com.avaya.sce.runtime.Subflow {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年6月29日 上午10時31分07秒
	 */
	public InputAndCheckID() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the name of the subflow that is being invoked.  This name is used for
	 * determining the URL mapping for the the entry point of the subflow..
	 *
	 * @return the name of the subflow
	 * Last generated by Orchestration Designer at: 2024年10月9日 下午05時54分46秒
	 */
	protected String getSubflowName() {
		return("CF_InputAndCheckID");
	}
	/**
	 * Returns the name of the mapping of sub flow exit points to the URL mappings
	 * of the servlets to return back to in the calling flow.
	 *
	 * @return map of sub flow exit points to servlets in the calling flow.
	 * Last generated by Orchestration Designer at: 2024年10月9日 下午05時54分46秒
	 */
	protected java.util.Map<String,String> getExitPoints() {
		java.util.Map<String, String> exitPoints;
		exitPoints = new java.util.HashMap<String, String>();
		exitPoints.put("CF_InputAndCheckID-End", "CF_FarEastOneSmallAmount-End");
		exitPoints.put("CF_InputAndCheckID-pass", "CF_FarEastOneSmallAmount-MN_015061_MenuID");
		return exitPoints;
	}
}
