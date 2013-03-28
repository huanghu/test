
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CaiXiaoInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡoneSelf���Ե�ֵ��
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
     * ����oneSelf���Ե�ֵ��
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
     * ��ȡpresident���Ե�ֵ��
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
     * ����president���Ե�ֵ��
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
     * ��ȡlower���Ե�ֵ��
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
     * ����lower���Ե�ֵ��
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
     * ��ȡsuperior���Ե�ֵ��
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
     * ����superior���Ե�ֵ��
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
     * ��ȡlevel���Ե�ֵ��
     * 
     */
    public int getLevel() {
        return level;
    }

    /**
     * ����level���Ե�ֵ��
     * 
     */
    public void setLevel(int value) {
        this.level = value;
    }

}
