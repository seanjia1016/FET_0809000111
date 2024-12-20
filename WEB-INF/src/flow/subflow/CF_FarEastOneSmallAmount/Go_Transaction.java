package flow.subflow.CF_FarEastOneSmallAmount;

/**
 * This servlet is used to forward the request to the entry point of a
 * project callflow (subflow).
 * Last generated by Orchestration Designer at: 2017年8月16日 下午01時50分43秒
 */
public class Go_Transaction extends com.avaya.sce.runtime.Subflow {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年8月16日 下午01時50分43秒
	 */
	public Go_Transaction() {
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
		return("CF_Go_Transaction");
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
		exitPoints.put("CF_Go_Transaction-End", "CF_FarEastOneSmallAmount-AN_015080");
		exitPoints.put("CF_Go_Transaction-next", "CF_FarEastOneSmallAmount-MN_015065_MenuID");
		return exitPoints;
	}
}
