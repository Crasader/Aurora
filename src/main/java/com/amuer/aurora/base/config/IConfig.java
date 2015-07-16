package com.amuer.aurora.base.config;


/**
 * Created by wangqiang on 2015/7/15.
 */
public interface IConfig
{
    /**
     *  ��ȡ�����еĶ�Ӧvalueֵ
     * @param key
     * @return json����xml��ʽ���ַ�����ʧ�ܷ���null
     */
    public String getValue(String key);

    /**
     *
     * @param key
     * @return object���� ����POJO����ʧ�ܷ���null
     */
    public Object getObject(String key);

    /**
     *  ȡ�����е�POJOʵ��
     * @return
     */
    public Object getConfigEntity();

    /**
     * ������
     * @param path �����ļ��ľ���·��
     * @param bean
     * @return �ɹ�����0 ʧ�ܷ��ش�����
     */
    public int loadConfigFile(String path, String bean);

    /**
     * ���¶�ȡ���ã���Ҫ�����ȸ���һЩ����
     * @param path
     * @return �ɹ�����0 ʧ�ܷ��ش�����
     */
    public int reloadConfigFile(String path);

}
