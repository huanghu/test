
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
 *         &lt;element name="GetCaiXiaoInfoByERPCodeResult" type="{http://tempuri.org/}CaiXiaoInfo" minOccurs="0"/>
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
    "getCaiXiaoInfoByERPCodeResult"
})
@XmlRootElement(name = "GetCaiXiaoInfoByERPCodeResponse")
public class GetCaiXiaoInfoByERPCodeResponse {

    @XmlElement(name = "GetCaiXiaoInfoByERPCodeResult")
    protected CaiXiaoInfo getCaiXiaoInfoByERPCodeResult;

    /**
     * 获取getCaiXiaoInfoByERPCodeResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CaiXiaoInfo }
     *     
     */
    public CaiXiaoInfo getGetCaiXiaoInfoByERPCodeResult() {
        return getCaiXiaoInfoByERPCodeResult;
    }

    /**
     * 设置getCaiXiaoInfoByERPCodeResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CaiXiaoInfo }
     *     
     */
    public void setGetCaiXiaoInfoByERPCodeResult(CaiXiaoInfo value) {
        this.getCaiXiaoInfoByERPCodeResult = value;
    }

}
