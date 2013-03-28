
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WareQita complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡskuId���Ե�ֵ��
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
     * ����skuId���Ե�ֵ��
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
     * ��ȡabcType���Ե�ֵ��
     * 
     */
    public int getABCType() {
        return abcType;
    }

    /**
     * ����abcType���Ե�ֵ��
     * 
     */
    public void setABCType(int value) {
        this.abcType = value;
    }

    /**
     * ��ȡwareTitle���Ե�ֵ��
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
     * ����wareTitle���Ե�ֵ��
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
     * ��ȡtitleColor���Ե�ֵ��
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
     * ����titleColor���Ե�ֵ��
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
     * ��ȡwarePX���Ե�ֵ��
     * 
     */
    public int getWarePX() {
        return warePX;
    }

    /**
     * ����warePX���Ե�ֵ��
     * 
     */
    public void setWarePX(int value) {
        this.warePX = value;
    }

    /**
     * ��ȡwdis���Ե�ֵ��
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
     * ����wdis���Ե�ֵ��
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
     * ��ȡshouhou���Ե�ֵ��
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
     * ����shouhou���Ե�ֵ��
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
     * ��ȡphone���Ե�ֵ��
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
     * ����phone���Ե�ֵ��
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

    /**
     * ��ȡlengths���Ե�ֵ��
     * 
     */
    public int getLengths() {
        return lengths;
    }

    /**
     * ����lengths���Ե�ֵ��
     * 
     */
    public void setLengths(int value) {
        this.lengths = value;
    }

    /**
     * ��ȡwidth���Ե�ֵ��
     * 
     */
    public int getWidth() {
        return width;
    }

    /**
     * ����width���Ե�ֵ��
     * 
     */
    public void setWidth(int value) {
        this.width = value;
    }

    /**
     * ��ȡheight���Ե�ֵ��
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * ����height���Ե�ֵ��
     * 
     */
    public void setHeight(int value) {
        this.height = value;
    }

    /**
     * ��ȡcid1���Ե�ֵ��
     * 
     */
    public int getCid1() {
        return cid1;
    }

    /**
     * ����cid1���Ե�ֵ��
     * 
     */
    public void setCid1(int value) {
        this.cid1 = value;
    }

    /**
     * ��ȡcid2���Ե�ֵ��
     * 
     */
    public int getCid2() {
        return cid2;
    }

    /**
     * ����cid2���Ե�ֵ��
     * 
     */
    public void setCid2(int value) {
        this.cid2 = value;
    }

    /**
     * ��ȡcid3���Ե�ֵ��
     * 
     */
    public int getCid3() {
        return cid3;
    }

    /**
     * ����cid3���Ե�ֵ��
     * 
     */
    public void setCid3(int value) {
        this.cid3 = value;
    }

    /**
     * ��ȡservice���Ե�ֵ��
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
     * ����service���Ե�ֵ��
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
     * ��ȡisPayFirst���Ե�ֵ��
     * 
     */
    public boolean isIsPayFirst() {
        return isPayFirst;
    }

    /**
     * ����isPayFirst���Ե�ֵ��
     * 
     */
    public void setIsPayFirst(boolean value) {
        this.isPayFirst = value;
    }

    /**
     * ��ȡcube���Ե�ֵ��
     * 
     */
    public double getCube() {
        return cube;
    }

    /**
     * ����cube���Ե�ֵ��
     * 
     */
    public void setCube(double value) {
        this.cube = value;
    }

    /**
     * ��ȡweight���Ե�ֵ��
     * 
     */
    public double getWeight() {
        return weight;
    }

    /**
     * ����weight���Ե�ֵ��
     * 
     */
    public void setWeight(double value) {
        this.weight = value;
    }

    /**
     * ��ȡstoreID���Ե�ֵ��
     * 
     */
    public int getStoreID() {
        return storeID;
    }

    /**
     * ����storeID���Ե�ֵ��
     * 
     */
    public void setStoreID(int value) {
        this.storeID = value;
    }

}
