
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
 *         &lt;element name="GetWareLWHResult" type="{http://tempuri.org/}WareQita" minOccurs="0"/>
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
    "getWareLWHResult"
})
@XmlRootElement(name = "GetWareLWHResponse")
public class GetWareLWHResponse {

    @XmlElement(name = "GetWareLWHResult")
    protected WareQita getWareLWHResult;

    /**
     * ��ȡgetWareLWHResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WareQita }
     *     
     */
    public WareQita getGetWareLWHResult() {
        return getWareLWHResult;
    }

    /**
     * ����getWareLWHResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WareQita }
     *     
     */
    public void setGetWareLWHResult(WareQita value) {
        this.getWareLWHResult = value;
    }

}
