
package ediwin.edicom.com;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para iedmUserSecurity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="iedmUserSecurity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userSecurityFunctions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="userSecurityFunctions" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="userSecuritySchemas" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="userSecuritySchemas" type="{com.edicom.ediwin}iedmUserSecurityOption" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="userSecurityInternalPartners" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="userSecurityInternalPartners" type="{com.edicom.ediwin}iedmUserSecurityOption" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="userSecurityExternalPartners" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="userSecurityExternalPartners" type="{com.edicom.ediwin}iedmUserSecurityOption" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="userSecurityEdicomData" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="userSecurityEdicomData" type="{com.edicom.ediwin}iedmUserSecurityOption" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="userSecurityHierarchy" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="userSecurityHierarchy" type="{com.edicom.ediwin}iedmUserSecurityOption" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="userSecurityVolumes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="userSecurityVolumes" type="{com.edicom.ediwin}iedmUserSecurityOption" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="userSecurityFolders" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="userSecurityFolders" type="{com.edicom.ediwin}iedmUserSecurityOption" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="userSecurityEquivList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="userSecurityEquivList" type="{com.edicom.ediwin}iedmUserSecurityOptionEnabled" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="userSecurityRemoteEquivLists" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="userSecurityRemoteEquivLists" type="{com.edicom.ediwin}iedmUserSecurityOptionEnabled" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="userSecurityUsers" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="userSecurityUsers" type="{com.edicom.ediwin}iedmUserSecurityOption" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="userSecurityWebOptions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="userSecurityWebOptions" type="{com.edicom.ediwin}iedmUserSecurityOptionValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="userSecurityAdvancedSecurity" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="userSecurityAdvancedSecurity" type="{com.edicom.ediwin}iedmUserSecurityOptionValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iedmUserSecurity", propOrder = {
    "userSecurityFunctions",
    "userSecuritySchemas",
    "userSecurityInternalPartners",
    "userSecurityExternalPartners",
    "userSecurityEdicomData",
    "userSecurityHierarchy",
    "userSecurityVolumes",
    "userSecurityFolders",
    "userSecurityEquivList",
    "userSecurityRemoteEquivLists",
    "userSecurityUsers",
    "userSecurityWebOptions",
    "userSecurityAdvancedSecurity"
})
public class IedmUserSecurity {

    protected IedmUserSecurity.UserSecurityFunctions userSecurityFunctions;
    protected IedmUserSecurity.UserSecuritySchemas userSecuritySchemas;
    protected IedmUserSecurity.UserSecurityInternalPartners userSecurityInternalPartners;
    protected IedmUserSecurity.UserSecurityExternalPartners userSecurityExternalPartners;
    protected IedmUserSecurity.UserSecurityEdicomData userSecurityEdicomData;
    protected IedmUserSecurity.UserSecurityHierarchy userSecurityHierarchy;
    protected IedmUserSecurity.UserSecurityVolumes userSecurityVolumes;
    protected IedmUserSecurity.UserSecurityFolders userSecurityFolders;
    protected IedmUserSecurity.UserSecurityEquivList userSecurityEquivList;
    protected IedmUserSecurity.UserSecurityRemoteEquivLists userSecurityRemoteEquivLists;
    protected IedmUserSecurity.UserSecurityUsers userSecurityUsers;
    protected IedmUserSecurity.UserSecurityWebOptions userSecurityWebOptions;
    protected IedmUserSecurity.UserSecurityAdvancedSecurity userSecurityAdvancedSecurity;

    /**
     * Obtiene el valor de la propiedad userSecurityFunctions.
     * 
     * @return
     *     possible object is
     *     {@link IedmUserSecurity.UserSecurityFunctions }
     *     
     */
    public IedmUserSecurity.UserSecurityFunctions getUserSecurityFunctions() {
        return userSecurityFunctions;
    }

    /**
     * Define el valor de la propiedad userSecurityFunctions.
     * 
     * @param value
     *     allowed object is
     *     {@link IedmUserSecurity.UserSecurityFunctions }
     *     
     */
    public void setUserSecurityFunctions(IedmUserSecurity.UserSecurityFunctions value) {
        this.userSecurityFunctions = value;
    }

    /**
     * Obtiene el valor de la propiedad userSecuritySchemas.
     * 
     * @return
     *     possible object is
     *     {@link IedmUserSecurity.UserSecuritySchemas }
     *     
     */
    public IedmUserSecurity.UserSecuritySchemas getUserSecuritySchemas() {
        return userSecuritySchemas;
    }

