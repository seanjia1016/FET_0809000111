/**
 * Last generated by Orchestration Designer at: 2017年8月7日 下午01時27分39秒
 */
package Chinese.prompts;

public class Voice_881008 extends com.avaya.sce.runtime.Prompt {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Constructor for Voice_881008.
	 */
	public Voice_881008() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}


	/**
	 * This method is generated automatically and should not be manually edited
	 * To manually edit the prompt, override:
	 * void updatePrompt()
	 * Last generated by Orchestration Designer at: 2024年10月9日 下午05時54分43秒
	 */
	public void buildPrompt(){
		com.avaya.sce.runtime.Format format = null;
		com.avaya.sce.runtime.RenderHint hint = null;
		com.avaya.sce.runtime.MediaPage mediaPage = null;
		setBarginType(com.avaya.sce.runtimecommon.SCERT.BARGIN_SPEECH);
		setName("Voice_881008");
		setOrder(com.avaya.sce.runtime.Prompt.STANDARD);

		// Prompt level 1
		setTimeout(1,8000);
		setBargin(1,true);

		add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"Voice:881008",false));

	}
}
