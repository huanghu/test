
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
 *         &lt;element name="GetSonAndOwnInfoByERPCodeResult" type="{http://tempuri.org/}ArrayOfAdmin" minOccurs="0"/>
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
    "getSonAndOwnInfoByERPCodeResult"
})
@XmlRootElement(name = "GetSonAndOwnInfoByERPCodeResponse")
public class GetSonAndOwnInfoByERPCodeResponse {

    @XmlElement(name = "GetSonAndOwnInfoByERPCodeResult")
    protected ArrayOfAdmin getSonAndOwnInfoByERPCodeResult;

    /**
     * ��ȡgetSonAndOwnInfoByERPCodeResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdmin }
     *     
     */
    public ArrayOfAdmin getGetSonAndOwnInfoByERPCodeResult() {
        return getSonAndOwnInfoByERPCodeResult;
    }

    /**
     * ����getSonAndOwnInfoByERPCodeResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdmin }
     *     
     */
    public void setGetSonAndOwnInfoByERPCodeResult(ArrayOfAdmin value) {
        this.getSonAndOwnInfoByERPCodeResult = value;
    }

}
