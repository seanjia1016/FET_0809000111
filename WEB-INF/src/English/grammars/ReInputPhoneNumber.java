package English.grammars;

/**
 * This class is generated automatically.
 * Only exit this class for Dynamic External grammars and override the method String getURL().
 * Last generated by Orchestration Designer at: 2017年8月9日 下午01時50分28秒
 */
public class ReInputPhoneNumber extends com.avaya.sce.runtime.Grammar {

    //{{START:CLASS:FIELDS
    //}}END:CLASS:FIELDS

    /**
    * Constructor for ReInputPhoneNumber.
    */
    public ReInputPhoneNumber() {
		//{{START:CLASS:CONSTRUCTOR
        super();
        setRootLanguage("en-us");
        setMode("dtmf");
        setBuiltin(true);
        setBuiltinMode("dtmf");
        setType("digits");
        setOptions("length=10");
		//}}END:CLASS:CONSTRUCTOR
    }

}

