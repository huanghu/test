
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
 *         &lt;element name="getSetFitServiceResult" type="{http://tempuri.org/}FitService" minOccurs="0"/>
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
    "getSetFitServiceResult"
})
@XmlRootElement(name = "getSetFitServiceResponse")
public class GetSetFitServiceResponse {

    protected FitService getSetFitServiceResult;

    /**
     * ��ȡgetSetFitServiceResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FitService }
     *     
     */
    public FitService getGetSetFitServiceResult() {
        return getSetFitServiceResult;
    }

    /**
     * ����getSetFitServiceResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FitService }
     *     
     */
    public void setGetSetFitServiceResult(FitService value) {
        this.getSetFitServiceResult = value;
    }

}
