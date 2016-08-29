
package ediwin.edicom.com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ediwin.edicom.com package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ComplementFunction_QNAME = new QName("com.edicom.ediwin", "complementFunction");
    private final static QName _Dataaux_QNAME = new QName("com.edicom.ediwin", "dataaux");
    private final static QName _Document_QNAME = new QName("com.edicom.ediwin", "document");
    private final static QName _EdiwinResult_QNAME = new QName("com.edicom.ediwin", "ediwinResult");
    private final static QName _Fblob_QNAME = new QName("com.edicom.ediwin", "fblob");
    private final static QName _Filter_QNAME = new QName("com.edicom.ediwin", "filter");
    private final static QName _Filterop_QNAME = new QName("com.edicom.ediwin", "filterop");
    private final static QName _Folder_QNAME = new QName("com.edicom.ediwin", "folder");
    private final static QName _Metafield_QNAME = new QName("com.edicom.ediwin", "metafield");
    private final static QName _Param_QNAME = new QName("com.edicom.ediwin", "param");
    private final static QName _SessionUserInfo_QNAME = new QName("com.edicom.ediwin", "sessionUserInfo");
    private final static QName _UserEdiwin_QNAME = new QName("com.edicom.ediwin", "userEdiwin");
    private final static QName _UserSecurity_QNAME = new QName("com.edicom.ediwin", "userSecurity");
    private final static QName _UserSecurityOption_QNAME = new QName("com.edicom.ediwin", "userSecurityOption");
    private final static QName _UserSecurityOptionEnabled_QNAME = new QName("com.edicom.ediwin", "userSecurityOptionEnabled");
    private final static QName _UserSecurityOptionValue_QNAME = new QName("com.edicom.ediwin", "userSecurityOptionValue");
    private final static QName _SecurityToken_QNAME = new QName("com.edicom.ediwin", "securityToken");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ediwin.edicom.com
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IedmUserSecurity }
     * 
     */
    public IedmUserSecurity createIedmUserSecurity() {
        return new IedmUserSecurity();
    }

    /**
     * Create an instance of {@link IedmSessionUserInfo }
     * 
     */
    public IedmSessionUserInfo createIedmSessionUserInfo() {
        return new IedmSessionUserInfo();
    }

    /**
     * Create an instance of {@link IedmSessionUserInfo.UserSecurityWebOptions }
     * 
     */
    public IedmSessionUserInfo.UserSecurityWebOptions createIedmSessionUserInfoUserSecurityWebOptions() {
        return new IedmSessionUserInfo.UserSecurityWebOptions();
    }

    /**
     * Create an instance of {@link IedmSessionUserInfo.ConfigUsuario }
     * 
     */
    public IedmSessionUserInfo.ConfigUsuario createIedmSessionUserInfoConfigUsuario() {
        return new IedmSessionUserInfo.ConfigUsuario();
    }

    /**
     * Create an instance of {@link IEdiwinResult }
     * 
     */
    public IEdiwinResult createIEdiwinResult() {
        return new IEdiwinResult();
    }

    /**
     * Create an instance of {@link IEdiwinResult.OutputData }
     * 
     */
    public IEdiwinResult.OutputData createIEdiwinResultOutputData() {
        return new IEdiwinResult.OutputData();
    }

    /**
     * Create an instance of {@link IedmDocument }
     * 
     */
    public IedmDocument createIedmDocument() {
        return new IedmDocument();
    }

    /**
     * Create an instance of {@link IedmDocument.Xdoc }
     * 
     */
    public IedmDocument.Xdoc createIedmDocumentXdoc() {
        return new IedmDocument.Xdoc();
    }

    /**
     * Create an instance of {@link IedmDocument.Profile }
     * 
     */
    public IedmDocument.Profile createIedmDocumentProfile() {
        return new IedmDocument.Profile();
    }

    /**
     * Create an instance of {@link IedmComplementFunction }
     * 
     */
    public IedmComplementFunction createIedmComplementFunction() {
        return new IedmComplementFunction();
    }

    /**
     * Create an instance of {@link IedmComplementFunction.Params }
     * 
     */
    public IedmComplementFunction.Params createIedmComplementFunctionParams() {
        return new IedmComplementFunction.Params();
    }

    /**
     * Create an instance of {@link IedmComplementFunction.InputData }
     * 
     */
    public IedmComplementFunction.InputData createIedmComplementFunctionInputData() {
        return new IedmComplementFunction.InputData();
    }

    /**
     * Create an instance of {@link IedmDataAux }
     * 
     */
    public IedmDataAux createIedmDataAux() {
        return new IedmDataAux();
    }

    /**
     * Create an instance of {@link IedmBlob }
     * 
     */
    public IedmBlob createIedmBlob() {
        return new IedmBlob();
    }

    /**
     * Create an instance of {@link IedmFilter }
     * 
     */
    public IedmFilter createIedmFilter() {
        return new IedmFilter();
    }

    /**
     * Create an instance of {@link IedmFilterCriteria }
     * 
     */
    public IedmFilterCriteria createIedmFilterCriteria() {
        return new IedmFilterCriteria();
    }

    /**
     * Create an instance of {@link IedmFolder }
     * 
     */
    public IedmFolder createIedmFolder() {
        return new IedmFolder();
    }

    /**
     * Create an instance of {@link IedmMetaField }
     * 
     */
    public IedmMetaField createIedmMetaField() {
        return new IedmMetaField();
    }

    /**
     * Create an instance of {@link IedmCriteria }
     * 
     */
    public IedmCriteria createIedmCriteria() {
        return new IedmCriteria();
    }

    /**
     * Create an instance of {@link IedmUser }
     * 
     */
    public IedmUser createIedmUser() {
        return new IedmUser();
    }

    /**
     * Create an instance of {@link IedmUserSecurityOption }
     * 
     */
    public IedmUserSecurityOption createIedmUserSecurityOption() {
        return new IedmUserSecurityOption();
    }

    /**
     * Create an instance of {@link IedmUserSecurityOptionEnabled }
     * 
     */
    public IedmUserSecurityOptionEnabled createIedmUserSecurityOptionEnabled() {
        return new IedmUserSecurityOptionEnabled();
    }

    /**
     * Create an instance of {@link IedmUserSecurityOptionValue }
     * 
     */
    public IedmUserSecurityOptionValue createIedmUserSecurityOptionValue() {
        return new IedmUserSecurityOptionValue();
    }

    /**
     * Create an instance of {@link Documents }
     * 
     */
    public Documents createDocuments() {
        return new Documents();
    }

    /**
     * Create an instance of {@link EdiwinResults }
     * 
     */
    public EdiwinResults createEdiwinResults() {
        return new EdiwinResults();
    }

    /**
     * Create an instance of {@link Folders }
     * 
     */
    public Folders createFolders() {
        return new Folders();
    }

    /**
     * Create an instance of {@link IedmSecurityToken }
     * 
     */
    public IedmSecurityToken createIedmSecurityToken() {
        return new IedmSecurityToken();
    }

    /**
     * Create an instance of {@link IedmXdocField }
     * 
     */
    public IedmXdocField createIedmXdocField() {
        return new IedmXdocField();
    }

    /**
     * Create an instance of {@link IedmUserSecurity.UserSecurityFunctions }
     * 
     */
    public IedmUserSecurity.UserSecurityFunctions createIedmUserSecurityUserSecurityFunctions() {
        return new IedmUserSecurity.UserSecurityFunctions();
    }

    /**
     * Create an instance of {@link IedmUserSecurity.UserSecuritySchemas }
     * 
     */
    public IedmUserSecurity.UserSecuritySchemas createIedmUserSecurityUserSecuritySchemas() {
        return new IedmUserSecurity.UserSecuritySchemas();
    }

    /**
     * Create an instance of {@link IedmUserSecurity.UserSecurityInternalPartners }
     * 
     */
    public IedmUserSecurity.UserSecurityInternalPartners createIedmUserSecurityUserSecurityInternalPartners() {
        return new IedmUserSecurity.UserSecurityInternalPartners();
    }

    /**
     * Create an instance of {@link IedmUserSecurity.UserSecurityExternalPartners }
     * 
     */
    public IedmUserSecurity.UserSecurityExternalPartners createIedmUserSecurityUserSecurityExternalPartners() {
        return new IedmUserSecurity.UserSecurityExternalPartners();
    }

    /**
     * Create an instance of {@link IedmUserSecurity.UserSecurityEdicomData }
     * 
     */
    public IedmUserSecurity.UserSecurityEdicomData createIedmUserSecurityUserSecurityEdicomData() {
        return new IedmUserSecurity.UserSecurityEdicomData();
    }

    /**
     * Create an instance of {@link IedmUserSecurity.UserSecurityHierarchy }
     * 
     */
    public IedmUserSecurity.UserSecurityHierarchy createIedmUserSecurityUserSecurityHierarchy() {
        return new IedmUserSecurity.UserSecurityHierarchy();
    }

    /**
     * Create an instance of {@link IedmUserSecurity.UserSecurityVolumes }
     * 
     */
    public IedmUserSecurity.UserSecurityVolumes createIedmUserSecurityUserSecurityVolumes() {
        return new IedmUserSecurity.UserSecurityVolumes();
    }

    /**
     * Create an instance of {@link IedmUserSecurity.UserSecurityFolders }
     * 
     */
    public IedmUserSecurity.UserSecurityFolders createIedmUserSecurityUserSecurityFolders() {
        return new IedmUserSecurity.UserSecurityFolders();
    }

    /**
     * Create an instance of {@link IedmUserSecurity.UserSecurityEquivList }
     * 
     */
    public IedmUserSecurity.UserSecurityEquivList createIedmUserSecurityUserSecurityEquivList() {
        return new IedmUserSecurity.UserSecurityEquivList();
    }

    /**
     * Create an instance of {@link IedmUserSecurity.UserSecurityRemoteEquivLists }
     * 
     */
    public IedmUserSecurity.UserSecurityRemoteEquivLists createIedmUserSecurityUserSecurityRemoteEquivLists() {
        return new IedmUserSecurity.UserSecurityRemoteEquivLists();
    }

    /**
     * Create an instance of {@link IedmUserSecurity.UserSecurityUsers }
     * 
     */
    public IedmUserSecurity.UserSecurityUsers createIedmUserSecurityUserSecurityUsers() {
        return new IedmUserSecurity.UserSecurityUsers();
    }

    /**
     * Create an instance of {@link IedmUserSecurity.UserSecurityWebOptions }
     * 
     */
    public IedmUserSecurity.UserSecurityWebOptions createIedmUserSecurityUserSecurityWebOptions() {
        return new IedmUserSecurity.UserSecurityWebOptions();
    }

    /**
     * Create an instance of {@link IedmUserSecurity.UserSecurityAdvancedSecurity }
     * 
     */
    public IedmUserSecurity.UserSecurityAdvancedSecurity createIedmUserSecurityUserSecurityAdvancedSecurity() {
        return new IedmUserSecurity.UserSecurityAdvancedSecurity();
    }

    /**
     * Create an instance of {@link IedmSessionUserInfo.UserSecurityWebOptions.Entry }
     * 
     */
    public IedmSessionUserInfo.UserSecurityWebOptions.Entry createIedmSessionUserInfoUserSecurityWebOptionsEntry() {
        return new IedmSessionUserInfo.UserSecurityWebOptions.Entry();
    }

    /**
     * Create an instance of {@link IedmSessionUserInfo.ConfigUsuario.Entry }
     * 
     */
    public IedmSessionUserInfo.ConfigUsuario.Entry createIedmSessionUserInfoConfigUsuarioEntry() {
        return new IedmSessionUserInfo.ConfigUsuario.Entry();
    }

    /**
     * Create an instance of {@link IEdiwinResult.OutputData.Entry }
     * 
     */
    public IEdiwinResult.OutputData.Entry createIEdiwinResultOutputDataEntry() {
        return new IEdiwinResult.OutputData.Entry();
    }

    /**
     * Create an instance of {@link IedmDocument.Xdoc.Entry }
     * 
     */
    public IedmDocument.Xdoc.Entry createIedmDocumentXdocEntry() {
        return new IedmDocument.Xdoc.Entry();
    }

    /**
     * Create an instance of {@link IedmDocument.Profile.Entry }
     * 
     */
    public IedmDocument.Profile.Entry createIedmDocumentProfileEntry() {
        return new IedmDocument.Profile.Entry();
    }

    /**
     * Create an instance of {@link IedmComplementFunction.Params.Entry }
     * 
     */
    public IedmComplementFunction.Params.Entry createIedmComplementFunctionParamsEntry() {
        return new IedmComplementFunction.Params.Entry();
    }

    /**
     * Create an instance of {@link IedmComplementFunction.InputData.Entry }
     * 
     */
    public IedmComplementFunction.InputData.Entry createIedmComplementFunctionInputDataEntry() {
        return new IedmComplementFunction.InputData.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IedmComplementFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.edicom.ediwin", name = "complementFunction")
    public JAXBElement<IedmComplementFunction> createComplementFunction(IedmComplementFunction value) {
        return new JAXBElement<IedmComplementFunction>(_ComplementFunction_QNAME, IedmComplementFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IedmDataAux }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.edicom.ediwin", name = "dataaux")
    public JAXBElement<IedmDataAux> createDataaux(IedmDataAux value) {
        return new JAXBElement<IedmDataAux>(_Dataaux_QNAME, IedmDataAux.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IedmDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.edicom.ediwin", name = "document")
    public JAXBElement<IedmDocument> createDocument(IedmDocument value) {
        return new JAXBElement<IedmDocument>(_Document_QNAME, IedmDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IEdiwinResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.edicom.ediwin", name = "ediwinResult")
    public JAXBElement<IEdiwinResult> createEdiwinResult(IEdiwinResult value) {
        return new JAXBElement<IEdiwinResult>(_EdiwinResult_QNAME, IEdiwinResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IedmBlob }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.edicom.ediwin", name = "fblob")
    public JAXBElement<IedmBlob> createFblob(IedmBlob value) {
        return new JAXBElement<IedmBlob>(_Fblob_QNAME, IedmBlob.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IedmFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.edicom.ediwin", name = "filter")
    public JAXBElement<IedmFilter> createFilter(IedmFilter value) {
        return new JAXBElement<IedmFilter>(_Filter_QNAME, IedmFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IedmFilterCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.edicom.ediwin", name = "filterop")
    public JAXBElement<IedmFilterCriteria> createFilterop(IedmFilterCriteria value) {
        return new JAXBElement<IedmFilterCriteria>(_Filterop_QNAME, IedmFilterCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IedmFolder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.edicom.ediwin", name = "folder")
    public JAXBElement<IedmFolder> createFolder(IedmFolder value) {
        return new JAXBElement<IedmFolder>(_Folder_QNAME, IedmFolder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IedmMetaField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.edicom.ediwin", name = "metafield")
    public JAXBElement<IedmMetaField> createMetafield(IedmMetaField value) {
        return new JAXBElement<IedmMetaField>(_Metafield_QNAME, IedmMetaField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IedmCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.edicom.ediwin", name = "param")
    public JAXBElement<IedmCriteria> createParam(IedmCriteria value) {
        return new JAXBElement<IedmCriteria>(_Param_QNAME, IedmCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IedmSessionUserInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.edicom.ediwin", name = "sessionUserInfo")
    public JAXBElement<IedmSessionUserInfo> createSessionUserInfo(IedmSessionUserInfo value) {
        return new JAXBElement<IedmSessionUserInfo>(_SessionUserInfo_QNAME, IedmSessionUserInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IedmUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.edicom.ediwin", name = "userEdiwin")
    public JAXBElement<IedmUser> createUserEdiwin(IedmUser value) {
        return new JAXBElement<IedmUser>(_UserEdiwin_QNAME, IedmUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IedmUserSecurity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.edicom.ediwin", name = "userSecurity")
    public JAXBElement<IedmUserSecurity> createUserSecurity(IedmUserSecurity value) {
        return new JAXBElement<IedmUserSecurity>(_UserSecurity_QNAME, IedmUserSecurity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IedmUserSecurityOption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.edicom.ediwin", name = "userSecurityOption")
    public JAXBElement<IedmUserSecurityOption> createUserSecurityOption(IedmUserSecurityOption value) {
        return new JAXBElement<IedmUserSecurityOption>(_UserSecurityOption_QNAME, IedmUserSecurityOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IedmUserSecurityOptionEnabled }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.edicom.ediwin", name = "userSecurityOptionEnabled")
    public JAXBElement<IedmUserSecurityOptionEnabled> createUserSecurityOptionEnabled(IedmUserSecurityOptionEnabled value) {
        return new JAXBElement<IedmUserSecurityOptionEnabled>(_UserSecurityOptionEnabled_QNAME, IedmUserSecurityOptionEnabled.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IedmUserSecurityOptionValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.edicom.ediwin", name = "userSecurityOptionValue")
    public JAXBElement<IedmUserSecurityOptionValue> createUserSecurityOptionValue(IedmUserSecurityOptionValue value) {
        return new JAXBElement<IedmUserSecurityOptionValue>(_UserSecurityOptionValue_QNAME, IedmUserSecurityOptionValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IedmSecurityToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.edicom.ediwin", name = "securityToken")
    public JAXBElement<IedmSecurityToken> createSecurityToken(IedmSecurityToken value) {
        return new JAXBElement<IedmSecurityToken>(_SecurityToken_QNAME, IedmSecurityToken.class, null, value);
    }

}
