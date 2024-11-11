package flow;

/**
 * Class that disconnects the call and allows any post-call processing and cleanup.
 * Last generated by Orchestration Designer at: 2018年12月26日 下午06時41分53秒
 */
public class Disconnect extends com.avaya.sce.runtime.Disconnect {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2018年12月26日 下午06時41分53秒
	 */
	public Disconnect() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * This method is generated automatically and should not be manually edited.
	 * To manually edit the event handlers for the node, override:
	 *    void updateEvents(Collection events, SCESession mySession)
	 * Last generated by Orchestration Designer at: 2024年11月11日 上午11時57分15秒
	 * @return a collection of Events
	 */
	public java.util.Collection getEvents(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list;
		com.avaya.sce.runtime.Event event;
		list = new java.util.ArrayList(1);
		java.util.List eventPromptNames = null;
		String ___tempPromptName = null;
		event = new com.avaya.sce.runtime.OnDisconnect("End", false);
		list.add(event);
		return(list);
	}
	/**
	 * Builds the list of prompts that are used by this flow item<br>
	 * This method is generated automatically and changes to it may
	 * be overwritten next time code is generated.  To modify the list
	 * of prompts for the flow item, override:
	 *     updatePrompts(Collection prompts, SCESession mySession)
	 * @return list of prompts for the menu
	 * Last generated by Orchestration Designer at: 2024年11月11日 上午11時57分15秒
	 */
	public java.util.Collection getPrompts(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		String ___tempPromptName = null;
		// Item has no prompts associated
		list = new java.util.ArrayList();

		return(list);
	}
	/**
	 * Builds the list of tracking items that are generated by this flow item<br>
	 * This method is generated automatically and changes to it may
	 * be overwritten next time code is generated.
	 * @return list of tracking items for the item
	 * Last generated by Orchestration Designer at: 2024年11月11日 上午11時57分15秒
	 */
	public java.util.Collection getTrackingActions(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;

		// Item has no tracking items.
		list = new java.util.ArrayList();
		return(list);
	}
	/**
	 * Builds the list of output parameters that are returned by this application
	 * This list is built automatically by defining Output Parameter nodes in the
	 * call flow editor.<BR>
	 *
	 * This method is generated automatically and changes to it may
	 * be overwritten next time code is generated.
	 *
	 * @return a Collection of <code>com.avaya.sce.runtime.Parameter</code>
	 * objects that the runtime will return to the calling application.
	 * If the node does not have any output parameters, then 
	 * this returns an empty list
	 * Last generated by Orchestration Designer at: 2024年11月11日 上午11時57分15秒
	 */
	public java.util.Collection getOutputParams(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Parameter param = null;
		list = new java.util.ArrayList();

		return list;
	}
}
