
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
 *         &lt;element name="rid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shelfNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "rid",
    "shelfNO"
})
@XmlRootElement(name = "selectWareInfoByShelf")
public class SelectWareInfoByShelf {

    protected int rid;
    protected String shelfNO;

    /**
     * ��ȡrid���Ե�ֵ��
     * 
     */
    public int getRid() {
        return rid;
    }

    /**
     * ����rid���Ե�ֵ��
     * 
     */
    public void setRid(int value) {
        this.rid = value;
    }

    /**
     * ��ȡshelfNO���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShelfNO() {
        return shelfNO;
    }

    /**
     * ����shelfNO���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShelfNO(String value) {
        this.shelfNO = value;
    }

}
