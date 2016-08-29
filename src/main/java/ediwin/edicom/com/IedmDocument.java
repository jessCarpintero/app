
package ediwin.edicom.com;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para iedmDocument complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="iedmDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attachment" type="{com.edicom.ediwin}iedmMetaField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="autack" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blob" type="{com.edicom.ediwin}iedmBlob" minOccurs="0"/&gt;
 *         &lt;element name="changeState" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ciphered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="crypto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="deleted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="envDestination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="envSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="errors" type="{com.edicom.ediwin}iedmDataAux" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="flags" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="guide" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hashDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idAck" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idExternal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idInt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ieen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iepe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="info" type="{com.edicom.ediwin}iedmDataAux" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="mark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="metadata" type="{com.edicom.ediwin}iedmMetaField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="profile"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="selection" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="signed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="situation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xdoc"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="value" type="{com.edicom.ediwin}iedmXdocField" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "iedmDocument", propOrder = {
    "attachment",
    "autack",
    "blob",
    "changeState",
    "ciphered",
    "crypto",
    "date",
    "deleted",
    "destination",
    "domain",
    "envDestination",
    "envSource",
    "errors",
    "flags",
    "format",
    "guide",
    "hashDoc",
    "id",
    "idAck",
    "idExternal",
    "idInt",
    "ieen",
    "iepe",
    "iere",
    "info",
    "length",
    "mark",
    "metadata",
    "profile",
    "reference",
    "schema",
    "selection",
    "signed",
    "situation",
    "source",
    "state",
    "type",
    "xdoc"
})
public class IedmDocument {

    @XmlElement(nillable = true)
    protected List<IedmMetaField> attachment;
    protected String autack;
    protected IedmBlob blob;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changeState;
    protected String ciphered;
    protected String crypto;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    protected String deleted;
    protected String destination;
    protected String domain;
    protected String envDestination;
    protected String envSource;
    @XmlElement(nillable = true)
    protected List<IedmDataAux> errors;
    protected Integer flags;
    protected String format;
    protected String guide;
    protected String hashDoc;
    protected Integer id;
    protected Integer idAck;
    protected String idExternal;
    protected Integer idInt;
    protected String ieen;
    protected String iepe;
    protected String iere;
    @XmlElement(nillable = true)
    protected List<IedmDataAux> info;
    protected Integer length;
    protected String mark;
    @XmlElement(nillable = true)
    protected List<IedmMetaField> metadata;
    @XmlElement(required = true)
    protected IedmDocument.Profile profile;
    protected String reference;
    protected String schema;
    protected Integer selection;
    protected String signed;
    protected String situation;
    protected String source;
    protected String state;
    protected String type;
    @XmlElement(required = true)
    protected IedmDocument.Xdoc xdoc;

