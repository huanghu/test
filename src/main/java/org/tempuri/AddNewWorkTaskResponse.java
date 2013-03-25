
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddNewWorkTaskResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "addNewWorkTaskResult",
    "mess"
})
@XmlRootElement(name = "AddNewWorkTaskResponse")
public class AddNewWorkTaskResponse {

    @XmlElement(name = "AddNewWorkTaskResult")
    protected boolean addNewWorkTaskResult;
    protected String mess;

    /**
     * 获取addNewWorkTaskResult属性的值。
     * 
     */
    public boolean isAddNewWorkTaskResult() {
        return addNewWorkTaskResult;
    }

    /**
     * 设置addNewWorkTaskResult属性的值。
     * 
     */
    public void setAddNewWorkTaskResult(boolean value) {
        this.addNewWorkTaskResult = value;
    }

    /**
     * 获取mess属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMess() {
        return mess;
    }

    /**
     * 设置mess属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMess(String value) {
        this.mess = value;
    }

}
