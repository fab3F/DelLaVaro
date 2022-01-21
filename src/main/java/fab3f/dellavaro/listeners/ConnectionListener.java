package fab3f.dellavaro.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import static fab3f.dellavaro.DelLaVaro.prefix;

public class ConnectionListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        if(player != null && player.isOp())
            event.setJoinMessage(prefix + "Die Legende " + ChatColor.DARK_RED + player.getName() + ChatColor.LIGHT_PURPLE + " hat den Server betreten!");
        else
            event.setJoinMessage(prefix + ChatColor.GRAY + player.getName() + ChatColor.LIGHT_PURPLE + " hat den Server betreten!");

    }

    @EventHandler
    public void onLeft(PlayerQuitEvent event){
        Player player = event.getPlayer();
        if(player != null && player.isOp())
            event.setQuitMessage(prefix + "Die Legende " + ChatColor.DARK_RED + player.getName() + ChatColor.LIGHT_PURPLE + " hat den Server leider verlassen!");
        else
            event.setQuitMessage(prefix + ChatColor.GRAY + player.getName() + ChatColor.LIGHT_PURPLE + " hat den Server verlassen!");


    }
}
