
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
 *         &lt;element name="wid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="supplierNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supplierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "wid",
    "supplierNo",
    "supplierName",
    "tel",
    "site"
})
@XmlRootElement(name = "IsFitServiceWare")
public class IsFitServiceWare {

    protected int wid;
    protected String supplierNo;
    protected String supplierName;
    protected String tel;
    protected String site;

    /**
     * ��ȡwid���Ե�ֵ��
     * 
     */
    public int getWid() {
        return wid;
    }

    /**
     * ����wid���Ե�ֵ��
     * 
     */
    public void setWid(int value) {
        this.wid = value;
    }

    /**
     * ��ȡsupplierNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierNo() {
        return supplierNo;
    }

    /**
     * ����supplierNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierNo(String value) {
        this.supplierNo = value;
    }

    /**
     * ��ȡsupplierName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * ����supplierName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierName(String value) {
        this.supplierName = value;
    }

    /**
     * ��ȡtel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel() {
        return tel;
    }

    /**
     * ����tel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel(String value) {
        this.tel = value;
    }

    /**
     * ��ȡsite���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite() {
        return site;
    }

    /**
     * ����site���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite(String value) {
        this.site = value;
    }

}
