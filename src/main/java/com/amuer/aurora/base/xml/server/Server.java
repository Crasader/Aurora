//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2015.07.15 ʱ�� 04:53:32 PM CST 
//


package com.amuer.aurora.base.xml.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{}ZookeeperServer"/>
 *         &lt;element ref="{}RouterServer"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *             &lt;enumeration value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "zookeeperServer",
    "routerServer"
})
@XmlRootElement(name = "Server")
public class Server {

    @XmlElement(name = "ZookeeperServer", required = true)
    protected ZookeeperServer zookeeperServer;
    @XmlElement(name = "RouterServer", required = true)
    protected RouterServer routerServer;
    @XmlAttribute(name = "version", required = true)
    protected byte version;

    /**
     * ��ȡzookeeperServer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ZookeeperServer }
     *     
     */
    public ZookeeperServer getZookeeperServer() {
        return zookeeperServer;
    }

    /**
     * ����zookeeperServer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ZookeeperServer }
     *     
     */
    public void setZookeeperServer(ZookeeperServer value) {
        this.zookeeperServer = value;
    }

    /**
     * ��ȡrouterServer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RouterServer }
     *     
     */
    public RouterServer getRouterServer() {
        return routerServer;
    }

    /**
     * ����routerServer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RouterServer }
     *     
     */
    public void setRouterServer(RouterServer value) {
        this.routerServer = value;
    }

    /**
     * ��ȡversion���Ե�ֵ��
     * 
     */
    public byte getVersion() {
        return version;
    }

    /**
     * ����version���Ե�ֵ��
     * 
     */
    public void setVersion(byte value) {
        this.version = value;
    }

}
