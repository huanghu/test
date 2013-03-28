
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
 *         &lt;element name="GetWareInfoResult" type="{http://tempuri.org/}WareQita" minOccurs="0"/>
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
    "getWareInfoResult"
})
@XmlRootElement(name = "GetWareInfoResponse")
public class GetWareInfoResponse {

    @XmlElement(name = "GetWareInfoResult")
    protected WareQita getWareInfoResult;

    /**
     * 获取getWareInfoResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WareQita }
     *     
     */
    public WareQita getGetWareInfoResult() {
        return getWareInfoResult;
    }

    /**
     * 设置getWareInfoResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WareQita }
     *     
     */
    public void setGetWareInfoResult(WareQita value) {
        this.getWareInfoResult = value;
    }

}
