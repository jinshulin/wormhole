package com.wormhole.core.spi;

import com.wormhole.config.EndpointConfig;
import com.wormhole.core.wrapper.LocalReferenceWrapper;
import com.wormhole.core.wrapper.LocalServiceWrapper;
import java.rmi.RemoteException;
import java.util.List;
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
     * 将服务注册到通信通道中.
     * @param services 实际暴露的服务
     */
    void serviceRegistry(List<LocalServiceWrapper> services);

    /**
     * 将本地服务依赖注册到通信通道中.
     * @param references 本地服务依赖
     */
    void referenceRegistry(List<LocalReferenceWrapper> references);
}
