package flow.subflow.CF_Go_Transaction;

/**
 * This servlet is used to forward the request to the entry point of a
 * project callflow (subflow).
 * Last generated by Orchestration Designer at: 2017年10月23日 下午04時53分11秒
 */
public class insert_IVR_DONATE_TRAN extends com.avaya.sce.runtime.Subflow {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年10月23日 下午04時53分11秒
	 */
	public insert_IVR_DONATE_TRAN() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the name of the subflow that is being invoked.  This name is used for
	 * determining the URL mapping for the the entry point of the subflow..
	 *
	 * @return the name of the subflow
	 * Last generated by Orchestration Designer at: 2024年11月13日 下午04時23分59秒
	 */
	protected String getSubflowName() {
		return("insert_IVR_DONATE_TRAN");
	}
	/**
	 * Returns the name of the mapping of sub flow exit points to the URL mappings
	 * of the servlets to return back to in the calling flow.
	 *
	 * @return map of sub flow exit points to servlets in the calling flow.
	 * Last generated by Orchestration Designer at: 2024年11月13日 下午04時23分59秒
	 */
	protected java.util.Map<String,String> getExitPoints() {
		java.util.Map<String, String> exitPoints;
		exitPoints = new java.util.HashMap<String, String>();
		exitPoints.put("insert_IVR_DONATE_TRAN-next", "CF_Go_Transaction-API_newTxnMstr");
		return exitPoints;
	}
}
