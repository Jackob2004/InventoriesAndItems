package me.shadow_warrior_.inventoriesanditems;

import me.shadow_warrior_.inventoriesanditems.commands.MenuCommand;
import me.shadow_warrior_.inventoriesanditems.listeners.MenuListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class InventoriesAndItems extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("menu").setExecutor(new MenuCommand());
        getServer().getPluginManager().registerEvents(new MenuListener(),this);

    }


}
