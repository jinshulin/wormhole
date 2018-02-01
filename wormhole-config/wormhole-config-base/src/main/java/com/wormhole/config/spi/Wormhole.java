package com.wormhole.config.spi;

import com.wormhole.config.EndpointConfig;
import java.rmi.RemoteException;
import java.util.List;
import com.wormhole.config.Aircraft;
import com.wormhole.config.ApplicationConfig;

/**
 * 连接通道.
 *
 * @author jinshulin (jinshulin@zhengheyingshi.com)
 * @since 2018年02月01日 16时32分
 */
public interface Wormhole {
    /**
     * 将配置的服务暴露到注册中心.
     * @param config 需要暴露的服务配置
     */
    void export(ApplicationConfig config);

    /**
     * 根据配置的服务依赖，建立与对应服务的通道.
     * @param configs 服务依赖的配置参数
     */
    void reference(List<EndpointConfig> configs);

    /**
     * 飞行器装载好物资，穿越虫洞，到达彼岸.
     * @param aircraft 要准备穿越的飞行器
     * @return 响应信息
     * @throws RemoteException 调用失败，抛出异常
     */
    Object sendMessage(Aircraft aircraft) throws RemoteException;

    /**
     * 将服务注册到通信通道中
     * @param service 实际暴露的服务
     */
    void serviceRegistry(Object service);
}
