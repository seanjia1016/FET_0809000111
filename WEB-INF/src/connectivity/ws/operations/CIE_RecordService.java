package connectivity.ws.operations;

/**
 * This class is generated automatically.  Manual edits must be outside of the tagged
 * areas (for example, "START:CLASS:..." and "END:CLASS:...").  Changes within the
 * tag areas will be overwritten when the web serice operation is regenerated.
 * Last generated by Orchestration Designer at: 2017年10月17日 下午07時46分40秒
 */
public class CIE_RecordService extends com.avaya.sce.runtime.connectivity.ws.CallService {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

    /**
    * Constructor for CIE_RecordService2.
    */
    public CIE_RecordService( com.avaya.sce.runtimecommon.IRuntimeSession mySession ) {
		//{{START:CLASS:CONSTRUCTOR
        super(mySession);
        setEndPoint("CIE_RecordService_1508240783876_WS_ENDPOINT");
        setTargetNS("http://servicerun.webservice.fet/");
        setPackageName("connectivity.ws.beans");
        setServiceName("CIE_RecordService");
        setTimeoutSeconds(45);
        setOperation(new javax.xml.namespace.QName("http://servicerun.webservice.fet/", "CIErecord"));
        addInParameter(new javax.xml.namespace.QName("http://servicerun.webservice.fet/", "parameters"), new javax.xml.namespace.QName("http://servicerun.webservice.fet/", "CIErecord"), "CIE_RecordService_Input", true, false, false);
        addOutParameter(new javax.xml.namespace.QName("http://servicerun.webservice.fet/", "parameters"), new javax.xml.namespace.QName("http://servicerun.webservice.fet/", "cieRecorditemlist"), "CIE_RecordService_Output", true, true, false);
        //}}END:CLASS:CONSTRUCTOR










































































































































































































































































































































<<<<<<< HEAD


=======
>>>>>>> 1ce24f429fccbcab12844b062c4f9e73875b8a9b
    }

}

