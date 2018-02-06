package com.wormhole.core.spi;

import com.wormhole.config.ReferenceConfig;

/**
 * 行器可以携带物资和星图，穿越虫洞，到达彼岸.
 *
 * @author jinshulin (jinshulin@zhengheyingshi.com)
 * @since 2018年02月01日 17时43分
 */
public class Aircraft {

    /**
     * 飞行器携带的物资.
     */
    private Object[] packages;
    /**
     * 飞行器到达彼岸的星图.
     */
    private ReferenceConfig config;
}
