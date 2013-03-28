
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
     * 获取getWareStockResult属性的值。
     * 
     */
    public int getGetWareStockResult() {
        return getWareStockResult;
    }

    /**
     * 设置getWareStockResult属性的值。
     * 
     */
    public void setGetWareStockResult(int value) {
        this.getWareStockResult = value;
    }

}
