//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.18 at 03:57:48 PM BRST 
//


package com.ibm.wmb.monitor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for ApplicationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="simpleContent" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="targetNamespace" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="dataType" use="required" type="{http://www.ibm.com/xmlns/prod/websphere/messagebroker/6.1.0/monitoring/event}simpleContentDataType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="complexContent" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='skip'/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="elementName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="targetNamespace" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationData", propOrder = {
    "simpleContent",
    "complexContent"
})
public class ApplicationData {

    protected List<ApplicationData.SimpleContent> simpleContent;
    protected List<ApplicationData.ComplexContent> complexContent;

    /**
     * Gets the value of the simpleContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simpleContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimpleContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationData.SimpleContent }
     * 
     * 
     */
    public List<ApplicationData.SimpleContent> getSimpleContent() {
        if (simpleContent == null) {
            simpleContent = new ArrayList<ApplicationData.SimpleContent>();
        }
        return this.simpleContent;
    }

    /**
     * Gets the value of the complexContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the complexContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComplexContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationData.ComplexContent }
     * 
     * 
     */
    public List<ApplicationData.ComplexContent> getComplexContent() {
        if (complexContent == null) {
            complexContent = new ArrayList<ApplicationData.ComplexContent>();
        }
        return this.complexContent;
    }


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
     *         &lt;any processContents='skip'/>
     *       &lt;/sequence>
     *       &lt;attribute name="elementName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="targetNamespace" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class ComplexContent {

        @XmlAnyElement
        protected Element any;
        @XmlAttribute(name = "elementName", namespace = "http://www.ibm.com/xmlns/prod/websphere/messagebroker/6.1.0/monitoring/event", required = true)
        protected String elementName;
        @XmlAttribute(name = "targetNamespace", namespace = "http://www.ibm.com/xmlns/prod/websphere/messagebroker/6.1.0/monitoring/event")
        protected String targetNamespace;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Element }
         *     
         */
        public Element getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Element }
         *     
         */
        public void setAny(Element value) {
            this.any = value;
        }

        /**
         * Gets the value of the elementName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getElementName() {
            return elementName;
        }

        /**
         * Sets the value of the elementName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setElementName(String value) {
            this.elementName = value;
        }

        /**
         * Gets the value of the targetNamespace property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTargetNamespace() {
            return targetNamespace;
        }

        /**
         * Sets the value of the targetNamespace property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTargetNamespace(String value) {
            this.targetNamespace = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="targetNamespace" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="dataType" use="required" type="{http://www.ibm.com/xmlns/prod/websphere/messagebroker/6.1.0/monitoring/event}simpleContentDataType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SimpleContent {

        @XmlAttribute(name = "name", namespace = "http://www.ibm.com/xmlns/prod/websphere/messagebroker/6.1.0/monitoring/event", required = true)
        protected String name;
        @XmlAttribute(name = "value", namespace = "http://www.ibm.com/xmlns/prod/websphere/messagebroker/6.1.0/monitoring/event", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String value;
        @XmlAttribute(name = "targetNamespace", namespace = "http://www.ibm.com/xmlns/prod/websphere/messagebroker/6.1.0/monitoring/event")
        protected String targetNamespace;
        @XmlAttribute(name = "dataType", namespace = "http://www.ibm.com/xmlns/prod/websphere/messagebroker/6.1.0/monitoring/event", required = true)
        protected SimpleContentDataType dataType;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the targetNamespace property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTargetNamespace() {
            return targetNamespace;
        }

        /**
         * Sets the value of the targetNamespace property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTargetNamespace(String value) {
            this.targetNamespace = value;
        }

        /**
         * Gets the value of the dataType property.
         * 
         * @return
         *     possible object is
         *     {@link SimpleContentDataType }
         *     
         */
        public SimpleContentDataType getDataType() {
            return dataType;
        }

        /**
         * Sets the value of the dataType property.
         * 
         * @param value
         *     allowed object is
         *     {@link SimpleContentDataType }
         *     
         */
        public void setDataType(SimpleContentDataType value) {
            this.dataType = value;
        }

    }

}