package flow.subflow.CF_DonationToChineseChristianReliefAssociation;

/**
 * This servlet is used to forward the request to the entry point of a
 * project callflow (subflow).
 * Last generated by Orchestration Designer at: 2017年8月18日 下午08時36分18秒
 */
public class SystemMaintenance extends com.avaya.sce.runtime.Subflow {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年8月18日 下午08時36分18秒
	 */
	public SystemMaintenance() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the name of the subflow that is being invoked.  This name is used for
	 * determining the URL mapping for the the entry point of the subflow..
	 *
	 * @return the name of the subflow
	 * Last generated by Orchestration Designer at: 2024年10月9日 下午05時54分44秒
	 */
	protected String getSubflowName() {
		return("CF_SystemMaintenance");
	}
	/**
	 * Returns the name of the mapping of sub flow exit points to the URL mappings
	 * of the servlets to return back to in the calling flow.
	 *
	 * @return map of sub flow exit points to servlets in the calling flow.
	 * Last generated by Orchestration Designer at: 2024年10月9日 下午05時54分44秒
	 */
	protected java.util.Map<String,String> getExitPoints() {
		java.util.Map<String, String> exitPoints;
		exitPoints = new java.util.HashMap<String, String>();
		exitPoints.put("CF_SystemMaintenance-End", "CF_DonationToChineseChristianReliefAssociation-end");
		exitPoints.put("CF_SystemMaintenance-Pass", "CF_DonationToChineseChristianReliefAssociation-Check_FandKData");
		return exitPoints;
	}
}
