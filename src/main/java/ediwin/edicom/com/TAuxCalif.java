
package ediwin.edicom.com;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tAuxCalif.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tAuxCalif"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *     &lt;enumeration value="INFO"/&gt;
 *     &lt;enumeration value="CONTROL"/&gt;
 *     &lt;enumeration value="GESTOR"/&gt;
 *     &lt;enumeration value="CRIPTO"/&gt;
 *     &lt;enumeration value="IECTE"/&gt;
 *     &lt;enumeration value="IERE"/&gt;
 *     &lt;enumeration value="PROFILE"/&gt;
 *     &lt;enumeration value="MOD"/&gt;
 *     &lt;enumeration value="AUDIT"/&gt;
 *     &lt;enumeration value="NOTA"/&gt;
 *     &lt;enumeration value="MAP"/&gt;
 *     &lt;enumeration value="TRO"/&gt;
 *     &lt;enumeration value="REP"/&gt;
 *     &lt;enumeration value="VAL"/&gt;
 *     &lt;enumeration value="GDSN"/&gt;
 *     &lt;enumeration value="DUP"/&gt;
 *     &lt;enumeration value="INTEG"/&gt;
 *     &lt;enumeration value="POS"/&gt;
 *     &lt;enumeration value="ERRDOC"/&gt;
 *     &lt;enumeration value="CRIPTO_INFODOC"/&gt;
 *     &lt;enumeration value="CRIPTO_ERRDOC"/&gt;
 *     &lt;enumeration value="INPROCCESS"/&gt;
 *     &lt;enumeration value="ASINC"/&gt;
 *     &lt;enumeration value="ASINC_NEW"/&gt;
 *     &lt;enumeration value="ASINC_EXE"/&gt;
 *     &lt;enumeration value="ASINC_END"/&gt;
 *     &lt;enumeration value="ASINC_NUMBER"/&gt;
 *     &lt;enumeration value="META_ATTACHMENT"/&gt;
 *     &lt;enumeration value="META_FIC"/&gt;
 *     &lt;enumeration value="META_LOG"/&gt;
 *     &lt;enumeration value="META_ACC"/&gt;
 *     &lt;enumeration value="META_TTC"/&gt;
 *     &lt;enumeration value="META_RESVAL"/&gt;
 *     &lt;enumeration value="META_VALIDADOR"/&gt;
 *     &lt;enumeration value="META_CRIPTO_LOG"/&gt;
 *     &lt;enumeration value="META_CRIPTO_SVUCEM"/&gt;
 *     &lt;enumeration value="META_CRIPTO_SSII_ENV"/&gt;
 *     &lt;enumeration value="META_CRIPTO_SNFSE"/&gt;
 *     &lt;enumeration value="META_NFSE_ENVHOR"/&gt;
 *     &lt;enumeration value="META_NFSE_ENVCUR"/&gt;
 *     &lt;enumeration value="META_NFSE_LOTCAM"/&gt;
 *     &lt;enumeration value="META_NFSE_RESPENV"/&gt;
 *     &lt;enumeration value="META_DGI_ACKCFE"/&gt;
 *     &lt;enumeration value="META_DGI_ENVCFE"/&gt;
 *     &lt;enumeration value="META_DGI_ACKSOBRE"/&gt;
 *     &lt;enumeration value="META_EMPRESAS_CFE"/&gt;
 *     &lt;enumeration value="META_SUNAT_FIRMA"/&gt;
 *     &lt;enumeration value="META_FUENTE_DTE"/&gt;
 *     &lt;enumeration value="META_SRI_AUT"/&gt;
 *     &lt;enumeration value="META_SGECO"/&gt;
 *     &lt;enumeration value="META_SAFT"/&gt;
 *     &lt;enumeration value="META_SOAP_REQUEST"/&gt;
 *     &lt;enumeration value="META_SOAP_RESPONSE"/&gt;
 *     &lt;enumeration value="META_SOAP_AMBOS"/&gt;
 *     &lt;enumeration value="META_DOCTO"/&gt;
 *     &lt;enumeration value="TRANSMITCODE"/&gt;
 *     &lt;enumeration value="TRUSTEDORIGIN"/&gt;
 *     &lt;enumeration value="EBIPUBINFO"/&gt;
 *     &lt;enumeration value="EBIPUBID"/&gt;
 *     &lt;enumeration value="REFGRUPO"/&gt;
 *     &lt;enumeration value="OBSLIT"/&gt;
 *     &lt;enumeration value="SIN_CODIGO"/&gt;
 *     &lt;enumeration value="SIN_NUMAUT"/&gt;
 *     &lt;enumeration value="RCANCELA"/&gt;
 *     &lt;enumeration value="SHA1RSA"/&gt;
 *     &lt;enumeration value="SAFT_TOSIGN"/&gt;
 *     &lt;enumeration value="SAFT_RESPONSECWS"/&gt;
 *     &lt;enumeration value="SAFT_RESPONSEWS"/&gt;
 *     &lt;enumeration value="DATA_RESPONSE"/&gt;
 *     &lt;enumeration value="CERTIFICATE"/&gt;
 *     &lt;enumeration value="CERTIFICATEVER"/&gt;
 *     &lt;enumeration value="FECSITBOR"/&gt;
 *     &lt;enumeration value="HASHINT"/&gt;
 *     &lt;enumeration value="SOURCEENCODING"/&gt;
 *     &lt;enumeration value="HASHDOC"/&gt;
 *     &lt;enumeration value="CONTENTENCODING"/&gt;
 *     &lt;enumeration value="SERIALNUMBER"/&gt;
 *     &lt;enumeration value="PASO_VOLUMEN"/&gt;
 *     &lt;enumeration value="COMPARA_VOLUMEN"/&gt;
 *     &lt;enumeration value="REF_ST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tAuxCalif")
