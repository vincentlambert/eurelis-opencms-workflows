//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1.6-7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.05.21 at 10:32:23 AM CEST 
//


package com.eurelis.opencms.workflows.jaxb.workflowpropertycontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{}parameters"/>
 *         &lt;element ref="{}associatedFiles"/>
 *         &lt;element ref="{}elements"/>
 *         &lt;element ref="{}allowedPeople"/>
 *       &lt;/choice>
 *       &lt;attribute name="workflowInstanceName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "parameters",
    "associatedFiles",
    "elements",
    "allowedPeople"
})
@XmlRootElement(name = "WorkflowPropertyContainer")
public class WorkflowPropertyContainer {

    protected Parameters parameters;
    protected AssociatedFiles associatedFiles;
    protected Elements elements;
    protected AllowedPeople allowedPeople;
    @XmlAttribute(required = true)
    protected String workflowInstanceName;

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link Parameters }
     *     
     */
    public Parameters getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parameters }
     *     
     */
    public void setParameters(Parameters value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the associatedFiles property.
     * 
     * @return
     *     possible object is
     *     {@link AssociatedFiles }
     *     
     */
    public AssociatedFiles getAssociatedFiles() {
        return associatedFiles;
    }

    /**
     * Sets the value of the associatedFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedFiles }
     *     
     */
    public void setAssociatedFiles(AssociatedFiles value) {
        this.associatedFiles = value;
    }

    /**
     * Gets the value of the elements property.
     * 
     * @return
     *     possible object is
     *     {@link Elements }
     *     
     */
    public Elements getElements() {
        return elements;
    }

    /**
     * Sets the value of the elements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Elements }
     *     
     */
    public void setElements(Elements value) {
        this.elements = value;
    }

    /**
     * Gets the value of the allowedPeople property.
     * 
     * @return
     *     possible object is
     *     {@link AllowedPeople }
     *     
     */
    public AllowedPeople getAllowedPeople() {
        return allowedPeople;
    }

    /**
     * Sets the value of the allowedPeople property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowedPeople }
     *     
     */
    public void setAllowedPeople(AllowedPeople value) {
        this.allowedPeople = value;
    }

    /**
     * Gets the value of the workflowInstanceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowInstanceName() {
        return workflowInstanceName;
    }

    /**
     * Sets the value of the workflowInstanceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowInstanceName(String value) {
        this.workflowInstanceName = value;
    }

}
