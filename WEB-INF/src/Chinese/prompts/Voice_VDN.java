/**
 * Last generated by Orchestration Designer at: 2017年8月17日 下午04時37分43秒
 */
package Chinese.prompts;

public class Voice_VDN extends com.avaya.sce.runtime.Prompt {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Constructor for Voice_VDN.
	 */
	public Voice_VDN() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}


	/**
	 * This method is generated automatically and should not be manually edited
	 * To manually edit the prompt, override:
	 * void updatePrompt()
	 * Last generated by Orchestration Designer at: 2024年11月6日 下午04時02分57秒
	 */
	public void buildPrompt(){
		com.avaya.sce.runtime.Format format = null;
		com.avaya.sce.runtime.RenderHint hint = null;
		com.avaya.sce.runtime.MediaPage mediaPage = null;
		setBarginType(com.avaya.sce.runtimecommon.SCERT.BARGIN_SPEECH);
		setName("Voice_VDN");
		setOrder(com.avaya.sce.runtime.Prompt.STANDARD);

		// Prompt level 1
		setTimeout(1,8000);
		setBargin(1,true);

		format = new com.avaya.sce.runtime.Format();
		format.add("format","digits");
		format.add("inflection","Crmm");
		add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.CONSTANT_AUDIO,"VDN",format,false));

	}
}
