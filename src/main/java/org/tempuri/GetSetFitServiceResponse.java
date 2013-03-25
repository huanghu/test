
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
     * 获取getSetFitServiceResult属性的值。
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
     * 设置getSetFitServiceResult属性的值。
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
