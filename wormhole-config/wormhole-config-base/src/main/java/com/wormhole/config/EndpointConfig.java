package com.wormhole.config;

import java.util.List;

/**
 * 远端依赖服务配置.
 *
 * @author jinshulin (jinshulin@zhengheyingshi.com)
 * @since 2018年02月01日 16时07分
 */
public class EndpointConfig implements Configuration {
    /**
     * 远端服务名称.
     */
    private String endpoint;
    /**
     * 依赖的服务配置.
     */
    private List<ReferenceConfig> referenceConfigList;
}
