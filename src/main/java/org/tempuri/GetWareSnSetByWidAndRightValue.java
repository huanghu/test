
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡwid���Ե�ֵ��
     * 
     */
    public int getWid() {
        return wid;
    }

    /**
     * ����wid���Ե�ֵ��
     * 
     */
    public void setWid(int value) {
        this.wid = value;
    }

    /**
     * ��ȡrightValue���Ե�ֵ��
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
     * ����rightValue���Ե�ֵ��
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
     * ��ȡleftValue���Ե�ֵ��
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
     * ����leftValue���Ե�ֵ��
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
