
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>admin complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="admin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="op_pass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="op_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="op_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="op_pre" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="yn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="provious" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ordersee" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="showid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ji" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="qx" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="provi" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="quanxian" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PageIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Sort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecordCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "admin", propOrder = {
    "id",
    "opPass",
    "opCode",
    "opName",
    "opPre",
    "yn",
    "provious",
    "ordersee",
    "showid",
    "ji",
    "qx",
    "provi",
    "quanxian",
    "count",
    "pageIndex",
    "pageSize",
    "sort",
    "recordCount"
})
public class Admin {

    protected int id;
    @XmlElement(name = "op_pass")
    protected String opPass;
    @XmlElement(name = "op_code")
    protected String opCode;
    @XmlElement(name = "op_name")
    protected String opName;
    @XmlElement(name = "op_pre")
    protected int opPre;
    protected int yn;
    protected String provious;
    protected int ordersee;
    protected int showid;
    protected int ji;
    protected int qx;
    protected int provi;
    protected String quanxian;
    @XmlElement(name = "Count")
    protected int count;
    @XmlElement(name = "PageIndex")
    protected int pageIndex;
    @XmlElement(name = "PageSize")
    protected int pageSize;
    @XmlElement(name = "Sort")
    protected String sort;
    @XmlElement(name = "RecordCount")
    protected int recordCount;

    /**
     * 获取id属性的值。
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * 获取opPass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpPass() {
        return opPass;
    }

    /**
     * 设置opPass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpPass(String value) {
        this.opPass = value;
    }

    /**
     * 获取opCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpCode() {
        return opCode;
    }

    /**
     * 设置opCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpCode(String value) {
        this.opCode = value;
    }

    /**
     * 获取opName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpName() {
        return opName;
    }

    /**
     * 设置opName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpName(String value) {
        this.opName = value;
    }

    /**
     * 获取opPre属性的值。
     * 
     */
    public int getOpPre() {
        return opPre;
    }

    /**
     * 设置opPre属性的值。
     * 
     */
    public void setOpPre(int value) {
        this.opPre = value;
    }

    /**
     * 获取yn属性的值。
     * 
     */
    public int getYn() {
        return yn;
    }

    /**
     * 设置yn属性的值。
     * 
     */
    public void setYn(int value) {
        this.yn = value;
    }

    /**
     * 获取provious属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvious() {
        return provious;
    }

    /**
     * 设置provious属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvious(String value) {
        this.provious = value;
    }

    /**
     * 获取ordersee属性的值。
     * 
     */
    public int getOrdersee() {
        return ordersee;
    }

    /**
     * 设置ordersee属性的值。
     * 
     */
    public void setOrdersee(int value) {
        this.ordersee = value;
    }

    /**
     * 获取showid属性的值。
     * 
     */
    public int getShowid() {
        return showid;
    }

    /**
     * 设置showid属性的值。
     * 
     */
    public void setShowid(int value) {
        this.showid = value;
    }

    /**
     * 获取ji属性的值。
     * 
     */
    public int getJi() {
        return ji;
    }

    /**
     * 设置ji属性的值。
     * 
     */
    public void setJi(int value) {
        this.ji = value;
    }

    /**
     * 获取qx属性的值。
     * 
     */
    public int getQx() {
        return qx;
    }

    /**
     * 设置qx属性的值。
     * 
     */
    public void setQx(int value) {
        this.qx = value;
    }

    /**
     * 获取provi属性的值。
     * 
     */
    public int getProvi() {
        return provi;
    }

    /**
     * 设置provi属性的值。
     * 
     */
    public void setProvi(int value) {
        this.provi = value;
    }

    /**
     * 获取quanxian属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuanxian() {
        return quanxian;
    }

    /**
     * 设置quanxian属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuanxian(String value) {
        this.quanxian = value;
    }

    /**
     * 获取count属性的值。
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * 设置count属性的值。
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * 获取pageIndex属性的值。
     * 
     */
    public int getPageIndex() {
        return pageIndex;
    }

    /**
     * 设置pageIndex属性的值。
     * 
     */
    public void setPageIndex(int value) {
        this.pageIndex = value;
    }

    /**
     * 获取pageSize属性的值。
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * 设置pageSize属性的值。
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * 获取sort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSort() {
        return sort;
    }

    /**
     * 设置sort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSort(String value) {
        this.sort = value;
    }

    /**
     * 获取recordCount属性的值。
     * 
     */
    public int getRecordCount() {
        return recordCount;
    }

    /**
     * 设置recordCount属性的值。
     * 
     */
    public void setRecordCount(int value) {
        this.recordCount = value;
    }

}
