package AdvancedChatOptimizer;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class AdvancedChatOptimizer extends JavaPlugin {

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new ChatListener(this),this);
        Bukkit.getConsoleSender().sendMessage("§c[AdvancedChatOptimizer] Plugin Enabled");
        Bukkit.getConsoleSender().sendMessage("§c----------------------O--------------------");
        Bukkit.getConsoleSender().sendMessage("§c------------O-------OOOOO-----OOOOOO-------");
        Bukkit.getConsoleSender().sendMessage("§c-----------OO------OO---OO---O-----OO------");
        Bukkit.getConsoleSender().sendMessage("§c-----------OO------O-----O--OO------O------");
        Bukkit.getConsoleSender().sendMessage("§c----------O-OO----OO--------OO------OO-----");
        Bukkit.getConsoleSender().sendMessage("§c----------OOOO----OO--------O-------OO-----");
        Bukkit.getConsoleSender().sendMessage("§c----------OOOOO---OO--------O-------OO-----");
        Bukkit.getConsoleSender().sendMessage("§c---------O---OO---OO--------OO------O------");
        Bukkit.getConsoleSender().sendMessage("§c---------O----O---OO-----O---OO----OO------");
        Bukkit.getConsoleSender().sendMessage("§c-------OOOO--OOOO--OO---OO----OOOOOO-------");
        Bukkit.getConsoleSender().sendMessage("§c---------------------OOOO------------------");
        Bukkit.getConsoleSender().sendMessage("§c-------------------------------------------");
    }
    public void onDisable() {
        getServer().getPluginManager().disablePlugin(this);
        Bukkit.getConsoleSender().sendMessage("§c[AdvancedChatOptimizer] Plugin Disabled");
    }
}
