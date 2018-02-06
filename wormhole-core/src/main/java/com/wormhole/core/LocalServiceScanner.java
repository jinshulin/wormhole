package com.wormhole.core;

import com.wormhole.config.ApplicationConfig;
import com.wormhole.config.EndpointConfig;
import com.wormhole.core.wrapper.LocalReferenceWrapper;
import com.wormhole.core.wrapper.LocalServiceWrapper;
import java.util.List;

/**
 * 本地服务扫描器.
 *
 * @author jinshulin (jinshulin@zhengheyingshi.com)
 * @since 2018年02月06日 16时40分
 */
public class LocalServiceScanner {

    /**
     * 通过待暴露服务的配置，扫描所有待暴露服务.
     * @param applicationConfig
     * @return
     */
    public List<LocalServiceWrapper> scanServices(ApplicationConfig applicationConfig) {
        return null;
    }

    /**
     * 通过所有服务依赖配置，获取所有需要外部依赖的服务.
     * @param endpointConfigs
     * @return
     */
    public List<LocalReferenceWrapper> scanReferences(List<EndpointConfig> endpointConfigs) {
        return null;
    }
}
