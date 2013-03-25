
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
     * 获取getSonAndOwnInfoByERPCodeResult属性的值。
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
     * 设置getSonAndOwnInfoByERPCodeResult属性的值。
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
