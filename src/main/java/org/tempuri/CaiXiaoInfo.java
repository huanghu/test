
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CaiXiaoInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CaiXiaoInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OneSelf" type="{http://tempuri.org/}admin" minOccurs="0"/>
 *         &lt;element name="President" type="{http://tempuri.org/}admin" minOccurs="0"/>
 *         &lt;element name="Lower" type="{http://tempuri.org/}ArrayOfAdmin" minOccurs="0"/>
 *         &lt;element name="Superior" type="{http://tempuri.org/}admin" minOccurs="0"/>
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaiXiaoInfo", propOrder = {
    "oneSelf",
    "president",
    "lower",
    "superior",
    "level"
})
public class CaiXiaoInfo {

    @XmlElement(name = "OneSelf")
    protected Admin oneSelf;
    @XmlElement(name = "President")
    protected Admin president;
    @XmlElement(name = "Lower")
    protected ArrayOfAdmin lower;
    @XmlElement(name = "Superior")
    protected Admin superior;
    @XmlElement(name = "Level")
    protected int level;

    /**
     * 获取oneSelf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Admin }
     *     
     */
    public Admin getOneSelf() {
        return oneSelf;
    }

    /**
     * 设置oneSelf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Admin }
     *     
     */
    public void setOneSelf(Admin value) {
        this.oneSelf = value;
    }

    /**
     * 获取president属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Admin }
     *     
     */
    public Admin getPresident() {
        return president;
    }

    /**
     * 设置president属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Admin }
     *     
     */
    public void setPresident(Admin value) {
        this.president = value;
    }

    /**
     * 获取lower属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdmin }
     *     
     */
    public ArrayOfAdmin getLower() {
        return lower;
    }

    /**
     * 设置lower属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdmin }
     *     
     */
    public void setLower(ArrayOfAdmin value) {
        this.lower = value;
    }

    /**
     * 获取superior属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Admin }
     *     
     */
    public Admin getSuperior() {
        return superior;
    }

    /**
     * 设置superior属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Admin }
     *     
     */
    public void setSuperior(Admin value) {
        this.superior = value;
    }

    /**
     * 获取level属性的值。
     * 
     */
    public int getLevel() {
        return level;
    }

    /**
     * 设置level属性的值。
     * 
     */
    public void setLevel(int value) {
        this.level = value;
    }

}
