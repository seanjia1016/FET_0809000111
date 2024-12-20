package flow.subflow.CF_Go_TransactionFor380;

/**
 * This servlet is used to forward the request to the entry point of a
 * project callflow (subflow).
 * Last generated by Orchestration Designer at: 2018年3月15日 下午04時22分37秒
 */
public class API_createCharge extends com.avaya.sce.runtime.Subflow {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2018年3月15日 下午04時22分37秒
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
<<<<<<< HEAD
	 * Last generated by Orchestration Designer at: 2024年11月22日 下午06時05分37秒
=======
	 * Last generated by Orchestration Designer at: 2024年11月22日 下午05時44分49秒
>>>>>>> 1ce24f429fccbcab12844b062c4f9e73875b8a9b
	 */
	protected String getSubflowName() {
		return("API_createCharge");
	}
	/**
	 * Returns the name of the mapping of sub flow exit points to the URL mappings
	 * of the servlets to return back to in the calling flow.
	 *
	 * @return map of sub flow exit points to servlets in the calling flow.
<<<<<<< HEAD
	 * Last generated by Orchestration Designer at: 2024年11月22日 下午06時05分37秒
=======
	 * Last generated by Orchestration Designer at: 2024年11月22日 下午05時44分49秒
>>>>>>> 1ce24f429fccbcab12844b062c4f9e73875b8a9b
	 */
	protected java.util.Map<String,String> getExitPoints() {
		java.util.Map<String, String> exitPoints;
		exitPoints = new java.util.HashMap<String, String>();
		exitPoints.put("API_createCharge-End", "CF_Go_TransactionFor380-End");
		exitPoints.put("API_createCharge-next", "CF_Go_TransactionFor380-Check_CreateCharge");
		return exitPoints;
	}
}
