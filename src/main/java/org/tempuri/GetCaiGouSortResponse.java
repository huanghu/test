
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
 *         &lt;element name="getCaiGouSortResult" type="{http://tempuri.org/}ArrayOfAdmin" minOccurs="0"/>
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
    "getCaiGouSortResult"
})
@XmlRootElement(name = "getCaiGouSortResponse")
public class GetCaiGouSortResponse {

    protected ArrayOfAdmin getCaiGouSortResult;

    /**
     * 获取getCaiGouSortResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdmin }
     *     
     */
    public ArrayOfAdmin getGetCaiGouSortResult() {
        return getCaiGouSortResult;
    }

    /**
     * 设置getCaiGouSortResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdmin }
     *     
     */
    public void setGetCaiGouSortResult(ArrayOfAdmin value) {
        this.getCaiGouSortResult = value;
    }

}
