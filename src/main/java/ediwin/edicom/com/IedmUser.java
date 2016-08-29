
package ediwin.edicom.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para iedmUser complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="iedmUser"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="certificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="changePwdAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="changePwdExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="changePwdOnLogin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ebiPwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ebiUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="filter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="forgottenPwdAnswer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="forgottenPwdQuest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupedPrint" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="preview" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reportLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="services" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userPwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userSecurity" type="{com.edicom.ediwin}iedmUserSecurity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iedmUser", propOrder = {
    "certificate",
    "changePwdAllowed",
    "changePwdExpirationDate",
    "changePwdOnLogin",
    "description",
    "ebiPwd",
    "ebiUser",
    "email",
    "enabled",
    "filter",
    "forgottenPwdAnswer",
    "forgottenPwdQuest",
    "fullName",
    "groupedPrint",
    "id",
    "language",
    "preview",
    "reportLanguage",
    "rol",
    "services",
    "timezone",
    "userId",
    "userPwd",
    "userSecurity"
})
public class IedmUser {

    protected String certificate;
    protected Boolean changePwdAllowed;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changePwdExpirationDate;
    protected Boolean changePwdOnLogin;
    protected String description;
    protected String ebiPwd;
    protected String ebiUser;
    protected String email;
    protected Boolean enabled;
    protected String filter;
    protected String forgottenPwdAnswer;
    protected String forgottenPwdQuest;
    protected String fullName;
    protected Integer groupedPrint;
    protected Long id;
    protected String language;
    protected String preview;
    protected String reportLanguage;
    protected String rol;
    protected String services;
    protected String timezone;
    protected String userId;
    protected String userPwd;
    protected IedmUserSecurity userSecurity;

    /**
     * Obtiene el valor de la propiedad certificate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * Define el valor de la propiedad certificate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificate(String value) {
        this.certificate = value;
    }

    /**
     * Obtiene el valor de la propiedad changePwdAllowed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangePwdAllowed() {
        return changePwdAllowed;
    }

    /**
     * Define el valor de la propiedad changePwdAllowed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangePwdAllowed(Boolean value) {
        this.changePwdAllowed = value;
    }

    /**
     * Obtiene el valor de la propiedad changePwdExpirationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangePwdExpirationDate() {
        return changePwdExpirationDate;
    }

    /**
     * Define el valor de la propiedad changePwdExpirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangePwdExpirationDate(XMLGregorianCalendar value) {
        this.changePwdExpirationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad changePwdOnLogin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangePwdOnLogin() {
        return changePwdOnLogin;
    }

    /**
     * Define el valor de la propiedad changePwdOnLogin.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangePwdOnLogin(Boolean value) {
        this.changePwdOnLogin = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad ebiPwd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEbiPwd() {
        return ebiPwd;
    }

    /**
     * Define el valor de la propiedad ebiPwd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEbiPwd(String value) {
        this.ebiPwd = value;
    }

    /**
     * Obtiene el valor de la propiedad ebiUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEbiUser() {
        return ebiUser;
    }

    /**
     * Define el valor de la propiedad ebiUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEbiUser(String value) {
        this.ebiUser = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad enabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Define el valor de la propiedad enabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Obtiene el valor de la propiedad filter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilter() {
        return filter;
    }

    /**
     * Define el valor de la propiedad filter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilter(String value) {
        this.filter = value;
    }

    /**
     * Obtiene el valor de la propiedad forgottenPwdAnswer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForgottenPwdAnswer() {
        return forgottenPwdAnswer;
    }

    /**
     * Define el valor de la propiedad forgottenPwdAnswer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForgottenPwdAnswer(String value) {
        this.forgottenPwdAnswer = value;
    }

    /**
     * Obtiene el valor de la propiedad forgottenPwdQuest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForgottenPwdQuest() {
        return forgottenPwdQuest;
    }

    /**
     * Define el valor de la propiedad forgottenPwdQuest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForgottenPwdQuest(String value) {
        this.forgottenPwdQuest = value;
    }

    /**
     * Obtiene el valor de la propiedad fullName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Define el valor de la propiedad fullName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Obtiene el valor de la propiedad groupedPrint.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGroupedPrint() {
        return groupedPrint;
    }

    /**
     * Define el valor de la propiedad groupedPrint.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroupedPrint(Integer value) {
        this.groupedPrint = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Define el valor de la propiedad language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Obtiene el valor de la propiedad preview.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreview() {
        return preview;
    }

    /**
     * Define el valor de la propiedad preview.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreview(String value) {
        this.preview = value;
    }

    /**
     * Obtiene el valor de la propiedad reportLanguage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportLanguage() {
        return reportLanguage;
    }

    /**
     * Define el valor de la propiedad reportLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportLanguage(String value) {
        this.reportLanguage = value;
    }

    /**
     * Obtiene el valor de la propiedad rol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRol() {
        return rol;
    }

    /**
     * Define el valor de la propiedad rol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRol(String value) {
        this.rol = value;
    }

    /**
     * Obtiene el valor de la propiedad services.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServices() {
        return services;
    }

    /**
     * Define el valor de la propiedad services.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServices(String value) {
        this.services = value;
    }

    /**
     * Obtiene el valor de la propiedad timezone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * Define el valor de la propiedad timezone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezone(String value) {
        this.timezone = value;
    }

    /**
     * Obtiene el valor de la propiedad userId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Define el valor de la propiedad userId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Obtiene el valor de la propiedad userPwd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * Define el valor de la propiedad userPwd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPwd(String value) {
        this.userPwd = value;
    }

    /**
     * Obtiene el valor de la propiedad userSecurity.
     * 
     * @return
     *     possible object is
     *     {@link IedmUserSecurity }
     *     
     */
    public IedmUserSecurity getUserSecurity() {
        return userSecurity;
    }

    /**
     * Define el valor de la propiedad userSecurity.
     * 
     * @param value
     *     allowed object is
     *     {@link IedmUserSecurity }
     *     
     */
    public void setUserSecurity(IedmUserSecurity value) {
        this.userSecurity = value;
    }

}
