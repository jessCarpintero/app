
package ediwin.edicom.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para iedmCriteria complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="iedmCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="v1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="v2" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iedmCriteria", propOrder = {
    "op",
    "v1",
    "v2"
})
public class IedmCriteria {

    protected String op;
    protected String v1;
    protected Object v2;

    /**
     * Obtiene el valor de la propiedad op.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOp() {
        return op;
    }

    /**
     * Define el valor de la propiedad op.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOp(String value) {
        this.op = value;
    }

    /**
     * Obtiene el valor de la propiedad v1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV1() {
        return v1;
    }

    /**
     * Define el valor de la propiedad v1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV1(String value) {
        this.v1 = value;
    }

    /**
     * Obtiene el valor de la propiedad v2.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getV2() {
        return v2;
    }

    /**
     * Define el valor de la propiedad v2.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setV2(Object value) {
        this.v2 = value;
    }

}
