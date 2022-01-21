package fab3f.dellavaro.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static fab3f.dellavaro.DelLaVaro.prefixError;

public class SetHomeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(prefixError + "Dieser Befehl kann nur von einem Spieler ausgeführt werden!");
            return false;
        }



        return false;
    }
}
