
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡsourceUser���Ե�ֵ��
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
     * ����sourceUser���Ե�ֵ��
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
     * ��ȡsourceUserName���Ե�ֵ��
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
     * ����sourceUserName���Ե�ֵ��
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
     * ��ȡpin���Ե�ֵ��
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
     * ����pin���Ե�ֵ��
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
     * ��ȡinstitution���Ե�ֵ��
     * 
     */
    public int getInstitution() {
        return institution;
    }

    /**
     * ����institution���Ե�ֵ��
     * 
     */
    public void setInstitution(int value) {
        this.institution = value;
    }

    /**
     * ��ȡsourceDepartment���Ե�ֵ��
     * 
     */
    public int getSourceDepartment() {
        return sourceDepartment;
    }

    /**
     * ����sourceDepartment���Ե�ֵ��
     * 
     */
    public void setSourceDepartment(int value) {
        this.sourceDepartment = value;
    }

    /**
     * ��ȡtitle���Ե�ֵ��
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
     * ����title���Ե�ֵ��
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
     * ��ȡcontents���Ե�ֵ��
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
     * ����contents���Ե�ֵ��
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
     * ��ȡacceptInstitution���Ե�ֵ��
     * 
     */
    public int getAcceptInstitution() {
        return acceptInstitution;
    }

    /**
     * ����acceptInstitution���Ե�ֵ��
     * 
     */
    public void setAcceptInstitution(int value) {
        this.acceptInstitution = value;
    }

    /**
     * ��ȡacceptDepartment���Ե�ֵ��
     * 
     */
    public int getAcceptDepartment() {
        return acceptDepartment;
    }

    /**
     * ����acceptDepartment���Ե�ֵ��
     * 
     */
    public void setAcceptDepartment(int value) {
        this.acceptDepartment = value;
    }

    /**
     * ��ȡmess���Ե�ֵ��
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
     * ����mess���Ե�ֵ��
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
