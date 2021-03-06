
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services.OptFileContentRequest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}OptFileContentRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request"
})
@XmlRootElement(name = "GetOptFileContent")
public class GetOptFileContent {

    @XmlElementRef(name = "request", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<OptFileContentRequest> request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OptFileContentRequest }{@code >}
     *     
     */
    public JAXBElement<OptFileContentRequest> getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OptFileContentRequest }{@code >}
     *     
     */
    public void setRequest(JAXBElement<OptFileContentRequest> value) {
        this.request = value;
    }

}
