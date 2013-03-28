
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
 *         &lt;element name="selectWareInfoByShelfResult" type="{http://tempuri.org/}ArrayOfWareInfo" minOccurs="0"/>
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
    "selectWareInfoByShelfResult"
})
@XmlRootElement(name = "selectWareInfoByShelfResponse")
public class SelectWareInfoByShelfResponse {

    protected ArrayOfWareInfo selectWareInfoByShelfResult;

    /**
     * 获取selectWareInfoByShelfResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWareInfo }
     *     
     */
    public ArrayOfWareInfo getSelectWareInfoByShelfResult() {
        return selectWareInfoByShelfResult;
    }

    /**
     * 设置selectWareInfoByShelfResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWareInfo }
     *     
     */
    public void setSelectWareInfoByShelfResult(ArrayOfWareInfo value) {
        this.selectWareInfoByShelfResult = value;
    }

}
