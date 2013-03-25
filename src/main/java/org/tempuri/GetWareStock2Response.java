
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
     * 获取getWareStock2Result属性的值。
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
     * 设置getWareStock2Result属性的值。
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
