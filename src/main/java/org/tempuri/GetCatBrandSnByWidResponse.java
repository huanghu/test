
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GetCatBrandSnByWidResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "getCatBrandSnByWidResult",
    "snmin",
    "snmax"
})
@XmlRootElement(name = "GetCatBrandSnByWidResponse")
public class GetCatBrandSnByWidResponse {

    @XmlElement(name = "GetCatBrandSnByWidResult")
    protected boolean getCatBrandSnByWidResult;
    protected int snmin;
    protected int snmax;

    /**
     * ��ȡgetCatBrandSnByWidResult���Ե�ֵ��
     * 
     */
    public boolean isGetCatBrandSnByWidResult() {
        return getCatBrandSnByWidResult;
    }

    /**
     * ����getCatBrandSnByWidResult���Ե�ֵ��
     * 
     */
    public void setGetCatBrandSnByWidResult(boolean value) {
        this.getCatBrandSnByWidResult = value;
    }

    /**
     * ��ȡsnmin���Ե�ֵ��
     * 
     */
    public int getSnmin() {
        return snmin;
    }

    /**
     * ����snmin���Ե�ֵ��
     * 
     */
    public void setSnmin(int value) {
        this.snmin = value;
    }

    /**
     * ��ȡsnmax���Ե�ֵ��
     * 
     */
    public int getSnmax() {
        return snmax;
    }

    /**
     * ����snmax���Ե�ֵ��
     * 
     */
    public void setSnmax(int value) {
        this.snmax = value;
    }

}