    /**
     * Define el valor de la propiedad userSecuritySchemas.
     * 
     * @param value
     *     allowed object is
     *     {@link IedmUserSecurity.UserSecuritySchemas }
     *     
     */
    public void setUserSecuritySchemas(IedmUserSecurity.UserSecuritySchemas value) {
        this.userSecuritySchemas = value;
    }

    /**
     * Obtiene el valor de la propiedad userSecurityInternalPartners.
     * 
     * @return
     *     possible object is
     *     {@link IedmUserSecurity.UserSecurityInternalPartners }
     *     
     */
    public IedmUserSecurity.UserSecurityInternalPartners getUserSecurityInternalPartners() {
        return userSecurityInternalPartners;
    }

    /**
     * Define el valor de la propiedad userSecurityInternalPartners.
     * 
     * @param value
     *     allowed object is
     *     {@link IedmUserSecurity.UserSecurityInternalPartners }
     *     
     */
    public void setUserSecurityInternalPartners(IedmUserSecurity.UserSecurityInternalPartners value) {
        this.userSecurityInternalPartners = value;
    }

    /**
     * Obtiene el valor de la propiedad userSecurityExternalPartners.
     * 
     * @return
     *     possible object is
     *     {@link IedmUserSecurity.UserSecurityExternalPartners }
     *     
     */
    public IedmUserSecurity.UserSecurityExternalPartners getUserSecurityExternalPartners() {
        return userSecurityExternalPartners;
    }

    /**
     * Define el valor de la propiedad userSecurityExternalPartners.
     * 
     * @param value
     *     allowed object is
     *     {@link IedmUserSecurity.UserSecurityExternalPartners }
     *     
     */
    public void setUserSecurityExternalPartners(IedmUserSecurity.UserSecurityExternalPartners value) {
        this.userSecurityExternalPartners = value;
    }

    /**
     * Obtiene el valor de la propiedad userSecurityEdicomData.
     * 
     * @return
     *     possible object is
     *     {@link IedmUserSecurity.UserSecurityEdicomData }
     *     
     */
    public IedmUserSecurity.UserSecurityEdicomData getUserSecurityEdicomData() {
        return userSecurityEdicomData;
    }

    /**
     * Define el valor de la propiedad userSecurityEdicomData.
     * 
     * @param value
     *     allowed object is
     *     {@link IedmUserSecurity.UserSecurityEdicomData }
     *     
     */
    public void setUserSecurityEdicomData(IedmUserSecurity.UserSecurityEdicomData value) {
        this.userSecurityEdicomData = value;
    }

    /**
     * Obtiene el valor de la propiedad userSecurityHierarchy.
     * 
     * @return
     *     possible object is
     *     {@link IedmUserSecurity.UserSecurityHierarchy }
     *     
     */
    public IedmUserSecurity.UserSecurityHierarchy getUserSecurityHierarchy() {
        return userSecurityHierarchy;
    }

    /**
     * Define el valor de la propiedad userSecurityHierarchy.
     * 
     * @param value
     *     allowed object is
     *     {@link IedmUserSecurity.UserSecurityHierarchy }
     *     
     */
    public void setUserSecurityHierarchy(IedmUserSecurity.UserSecurityHierarchy value) {
        this.userSecurityHierarchy = value;
    }

    /**
     * Obtiene el valor de la propiedad userSecurityVolumes.
     * 
     * @return
     *     possible object is
     *     {@link IedmUserSecurity.UserSecurityVolumes }
     *     
     */
    public IedmUserSecurity.UserSecurityVolumes getUserSecurityVolumes() {
        return userSecurityVolumes;
    }

    /**
     * Define el valor de la propiedad userSecurityVolumes.
     * 
     * @param value
     *     allowed object is
     *     {@link IedmUserSecurity.UserSecurityVolumes }
     *     
     */
    public void setUserSecurityVolumes(IedmUserSecurity.UserSecurityVolumes value) {
        this.userSecurityVolumes = value;
    }

    /**
     * Obtiene el valor de la propiedad userSecurityFolders.
     * 
     * @return
     *     possible object is
     *     {@link IedmUserSecurity.UserSecurityFolders }
     *     
     */
    public IedmUserSecurity.UserSecurityFolders getUserSecurityFolders() {
        return userSecurityFolders;
    }

