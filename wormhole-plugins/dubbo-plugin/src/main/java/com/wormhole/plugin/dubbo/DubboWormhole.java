package com.wormhole.plugin.dubbo;

import java.rmi.RemoteException;
import java.util.List;
import com.wormhole.config.Aircraft;
import com.wormhole.config.ApplicationConfig;
import com.wormhole.config.EndpointConfig;
import com.wormhole.config.spi.Wormhole;

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

    public Object sendMessage(Aircraft aircraft) throws RemoteException {
        return null;
    }

    public void serviceRegistry(Object service) {

    }
}
