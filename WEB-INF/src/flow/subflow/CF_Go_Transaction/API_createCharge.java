package flow.subflow.CF_Go_Transaction;

/**
 * This servlet is used to forward the request to the entry point of a
 * project callflow (subflow).
 * Last generated by Orchestration Designer at: 2017年10月13日 上午09時36分43秒
 */
public class API_createCharge extends com.avaya.sce.runtime.Subflow {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年10月13日 上午09時36分43秒
	 */
	public API_createCharge() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the name of the subflow that is being invoked.  This name is used for
	 * determining the URL mapping for the the entry point of the subflow..
	 *
	 * @return the name of the subflow
	 * Last generated by Orchestration Designer at: 2024年11月14日 下午01時09分33秒
	 */
	protected String getSubflowName() {
		return("API_createCharge");
	}
	/**
	 * Returns the name of the mapping of sub flow exit points to the URL mappings
	 * of the servlets to return back to in the calling flow.
	 *
	 * @return map of sub flow exit points to servlets in the calling flow.
	 * Last generated by Orchestration Designer at: 2024年11月14日 下午01時09分33秒
	 */
	protected java.util.Map<String,String> getExitPoints() {
		java.util.Map<String, String> exitPoints;
		exitPoints = new java.util.HashMap<String, String>();
		exitPoints.put("API_createCharge-End", "CF_Go_Transaction-End");
		exitPoints.put("API_createCharge-next", "CF_Go_Transaction-Assign_insert_ivr_donate_tran");
		return exitPoints;
	}
}
