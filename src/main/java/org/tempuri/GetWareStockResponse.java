
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
 *         &lt;element name="getWareStockResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getWareStockResult"
})
@XmlRootElement(name = "getWareStockResponse")
public class GetWareStockResponse {

    protected int getWareStockResult;

    /**
     * ��ȡgetWareStockResult���Ե�ֵ��
     * 
     */
    public int getGetWareStockResult() {
        return getWareStockResult;
    }

    /**
     * ����getWareStockResult���Ե�ֵ��
     * 
     */
    public void setGetWareStockResult(int value) {
        this.getWareStockResult = value;
    }

}
