
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Ware complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡcompareNewegg���Ե�ֵ��
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
     * ����compareNewegg���Ե�ֵ��
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
     * ��ȡcompareYixun���Ե�ֵ��
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
     * ����compareYixun���Ե�ֵ��
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
     * ��ȡcompareAmazon���Ե�ֵ��
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
     * ����compareAmazon���Ե�ֵ��
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
     * ��ȡwareQD���Ե�ֵ��
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
     * ����wareQD���Ե�ֵ��
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
     * ��ȡimageurl���Ե�ֵ��
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
     * ����imageurl���Ե�ֵ��
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
     * ��ȡwid���Ե�ֵ��
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
     * ����wid���Ե�ֵ��
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
     * ��ȡwareid���Ե�ֵ��
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
     * ����wareid���Ե�ֵ��
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
     * ��ȡwarejia���Ե�ֵ��
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
     * ����warejia���Ե�ֵ��
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
     * ��ȡdaima���Ե�ֵ��
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
     * ����daima���Ե�ֵ��
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
     * ��ȡcpbm���Ե�ֵ��
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
     * ����cpbm���Ե�ֵ��
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
     * ��ȡdmbs���Ե�ֵ��
     * 
     */
    public int getDmbs() {
        return dmbs;
    }

    /**
     * ����dmbs���Ե�ֵ��
     * 
     */
    public void setDmbs(int value) {
        this.dmbs = value;
    }

    /**
     * ��ȡbilv���Ե�ֵ��
     * 
     */
    public int getBilv() {
        return bilv;
    }

    /**
     * ����bilv���Ե�ֵ��
     * 
     */
    public void setBilv(int value) {
        this.bilv = value;
    }

    /**
     * ��ȡzpbl���Ե�ֵ��
     * 
     */
    public int getZpbl() {
        return zpbl;
    }

    /**
     * ����zpbl���Ե�ֵ��
     * 
     */
    public void setZpbl(int value) {
        this.zpbl = value;
    }

    /**
     * ��ȡwStatus���Ե�ֵ��
     * 
     */
    public int getWStatus() {
        return wStatus;
    }

    /**
     * ����wStatus���Ե�ֵ��
     * 
     */
    public void setWStatus(int value) {
        this.wStatus = value;
    }

    /**
     * ��ȡgzstatus���Ե�ֵ��
     * 
     */
    public int getGzstatus() {
        return gzstatus;
    }

    /**
     * ����gzstatus���Ե�ֵ��
     * 
     */
    public void setGzstatus(int value) {
        this.gzstatus = value;
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
     * ��ȡwPid���Ե�ֵ��
     * 
     */
    public int getWPid() {
        return wPid;
    }

    /**
     * ����wPid���Ե�ֵ��
     * 
     */
    public void setWPid(int value) {
        this.wPid = value;
    }

    /**
     * ��ȡwpid2���Ե�ֵ��
     * 
     */
    public int getWpid2() {
        return wpid2;
    }

    /**
     * ����wpid2���Ե�ֵ��
     * 
     */
    public void setWpid2(int value) {
        this.wpid2 = value;
    }

    /**
     * ��ȡwpidstate���Ե�ֵ��
     * 
     */
    public int getWpidstate() {
        return wpidstate;
    }

    /**
     * ����wpidstate���Ե�ֵ��
     * 
     */
    public void setWpidstate(int value) {
        this.wpidstate = value;
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
     * ��ȡwReadMe���Ե�ֵ��
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
     * ����wReadMe���Ե�ֵ��
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
     * ��ȡwstart���Ե�ֵ��
     * 
     */
    public int getWstart() {
        return wstart;
    }

    /**
     * ����wstart���Ե�ֵ��
     * 
     */
    public void setWstart(int value) {
        this.wstart = value;
    }

    /**
     * ��ȡwpack���Ե�ֵ��
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
     * ����wpack���Ե�ֵ��
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
     * ��ȡwweight���Ե�ֵ��
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
     * ����wweight���Ե�ֵ��
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
     * ��ȡwpostage���Ե�ֵ��
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
     * ����wpostage���Ե�ֵ��
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
     * ��ȡwarea���Ե�ֵ��
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
     * ����warea���Ե�ֵ��
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
     * ��ȡwfacturer���Ե�ֵ��
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
     * ����wfacturer���Ե�ֵ��
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
     * ��ȡwMaprice���Ե�ֵ��
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
     * ����wMaprice���Ե�ֵ��
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
     * ��ȡwMeprice���Ե�ֵ��
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
     * ����wMeprice���Ե�ֵ��
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
     * ��ȡwlkNum���Ե�ֵ��
     * 
     */
    public int getWlkNum() {
        return wlkNum;
    }

    /**
     * ����wlkNum���Ե�ֵ��
     * 
     */
    public void setWlkNum(int value) {
        this.wlkNum = value;
    }

    /**
     * ��ȡwbuNum���Ե�ֵ��
     * 
     */
    public int getWbuNum() {
        return wbuNum;
    }

    /**
     * ����wbuNum���Ե�ֵ��
     * 
     */
    public void setWbuNum(int value) {
        this.wbuNum = value;
    }

    /**
     * ��ȡwSmimgName���Ե�ֵ��
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
     * ����wSmimgName���Ե�ֵ��
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
     * ��ȡwSmimgPath���Ե�ֵ��
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
     * ����wSmimgPath���Ե�ֵ��
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

    /**
     * ��ȡwUpDate���Ե�ֵ��
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
     * ����wUpDate���Ե�ֵ��
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
     * ��ȡwinsPerson���Ե�ֵ��
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
     * ����winsPerson���Ե�ֵ��
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
     * ��ȡwupPerson���Ե�ֵ��
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
     * ����wupPerson���Ե�ֵ��
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
     * ��ȡwyn���Ե�ֵ��
     * 
     */
    public int getWyn() {
        return wyn;
    }

    /**
     * ����wyn���Ե�ֵ��
     * 
     */
    public void setWyn(int value) {
        this.wyn = value;
    }

    /**
     * ��ȡwst���Ե�ֵ��
     * 
     */
    public int getWst() {
        return wst;
    }

    /**
     * ����wst���Ե�ֵ��
     * 
     */
    public void setWst(int value) {
        this.wst = value;
    }

    /**
     * ��ȡweval���Ե�ֵ��
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
     * ����weval���Ե�ֵ��
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
     * ��ȡwserve���Ե�ֵ��
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
     * ����wserve���Ե�ֵ��
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
     * ��ȡautoid���Ե�ֵ��
     * 
     */
    public int getAutoid() {
        return autoid;
    }

    /**
     * ����autoid���Ե�ֵ��
     * 
     */
    public void setAutoid(int value) {
        this.autoid = value;
    }

    /**
     * ��ȡwreprice���Ե�ֵ��
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
     * ����wreprice���Ե�ֵ��
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
     * ��ȡwtshing���Ե�ֵ��
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
     * ����wtshing���Ե�ֵ��
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
     * ��ȡwtshingrmark���Ե�ֵ��
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
     * ����wtshingrmark���Ե�ֵ��
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
     * ��ȡzpsm���Ե�ֵ��
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
     * ����zpsm���Ե�ֵ��
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
     * ��ȡhcsm���Ե�ֵ��
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
     * ����hcsm���Ե�ֵ��
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
     * ��ȡsuperprice���Ե�ֵ��
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
     * ����superprice���Ե�ֵ��
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
     * ��ȡwstate���Ե�ֵ��
     * 
     */
    public int getWstate() {
        return wstate;
    }

    /**
     * ����wstate���Ե�ֵ��
     * 
     */
    public void setWstate(int value) {
        this.wstate = value;
    }

    /**
     * ��ȡsuperremark���Ե�ֵ��
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
     * ����superremark���Ե�ֵ��
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
     * ��ȡshstore���Ե�ֵ��
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
     * ����shstore���Ե�ֵ��
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
     * ��ȡjifen���Ե�ֵ��
     * 
     */
    public int getJifen() {
        return jifen;
    }

    /**
     * ����jifen���Ե�ֵ��
     * 
     */
    public void setJifen(int value) {
        this.jifen = value;
    }

    /**
     * ��ȡcutPrice���Ե�ֵ��
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
     * ����cutPrice���Ե�ֵ��
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
     * ��ȡallnum���Ե�ֵ��
     * 
     */
    public int getAllnum() {
        return allnum;
    }

    /**
     * ����allnum���Ե�ֵ��
     * 
     */
    public void setAllnum(int value) {
        this.allnum = value;
    }

    /**
     * ��ȡadddate���Ե�ֵ��
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
     * ����adddate���Ե�ֵ��
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
     * ��ȡgrade���Ե�ֵ��
     * 
     */
    public int getGrade() {
        return grade;
    }

    /**
     * ����grade���Ե�ֵ��
     * 
     */
    public void setGrade(int value) {
        this.grade = value;
    }

    /**
     * ��ȡbeique���Ե�ֵ��
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
     * ����beique���Ե�ֵ��
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
     * ��ȡgzque���Ե�ֵ��
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
     * ����gzque���Ե�ֵ��
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
     * ��ȡshhque���Ե�ֵ��
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
     * ����shhque���Ե�ֵ��
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
     * ��ȡcaigou���Ե�ֵ��
     * 
     */
    public int getCaigou() {
        return caigou;
    }

    /**
     * ����caigou���Ե�ֵ��
     * 
     */
    public void setCaigou(int value) {
        this.caigou = value;
    }

    /**
     * ��ȡccity���Ե�ֵ��
     * 
     */
    public int getCcity() {
        return ccity;
    }

    /**
     * ����ccity���Ե�ֵ��
     * 
     */
    public void setCcity(int value) {
        this.ccity = value;
    }

    /**
     * ��ȡcnumb���Ե�ֵ��
     * 
     */
    public int getCnumb() {
        return cnumb;
    }

    /**
     * ����cnumb���Ե�ֵ��
     * 
     */
    public void setCnumb(int value) {
        this.cnumb = value;
    }

    /**
     * ��ȡshangjia���Ե�ֵ��
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
     * ����shangjia���Ե�ֵ��
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
     * ��ȡswkc���Ե�ֵ��
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
     * ����swkc���Ե�ֵ��
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
     * ��ȡswrc���Ե�ֵ��
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
     * ����swrc���Ե�ֵ��
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
     * ��ȡrcts���Ե�ֵ��
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
     * ����rcts���Ե�ֵ��
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
     * ��ȡkcts���Ե�ֵ��
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
     * ����kcts���Ե�ֵ��
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
     * ��ȡps���Ե�ֵ��
     * 
     */
    public int getPs() {
        return ps;
    }

    /**
     * ����ps���Ե�ֵ��
     * 
     */
    public void setPs(int value) {
        this.ps = value;
    }

    /**
     * ��ȡdhkc���Ե�ֵ��
     * 
     */
    public int getDhkc() {
        return dhkc;
    }

    /**
     * ����dhkc���Ե�ֵ��
     * 
     */
    public void setDhkc(int value) {
        this.dhkc = value;
    }

    /**
     * ��ȡzgskc���Ե�ֵ��
     * 
     */
    public int getZgskc() {
        return zgskc;
    }

    /**
     * ����zgskc���Ե�ֵ��
     * 
     */
    public void setZgskc(int value) {
        this.zgskc = value;
    }

    /**
     * ��ȡshkc���Ե�ֵ��
     * 
     */
    public int getShkc() {
        return shkc;
    }

    /**
     * ����shkc���Ե�ֵ��
     * 
     */
    public void setShkc(int value) {
        this.shkc = value;
    }

    /**
     * ��ȡshph���Ե�ֵ��
     * 
     */
    public int getShph() {
        return shph;
    }

    /**
     * ����shph���Ե�ֵ��
     * 
     */
    public void setShph(int value) {
        this.shph = value;
    }

    /**
     * ��ȡbjph���Ե�ֵ��
     * 
     */
    public int getBjph() {
        return bjph;
    }

    /**
     * ����bjph���Ե�ֵ��
     * 
     */
    public void setBjph(int value) {
        this.bjph = value;
    }

    /**
     * ��ȡgzph���Ե�ֵ��
     * 
     */
    public int getGzph() {
        return gzph;
    }

    /**
     * ����gzph���Ե�ֵ��
     * 
     */
    public void setGzph(int value) {
        this.gzph = value;
    }

    /**
     * ��ȡshx���Ե�ֵ��
     * 
     */
    public int getShx() {
        return shx;
    }

    /**
     * ����shx���Ե�ֵ��
     * 
     */
    public void setShx(int value) {
        this.shx = value;
    }

    /**
     * ��ȡfprice���Ե�ֵ��
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
     * ����fprice���Ե�ֵ��
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
     * ��ȡshangg���Ե�ֵ��
     * 
     */
    public int getShangg() {
        return shangg;
    }

    /**
     * ����shangg���Ե�ֵ��
     * 
     */
    public void setShangg(int value) {
        this.shangg = value;
    }

    /**
     * ��ȡrcts15���Ե�ֵ��
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
     * ����rcts15���Ե�ֵ��
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
     * ��ȡswrc15���Ե�ֵ��
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
     * ����swrc15���Ե�ֵ��
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
     * ��ȡproser���Ե�ֵ��
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
     * ����proser���Ե�ֵ��
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
     * ��ȡbalimit���Ե�ֵ��
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
     * ����balimit���Ե�ֵ��
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
     * ��ȡbjzd���Ե�ֵ��
     * 
     */
    public int getBjzd() {
        return bjzd;
    }

    /**
     * ����bjzd���Ե�ֵ��
     * 
     */
    public void setBjzd(int value) {
        this.bjzd = value;
    }

    /**
     * ��ȡgzzd���Ե�ֵ��
     * 
     */
    public int getGzzd() {
        return gzzd;
    }

    /**
     * ����gzzd���Ե�ֵ��
     * 
     */
    public void setGzzd(int value) {
        this.gzzd = value;
    }

    /**
     * ��ȡcdbk���Ե�ֵ��
     * 
     */
    public int getCdbk() {
        return cdbk;
    }

    /**
     * ����cdbk���Ե�ֵ��
     * 
     */
    public void setCdbk(int value) {
        this.cdbk = value;
    }

    /**
     * ��ȡcdzd���Ե�ֵ��
     * 
     */
    public int getCdzd() {
        return cdzd;
    }

    /**
     * ����cdzd���Ե�ֵ��
     * 
     */
    public void setCdzd(int value) {
        this.cdzd = value;
    }

    /**
     * ��ȡshef���Ե�ֵ��
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
     * ����shef���Ե�ֵ��
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
     * ��ȡcgcity���Ե�ֵ��
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
     * ����cgcity���Ե�ֵ��
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
     * ��ȡmaxpurchqty���Ե�ֵ��
     * 
     */
    public int getMaxpurchqty() {
        return maxpurchqty;
    }

    /**
     * ����maxpurchqty���Ե�ֵ��
     * 
     */
    public void setMaxpurchqty(int value) {
        this.maxpurchqty = value;
    }

    /**
     * ��ȡbjcg���Ե�ֵ��
     * 
     */
    public int getBjcg() {
        return bjcg;
    }

    /**
     * ����bjcg���Ե�ֵ��
     * 
     */
    public void setBjcg(int value) {
        this.bjcg = value;
    }

    /**
     * ��ȡshcg���Ե�ֵ��
     * 
     */
    public int getShcg() {
        return shcg;
    }

    /**
     * ����shcg���Ե�ֵ��
     * 
     */
    public void setShcg(int value) {
        this.shcg = value;
    }

    /**
     * ��ȡgzcg���Ե�ֵ��
     * 
     */
    public int getGzcg() {
        return gzcg;
    }

    /**
     * ����gzcg���Ե�ֵ��
     * 
     */
    public void setGzcg(int value) {
        this.gzcg = value;
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
     * ��ȡcdsnid���Ե�ֵ��
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
     * ����cdsnid���Ե�ֵ��
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
