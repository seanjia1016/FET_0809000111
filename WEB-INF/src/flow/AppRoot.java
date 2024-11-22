package flow;

/**
 * This is the root document for the application.  It defines the links and grammars
 * that are "global" for the application.<br>
 * Last generated by Orchestration Designer at: 2017年8月18日 下午02時33分30秒
 */
public class AppRoot extends com.avaya.sce.runtime.Root {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年8月18日 下午02時33分30秒
	 */
	public AppRoot() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * This method is generated automatically and should not be manually edited.
	 * To manually edit the links for the node, override:
	 *     void updateLinks(Collection links, SCESession mySession)
	 * Last generated by Orchestration Designer at: 2024年11月22日 下午09時46分14秒
	 * @return a collection of links
	 */
	public java.util.Collection getLinks(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Link link;
		java.util.List list;
		java.util.Collection grammarInfo = null;
		java.util.Collection<com.avaya.sce.runtime.CaptureExpression> captureExpr = null;
		// This item does not have any defined links
		list = new java.util.ArrayList();
		String ___tempGrammarName = null;

		return(list);
	}
	/**
	 * This method is generated automatically and should not be manually edited.
	 * To manually edit the properties for the node, override:
	 *     void updateProperties(Collection properties, SCESession mySession)
	 * Last generated by Orchestration Designer at: 2024年11月22日 下午09時46分14秒
	 * @return a collection of properties
	 */
	public java.util.Collection getProperties(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Property property;
		java.util.List list;
		// This item does not have any defined properties
		list = new java.util.ArrayList();

		return(list);
	}
	/**
	 * This method is generated automatically and should not be manually edited.
	 * To manually edit the event handlers for the node, override:
	 *    void updateEvents(Collection events, SCESession mySession)
	 * Last generated by Orchestration Designer at: 2024年11月22日 下午09時46分14秒
	 * @return a collection of Events
	 */
	public java.util.Collection getEvents(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list;
		com.avaya.sce.runtime.Event event;
		list = new java.util.ArrayList(8);
		java.util.List eventPromptNames = null;
		String ___tempPromptName = null;

		// Item has no prompts associated
		eventPromptNames = new java.util.ArrayList();

		event = new com.avaya.sce.runtime.Event("error.runtime", (com.avaya.sce.runtime.PromptRefInfo[])eventPromptNames.toArray(new com.avaya.sce.runtime.PromptRefInfo[0]), new com.avaya.sce.runtime.Goto("Disconnect", 0, true, "", java.util.Arrays.asList(new com.avaya.sce.runtime.CaptureExpression[] {new com.avaya.sce.runtime.CaptureExpression("event_message", "_message")})));
		list.add(event);

		// Item has no prompts associated
		eventPromptNames = new java.util.ArrayList();

		event = new com.avaya.sce.runtime.Event("error.badfetch.http.404", (com.avaya.sce.runtime.PromptRefInfo[])eventPromptNames.toArray(new com.avaya.sce.runtime.PromptRefInfo[0]), new com.avaya.sce.runtime.Goto("Disconnect", 0, true, "", java.util.Arrays.asList(new com.avaya.sce.runtime.CaptureExpression[] {new com.avaya.sce.runtime.CaptureExpression("event_message", "_message"), new com.avaya.sce.runtime.CaptureExpression("event_name", "_event")})));
		list.add(event);

		// Item has no prompts associated
		eventPromptNames = new java.util.ArrayList();

		event = new com.avaya.sce.runtime.Event("error.badfetch.http.404", (com.avaya.sce.runtime.PromptRefInfo[])eventPromptNames.toArray(new com.avaya.sce.runtime.PromptRefInfo[0]), new com.avaya.sce.runtime.Throw("app.fatal", 2, "Problems on application server", false));
		list.add(event);

		// Item has no prompts associated
		eventPromptNames = new java.util.ArrayList();

		event = new com.avaya.sce.runtime.Event("error.badfetch.http.500", (com.avaya.sce.runtime.PromptRefInfo[])eventPromptNames.toArray(new com.avaya.sce.runtime.PromptRefInfo[0]), new com.avaya.sce.runtime.Goto("Disconnect", 0, true, "", java.util.Arrays.asList(new com.avaya.sce.runtime.CaptureExpression[] {new com.avaya.sce.runtime.CaptureExpression("event_message", "_message"), new com.avaya.sce.runtime.CaptureExpression("event_name", "_event")})));
		list.add(event);

		// Item has no prompts associated
		eventPromptNames = new java.util.ArrayList();

		event = new com.avaya.sce.runtime.Event("error.badfetch.http.500", (com.avaya.sce.runtime.PromptRefInfo[])eventPromptNames.toArray(new com.avaya.sce.runtime.PromptRefInfo[0]), new com.avaya.sce.runtime.Throw("app.fatal", 2, "Problems on application server", false));
		list.add(event);

		// Item has no prompts associated
		eventPromptNames = new java.util.ArrayList();

		event = new com.avaya.sce.runtime.Event("error.badfetch", (com.avaya.sce.runtime.PromptRefInfo[])eventPromptNames.toArray(new com.avaya.sce.runtime.PromptRefInfo[0]), new com.avaya.sce.runtime.Goto("Disconnect", 0, true, "", java.util.Arrays.asList(new com.avaya.sce.runtime.CaptureExpression[] {new com.avaya.sce.runtime.CaptureExpression("event_message", "_message"), new com.avaya.sce.runtime.CaptureExpression("event_name", "_event")})));
		list.add(event);

		// Item has no prompts associated
		eventPromptNames = new java.util.ArrayList();

		event = new com.avaya.sce.runtime.Event("error.badfetch", (com.avaya.sce.runtime.PromptRefInfo[])eventPromptNames.toArray(new com.avaya.sce.runtime.PromptRefInfo[0]), new com.avaya.sce.runtime.Throw("app.fatal", 2, "Problems on application server", false));
		list.add(event);

		// Item has no prompts associated
		eventPromptNames = new java.util.ArrayList();

		event = new com.avaya.sce.runtime.Event("error", (com.avaya.sce.runtime.PromptRefInfo[])eventPromptNames.toArray(new com.avaya.sce.runtime.PromptRefInfo[0]), new com.avaya.sce.runtime.Throw("app.fatal", 2, "Problems on application server", false));
		list.add(event);
		return(list);
	}
}
