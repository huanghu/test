
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡgetImgNameWidResult���Ե�ֵ��
     * 
     */
    public boolean isGetImgNameWidResult() {
        return getImgNameWidResult;
    }

    /**
     * ����getImgNameWidResult���Ե�ֵ��
     * 
     */
    public void setGetImgNameWidResult(boolean value) {
        this.getImgNameWidResult = value;
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

}
