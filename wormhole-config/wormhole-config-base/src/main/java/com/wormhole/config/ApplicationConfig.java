package com.wormhole.config;

import java.util.List;

/**
 * 服务暴露配置.
 *
 * @author jinshulin (jinshulin@zhengheyingshi.com)
 * @since 2018年02月01日 16时08分
 */
public class ApplicationConfig implements Configuration {
    /**
     * 暴露的服务名称.
     */
    private String application;
    /**
     * 服务中暴露的接口列表.
     */
    private List<ServiceConfig> serviceConfigList;
}
