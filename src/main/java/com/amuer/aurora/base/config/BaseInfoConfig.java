package com.amuer.aurora.base.config;


import com.amuer.aurora.base.xml.server.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.File;

/**
 * ��ŵ��Ƿ����һЩ������Ϣ�����籾������̵�id�����͡���Ⱥ·�ɵ�ַ�ȵȣ�Ӧ����Ҫ��һ����������
 * Created by wangqiang on 2015/7/15.
 */
public class BaseInfoConfig implements IConfig
{
    private static final Logger logger = LoggerFactory.getLogger(BaseInfoConfig.class);
    private Server server = null;

    public String getValue(String key)
    {
        return null;
    }

    public Object getObject(String key)
    {
        return null;
    }

    public Object getConfigEntity()
    {
        return server;
    }

    public int loadConfigFile(String path, String bean)
    {
        try
        {
            JAXBContext context = JAXBContext.newInstance(bean);
            server = (Server) context.createUnmarshaller().unmarshal(new File(path));
        }
        catch (JAXBException e)
        {
            e.printStackTrace();
            logger.error("loadConfigFile failure path:" + path + ", bean:" + bean);
            return -1;
        }
        return 0;
    }

    public int reloadConfigFile(String path)
    {
        loadConfigFile(path, null);
        return 0;
    }

    public static void main(String args[])
    {
        BaseInfoConfig baseInfoConfig = new BaseInfoConfig();
        String path = "E:\\opensource\\Aurora\\tools\\jaxb\\Server.xml";
        String bean = "com.amuer.aurora.xml.server";
        baseInfoConfig.loadConfigFile(path, bean);
        Server server = (Server) baseInfoConfig.getConfigEntity();
        System.out.println(server.getVersion());
        logger.info(server.getRouterServer().getServerInfo().getAddress().getIp());
    }
}
