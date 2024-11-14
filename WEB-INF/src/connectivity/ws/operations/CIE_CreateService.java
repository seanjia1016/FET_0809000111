package connectivity.ws.operations;

/**
 * This class is generated automatically.  Manual edits must be outside of the tagged
 * areas (for example, "START:CLASS:..." and "END:CLASS:...").  Changes within the
 * tag areas will be overwritten when the web serice operation is regenerated.
 * Last generated by Orchestration Designer at: 2017年10月17日 下午07時52分48秒
 */
public class CIE_CreateService extends com.avaya.sce.runtime.connectivity.ws.CallService {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

    /**
    * Constructor for CIE_CreateService2.
    */
    public CIE_CreateService( com.avaya.sce.runtimecommon.IRuntimeSession mySession ) {
		//{{START:CLASS:CONSTRUCTOR
        super(mySession);
        setEndPoint("CIE_CreateService_1508241166934_WS_ENDPOINT");
        setTargetNS("http://servicerun.webservice.fet/");
        setPackageName("connectivity.ws.beans");
        setServiceName("CIE_CreateService");
        setTimeoutSeconds(45);
        setOperation(new javax.xml.namespace.QName("http://servicerun.webservice.fet/", "CIEcreate"));
        addInParameter(new javax.xml.namespace.QName("http://servicerun.webservice.fet/", "parameters"), new javax.xml.namespace.QName("http://servicerun.webservice.fet/", "CIEcreate"), "CIE_CreateService_Input", true, false, false);
        addOutParameter(new javax.xml.namespace.QName("http://servicerun.webservice.fet/", "parameters"), new javax.xml.namespace.QName("http://servicerun.webservice.fet/", "cieCreateitemlist"), "CIE_CreateService_Output", true, true, false);
        //}}END:CLASS:CONSTRUCTOR




































































































































































































































































































    }

}

