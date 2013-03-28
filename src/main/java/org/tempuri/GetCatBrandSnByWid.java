
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
 *         &lt;element name="snmin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="snmax" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "snmin",
    "snmax"
})
@XmlRootElement(name = "GetCatBrandSnByWid")
public class GetCatBrandSnByWid {

    protected int wid;
    protected int snmin;
    protected int snmax;

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
     * 获取snmin属性的值。
     * 
     */
    public int getSnmin() {
        return snmin;
    }

    /**
     * 设置snmin属性的值。
     * 
     */
    public void setSnmin(int value) {
        this.snmin = value;
    }

    /**
     * 获取snmax属性的值。
     * 
     */
    public int getSnmax() {
        return snmax;
    }

    /**
     * 设置snmax属性的值。
     * 
     */
    public void setSnmax(int value) {
        this.snmax = value;
    }

}
