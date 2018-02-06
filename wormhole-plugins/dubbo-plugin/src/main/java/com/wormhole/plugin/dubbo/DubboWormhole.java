package com.wormhole.plugin.dubbo;

import com.wormhole.core.spi.Aircraft;
import com.wormhole.core.spi.Wormhole;
import com.wormhole.core.wrapper.LocalReferenceWrapper;
import com.wormhole.core.wrapper.LocalServiceWrapper;
import java.rmi.RemoteException;
import java.util.List;
import com.wormhole.config.ApplicationConfig;
import com.wormhole.config.EndpointConfig;

/**
 * Dubbo版本的虫洞.
 *
 * @author jinshulin (jinshulin@zhengheyingshi.com)
 * @since 2018年02月01日 17时58分
 */
public class DubboWormhole implements Wormhole {

    public void export(ApplicationConfig config) {

    }

    public void reference(List<EndpointConfig> configs) {

    }

    public void serviceRegistry(List<LocalServiceWrapper> services) {

    }

    public void referenceRegistry(List<LocalReferenceWrapper> references) {

    }

}
