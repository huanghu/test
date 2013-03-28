
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Ware complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Ware">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompareNewegg" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CompareYixun" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CompareAmazon" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="wareQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sku_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageurl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Wid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wareid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="warejia" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="daima" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpbm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dmbs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bilv" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="zpbl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gzstatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Wname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WPid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="wpid2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="wpidstate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Wdis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WReadMe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Wstart" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Wpack" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Wweight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Wpostage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Warea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Wfacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WMaprice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="WMeprice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="WlkNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WbuNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WSmimgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WSmimgPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WinsDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="WUpDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="WinsPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WupPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Wyn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Wst" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Weval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Wserve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autoid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Wreprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Wtshing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Wtshingrmark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zpsm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hcsm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="superprice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="wstate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="superremark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shstore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jifen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cut_price" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="allnum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="adddate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="snid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grade" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="beique" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gzque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shhque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caigou" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ccity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cnumb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shangjia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="swkc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="swrc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rcts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kcts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ps" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dhkc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="zgskc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shkc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shph" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bjph" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gzph" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shx" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fprice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="shangg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rcts15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="swrc15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="balimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bjzd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gzzd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cdbk" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cdzd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cgcity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxpurchqty" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bjcg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shcg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gzcg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gzsnid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shsnid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdsnid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ware", propOrder = {
    "compareNewegg",
    "compareYixun",
    "compareAmazon",
    "wareQD",
    "skuId",
    "imageurl",
    "wid",
    "wareid",
    "warejia",
    "daima",
    "cpbm",
    "dmbs",
    "bilv",
    "zpbl",
    "wStatus",
    "gzstatus",
    "wname",
    "wPid",
    "wpid2",
    "wpidstate",
    "wdis",
    "wReadMe",
    "wstart",
    "wpack",
    "wweight",
    "wpostage",
    "warea",
    "wfacturer",
    "wMaprice",
    "wMeprice",
    "wlkNum",
    "wbuNum",
    "wSmimgName",
    "wSmimgPath",
    "winsDate",
    "wUpDate",
    "winsPerson",
    "wupPerson",
    "wyn",
    "wst",
    "weval",
    "wserve",
    "autoid",
    "wreprice",
    "wtshing",
    "wtshingrmark",
    "zpsm",
    "hcsm",
    "superprice",
    "wstate",
    "superremark",
    "shstore",
    "jifen",
    "cutPrice",
    "allnum",
    "adddate",
    "snid",
    "grade",
    "beique",
    "gzque",
    "shhque",
    "caigou",
    "ccity",
    "cnumb",
    "shangjia",
    "showid",
    "swkc",
    "swrc",
    "rcts",
    "kcts",
    "ps",
    "dhkc",
    "zgskc",
    "shkc",
    "shph",
    "bjph",
    "gzph",
    "shx",
    "fprice",
    "shangg",
    "rcts15",
    "swrc15",
    "proser",
    "balimit",
    "bjzd",
    "gzzd",
    "cdbk",
    "cdzd",
    "shef",
    "cgcity",
    "maxpurchqty",
    "bjcg",
    "shcg",
    "gzcg",
    "gzsnid",
    "shsnid",
    "cdsnid"
})
public class Ware {

