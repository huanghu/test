
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
 *         &lt;element name="IsKillSoftWareResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isKillSoftWareResult"
})
@XmlRootElement(name = "IsKillSoftWareResponse")
public class IsKillSoftWareResponse {

    @XmlElement(name = "IsKillSoftWareResult")
    protected boolean isKillSoftWareResult;

    /**
     * 获取isKillSoftWareResult属性的值。
     * 
     */
    public boolean isIsKillSoftWareResult() {
        return isKillSoftWareResult;
    }

    /**
     * 设置isKillSoftWareResult属性的值。
     * 
     */
    public void setIsKillSoftWareResult(boolean value) {
        this.isKillSoftWareResult = value;
    }

}
