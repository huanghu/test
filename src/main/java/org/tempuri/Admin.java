
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>admin complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡid���Ե�ֵ��
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * ��ȡopPass���Ե�ֵ��
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
     * ����opPass���Ե�ֵ��
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
     * ��ȡopCode���Ե�ֵ��
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
     * ����opCode���Ե�ֵ��
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
     * ��ȡopName���Ե�ֵ��
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
     * ����opName���Ե�ֵ��
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
     * ��ȡopPre���Ե�ֵ��
     * 
     */
    public int getOpPre() {
        return opPre;
    }

    /**
     * ����opPre���Ե�ֵ��
     * 
     */
    public void setOpPre(int value) {
        this.opPre = value;
    }

    /**
     * ��ȡyn���Ե�ֵ��
     * 
     */
    public int getYn() {
        return yn;
    }

    /**
     * ����yn���Ե�ֵ��
     * 
     */
    public void setYn(int value) {
        this.yn = value;
    }

    /**
     * ��ȡprovious���Ե�ֵ��
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
     * ����provious���Ե�ֵ��
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
     * ��ȡordersee���Ե�ֵ��
     * 
     */
    public int getOrdersee() {
        return ordersee;
    }

    /**
     * ����ordersee���Ե�ֵ��
     * 
     */
    public void setOrdersee(int value) {
        this.ordersee = value;
    }

    /**
     * ��ȡshowid���Ե�ֵ��
     * 
     */
    public int getShowid() {
        return showid;
    }

    /**
     * ����showid���Ե�ֵ��
     * 
     */
    public void setShowid(int value) {
        this.showid = value;
    }

    /**
     * ��ȡji���Ե�ֵ��
     * 
     */
    public int getJi() {
        return ji;
    }

    /**
     * ����ji���Ե�ֵ��
     * 
     */
    public void setJi(int value) {
        this.ji = value;
    }

    /**
     * ��ȡqx���Ե�ֵ��
     * 
     */
    public int getQx() {
        return qx;
    }

    /**
     * ����qx���Ե�ֵ��
     * 
     */
    public void setQx(int value) {
        this.qx = value;
    }

    /**
     * ��ȡprovi���Ե�ֵ��
     * 
     */
    public int getProvi() {
        return provi;
    }

    /**
     * ����provi���Ե�ֵ��
     * 
     */
    public void setProvi(int value) {
        this.provi = value;
    }

    /**
     * ��ȡquanxian���Ե�ֵ��
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
     * ����quanxian���Ե�ֵ��
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
     * ��ȡcount���Ե�ֵ��
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * ����count���Ե�ֵ��
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * ��ȡpageIndex���Ե�ֵ��
     * 
     */
    public int getPageIndex() {
        return pageIndex;
    }

    /**
     * ����pageIndex���Ե�ֵ��
     * 
     */
    public void setPageIndex(int value) {
        this.pageIndex = value;
    }

    /**
     * ��ȡpageSize���Ե�ֵ��
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * ����pageSize���Ե�ֵ��
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * ��ȡsort���Ե�ֵ��
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
     * ����sort���Ե�ֵ��
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
     * ��ȡrecordCount���Ե�ֵ��
     * 
     */
    public int getRecordCount() {
        return recordCount;
    }

    /**
     * ����recordCount���Ե�ֵ��
     * 
     */
    public void setRecordCount(int value) {
        this.recordCount = value;
    }

}
