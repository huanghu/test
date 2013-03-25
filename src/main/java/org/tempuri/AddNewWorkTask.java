
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="sourceUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="institution" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sourceDepartment" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acceptInstitution" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="acceptDepartment" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "sourceUser",
    "sourceUserName",
    "pin",
    "institution",
    "sourceDepartment",
    "title",
    "contents",
    "acceptInstitution",
    "acceptDepartment",
    "mess"
})
@XmlRootElement(name = "AddNewWorkTask")
public class AddNewWorkTask {

    protected String sourceUser;
    protected String sourceUserName;
    protected String pin;
    protected int institution;
    protected int sourceDepartment;
    protected String title;
    protected String contents;
    protected int acceptInstitution;
    protected int acceptDepartment;
    protected String mess;

    /**
     * 获取sourceUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceUser() {
        return sourceUser;
    }

    /**
     * 设置sourceUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceUser(String value) {
        this.sourceUser = value;
    }

    /**
     * 获取sourceUserName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceUserName() {
        return sourceUserName;
    }

    /**
     * 设置sourceUserName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceUserName(String value) {
        this.sourceUserName = value;
    }

    /**
     * 获取pin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin() {
        return pin;
    }

    /**
     * 设置pin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin(String value) {
        this.pin = value;
    }

    /**
     * 获取institution属性的值。
     * 
     */
    public int getInstitution() {
        return institution;
    }

    /**
     * 设置institution属性的值。
     * 
     */
    public void setInstitution(int value) {
        this.institution = value;
    }

    /**
     * 获取sourceDepartment属性的值。
     * 
     */
    public int getSourceDepartment() {
        return sourceDepartment;
    }

    /**
     * 设置sourceDepartment属性的值。
     * 
     */
    public void setSourceDepartment(int value) {
        this.sourceDepartment = value;
    }

    /**
     * 获取title属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置title属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * 获取contents属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContents() {
        return contents;
    }

    /**
     * 设置contents属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContents(String value) {
        this.contents = value;
    }

    /**
     * 获取acceptInstitution属性的值。
     * 
     */
    public int getAcceptInstitution() {
        return acceptInstitution;
    }

    /**
     * 设置acceptInstitution属性的值。
     * 
     */
    public void setAcceptInstitution(int value) {
        this.acceptInstitution = value;
    }

    /**
     * 获取acceptDepartment属性的值。
     * 
     */
    public int getAcceptDepartment() {
        return acceptDepartment;
    }

    /**
     * 设置acceptDepartment属性的值。
     * 
     */
    public void setAcceptDepartment(int value) {
        this.acceptDepartment = value;
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
