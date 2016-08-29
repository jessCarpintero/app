
package ediwin.edicom.com;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tAuxClass.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tAuxClass"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ERR"/&gt;
 *     &lt;enumeration value="INF"/&gt;
 *     &lt;enumeration value="DATA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tAuxClass")
@XmlEnum
public enum TAuxClass {

    ERR,
    INF,
    DATA;

    public String value() {
        return name();
    }

    public static TAuxClass fromValue(String v) {
        return valueOf(v);
    }

}
