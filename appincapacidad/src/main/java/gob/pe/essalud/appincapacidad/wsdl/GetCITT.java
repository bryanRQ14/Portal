
package gob.pe.essalud.appincapacidad.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetCITT complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetCITT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpdoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nrdoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tpSubsidio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCITT", propOrder = {
    "tpdoc",
    "nrdoc",
    "tpSubsidio",
    "user",
    "pass"
})
public class GetCITT {

    protected String tpdoc;
    protected String nrdoc;
    protected String tpSubsidio;
    protected String user;
    protected String pass;

    /**
     * Obtiene el valor de la propiedad tpdoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpdoc() {
        return tpdoc;
    }

    /**
     * Define el valor de la propiedad tpdoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpdoc(String value) {
        this.tpdoc = value;
    }

    /**
     * Obtiene el valor de la propiedad nrdoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrdoc() {
        return nrdoc;
    }

    /**
     * Define el valor de la propiedad nrdoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrdoc(String value) {
        this.nrdoc = value;
    }

    /**
     * Obtiene el valor de la propiedad tpSubsidio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpSubsidio() {
        return tpSubsidio;
    }

    /**
     * Define el valor de la propiedad tpSubsidio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpSubsidio(String value) {
        this.tpSubsidio = value;
    }

    /**
     * Obtiene el valor de la propiedad user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Define el valor de la propiedad user.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Obtiene el valor de la propiedad pass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPass() {
        return pass;
    }

    /**
     * Define el valor de la propiedad pass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPass(String value) {
        this.pass = value;
    }

}