    @XmlElement(name = "CompareNewegg", required = true)
    protected BigDecimal compareNewegg;
    @XmlElement(name = "CompareYixun", required = true)
    protected BigDecimal compareYixun;
    @XmlElement(name = "CompareAmazon", required = true)
    protected BigDecimal compareAmazon;
    protected String wareQD;
    @XmlElement(name = "sku_id")
    protected String skuId;
    protected String imageurl;
    @XmlElement(name = "Wid")
    protected String wid;
    protected String wareid;
    @XmlElement(required = true)
    protected BigDecimal warejia;
    protected String daima;
    protected String cpbm;
    protected int dmbs;
    protected int bilv;
    protected int zpbl;
    @XmlElement(name = "WStatus")
    protected int wStatus;
    protected int gzstatus;
    @XmlElement(name = "Wname")
    protected String wname;
    @XmlElement(name = "WPid")
    protected int wPid;
    protected int wpid2;
    protected int wpidstate;
    @XmlElement(name = "Wdis")
    protected String wdis;
    @XmlElement(name = "WReadMe")
    protected String wReadMe;
    @XmlElement(name = "Wstart")
    protected int wstart;
    @XmlElement(name = "Wpack")
    protected String wpack;
    @XmlElement(name = "Wweight")
    protected String wweight;
    @XmlElement(name = "Wpostage")
    protected String wpostage;
    @XmlElement(name = "Warea")
    protected String warea;
    @XmlElement(name = "Wfacturer")
    protected String wfacturer;
    @XmlElement(name = "WMaprice", required = true)
    protected BigDecimal wMaprice;
    @XmlElement(name = "WMeprice", required = true)
    protected BigDecimal wMeprice;
    @XmlElement(name = "WlkNum")
    protected int wlkNum;
    @XmlElement(name = "WbuNum")
    protected int wbuNum;
    @XmlElement(name = "WSmimgName")
    protected String wSmimgName;
    @XmlElement(name = "WSmimgPath")
    protected String wSmimgPath;
    @XmlElement(name = "WinsDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar winsDate;
    @XmlElement(name = "WUpDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar wUpDate;
    @XmlElement(name = "WinsPerson")
    protected String winsPerson;
    @XmlElement(name = "WupPerson")
    protected String wupPerson;
    @XmlElement(name = "Wyn")
    protected int wyn;
    @XmlElement(name = "Wst")
    protected int wst;
    @XmlElement(name = "Weval")
    protected String weval;
    @XmlElement(name = "Wserve")
    protected String wserve;
    protected int autoid;
    @XmlElement(name = "Wreprice")
    protected String wreprice;
    @XmlElement(name = "Wtshing")
    protected String wtshing;
    @XmlElement(name = "Wtshingrmark")
    protected String wtshingrmark;
    protected String zpsm;
    protected String hcsm;
    @XmlElement(required = true)
    protected BigDecimal superprice;
    protected int wstate;
    protected String superremark;
    protected String shstore;
    protected int jifen;
    @XmlElement(name = "cut_price", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cutPrice;
    protected int allnum;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar adddate;
    protected String snid;
    protected int grade;
    protected String beique;
    protected String gzque;
    protected String shhque;
    protected int caigou;
    protected int ccity;
    protected int cnumb;
    protected String shangjia;
    protected int showid;
    protected String swkc;
    protected String swrc;
    protected String rcts;
    protected String kcts;
    protected int ps;
    protected int dhkc;
    protected int zgskc;
    protected int shkc;
    protected int shph;
    protected int bjph;
    protected int gzph;
    protected int shx;
    @XmlElement(required = true)
    protected BigDecimal fprice;
    protected int shangg;
    protected String rcts15;
    protected String swrc15;
    protected String proser;
    protected String balimit;
    protected int bjzd;
    protected int gzzd;
    protected int cdbk;
    protected int cdzd;
    protected String shef;
    protected String cgcity;
    protected int maxpurchqty;
    protected int bjcg;
    protected int shcg;
    protected int gzcg;
    protected String gzsnid;
    protected String shsnid;
    protected String cdsnid;

    /**
     * 获取compareNewegg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCompareNewegg() {
        return compareNewegg;
    }

    /**
     * 设置compareNewegg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCompareNewegg(BigDecimal value) {
        this.compareNewegg = value;
    }

    /**
     * 获取compareYixun属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCompareYixun() {
        return compareYixun;
    }

    /**
     * 设置compareYixun属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCompareYixun(BigDecimal value) {
        this.compareYixun = value;
    }

    /**
     * 获取compareAmazon属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCompareAmazon() {
        return compareAmazon;
    }

    /**
     * 设置compareAmazon属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCompareAmazon(BigDecimal value) {
        this.compareAmazon = value;
    }

    /**
     * 获取wareQD属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWareQD() {
        return wareQD;
    }

    /**
     * 设置wareQD属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWareQD(String value) {
        this.wareQD = value;
    }

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
     * 获取imageurl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageurl() {
        return imageurl;
    }

    /**
     * 设置imageurl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageurl(String value) {
        this.imageurl = value;
    }

    /**
     * 获取wid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWid() {
        return wid;
    }

    /**
     * 设置wid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWid(String value) {
        this.wid = value;
    }

    /**
     * 获取wareid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWareid() {
        return wareid;
    }

    /**
     * 设置wareid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWareid(String value) {
        this.wareid = value;
    }

    /**
     * 获取warejia属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWarejia() {
        return warejia;
    }

    /**
     * 设置warejia属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWarejia(BigDecimal value) {
        this.warejia = value;
    }

    /**
     * 获取daima属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaima() {
        return daima;
    }

    /**
     * 设置daima属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaima(String value) {
        this.daima = value;
    }

    /**
     * 获取cpbm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpbm() {
        return cpbm;
    }

    /**
     * 设置cpbm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpbm(String value) {
        this.cpbm = value;
    }

    /**
     * 获取dmbs属性的值。
     * 
     */
    public int getDmbs() {
        return dmbs;
    }

    /**
     * 设置dmbs属性的值。
     * 
     */
    public void setDmbs(int value) {
        this.dmbs = value;
    }

    /**
     * 获取bilv属性的值。
     * 
     */
    public int getBilv() {
        return bilv;
    }

    /**
     * 设置bilv属性的值。
     * 
     */
    public void setBilv(int value) {
        this.bilv = value;
    }

    /**
     * 获取zpbl属性的值。
     * 
     */
    public int getZpbl() {
        return zpbl;
    }

    /**
     * 设置zpbl属性的值。
     * 
     */
    public void setZpbl(int value) {
        this.zpbl = value;
    }

    /**
     * 获取wStatus属性的值。
     * 
     */
    public int getWStatus() {
        return wStatus;
    }

    /**
     * 设置wStatus属性的值。
     * 
     */
    public void setWStatus(int value) {
        this.wStatus = value;
    }

    /**
     * 获取gzstatus属性的值。
     * 
     */
    public int getGzstatus() {
        return gzstatus;
    }

    /**
     * 设置gzstatus属性的值。
     * 
     */
    public void setGzstatus(int value) {
        this.gzstatus = value;
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
     * 获取wPid属性的值。
     * 
     */
    public int getWPid() {
        return wPid;
    }

    /**
     * 设置wPid属性的值。
     * 
     */
    public void setWPid(int value) {
        this.wPid = value;
    }

    /**
     * 获取wpid2属性的值。
     * 
     */
    public int getWpid2() {
        return wpid2;
    }

    /**
     * 设置wpid2属性的值。
     * 
     */
    public void setWpid2(int value) {
        this.wpid2 = value;
    }

    /**
     * 获取wpidstate属性的值。
     * 
     */
    public int getWpidstate() {
        return wpidstate;
    }

    /**
     * 设置wpidstate属性的值。
     * 
     */
    public void setWpidstate(int value) {
        this.wpidstate = value;
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
     * 获取wReadMe属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWReadMe() {
        return wReadMe;
    }

    /**
     * 设置wReadMe属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWReadMe(String value) {
        this.wReadMe = value;
    }

    /**
     * 获取wstart属性的值。
     * 
     */
    public int getWstart() {
        return wstart;
    }

    /**
     * 设置wstart属性的值。
     * 
     */
    public void setWstart(int value) {
        this.wstart = value;
    }

    /**
     * 获取wpack属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWpack() {
        return wpack;
    }

    /**
     * 设置wpack属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWpack(String value) {
        this.wpack = value;
    }

    /**
     * 获取wweight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWweight() {
        return wweight;
    }

    /**
     * 设置wweight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWweight(String value) {
        this.wweight = value;
    }

    /**
     * 获取wpostage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWpostage() {
        return wpostage;
    }

    /**
     * 设置wpostage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWpostage(String value) {
        this.wpostage = value;
    }

    /**
     * 获取warea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarea() {
        return warea;
    }

    /**
     * 设置warea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarea(String value) {
        this.warea = value;
    }

    /**
     * 获取wfacturer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWfacturer() {
        return wfacturer;
    }

    /**
     * 设置wfacturer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWfacturer(String value) {
        this.wfacturer = value;
    }

    /**
     * 获取wMaprice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWMaprice() {
        return wMaprice;
    }

    /**
     * 设置wMaprice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWMaprice(BigDecimal value) {
        this.wMaprice = value;
    }

    /**
     * 获取wMeprice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWMeprice() {
        return wMeprice;
    }

    /**
     * 设置wMeprice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWMeprice(BigDecimal value) {
        this.wMeprice = value;
    }

    /**
     * 获取wlkNum属性的值。
     * 
     */
    public int getWlkNum() {
        return wlkNum;
    }

    /**
     * 设置wlkNum属性的值。
     * 
     */
    public void setWlkNum(int value) {
        this.wlkNum = value;
    }

    /**
     * 获取wbuNum属性的值。
     * 
     */
    public int getWbuNum() {
        return wbuNum;
    }

    /**
     * 设置wbuNum属性的值。
     * 
     */
    public void setWbuNum(int value) {
        this.wbuNum = value;
    }

    /**
     * 获取wSmimgName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWSmimgName() {
        return wSmimgName;
    }

    /**
     * 设置wSmimgName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWSmimgName(String value) {
        this.wSmimgName = value;
    }

    /**
     * 获取wSmimgPath属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWSmimgPath() {
        return wSmimgPath;
    }

    /**
     * 设置wSmimgPath属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWSmimgPath(String value) {
        this.wSmimgPath = value;
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

    /**
     * 获取wUpDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWUpDate() {
        return wUpDate;
    }

    /**
     * 设置wUpDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWUpDate(XMLGregorianCalendar value) {
        this.wUpDate = value;
    }

    /**
     * 获取winsPerson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWinsPerson() {
        return winsPerson;
    }

    /**
     * 设置winsPerson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWinsPerson(String value) {
        this.winsPerson = value;
    }

    /**
     * 获取wupPerson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWupPerson() {
        return wupPerson;
    }

    /**
     * 设置wupPerson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWupPerson(String value) {
        this.wupPerson = value;
    }

    /**
     * 获取wyn属性的值。
     * 
     */
    public int getWyn() {
        return wyn;
    }

    /**
     * 设置wyn属性的值。
     * 
     */
    public void setWyn(int value) {
        this.wyn = value;
    }

    /**
     * 获取wst属性的值。
     * 
     */
    public int getWst() {
        return wst;
    }

    /**
     * 设置wst属性的值。
     * 
     */
    public void setWst(int value) {
        this.wst = value;
    }

    /**
     * 获取weval属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeval() {
        return weval;
    }

    /**
     * 设置weval属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeval(String value) {
        this.weval = value;
    }

    /**
     * 获取wserve属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWserve() {
        return wserve;
    }

    /**
     * 设置wserve属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWserve(String value) {
        this.wserve = value;
    }

    /**
     * 获取autoid属性的值。
     * 
     */
    public int getAutoid() {
        return autoid;
    }

    /**
     * 设置autoid属性的值。
     * 
     */
    public void setAutoid(int value) {
        this.autoid = value;
    }

    /**
     * 获取wreprice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWreprice() {
        return wreprice;
    }

    /**
     * 设置wreprice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWreprice(String value) {
        this.wreprice = value;
    }

    /**
     * 获取wtshing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWtshing() {
        return wtshing;
    }

    /**
     * 设置wtshing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWtshing(String value) {
        this.wtshing = value;
    }

    /**
     * 获取wtshingrmark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWtshingrmark() {
        return wtshingrmark;
    }

    /**
     * 设置wtshingrmark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWtshingrmark(String value) {
        this.wtshingrmark = value;
    }

    /**
     * 获取zpsm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZpsm() {
        return zpsm;
    }

    /**
     * 设置zpsm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZpsm(String value) {
        this.zpsm = value;
    }

    /**
     * 获取hcsm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHcsm() {
        return hcsm;
    }

    /**
     * 设置hcsm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHcsm(String value) {
        this.hcsm = value;
    }

    /**
     * 获取superprice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSuperprice() {
        return superprice;
    }

    /**
     * 设置superprice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSuperprice(BigDecimal value) {
        this.superprice = value;
    }

    /**
     * 获取wstate属性的值。
     * 
     */
    public int getWstate() {
        return wstate;
    }

    /**
     * 设置wstate属性的值。
     * 
     */
    public void setWstate(int value) {
        this.wstate = value;
    }

    /**
     * 获取superremark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuperremark() {
        return superremark;
    }

    /**
     * 设置superremark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuperremark(String value) {
        this.superremark = value;
    }

    /**
     * 获取shstore属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShstore() {
        return shstore;
    }

    /**
     * 设置shstore属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShstore(String value) {
        this.shstore = value;
    }

    /**
     * 获取jifen属性的值。
     * 
     */
    public int getJifen() {
        return jifen;
    }

    /**
     * 设置jifen属性的值。
     * 
     */
    public void setJifen(int value) {
        this.jifen = value;
    }

    /**
     * 获取cutPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCutPrice() {
        return cutPrice;
    }

    /**
     * 设置cutPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCutPrice(XMLGregorianCalendar value) {
        this.cutPrice = value;
    }

    /**
     * 获取allnum属性的值。
     * 
     */
    public int getAllnum() {
        return allnum;
    }

    /**
     * 设置allnum属性的值。
     * 
     */
    public void setAllnum(int value) {
        this.allnum = value;
    }

    /**
     * 获取adddate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdddate() {
        return adddate;
    }

    /**
     * 设置adddate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdddate(XMLGregorianCalendar value) {
        this.adddate = value;
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
     * 获取grade属性的值。
     * 
     */
    public int getGrade() {
        return grade;
    }

    /**
     * 设置grade属性的值。
     * 
     */
    public void setGrade(int value) {
        this.grade = value;
    }

    /**
     * 获取beique属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeique() {
        return beique;
    }

    /**
     * 设置beique属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeique(String value) {
        this.beique = value;
    }

    /**
     * 获取gzque属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGzque() {
        return gzque;
    }

    /**
     * 设置gzque属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGzque(String value) {
        this.gzque = value;
    }

    /**
     * 获取shhque属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShhque() {
        return shhque;
    }

    /**
     * 设置shhque属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShhque(String value) {
        this.shhque = value;
    }

    /**
     * 获取caigou属性的值。
     * 
     */
    public int getCaigou() {
        return caigou;
    }

    /**
     * 设置caigou属性的值。
     * 
     */
    public void setCaigou(int value) {
        this.caigou = value;
    }

    /**
     * 获取ccity属性的值。
     * 
     */
    public int getCcity() {
        return ccity;
    }

    /**
     * 设置ccity属性的值。
     * 
     */
    public void setCcity(int value) {
        this.ccity = value;
    }

    /**
     * 获取cnumb属性的值。
     * 
     */
    public int getCnumb() {
        return cnumb;
    }

    /**
     * 设置cnumb属性的值。
     * 
     */
    public void setCnumb(int value) {
        this.cnumb = value;
    }

    /**
     * 获取shangjia属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShangjia() {
        return shangjia;
    }

    /**
     * 设置shangjia属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShangjia(String value) {
        this.shangjia = value;
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
     * 获取swkc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwkc() {
        return swkc;
    }

    /**
     * 设置swkc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwkc(String value) {
        this.swkc = value;
    }

    /**
     * 获取swrc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwrc() {
        return swrc;
    }

    /**
     * 设置swrc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwrc(String value) {
        this.swrc = value;
    }

    /**
     * 获取rcts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcts() {
        return rcts;
    }

    /**
     * 设置rcts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcts(String value) {
        this.rcts = value;
    }

    /**
     * 获取kcts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKcts() {
        return kcts;
    }

    /**
     * 设置kcts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKcts(String value) {
        this.kcts = value;
    }

    /**
     * 获取ps属性的值。
     * 
     */
    public int getPs() {
        return ps;
    }

    /**
     * 设置ps属性的值。
     * 
     */
    public void setPs(int value) {
        this.ps = value;
    }

    /**
     * 获取dhkc属性的值。
     * 
     */
    public int getDhkc() {
        return dhkc;
    }

    /**
     * 设置dhkc属性的值。
     * 
     */
    public void setDhkc(int value) {
        this.dhkc = value;
    }

    /**
     * 获取zgskc属性的值。
     * 
     */
    public int getZgskc() {
        return zgskc;
    }

    /**
     * 设置zgskc属性的值。
     * 
     */
    public void setZgskc(int value) {
        this.zgskc = value;
    }

    /**
     * 获取shkc属性的值。
     * 
     */
    public int getShkc() {
        return shkc;
    }

    /**
     * 设置shkc属性的值。
     * 
     */
    public void setShkc(int value) {
        this.shkc = value;
    }

    /**
     * 获取shph属性的值。
     * 
     */
    public int getShph() {
        return shph;
    }

    /**
     * 设置shph属性的值。
     * 
     */
    public void setShph(int value) {
        this.shph = value;
    }

    /**
     * 获取bjph属性的值。
     * 
     */
    public int getBjph() {
        return bjph;
    }

    /**
     * 设置bjph属性的值。
     * 
     */
    public void setBjph(int value) {
        this.bjph = value;
    }

    /**
     * 获取gzph属性的值。
     * 
     */
    public int getGzph() {
        return gzph;
    }

    /**
     * 设置gzph属性的值。
     * 
     */
    public void setGzph(int value) {
        this.gzph = value;
    }

    /**
     * 获取shx属性的值。
     * 
     */
    public int getShx() {
        return shx;
    }

    /**
     * 设置shx属性的值。
     * 
     */
    public void setShx(int value) {
        this.shx = value;
    }

    /**
     * 获取fprice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFprice() {
        return fprice;
    }

    /**
     * 设置fprice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFprice(BigDecimal value) {
        this.fprice = value;
    }

    /**
     * 获取shangg属性的值。
     * 
     */
    public int getShangg() {
        return shangg;
    }

    /**
     * 设置shangg属性的值。
     * 
     */
    public void setShangg(int value) {
        this.shangg = value;
    }

    /**
     * 获取rcts15属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcts15() {
        return rcts15;
    }

    /**
     * 设置rcts15属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcts15(String value) {
        this.rcts15 = value;
    }

    /**
     * 获取swrc15属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwrc15() {
        return swrc15;
    }

    /**
     * 设置swrc15属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwrc15(String value) {
        this.swrc15 = value;
    }

    /**
     * 获取proser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProser() {
        return proser;
    }

    /**
     * 设置proser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProser(String value) {
        this.proser = value;
    }

    /**
     * 获取balimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalimit() {
        return balimit;
    }

    /**
     * 设置balimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalimit(String value) {
        this.balimit = value;
    }

    /**
     * 获取bjzd属性的值。
     * 
     */
    public int getBjzd() {
        return bjzd;
    }

    /**
     * 设置bjzd属性的值。
     * 
     */
    public void setBjzd(int value) {
        this.bjzd = value;
    }

    /**
     * 获取gzzd属性的值。
     * 
     */
    public int getGzzd() {
        return gzzd;
    }

    /**
     * 设置gzzd属性的值。
     * 
     */
    public void setGzzd(int value) {
        this.gzzd = value;
    }

    /**
     * 获取cdbk属性的值。
     * 
     */
    public int getCdbk() {
        return cdbk;
    }

    /**
     * 设置cdbk属性的值。
     * 
     */
    public void setCdbk(int value) {
        this.cdbk = value;
    }

    /**
     * 获取cdzd属性的值。
     * 
     */
    public int getCdzd() {
        return cdzd;
    }

    /**
     * 设置cdzd属性的值。
     * 
     */
    public void setCdzd(int value) {
        this.cdzd = value;
    }

    /**
     * 获取shef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShef() {
        return shef;
    }

    /**
     * 设置shef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShef(String value) {
        this.shef = value;
    }

    /**
     * 获取cgcity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCgcity() {
        return cgcity;
    }

    /**
     * 设置cgcity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCgcity(String value) {
        this.cgcity = value;
    }

    /**
     * 获取maxpurchqty属性的值。
     * 
     */
    public int getMaxpurchqty() {
        return maxpurchqty;
    }

    /**
     * 设置maxpurchqty属性的值。
     * 
     */
    public void setMaxpurchqty(int value) {
        this.maxpurchqty = value;
    }

    /**
     * 获取bjcg属性的值。
     * 
     */
    public int getBjcg() {
        return bjcg;
    }

    /**
     * 设置bjcg属性的值。
     * 
     */
    public void setBjcg(int value) {
        this.bjcg = value;
    }

    /**
     * 获取shcg属性的值。
     * 
     */
    public int getShcg() {
        return shcg;
    }

    /**
     * 设置shcg属性的值。
     * 
     */
    public void setShcg(int value) {
        this.shcg = value;
    }

    /**
     * 获取gzcg属性的值。
     * 
     */
    public int getGzcg() {
        return gzcg;
    }

    /**
     * 设置gzcg属性的值。
     * 
     */
    public void setGzcg(int value) {
        this.gzcg = value;
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
     * 获取cdsnid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdsnid() {
        return cdsnid;
    }

    /**
     * 设置cdsnid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdsnid(String value) {
        this.cdsnid = value;
    }

}