    /**
     * Gets the value of the attachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IedmMetaField }
     * 
     * 
     */
    public List<IedmMetaField> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<IedmMetaField>();
        }
        return this.attachment;
    }

    /**
     * Obtiene el valor de la propiedad autack.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutack() {
        return autack;
    }

    /**
     * Define el valor de la propiedad autack.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutack(String value) {
        this.autack = value;
    }

    /**
     * Obtiene el valor de la propiedad blob.
     * 
     * @return
     *     possible object is
     *     {@link IedmBlob }
     *     
     */
    public IedmBlob getBlob() {
        return blob;
    }

    /**
     * Define el valor de la propiedad blob.
     * 
     * @param value
     *     allowed object is
     *     {@link IedmBlob }
     *     
     */
    public void setBlob(IedmBlob value) {
        this.blob = value;
    }

    /**
     * Obtiene el valor de la propiedad changeState.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangeState() {
        return changeState;
    }

    /**
     * Define el valor de la propiedad changeState.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangeState(XMLGregorianCalendar value) {
        this.changeState = value;
    }

    /**
     * Obtiene el valor de la propiedad ciphered.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiphered() {
        return ciphered;
    }

    /**
     * Define el valor de la propiedad ciphered.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiphered(String value) {
        this.ciphered = value;
    }

    /**
     * Obtiene el valor de la propiedad crypto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrypto() {
        return crypto;
    }

    /**
     * Define el valor de la propiedad crypto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrypto(String value) {
        this.crypto = value;
    }

    /**
     * Obtiene el valor de la propiedad date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Define el valor de la propiedad date.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Obtiene el valor de la propiedad deleted.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * Define el valor de la propiedad deleted.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleted(String value) {
        this.deleted = value;
    }

    /**
     * Obtiene el valor de la propiedad destination.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Define el valor de la propiedad destination.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Obtiene el valor de la propiedad domain.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Define el valor de la propiedad domain.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Obtiene el valor de la propiedad envDestination.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvDestination() {
        return envDestination;
    }

    /**
     * Define el valor de la propiedad envDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvDestination(String value) {
        this.envDestination = value;
    }

    /**
     * Obtiene el valor de la propiedad envSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvSource() {
        return envSource;
    }

    /**
     * Define el valor de la propiedad envSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvSource(String value) {
        this.envSource = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IedmDataAux }
     * 
     * 
     */
    public List<IedmDataAux> getErrors() {
        if (errors == null) {
            errors = new ArrayList<IedmDataAux>();
        }
        return this.errors;
    }

    /**
     * Obtiene el valor de la propiedad flags.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlags(Integer value) {
        this.flags = value;
    }

    /**
     * Obtiene el valor de la propiedad format.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Define el valor de la propiedad format.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Obtiene el valor de la propiedad guide.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuide() {
        return guide;
    }

    /**
     * Define el valor de la propiedad guide.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuide(String value) {
        this.guide = value;
    }

    /**
     * Obtiene el valor de la propiedad hashDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashDoc() {
        return hashDoc;
    }

    /**
     * Define el valor de la propiedad hashDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashDoc(String value) {
        this.hashDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad idAck.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAck() {
        return idAck;
    }

    /**
     * Define el valor de la propiedad idAck.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAck(Integer value) {
        this.idAck = value;
    }

    /**
     * Obtiene el valor de la propiedad idExternal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdExternal() {
        return idExternal;
    }

    /**
     * Define el valor de la propiedad idExternal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdExternal(String value) {
        this.idExternal = value;
    }

    /**
     * Obtiene el valor de la propiedad idInt.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdInt() {
        return idInt;
    }

    /**
     * Define el valor de la propiedad idInt.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdInt(Integer value) {
        this.idInt = value;
    }

    /**
     * Obtiene el valor de la propiedad ieen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIeen() {
        return ieen;
    }

    /**
     * Define el valor de la propiedad ieen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIeen(String value) {
        this.ieen = value;
    }

    /**
     * Obtiene el valor de la propiedad iepe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIepe() {
        return iepe;
    }

    /**
     * Define el valor de la propiedad iepe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIepe(String value) {
        this.iepe = value;
    }

    /**
     * Obtiene el valor de la propiedad iere.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIere() {
        return iere;
    }

    /**
     * Define el valor de la propiedad iere.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIere(String value) {
        this.iere = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the info property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IedmDataAux }
     * 
     * 
     */
    public List<IedmDataAux> getInfo() {
        if (info == null) {
            info = new ArrayList<IedmDataAux>();
        }
        return this.info;
    }

    /**
     * Obtiene el valor de la propiedad length.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLength() {
        return length;
    }

    /**
     * Define el valor de la propiedad length.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLength(Integer value) {
        this.length = value;
    }

    /**
     * Obtiene el valor de la propiedad mark.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMark() {
        return mark;
    }

    /**
     * Define el valor de la propiedad mark.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMark(String value) {
        this.mark = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IedmMetaField }
     * 
     * 
     */
    public List<IedmMetaField> getMetadata() {
        if (metadata == null) {
            metadata = new ArrayList<IedmMetaField>();
        }
        return this.metadata;
    }

    /**
     * Obtiene el valor de la propiedad profile.
     * 
     * @return
     *     possible object is
     *     {@link IedmDocument.Profile }
     *     
     */
    public IedmDocument.Profile getProfile() {
        return profile;
    }

    /**
     * Define el valor de la propiedad profile.
     * 
     * @param value
     *     allowed object is
     *     {@link IedmDocument.Profile }
     *     
     */
    public void setProfile(IedmDocument.Profile value) {
        this.profile = value;
    }

    /**
     * Obtiene el valor de la propiedad reference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Define el valor de la propiedad reference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Obtiene el valor de la propiedad schema.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchema() {
        return schema;
    }

    /**
     * Define el valor de la propiedad schema.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchema(String value) {
        this.schema = value;
    }

    /**
     * Obtiene el valor de la propiedad selection.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSelection() {
        return selection;
    }

    /**
     * Define el valor de la propiedad selection.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSelection(Integer value) {
        this.selection = value;
    }

    /**
     * Obtiene el valor de la propiedad signed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigned() {
        return signed;
    }

    /**
     * Define el valor de la propiedad signed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigned(String value) {
        this.signed = value;
    }

    /**
     * Obtiene el valor de la propiedad situation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituation() {
        return situation;
    }

    /**
     * Define el valor de la propiedad situation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituation(String value) {
        this.situation = value;
    }

    /**
     * Obtiene el valor de la propiedad source.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Define el valor de la propiedad source.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Obtiene el valor de la propiedad state.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Define el valor de la propiedad state.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad xdoc.
     * 
     * @return
     *     possible object is
     *     {@link IedmDocument.Xdoc }
     *     
     */
    public IedmDocument.Xdoc getXdoc() {
        return xdoc;
    }

    /**
     * Define el valor de la propiedad xdoc.
     * 
     * @param value
     *     allowed object is
     *     {@link IedmDocument.Xdoc }
     *     
     */
    public void setXdoc(IedmDocument.Xdoc value) {
        this.xdoc = value;
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
     *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    @XmlType(name = "", propOrder = {
        "entry"
    })
    public static class Profile {

        protected List<IedmDocument.Profile.Entry> entry;

        /**
         * Gets the value of the entry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IedmDocument.Profile.Entry }
         * 
         * 
         */
        public List<IedmDocument.Profile.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<IedmDocument.Profile.Entry>();
            }
            return this.entry;
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
         *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "key",
            "value"
        })
        public static class Entry {

            protected String key;
            protected String value;

            /**
             * Obtiene el valor de la propiedad key.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKey() {
                return key;
            }

            /**
             * Define el valor de la propiedad key.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKey(String value) {
                this.key = value;
            }

            /**
             * Obtiene el valor de la propiedad value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Define el valor de la propiedad value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

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
     *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="value" type="{com.edicom.ediwin}iedmXdocField" minOccurs="0"/&gt;
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
    @XmlType(name = "", propOrder = {
        "entry"
    })
    public static class Xdoc {

        protected List<IedmDocument.Xdoc.Entry> entry;

        /**
         * Gets the value of the entry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IedmDocument.Xdoc.Entry }
         * 
         * 
         */
        public List<IedmDocument.Xdoc.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<IedmDocument.Xdoc.Entry>();
            }
            return this.entry;
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
         *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="value" type="{com.edicom.ediwin}iedmXdocField" minOccurs="0"/&gt;
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
            "key",
            "value"
        })
        public static class Entry {

            protected String key;
            protected IedmXdocField value;

            /**
             * Obtiene el valor de la propiedad key.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKey() {
                return key;
            }

            /**
             * Define el valor de la propiedad key.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKey(String value) {
                this.key = value;
            }

            /**
             * Obtiene el valor de la propiedad value.
             * 
             * @return
             *     possible object is
             *     {@link IedmXdocField }
             *     
             */
            public IedmXdocField getValue() {
                return value;
            }

            /**
             * Define el valor de la propiedad value.
             * 
             * @param value
             *     allowed object is
             *     {@link IedmXdocField }
             *     
             */
            public void setValue(IedmXdocField value) {
                this.value = value;
            }

        }

    }

}