    /**
     * Define el valor de la propiedad userSecurityFolders.
     * 
     * @param value
     *     allowed object is
     *     {@link IedmUserSecurity.UserSecurityFolders }
     *     
     */
    public void setUserSecurityFolders(IedmUserSecurity.UserSecurityFolders value) {
        this.userSecurityFolders = value;
    }

    /**
     * Obtiene el valor de la propiedad userSecurityEquivList.
     * 
     * @return
     *     possible object is
     *     {@link IedmUserSecurity.UserSecurityEquivList }
     *     
     */
    public IedmUserSecurity.UserSecurityEquivList getUserSecurityEquivList() {
        return userSecurityEquivList;
    }

    /**
     * Define el valor de la propiedad userSecurityEquivList.
     * 
     * @param value
     *     allowed object is
     *     {@link IedmUserSecurity.UserSecurityEquivList }
     *     
     */
    public void setUserSecurityEquivList(IedmUserSecurity.UserSecurityEquivList value) {
        this.userSecurityEquivList = value;
    }

    /**
     * Obtiene el valor de la propiedad userSecurityRemoteEquivLists.
     * 
     * @return
     *     possible object is
     *     {@link IedmUserSecurity.UserSecurityRemoteEquivLists }
     *     
     */
    public IedmUserSecurity.UserSecurityRemoteEquivLists getUserSecurityRemoteEquivLists() {
        return userSecurityRemoteEquivLists;
    }

    /**
     * Define el valor de la propiedad userSecurityRemoteEquivLists.
     * 
     * @param value
     *     allowed object is
     *     {@link IedmUserSecurity.UserSecurityRemoteEquivLists }
     *     
     */
    public void setUserSecurityRemoteEquivLists(IedmUserSecurity.UserSecurityRemoteEquivLists value) {
        this.userSecurityRemoteEquivLists = value;
    }

    /**
     * Obtiene el valor de la propiedad userSecurityUsers.
     * 
     * @return
     *     possible object is
     *     {@link IedmUserSecurity.UserSecurityUsers }
     *     
     */
    public IedmUserSecurity.UserSecurityUsers getUserSecurityUsers() {
        return userSecurityUsers;
    }

    /**
     * Define el valor de la propiedad userSecurityUsers.
     * 
     * @param value
     *     allowed object is
     *     {@link IedmUserSecurity.UserSecurityUsers }
     *     
     */
    public void setUserSecurityUsers(IedmUserSecurity.UserSecurityUsers value) {
        this.userSecurityUsers = value;
    }

    /**
     * Obtiene el valor de la propiedad userSecurityWebOptions.
     * 
     * @return
     *     possible object is
     *     {@link IedmUserSecurity.UserSecurityWebOptions }
     *     
     */
    public IedmUserSecurity.UserSecurityWebOptions getUserSecurityWebOptions() {
        return userSecurityWebOptions;
    }

    /**
     * Define el valor de la propiedad userSecurityWebOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link IedmUserSecurity.UserSecurityWebOptions }
     *     
     */
    public void setUserSecurityWebOptions(IedmUserSecurity.UserSecurityWebOptions value) {
        this.userSecurityWebOptions = value;
    }

    /**
     * Obtiene el valor de la propiedad userSecurityAdvancedSecurity.
     * 
     * @return
     *     possible object is
     *     {@link IedmUserSecurity.UserSecurityAdvancedSecurity }
     *     
     */
    public IedmUserSecurity.UserSecurityAdvancedSecurity getUserSecurityAdvancedSecurity() {
        return userSecurityAdvancedSecurity;
    }

