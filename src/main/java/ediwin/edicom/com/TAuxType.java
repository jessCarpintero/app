
package ediwin.edicom.com;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tAuxType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tAuxType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DOC"/&gt;
 *     &lt;enumeration value="INT"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tAuxType")
@XmlEnum
public enum TAuxType {

    DOC,
    INT,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static TAuxType fromValue(String v) {
        return valueOf(v);
    }

}
