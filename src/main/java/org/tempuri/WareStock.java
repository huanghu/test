
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>wareStock complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡstorePrice���Ե�ֵ��
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
     * ����storePrice���Ե�ֵ��
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
     * ��ȡwid���Ե�ֵ��
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
     * ����wid���Ե�ֵ��
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
     * ��ȡremark���Ե�ֵ��
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
     * ����remark���Ե�ֵ��
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
     * ��ȡrid���Ե�ֵ��
     * 
     */
    public int getRid() {
        return rid;
    }

    /**
     * ����rid���Ե�ֵ��
     * 
     */
    public void setRid(int value) {
        this.rid = value;
    }

    /**
     * ��ȡpurchase���Ե�ֵ��
     * 
     */
    public int getPurchase() {
        return purchase;
    }

    /**
     * ����purchase���Ե�ֵ��
     * 
     */
    public void setPurchase(int value) {
        this.purchase = value;
    }

    /**
     * ��ȡstock���Ե�ֵ��
     * 
     */
    public int getStock() {
        return stock;
    }

    /**
     * ����stock���Ե�ֵ��
     * 
     */
    public void setStock(int value) {
        this.stock = value;
    }

    /**
     * ��ȡreserve���Ե�ֵ��
     * 
     */
    public int getReserve() {
        return reserve;
    }

    /**
     * ����reserve���Ե�ֵ��
     * 
     */
    public void setReserve(int value) {
        this.reserve = value;
    }

    /**
     * ��ȡbasestock���Ե�ֵ��
     * 
     */
    public int getBasestock() {
        return basestock;
    }

    /**
     * ����basestock���Ե�ֵ��
     * 
     */
    public void setBasestock(int value) {
        this.basestock = value;
    }

    /**
     * ��ȡloweststock���Ե�ֵ��
     * 
     */
    public int getLoweststock() {
        return loweststock;
    }

    /**
     * ����loweststock���Ե�ֵ��
     * 
     */
    public void setLoweststock(int value) {
        this.loweststock = value;
    }

    /**
     * ��ȡsid���Ե�ֵ��
     * 
     */
    public int getSid() {
        return sid;
    }

    /**
     * ����sid���Ե�ֵ��
     * 
     */
    public void setSid(int value) {
        this.sid = value;
    }

    /**
     * ��ȡshelfNO���Ե�ֵ��
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
     * ����shelfNO���Ե�ֵ��
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
     * ��ȡbatchCount���Ե�ֵ��
     * 
     */
    public int getBatchCount() {
        return batchCount;
    }

    /**
     * ����batchCount���Ե�ֵ��
     * 
     */
    public void setBatchCount(int value) {
        this.batchCount = value;
    }

    /**
     * ��ȡarea���Ե�ֵ��
     * 
     */
    public int getArea() {
        return area;
    }

    /**
     * ����area���Ե�ֵ��
     * 
     */
    public void setArea(int value) {
        this.area = value;
    }

    /**
     * ��ȡshelfWhr���Ե�ֵ��
     * 
     */
    public int getShelfWhr() {
        return shelfWhr;
    }

    /**
     * ����shelfWhr���Ե�ֵ��
     * 
     */
    public void setShelfWhr(int value) {
        this.shelfWhr = value;
    }

    /**
     * ��ȡwareState���Ե�ֵ��
     * 
     */
    public int getWareState() {
        return wareState;
    }

    /**
     * ����wareState���Ե�ֵ��
     * 
     */
    public void setWareState(int value) {
        this.wareState = value;
    }

    /**
     * ��ȡwinsDate���Ե�ֵ��
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
     * ����winsDate���Ե�ֵ��
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