@XmlEnum
public enum TAuxCalif {

    ERROR("ERROR"),
    INFO("INFO"),
    CONTROL("CONTROL"),
    GESTOR("GESTOR"),
    CRIPTO("CRIPTO"),
    IECTE("IECTE"),
    IERE("IERE"),
    PROFILE("PROFILE"),
    MOD("MOD"),
    AUDIT("AUDIT"),
    NOTA("NOTA"),
    MAP("MAP"),
    TRO("TRO"),
    REP("REP"),
    VAL("VAL"),
    GDSN("GDSN"),
    DUP("DUP"),
    INTEG("INTEG"),
    POS("POS"),
    ERRDOC("ERRDOC"),
    CRIPTO_INFODOC("CRIPTO_INFODOC"),
    CRIPTO_ERRDOC("CRIPTO_ERRDOC"),
    INPROCCESS("INPROCCESS"),
    ASINC("ASINC"),
    ASINC_NEW("ASINC_NEW"),
    ASINC_EXE("ASINC_EXE"),
    ASINC_END("ASINC_END"),
    ASINC_NUMBER("ASINC_NUMBER"),
    META_ATTACHMENT("META_ATTACHMENT"),
    META_FIC("META_FIC"),
    META_LOG("META_LOG"),
    META_ACC("META_ACC"),
    META_TTC("META_TTC"),
    META_RESVAL("META_RESVAL"),
    META_VALIDADOR("META_VALIDADOR"),
    META_CRIPTO_LOG("META_CRIPTO_LOG"),
    META_CRIPTO_SVUCEM("META_CRIPTO_SVUCEM"),
    META_CRIPTO_SSII_ENV("META_CRIPTO_SSII_ENV"),
    META_CRIPTO_SNFSE("META_CRIPTO_SNFSE"),
    META_NFSE_ENVHOR("META_NFSE_ENVHOR"),
    META_NFSE_ENVCUR("META_NFSE_ENVCUR"),
    META_NFSE_LOTCAM("META_NFSE_LOTCAM"),
    META_NFSE_RESPENV("META_NFSE_RESPENV"),
    META_DGI_ACKCFE("META_DGI_ACKCFE"),
    META_DGI_ENVCFE("META_DGI_ENVCFE"),
    META_DGI_ACKSOBRE("META_DGI_ACKSOBRE"),
    META_EMPRESAS_CFE("META_EMPRESAS_CFE"),
    META_SUNAT_FIRMA("META_SUNAT_FIRMA"),
    META_FUENTE_DTE("META_FUENTE_DTE"),
    META_SRI_AUT("META_SRI_AUT"),
    META_SGECO("META_SGECO"),
    META_SAFT("META_SAFT"),
    META_SOAP_REQUEST("META_SOAP_REQUEST"),
    META_SOAP_RESPONSE("META_SOAP_RESPONSE"),
    META_SOAP_AMBOS("META_SOAP_AMBOS"),
    META_DOCTO("META_DOCTO"),
    TRANSMITCODE("TRANSMITCODE"),
    TRUSTEDORIGIN("TRUSTEDORIGIN"),
    EBIPUBINFO("EBIPUBINFO"),
    EBIPUBID("EBIPUBID"),
    REFGRUPO("REFGRUPO"),
    OBSLIT("OBSLIT"),
    SIN_CODIGO("SIN_CODIGO"),
    SIN_NUMAUT("SIN_NUMAUT"),
    RCANCELA("RCANCELA"),
    @XmlEnumValue("SHA1RSA")
    SHA_1_RSA("SHA1RSA"),
    SAFT_TOSIGN("SAFT_TOSIGN"),
    SAFT_RESPONSECWS("SAFT_RESPONSECWS"),
    SAFT_RESPONSEWS("SAFT_RESPONSEWS"),
    DATA_RESPONSE("DATA_RESPONSE"),
    CERTIFICATE("CERTIFICATE"),
    CERTIFICATEVER("CERTIFICATEVER"),
    FECSITBOR("FECSITBOR"),
    HASHINT("HASHINT"),
    SOURCEENCODING("SOURCEENCODING"),
    HASHDOC("HASHDOC"),
    CONTENTENCODING("CONTENTENCODING"),
    SERIALNUMBER("SERIALNUMBER"),
    PASO_VOLUMEN("PASO_VOLUMEN"),
    COMPARA_VOLUMEN("COMPARA_VOLUMEN"),
    REF_ST("REF_ST");
    private final String value;

    TAuxCalif(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TAuxCalif fromValue(String v) {
        for (TAuxCalif c: TAuxCalif.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
