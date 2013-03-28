
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
 *         &lt;element name="wid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rightValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="leftValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "wid",
    "rightValue",
    "leftValue"
})
@XmlRootElement(name = "GetWareSnSetByWidAndRightValue")
public class GetWareSnSetByWidAndRightValue {

    protected int wid;
    protected String rightValue;
    protected String leftValue;

    /**
     * 获取wid属性的值。
     * 
     */
    public int getWid() {
        return wid;
    }

    /**
     * 设置wid属性的值。
     * 
     */
    public void setWid(int value) {
        this.wid = value;
    }

    /**
     * 获取rightValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightValue() {
        return rightValue;
    }

    /**
     * 设置rightValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightValue(String value) {
        this.rightValue = value;
    }

    /**
     * 获取leftValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftValue() {
        return leftValue;
    }

    /**
     * 设置leftValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftValue(String value) {
        this.leftValue = value;
    }

}
