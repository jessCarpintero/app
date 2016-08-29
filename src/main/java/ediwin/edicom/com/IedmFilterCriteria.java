
package ediwin.edicom.com;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para iedmFilterCriteria complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="iedmFilterCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="children" type="{com.edicom.ediwin}iedmFilterCriteria" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="criteria" type="{com.edicom.ediwin}iedmCriteria" minOccurs="0"/&gt;
 *         &lt;element name="union" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iedmFilterCriteria", propOrder = {
    "children",
    "criteria",
    "union"
})
public class IedmFilterCriteria {

    @XmlElement(nillable = true)
    protected List<IedmFilterCriteria> children;
    protected IedmCriteria criteria;
    protected String union;

    /**
     * Gets the value of the children property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the children property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildren().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IedmFilterCriteria }
     * 
     * 
     */
    public List<IedmFilterCriteria> getChildren() {
        if (children == null) {
            children = new ArrayList<IedmFilterCriteria>();
        }
        return this.children;
    }

    /**
     * Obtiene el valor de la propiedad criteria.
     * 
     * @return
     *     possible object is
     *     {@link IedmCriteria }
     *     
     */
    public IedmCriteria getCriteria() {
        return criteria;
    }

    /**
     * Define el valor de la propiedad criteria.
     * 
     * @param value
     *     allowed object is
     *     {@link IedmCriteria }
     *     
     */
    public void setCriteria(IedmCriteria value) {
        this.criteria = value;
    }

    /**
     * Obtiene el valor de la propiedad union.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnion() {
        return union;
    }

    /**
     * Define el valor de la propiedad union.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnion(String value) {
        this.union = value;
    }

}
