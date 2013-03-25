
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WareQita complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WareQita">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sku_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Wid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ABCType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WareTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TitleColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarePX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Wdis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shouhou" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lengths" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cid1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cid2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cid3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Service" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isPayFirst" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Cube" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="storeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WareQita", propOrder = {
    "skuId",
    "wid",
    "abcType",
    "wareTitle",
    "titleColor",
    "warePX",
    "wdis",
    "shouhou",
    "phone",
    "site",
    "lengths",
    "width",
    "height",
    "cid1",
    "cid2",
    "cid3",
    "service",
    "isPayFirst",
    "cube",
    "weight",
    "storeID"
})
public class WareQita {

    @XmlElement(name = "sku_id")
    protected String skuId;
    @XmlElement(name = "Wid")
    protected int wid;
    @XmlElement(name = "ABCType")
    protected int abcType;
    @XmlElement(name = "WareTitle")
    protected String wareTitle;
    @XmlElement(name = "TitleColor")
    protected String titleColor;
    @XmlElement(name = "WarePX")
    protected int warePX;
    @XmlElement(name = "Wdis")
    protected String wdis;
    protected String shouhou;
    protected String phone;
    protected String site;
    protected int lengths;
    protected int width;
    protected int height;
    protected int cid1;
    protected int cid2;
    protected int cid3;
    @XmlElement(name = "Service")
    protected String service;
    protected boolean isPayFirst;
    @XmlElement(name = "Cube")
    protected double cube;
    protected double weight;
    protected int storeID;

    /**
     * 获取skuId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkuId() {
        return skuId;
    }

    /**
     * 设置skuId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkuId(String value) {
        this.skuId = value;
    }

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
     * 获取abcType属性的值。
     * 
     */
    public int getABCType() {
        return abcType;
    }

    /**
     * 设置abcType属性的值。
     * 
     */
    public void setABCType(int value) {
        this.abcType = value;
    }

    /**
     * 获取wareTitle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWareTitle() {
        return wareTitle;
    }

    /**
     * 设置wareTitle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWareTitle(String value) {
        this.wareTitle = value;
    }

    /**
     * 获取titleColor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleColor() {
        return titleColor;
    }

    /**
     * 设置titleColor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleColor(String value) {
        this.titleColor = value;
    }

    /**
     * 获取warePX属性的值。
     * 
     */
    public int getWarePX() {
        return warePX;
    }

    /**
     * 设置warePX属性的值。
     * 
     */
    public void setWarePX(int value) {
        this.warePX = value;
    }

    /**
     * 获取wdis属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWdis() {
        return wdis;
    }

    /**
     * 设置wdis属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWdis(String value) {
        this.wdis = value;
    }

    /**
     * 获取shouhou属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShouhou() {
        return shouhou;
    }

    /**
     * 设置shouhou属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShouhou(String value) {
        this.shouhou = value;
    }

    /**
     * 获取phone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置phone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * 获取site属性的值。
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
     * 设置site属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite(String value) {
        this.site = value;
    }

    /**
     * 获取lengths属性的值。
     * 
     */
    public int getLengths() {
        return lengths;
    }

    /**
     * 设置lengths属性的值。
     * 
     */
    public void setLengths(int value) {
        this.lengths = value;
    }

    /**
     * 获取width属性的值。
     * 
     */
    public int getWidth() {
        return width;
    }

    /**
     * 设置width属性的值。
     * 
     */
    public void setWidth(int value) {
        this.width = value;
    }

    /**
     * 获取height属性的值。
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * 设置height属性的值。
     * 
     */
    public void setHeight(int value) {
        this.height = value;
    }

    /**
     * 获取cid1属性的值。
     * 
     */
    public int getCid1() {
        return cid1;
    }

    /**
     * 设置cid1属性的值。
     * 
     */
    public void setCid1(int value) {
        this.cid1 = value;
    }

    /**
     * 获取cid2属性的值。
     * 
     */
    public int getCid2() {
        return cid2;
    }

    /**
     * 设置cid2属性的值。
     * 
     */
    public void setCid2(int value) {
        this.cid2 = value;
    }

    /**
     * 获取cid3属性的值。
     * 
     */
    public int getCid3() {
        return cid3;
    }

    /**
     * 设置cid3属性的值。
     * 
     */
    public void setCid3(int value) {
        this.cid3 = value;
    }

    /**
     * 获取service属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * 设置service属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService(String value) {
        this.service = value;
    }

    /**
     * 获取isPayFirst属性的值。
     * 
     */
    public boolean isIsPayFirst() {
        return isPayFirst;
    }

    /**
     * 设置isPayFirst属性的值。
     * 
     */
    public void setIsPayFirst(boolean value) {
        this.isPayFirst = value;
    }

    /**
     * 获取cube属性的值。
     * 
     */
    public double getCube() {
        return cube;
    }

    /**
     * 设置cube属性的值。
     * 
     */
    public void setCube(double value) {
        this.cube = value;
    }

    /**
     * 获取weight属性的值。
     * 
     */
    public double getWeight() {
        return weight;
    }

    /**
     * 设置weight属性的值。
     * 
     */
    public void setWeight(double value) {
        this.weight = value;
    }

    /**
     * 获取storeID属性的值。
     * 
     */
    public int getStoreID() {
        return storeID;
    }

    /**
     * 设置storeID属性的值。
     * 
     */
    public void setStoreID(int value) {
        this.storeID = value;
    }

}
