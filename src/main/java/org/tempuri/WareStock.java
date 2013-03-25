
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>wareStock complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="wareStock">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="storePrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="wid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="purchase" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="stock" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reserve" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="basestock" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="loweststock" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shelfNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Wname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BatchCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ShelfWhr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WareState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WinsDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wareStock", propOrder = {
    "storePrice",
    "wid",
    "remark",
    "rid",
    "purchase",
    "stock",
    "reserve",
    "basestock",
    "loweststock",
    "sid",
    "shelfNO",
    "wname",
    "batchCount",
    "area",
    "shelfWhr",
    "wareState",
    "winsDate"
})
public class WareStock {

    @XmlElement(required = true)
    protected BigDecimal storePrice;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer wid;
    @XmlElement(name = "Remark")
    protected String remark;
    protected int rid;
    protected int purchase;
    protected int stock;
    protected int reserve;
    protected int basestock;
    protected int loweststock;
    protected int sid;
    protected String shelfNO;
    @XmlElement(name = "Wname")
    protected String wname;
    @XmlElement(name = "BatchCount")
    protected int batchCount;
    @XmlElement(name = "Area")
    protected int area;
    @XmlElement(name = "ShelfWhr")
    protected int shelfWhr;
    @XmlElement(name = "WareState")
    protected int wareState;
    @XmlElement(name = "WinsDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar winsDate;

    /**
     * 获取storePrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStorePrice() {
        return storePrice;
    }

    /**
     * 设置storePrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStorePrice(BigDecimal value) {
        this.storePrice = value;
    }

    /**
     * 获取wid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWid() {
        return wid;
    }

    /**
     * 设置wid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWid(Integer value) {
        this.wid = value;
    }

    /**
     * 获取remark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置remark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * 获取rid属性的值。
     * 
     */
    public int getRid() {
        return rid;
    }

    /**
     * 设置rid属性的值。
     * 
     */
    public void setRid(int value) {
        this.rid = value;
    }

    /**
     * 获取purchase属性的值。
     * 
     */
    public int getPurchase() {
        return purchase;
    }

    /**
     * 设置purchase属性的值。
     * 
     */
    public void setPurchase(int value) {
        this.purchase = value;
    }

    /**
     * 获取stock属性的值。
     * 
     */
    public int getStock() {
        return stock;
    }

    /**
     * 设置stock属性的值。
     * 
     */
    public void setStock(int value) {
        this.stock = value;
    }

    /**
     * 获取reserve属性的值。
     * 
     */
    public int getReserve() {
        return reserve;
    }

    /**
     * 设置reserve属性的值。
     * 
     */
    public void setReserve(int value) {
        this.reserve = value;
    }

    /**
     * 获取basestock属性的值。
     * 
     */
    public int getBasestock() {
        return basestock;
    }

    /**
     * 设置basestock属性的值。
     * 
     */
    public void setBasestock(int value) {
        this.basestock = value;
    }

    /**
     * 获取loweststock属性的值。
     * 
     */
    public int getLoweststock() {
        return loweststock;
    }

    /**
     * 设置loweststock属性的值。
     * 
     */
    public void setLoweststock(int value) {
        this.loweststock = value;
    }

    /**
     * 获取sid属性的值。
     * 
     */
    public int getSid() {
        return sid;
    }

    /**
     * 设置sid属性的值。
     * 
     */
    public void setSid(int value) {
        this.sid = value;
    }

    /**
     * 获取shelfNO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShelfNO() {
        return shelfNO;
    }

    /**
     * 设置shelfNO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShelfNO(String value) {
        this.shelfNO = value;
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
     * 获取batchCount属性的值。
     * 
     */
    public int getBatchCount() {
        return batchCount;
    }

    /**
     * 设置batchCount属性的值。
     * 
     */
    public void setBatchCount(int value) {
        this.batchCount = value;
    }

    /**
     * 获取area属性的值。
     * 
     */
    public int getArea() {
        return area;
    }

    /**
     * 设置area属性的值。
     * 
     */
    public void setArea(int value) {
        this.area = value;
    }

    /**
     * 获取shelfWhr属性的值。
     * 
     */
    public int getShelfWhr() {
        return shelfWhr;
    }

    /**
     * 设置shelfWhr属性的值。
     * 
     */
    public void setShelfWhr(int value) {
        this.shelfWhr = value;
    }

    /**
     * 获取wareState属性的值。
     * 
     */
    public int getWareState() {
        return wareState;
    }

    /**
     * 设置wareState属性的值。
     * 
     */
    public void setWareState(int value) {
        this.wareState = value;
    }

    /**
     * 获取winsDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWinsDate() {
        return winsDate;
    }

    /**
     * 设置winsDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWinsDate(XMLGregorianCalendar value) {
        this.winsDate = value;
    }

}
