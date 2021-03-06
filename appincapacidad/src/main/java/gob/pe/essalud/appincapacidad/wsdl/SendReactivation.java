
package gob.pe.essalud.appincapacidad.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para sendReactivation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="sendReactivation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nroExpediente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "sendReactivation", propOrder = {
    "nroExpediente",
    "codUsuario",
    "terUsuario",
    "ipUsuario",
    "user",
    "pass"
})
public class SendReactivation {

    protected String nroExpediente;
    protected String codUsuario;
    protected String terUsuario;
    protected String ipUsuario;
    protected String user;
    protected String pass;

    /**
     * Obtiene el valor de la propiedad nroExpediente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroExpediente() {
        return nroExpediente;
    }

    /**
     * Define el valor de la propiedad nroExpediente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroExpediente(String value) {
        this.nroExpediente = value;
    }

    /**
     * Obtiene el valor de la propiedad codUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodUsuario() {
        return codUsuario;
    }

    /**
     * Define el valor de la propiedad codUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodUsuario(String value) {
        this.codUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad terUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerUsuario() {
        return terUsuario;
    }

    /**
     * Define el valor de la propiedad terUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerUsuario(String value) {
        this.terUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad ipUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpUsuario() {
        return ipUsuario;
    }

    /**
     * Define el valor de la propiedad ipUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpUsuario(String value) {
        this.ipUsuario = value;
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
