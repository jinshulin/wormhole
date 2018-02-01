package com.wormhole.config.spi;

import java.util.List;
import com.wormhole.config.Configuration;

/**
 * 配置发现接口.
 *
 * @author jinshulin (jinshulin@zhengheyingshi.com)
 * @since 2018年02月01日 16时29分
 */
public interface ConfigurationDiscovery {

    /**
     * 初始化服务配置<br/>
     * 包括服务的暴露和服务发现.
     * @return 发现的配置项
     */
    List<Configuration> discovery();
}
