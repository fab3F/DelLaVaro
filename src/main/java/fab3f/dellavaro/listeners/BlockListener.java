package fab3f.dellavaro.listeners;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import static fab3f.dellavaro.DelLaVaro.prefix;

public class BlockListener implements Listener {

    @EventHandler(ignoreCancelled = true)
    public void onBlockBreak(BlockBreakEvent event) {
        if(!event.getPlayer().getGameMode().equals(GameMode.CREATIVE)){
            event.setCancelled(true);
        }

    }

    @EventHandler(ignoreCancelled = true)
    public void onBlockPlace(BlockPlaceEvent event) {
        if(!event.getPlayer().getGameMode().equals(GameMode.CREATIVE)){
            event.setCancelled(true);
        }
    }
}
