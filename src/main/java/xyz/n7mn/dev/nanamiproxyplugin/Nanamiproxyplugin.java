package xyz.n7mn.dev.nanamiproxyplugin;

import com.google.inject.Inject;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyPingEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.plugin.PluginContainer;
import com.velocitypowered.api.proxy.ProxyServer;
import org.slf4j.Logger;

import java.util.*;


@Plugin(
        id = "nanamiproxyplugin",
        name = "NanamiProxyPlugin",
        version = BuildConstants.VERSION,
        description = "NanamiProxyPlugin",
        url = "https://twitter.com/7mi_network",
        authors = {"7mi_chan"}
)
public class Nanamiproxyplugin {

    @Inject
    private Logger logger;

    @Inject
    private ProxyServer proxyServer;

    private Optional<PluginContainer> plugin;

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {

        plugin = proxyServer.getPluginManager().getPlugin("nanamiproxyplugin");
    }

    @Subscribe
    public void ProxyPingEvent(ProxyPingEvent e){


    }
}
