
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
     * ��ȡgetShelfInfoByWidResult���Ե�ֵ��
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
     * ����getShelfInfoByWidResult���Ե�ֵ��
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
