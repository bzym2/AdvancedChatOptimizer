package AdvancedChatOptimizer;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;

public class ChatListener implements Listener {
    private final AdvancedChatOptimizer plugin;

    public ChatListener(AdvancedChatOptimizer plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        String message = event.getMessage();
        event.setCancelled(true);
        FileConfiguration cfg = plugin.getConfig();
        Bukkit.broadcastMessage(getCurrentDimension(event.getPlayer())+" "+event.getPlayer().getName()+": "+ChatColor.translateAlternateColorCodes('&', message));
    }

    public String getCurrentDimension(Player player) {
        World world = player.getWorld();
        String worldName = world.getName();
        if (worldName.equalsIgnoreCase("world")) {
            return ChatColor.GREEN+"[主世界]";
        } else if (worldName.equalsIgnoreCase("world_nether")) {
            return ChatColor.RED+"[地狱]";
        } else if (worldName.equalsIgnoreCase("world_the_end")) {
            return ChatColor.YELLOW+"[末地]";
        };
        return " ";
    };
}
