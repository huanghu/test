
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
 *         &lt;element name="GetShelfInfoByWidResult" type="{http://tempuri.org/}wareInfo" minOccurs="0"/>
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
    "getShelfInfoByWidResult"
})
@XmlRootElement(name = "GetShelfInfoByWidResponse")
public class GetShelfInfoByWidResponse {

    @XmlElement(name = "GetShelfInfoByWidResult")
    protected WareInfo getShelfInfoByWidResult;

    /**
     * 获取getShelfInfoByWidResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WareInfo }
     *     
     */
    public WareInfo getGetShelfInfoByWidResult() {
        return getShelfInfoByWidResult;
    }

    /**
     * 设置getShelfInfoByWidResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WareInfo }
     *     
     */
    public void setGetShelfInfoByWidResult(WareInfo value) {
        this.getShelfInfoByWidResult = value;
    }

}
