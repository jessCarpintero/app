/**
 * Created by Apache CXF WadlToJava code generator
**/
package application;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/")
public interface Resource {

    @POST
    @Produces("application/json")
    @Path("/bulkImport")
    Response postBulkImport(@QueryParam("document") String document);

    @POST
    @Produces("application/json")
    @Path("/bulkImport")
    Response postBulkImport2(@QueryParam("interchange") String interchange);

    @POST
    @Consumes("application/octet-stream")
    @Produces("application/json")
    @Path("/bulkImportFile")
    Response postBulkImportFile();

    @GET
    @Produces("application/json")
    @Path("/changeSituation")
    Response getChangeSituation(@QueryParam("filter") String filter);

    @GET
    @Produces("application/octet-stream")
    @Path("/checkStatus")
    boolean getCheckStatus();

    @POST
    @Consumes("application/octet-stream")
    @Produces("application/json")
    @Path("/commAcknowledgement")
    Response postCommAcknowledgement();

    @POST
    @Consumes("application/octet-stream")
    @Produces("application/json")
    @Path("/commImport")
    Response postCommImport();

    @POST
    @Produces("application/json")
    @Path("/commSend")
    Response postCommSend(@QueryParam("interchange") String interchange);

    @GET
    @Produces("application/json")
    @Path("/connect")
    Response getConnect();

    @GET
    @Produces("application/octet-stream")
    @Path("/createSecuirtyToken")
    String getCreateSecuirtyToken();

    @GET
    @Produces("application/json")
    @Path("/deleteDocuments")
    Response getDeleteDocuments(@QueryParam("documents") List<Integer> documents);

    @GET
    @Produces("application/json")
    @Path("/deposit")
    Response getDeposit(@QueryParam("filter") String filter);

    @GET
    @Produces("application/json")
    @Path("/documentModify")
    Response getDocumentModify(@QueryParam("mapProfile") String mapProfile, @QueryParam("ediwinConfig") String ediwinConfig);

    @GET
    @Produces("application/json")
    @Path("/duplicate")
    Response getDuplicate(@QueryParam("filter") String filter);

    @GET
    @Produces("application/json")
    @Path("/ediwinExport")
    Response getEdiwinExport(@QueryParam("filter") String filter);

    @POST
    @Consumes("application/octet-stream")
    @Produces("application/json")
    @Path("/ediwinImport")
    Response postEdiwinImport();

    @GET
    @Produces("application/json")
    @Path("/endClientSignature")
    Response getEndClientSignature();

    @GET
    @Path("/endSession")
    void getEndSession();

    @GET
    @Produces("application/json")
    @Path("/getConfigDomain")
    Response getGetConfigDomain();

    @GET
    @Produces({"application/zip", "application/pdf" })
    @Path("/getContent")
    Response getGetContent(@QueryParam("filter") String filter);

    @GET
    @Produces("application/json")
    @Path("/getCounterFolder")
    int getGetCounterFolder(@QueryParam("filter") String filter);

    @GET
    @Produces("application/json")
    @Path("/getDocuments")
    Response getGetDocuments(@QueryParam("filter") String filter);

    @GET
    @Produces("application/json")
    @Path("/getFolders")
    Response getGetFolders();

    @GET
    @Produces({"application/zip", "application/pdf" })
    @Path("/getReport")
    Response getGetReport();

    @GET
    @Produces("application/json")
    @Path("/getSessionInfo")
    Response getGetSessionInfo();

    @GET
    @Produces("application/json")
    @Path("/getUser")
    Response getGetUser();

    @GET
    @Produces("application/octet-stream")
    @Path("/prepareParams")
    String getPrepareParams();

    @GET
    @Produces("application/json")
    @Path("/print")
    Response getPrint(@QueryParam("reports") List<String> reports);

    @GET
    @Produces("application/json")
    @Path("/registerSession")
    Response getRegisterSession(@QueryParam("group") String group, @QueryParam("domain") String domain, @QueryParam("user") String user, @QueryParam("password") String password, 
                @QueryParam("ediwinini") String ediwinini);

    @GET
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/runAsynctask")
    Response getRunAsynctask();

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/runComplement")
    Response postRunComplement();

    @POST
    @Produces("application/json")
    @Path("/saveOrUpdateConfigDomain")
    Response postSaveOrUpdateConfigDomain(@QueryParam("options") String options);

    @GET
    @Produces("application/json")
    @Path("/saveUser")
    boolean getSaveUser(@QueryParam("user") String user);

    @GET
    @Produces("application/json")
    @Path("/sendToVolume")
    Response getSendToVolume(@QueryParam("documents") List<Integer> documents);

    @POST
    @Consumes({"multipart/form-data" })
    @Produces("application/json")
    @Path("/startClientSignature")
    String postStartClientSignature();

    @POST
    @Consumes("application/octet-stream")
    @Produces("application/json")
    @Path("/transform")
    Response postTransform();

    @GET
    @Produces("application/json")
    @Path("/translate")
    Response getTranslate(@QueryParam("filter") String filter);

    @GET
    @Produces("application/json")
    @Path("/validate")
    Response getValidate(@QueryParam("filter") String filter);

}