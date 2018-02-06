package com.wormhole.core;

import com.google.common.collect.Lists;
import com.wormhole.config.ApplicationConfig;
import com.wormhole.config.Configuration;
import com.wormhole.config.EndpointConfig;
import com.wormhole.config.spi.ConfigurationDiscovery;
import com.wormhole.core.spi.Wormhole;
import com.wormhole.core.wrapper.LocalReferenceWrapper;
import com.wormhole.core.wrapper.LocalServiceWrapper;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 容器上下文环境.
 *
 * @author jinshulin (jinshulin@zhengheyingshi.com)
 * @since 2018年02月06日 10时04分
 */
public abstract class ApplicationContext {
    private static final Logger logger = LoggerFactory.getLogger(ApplicationContext.class);

    /**
     * 配置读取.
     */
    private ConfigurationDiscovery configurationDiscovery;
    /**
     * 通信通道建立.
     */
    private Wormhole wormhole;
    /**
     * 服务扫描器.
     */
    private LocalServiceScanner scanner;
    /**
     * 扫描上下文.
     */
    public void refresh() {
        // 1.prepare application context.
        prepareContext();
        // 2.prepare configuration.
        List<Configuration> configurationList = configurationDiscovery.discovery();

        // 3.build communication between containers.
        List<EndpointConfig> endpointConfigList = Lists.newArrayList();
        ApplicationConfig applicationConfig = null;
        for(Configuration configure : configurationList) {
            if (ApplicationConfig.class.isAssignableFrom(configure.getClass())) {
                applicationConfig = (ApplicationConfig)configure;
            } else if (EndpointConfig.class.isAssignableFrom(configure.getClass())) {
                endpointConfigList.add((EndpointConfig)configure);
            } else {
                logger.info("Unknown Configuration: {}.", configure);
            }
        }
        wormhole.reference(endpointConfigList);
        wormhole.export(applicationConfig);

        // 4.scan local services by configuration.
        List<LocalServiceWrapper> serviceList = scanner.scanServices(applicationConfig);
        List<LocalReferenceWrapper> referenceList = scanner.scanReferences(endpointConfigList);

        // 5.本地服务注册到通信通道
        // 将外部服务依赖注入到本地服务
        wormhole.serviceRegistry(serviceList);
        wormhole.referenceRegistry(referenceList);

        // 6.finish refresh application context.
        finishRefresh();
    }

    /**
     * 准备刷新上下文.
     */
    protected void prepareContext() {
        // do nothing here. because i don't know what need to do here now.
    }

    /**
     * 完成上下文刷新.
     */
    protected void finishRefresh() {
        // do nothing here. because i don't know what need to do here now.
    }

    public void setConfigurationDiscovery(ConfigurationDiscovery configurationDiscovery) {
        this.configurationDiscovery = configurationDiscovery;
    }

    public void setWormhole(Wormhole wormhole) {
        this.wormhole = wormhole;
    }

    public void setScanner(LocalServiceScanner scanner) {
        this.scanner = scanner;
    }
}