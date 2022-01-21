package fab3f.dellavaro.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static fab3f.dellavaro.DelLaVaro.prefix;
import static fab3f.dellavaro.DelLaVaro.prefixError;

public class DoCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(prefixError + "Dieser Befehl kann nur von einem Spieler ausgeführt werden!");
            return false;
        }

        Player player = (Player) sender;
        String s = args[0];

        if (args.length >= 1) {


            if(s.startsWith("gm")){

                if(player.isOp()) {

                    if (s.equalsIgnoreCase("gm0")) {
                        player.setGameMode(GameMode.SURVIVAL);
                        player.sendMessage(prefix + "Spielmodus geändert!");
                        return true;
                    } else if (s.equalsIgnoreCase("gm1")) {
                        player.setGameMode(GameMode.CREATIVE);
                        player.sendMessage(prefix + "Spielmodus geändert!");
                        return true;
                    } else if (s.equalsIgnoreCase("gm2")) {
                        player.setGameMode(GameMode.ADVENTURE);
                        player.sendMessage(prefix + "Spielmodus geändert!");
                        return true;
                    } else if (s.equalsIgnoreCase("gm3")) {
                        player.setGameMode(GameMode.SPECTATOR);
                        player.sendMessage(prefix + "Spielmodus geändert!");
                        return true;
                    } else {
                        player.sendMessage(prefixError + "Kein passender Gamemode angegeben, z.B. /do gm1");
                        return false;
                    }

                }else{
                    player.sendMessage(prefixError + "Du musst ein Operator sein, um deinen Spielmodus zu wechseln");
                }


            }else{
                sendCommandUsage(sender);}

        } else {
            sendCommandUsage(sender);}

        return false;
    }

    public static void sendCommandUsage(CommandSender sender){sender.sendMessage(prefixError + "Benutzung: /do <command>");}

}