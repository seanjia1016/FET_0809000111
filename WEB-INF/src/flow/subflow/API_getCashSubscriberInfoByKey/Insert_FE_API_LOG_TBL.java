package flow.subflow.API_getCashSubscriberInfoByKey;

/**
 * This servlet is used to forward the request to the entry point of a
 * project callflow (subflow).
 * Last generated by Orchestration Designer at: 2017年12月19日 上午11時30分23秒
 */
public class Insert_FE_API_LOG_TBL extends com.avaya.sce.runtime.Subflow {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年12月19日 上午11時30分23秒
	 */
	public Insert_FE_API_LOG_TBL() {
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
		return("Insert_FE_API_LOG_TBL");
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
		exitPoints.put("Insert_FE_API_LOG_TBL-next", "API_getCashSubscriberInfoByKey-check_ReturnCode");
		return exitPoints;
	}
}
