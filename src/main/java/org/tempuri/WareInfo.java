
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>wareInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取wid属性的值。
     * 
     */
    public int getWid() {
        return wid;
    }

    /**
     * 设置wid属性的值。
     * 
     */
    public void setWid(int value) {
        this.wid = value;
    }

    /**
     * 获取wname属性的值。
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
     * 设置wname属性的值。
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
     * 获取amount属性的值。
     * 
     */
    public int getAmount() {
        return amount;
    }

    /**
     * 设置amount属性的值。
     * 
     */
    public void setAmount(int value) {
        this.amount = value;
    }

    /**
     * 获取shelfNo属性的值。
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
     * 设置shelfNo属性的值。
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
     * 获取snid属性的值。
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
     * 设置snid属性的值。
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
     * 获取shsnid属性的值。
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
     * 设置shsnid属性的值。
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
     * 获取gzsnid属性的值。
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
     * 设置gzsnid属性的值。
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
