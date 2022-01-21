package fab3f.dellavaro.commands;

import fab3f.dellavaro.DelLaVaro;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.ConfigurationOptions;
import org.bukkit.entity.Player;


import static fab3f.dellavaro.DelLaVaro.prefixError;

public class HomeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(prefixError + "Dieser Befehl kann nur von einem Spieler ausgeführt werden!");
            return false;
        }

        Player player = (Player) sender;




        if (args.length == 0) {
            return true;
        }else{
            return false;
        }
    }
}
