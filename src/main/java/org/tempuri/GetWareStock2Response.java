
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="getWareStock2Result" type="{http://tempuri.org/}ArrayOfWareStock" minOccurs="0"/>
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
    "getWareStock2Result"
})
@XmlRootElement(name = "getWareStock2Response")
public class GetWareStock2Response {

    protected ArrayOfWareStock getWareStock2Result;

    /**
     * ��ȡgetWareStock2Result���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWareStock }
     *     
     */
    public ArrayOfWareStock getGetWareStock2Result() {
        return getWareStock2Result;
    }

    /**
     * ����getWareStock2Result���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWareStock }
     *     
     */
    public void setGetWareStock2Result(ArrayOfWareStock value) {
        this.getWareStock2Result = value;
    }

}
