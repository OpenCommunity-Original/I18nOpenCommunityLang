package org.opencommunity.I18nLang;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.ResourceBundle;


public class Main extends JavaPlugin implements Listener {
    private ResourceBundle messages;

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        LocaleAPI localeAPI = new LocaleAPI();
        Bukkit.getPluginManager().registerEvents(localeAPI, this);
        localeAPI.loadSupportedLocales(this);
    }

    @EventHandler
    public void onPlayerJoin(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        String message = LocaleAPI.getMessage(player, "welcome_message");
        event.getPlayer().sendMessage(message);
    }
}
