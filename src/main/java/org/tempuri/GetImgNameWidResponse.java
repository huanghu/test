
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetImgNameWidResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="imageurl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getImgNameWidResult",
    "imageurl",
    "wname"
})
@XmlRootElement(name = "GetImgNameWidResponse")
public class GetImgNameWidResponse {

    @XmlElement(name = "GetImgNameWidResult")
    protected boolean getImgNameWidResult;
    protected String imageurl;
    protected String wname;

    /**
     * 获取getImgNameWidResult属性的值。
     * 
     */
    public boolean isGetImgNameWidResult() {
        return getImgNameWidResult;
    }

    /**
     * 设置getImgNameWidResult属性的值。
     * 
     */
    public void setGetImgNameWidResult(boolean value) {
        this.getImgNameWidResult = value;
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

}
