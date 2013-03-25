
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>wareInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="wareInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="wname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shelfNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="snid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shsnid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gzsnid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wareInfo", propOrder = {
    "wid",
    "wname",
    "amount",
    "shelfNo",
    "snid",
    "shsnid",
    "gzsnid"
})
public class WareInfo {

    protected int wid;
    protected String wname;
    protected int amount;
    protected String shelfNo;
    protected String snid;
    protected String shsnid;
    protected String gzsnid;

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
     * ��ȡwname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWname() {
        return wname;
    }

    /**
     * ����wname���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWname(String value) {
        this.wname = value;
    }

    /**
     * ��ȡamount���Ե�ֵ��
     * 
     */
    public int getAmount() {
        return amount;
    }

    /**
     * ����amount���Ե�ֵ��
     * 
     */
    public void setAmount(int value) {
        this.amount = value;
    }

    /**
     * ��ȡshelfNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShelfNo() {
        return shelfNo;
    }

    /**
     * ����shelfNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShelfNo(String value) {
        this.shelfNo = value;
    }

    /**
     * ��ȡsnid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnid() {
        return snid;
    }

    /**
     * ����snid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnid(String value) {
        this.snid = value;
    }

    /**
     * ��ȡshsnid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShsnid() {
        return shsnid;
    }

    /**
     * ����shsnid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShsnid(String value) {
        this.shsnid = value;
    }

    /**
     * ��ȡgzsnid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGzsnid() {
        return gzsnid;
    }

    /**
     * ����gzsnid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGzsnid(String value) {
        this.gzsnid = value;
    }

}
