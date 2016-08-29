
package ediwin.edicom.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para iedmFilter complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="iedmFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="filterCriteria" type="{com.edicom.ediwin}iedmFilterCriteria" minOccurs="0"/&gt;
 *         &lt;element name="groupBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iedmFilter", propOrder = {
    "filterCriteria",
    "groupBy",
    "orderBy"
})
public class IedmFilter {

    protected IedmFilterCriteria filterCriteria;
    protected String groupBy;
    protected String orderBy;

    /**
     * Obtiene el valor de la propiedad filterCriteria.
     * 
     * @return
     *     possible object is
     *     {@link IedmFilterCriteria }
     *     
     */
    public IedmFilterCriteria getFilterCriteria() {
        return filterCriteria;
    }

    /**
     * Define el valor de la propiedad filterCriteria.
     * 
     * @param value
     *     allowed object is
     *     {@link IedmFilterCriteria }
     *     
     */
    public void setFilterCriteria(IedmFilterCriteria value) {
        this.filterCriteria = value;
    }

    /**
     * Obtiene el valor de la propiedad groupBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupBy() {
        return groupBy;
    }

    /**
     * Define el valor de la propiedad groupBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupBy(String value) {
        this.groupBy = value;
    }

    /**
     * Obtiene el valor de la propiedad orderBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * Define el valor de la propiedad orderBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderBy(String value) {
        this.orderBy = value;
    }

}
