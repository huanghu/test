
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
 *         &lt;element name="selectWidByUPCResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "selectWidByUPCResult"
})
@XmlRootElement(name = "selectWidByUPCResponse")
public class SelectWidByUPCResponse {

    protected int selectWidByUPCResult;

    /**
     * ��ȡselectWidByUPCResult���Ե�ֵ��
     * 
     */
    public int getSelectWidByUPCResult() {
        return selectWidByUPCResult;
    }

    /**
     * ����selectWidByUPCResult���Ե�ֵ��
     * 
     */
    public void setSelectWidByUPCResult(int value) {
        this.selectWidByUPCResult = value;
    }

}
