
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
 *         &lt;element name="GetWareInfoByUPCResult" type="{http://tempuri.org/}ArrayOfWare" minOccurs="0"/>
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
    "getWareInfoByUPCResult"
})
@XmlRootElement(name = "GetWareInfoByUPCResponse")
public class GetWareInfoByUPCResponse {

    @XmlElement(name = "GetWareInfoByUPCResult")
    protected ArrayOfWare getWareInfoByUPCResult;

    /**
     * ��ȡgetWareInfoByUPCResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWare }
     *     
     */
    public ArrayOfWare getGetWareInfoByUPCResult() {
        return getWareInfoByUPCResult;
    }

    /**
     * ����getWareInfoByUPCResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWare }
     *     
     */
    public void setGetWareInfoByUPCResult(ArrayOfWare value) {
        this.getWareInfoByUPCResult = value;
    }

}
