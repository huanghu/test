
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
 *         &lt;element name="wid" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "wid"
})
@XmlRootElement(name = "selectWareInfoByWid")
public class SelectWareInfoByWid {

    protected int rid;
    protected int wid;

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

}
