package com.amuer.aurora.base.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * ��������ù�����
 * Created by mark on 2015/7/15.
 */

public class ConfigManager
{
    private static final Logger logger = LoggerFactory.getLogger(ConfigManager.class);
    private static final ConfigManager instance = new ConfigManager();
    private Map<String, IConfig> configMap = new HashMap<String, IConfig>();

    private ConfigManager()
    {
    }

    /**
     * ��ȡ���ù���������һ������ʵ�֣����ù������������̰߳�ȫ�ģ�configMap�еĸ��������������Ҫ�Լ�ʵ���̰߳�ȫ
     * @return ���ù�����
     */
    public static ConfigManager getInstance()
    {
        return instance;
    }

    public IConfig getConfig(String key)
    {
        return configMap.get(key);
    }

    public void RegisterConfig(String key, IConfig config)
    {
        configMap.put(key, config);
    }

    public static void main(String args[])
    {
        System.out.println("hello");
        System.out.println(ConfigManager.getInstance().getConfig("1"));
    }
}