    /**
     * Define el valor de la propiedad userSecurityAdvancedSecurity.
     * 
     * @param value
     *     allowed object is
     *     {@link IedmUserSecurity.UserSecurityAdvancedSecurity }
     *     
     */
    public void setUserSecurityAdvancedSecurity(IedmUserSecurity.UserSecurityAdvancedSecurity value) {
        this.userSecurityAdvancedSecurity = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="userSecurityAdvancedSecurity" type="{com.edicom.ediwin}iedmUserSecurityOptionValue" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userSecurityAdvancedSecurity"
    })
    public static class UserSecurityAdvancedSecurity {

        protected List<IedmUserSecurityOptionValue> userSecurityAdvancedSecurity;

        /**
         * Gets the value of the userSecurityAdvancedSecurity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the userSecurityAdvancedSecurity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUserSecurityAdvancedSecurity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IedmUserSecurityOptionValue }
         * 
         * 
         */
        public List<IedmUserSecurityOptionValue> getUserSecurityAdvancedSecurity() {
            if (userSecurityAdvancedSecurity == null) {
                userSecurityAdvancedSecurity = new ArrayList<IedmUserSecurityOptionValue>();
            }
            return this.userSecurityAdvancedSecurity;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="userSecurityEdicomData" type="{com.edicom.ediwin}iedmUserSecurityOption" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userSecurityEdicomData"
    })
    public static class UserSecurityEdicomData {

        protected List<IedmUserSecurityOption> userSecurityEdicomData;

        /**
         * Gets the value of the userSecurityEdicomData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the userSecurityEdicomData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUserSecurityEdicomData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IedmUserSecurityOption }
         * 
         * 
         */
        public List<IedmUserSecurityOption> getUserSecurityEdicomData() {
            if (userSecurityEdicomData == null) {
                userSecurityEdicomData = new ArrayList<IedmUserSecurityOption>();
            }
            return this.userSecurityEdicomData;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="userSecurityEquivList" type="{com.edicom.ediwin}iedmUserSecurityOptionEnabled" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userSecurityEquivList"
    })
    public static class UserSecurityEquivList {

        protected List<IedmUserSecurityOptionEnabled> userSecurityEquivList;

        /**
         * Gets the value of the userSecurityEquivList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the userSecurityEquivList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUserSecurityEquivList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IedmUserSecurityOptionEnabled }
         * 
         * 
         */
        public List<IedmUserSecurityOptionEnabled> getUserSecurityEquivList() {
            if (userSecurityEquivList == null) {
                userSecurityEquivList = new ArrayList<IedmUserSecurityOptionEnabled>();
            }
            return this.userSecurityEquivList;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="userSecurityExternalPartners" type="{com.edicom.ediwin}iedmUserSecurityOption" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userSecurityExternalPartners"
    })
    public static class UserSecurityExternalPartners {

        protected List<IedmUserSecurityOption> userSecurityExternalPartners;

        /**
         * Gets the value of the userSecurityExternalPartners property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the userSecurityExternalPartners property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUserSecurityExternalPartners().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IedmUserSecurityOption }
         * 
         * 
         */
        public List<IedmUserSecurityOption> getUserSecurityExternalPartners() {
            if (userSecurityExternalPartners == null) {
                userSecurityExternalPartners = new ArrayList<IedmUserSecurityOption>();
            }
            return this.userSecurityExternalPartners;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="userSecurityFolders" type="{com.edicom.ediwin}iedmUserSecurityOption" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userSecurityFolders"
    })
    public static class UserSecurityFolders {

        protected List<IedmUserSecurityOption> userSecurityFolders;

        /**
         * Gets the value of the userSecurityFolders property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the userSecurityFolders property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUserSecurityFolders().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IedmUserSecurityOption }
         * 
         * 
         */
        public List<IedmUserSecurityOption> getUserSecurityFolders() {
            if (userSecurityFolders == null) {
                userSecurityFolders = new ArrayList<IedmUserSecurityOption>();
            }
            return this.userSecurityFolders;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="userSecurityFunctions" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userSecurityFunctions"
    })
    public static class UserSecurityFunctions {

        protected List<String> userSecurityFunctions;

        /**
         * Gets the value of the userSecurityFunctions property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the userSecurityFunctions property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUserSecurityFunctions().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getUserSecurityFunctions() {
            if (userSecurityFunctions == null) {
                userSecurityFunctions = new ArrayList<String>();
            }
            return this.userSecurityFunctions;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="userSecurityHierarchy" type="{com.edicom.ediwin}iedmUserSecurityOption" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userSecurityHierarchy"
    })
    public static class UserSecurityHierarchy {

        protected List<IedmUserSecurityOption> userSecurityHierarchy;

        /**
         * Gets the value of the userSecurityHierarchy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the userSecurityHierarchy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUserSecurityHierarchy().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IedmUserSecurityOption }
         * 
         * 
         */
        public List<IedmUserSecurityOption> getUserSecurityHierarchy() {
            if (userSecurityHierarchy == null) {
                userSecurityHierarchy = new ArrayList<IedmUserSecurityOption>();
            }
            return this.userSecurityHierarchy;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="userSecurityInternalPartners" type="{com.edicom.ediwin}iedmUserSecurityOption" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userSecurityInternalPartners"
    })
    public static class UserSecurityInternalPartners {

        protected List<IedmUserSecurityOption> userSecurityInternalPartners;

        /**
         * Gets the value of the userSecurityInternalPartners property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the userSecurityInternalPartners property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUserSecurityInternalPartners().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IedmUserSecurityOption }
         * 
         * 
         */
        public List<IedmUserSecurityOption> getUserSecurityInternalPartners() {
            if (userSecurityInternalPartners == null) {
                userSecurityInternalPartners = new ArrayList<IedmUserSecurityOption>();
            }
            return this.userSecurityInternalPartners;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="userSecurityRemoteEquivLists" type="{com.edicom.ediwin}iedmUserSecurityOptionEnabled" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userSecurityRemoteEquivLists"
    })
    public static class UserSecurityRemoteEquivLists {

        protected List<IedmUserSecurityOptionEnabled> userSecurityRemoteEquivLists;

        /**
         * Gets the value of the userSecurityRemoteEquivLists property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the userSecurityRemoteEquivLists property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUserSecurityRemoteEquivLists().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IedmUserSecurityOptionEnabled }
         * 
         * 
         */
        public List<IedmUserSecurityOptionEnabled> getUserSecurityRemoteEquivLists() {
            if (userSecurityRemoteEquivLists == null) {
                userSecurityRemoteEquivLists = new ArrayList<IedmUserSecurityOptionEnabled>();
            }
            return this.userSecurityRemoteEquivLists;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="userSecuritySchemas" type="{com.edicom.ediwin}iedmUserSecurityOption" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userSecuritySchemas"
    })
    public static class UserSecuritySchemas {

        protected List<IedmUserSecurityOption> userSecuritySchemas;

        /**
         * Gets the value of the userSecuritySchemas property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the userSecuritySchemas property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUserSecuritySchemas().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IedmUserSecurityOption }
         * 
         * 
         */
        public List<IedmUserSecurityOption> getUserSecuritySchemas() {
            if (userSecuritySchemas == null) {
                userSecuritySchemas = new ArrayList<IedmUserSecurityOption>();
            }
            return this.userSecuritySchemas;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="userSecurityUsers" type="{com.edicom.ediwin}iedmUserSecurityOption" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userSecurityUsers"
    })
    public static class UserSecurityUsers {

        protected List<IedmUserSecurityOption> userSecurityUsers;

        /**
         * Gets the value of the userSecurityUsers property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the userSecurityUsers property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUserSecurityUsers().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IedmUserSecurityOption }
         * 
         * 
         */
        public List<IedmUserSecurityOption> getUserSecurityUsers() {
            if (userSecurityUsers == null) {
                userSecurityUsers = new ArrayList<IedmUserSecurityOption>();
            }
            return this.userSecurityUsers;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="userSecurityVolumes" type="{com.edicom.ediwin}iedmUserSecurityOption" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userSecurityVolumes"
    })
    public static class UserSecurityVolumes {

        protected List<IedmUserSecurityOption> userSecurityVolumes;

        /**
         * Gets the value of the userSecurityVolumes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the userSecurityVolumes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUserSecurityVolumes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IedmUserSecurityOption }
         * 
         * 
         */
        public List<IedmUserSecurityOption> getUserSecurityVolumes() {
            if (userSecurityVolumes == null) {
                userSecurityVolumes = new ArrayList<IedmUserSecurityOption>();
            }
            return this.userSecurityVolumes;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="userSecurityWebOptions" type="{com.edicom.ediwin}iedmUserSecurityOptionValue" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userSecurityWebOptions"
    })
    public static class UserSecurityWebOptions {

        protected List<IedmUserSecurityOptionValue> userSecurityWebOptions;

        /**
         * Gets the value of the userSecurityWebOptions property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the userSecurityWebOptions property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUserSecurityWebOptions().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IedmUserSecurityOptionValue }
         * 
         * 
         */
        public List<IedmUserSecurityOptionValue> getUserSecurityWebOptions() {
            if (userSecurityWebOptions == null) {
                userSecurityWebOptions = new ArrayList<IedmUserSecurityOptionValue>();
            }
            return this.userSecurityWebOptions;
        }

    }

}
