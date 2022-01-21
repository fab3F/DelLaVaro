package fab3f.dellavaro.commands;

import org.bukkit.Bukkit;
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

        if (player.isOp()) {
            if (args.length == 1) {
                performTheCommand(args[0], player, player);
                return true;
            } else if (args.length == 2) {
                Player target = Bukkit.getPlayer(args[1]);
                if(!(target == null)) {
                    if (target.isOnline()) {
                        performTheCommand(args[0], target, player);
                    } else {
                        player.sendMessage(prefixError + "Dieser Spieler ist nicht online und/oder existiert nicht!");
                    }
                }else{
                    player.sendMessage(prefixError + "Dieser Spieler ist nicht online und/oder existiert nicht!");
                }
                return true;
            } else {
                sendCommandUsage(player);
                return true;
            }

        } else {
            player.sendMessage(prefixError + "Du musst ein Operator sein, um deinen Spielmodus zu wechseln");
            return true;
        }
    }



    public void performTheCommand(String command, Player target, Player sender){

        if(command.equalsIgnoreCase("gm0")) {
            target.setGameMode(GameMode.SURVIVAL);
            target.sendMessage(prefix + "Spielmodus geändert!");
            if(!(target == sender))
                sender.sendMessage(prefix + "Spielmodus geändert!");
        }
        else if(command.equalsIgnoreCase("gm1")) {
            target.setGameMode(GameMode.CREATIVE);
            target.sendMessage(prefix + "Spielmodus geändert!");
            if(!(target == sender))
                sender.sendMessage(prefix + "Spielmodus geändert!");
        }
        else if(command.equalsIgnoreCase("gm2")) {
            target.setGameMode(GameMode.ADVENTURE);
            target.sendMessage(prefix + "Spielmodus geändert!");
            if(!(target == sender))
                sender.sendMessage(prefix + "Spielmodus geändert!");
        }
        else if(command.equalsIgnoreCase("gm3")) {
            target.setGameMode(GameMode.SPECTATOR);
            target.sendMessage(prefix + "Spielmodus geändert!");
            if (!(target == sender))
                sender.sendMessage(prefix + "Spielmodus geändert!");
        }else if(command.equalsIgnoreCase("heal")){
            target.setHealth(20);
            target.setFoodLevel(20);
            target.sendMessage(prefix + "Heilung erhalten!");
            if (!(target == sender))
                sender.sendMessage(prefix + "Der Spieler wurde geheilt!");
        }else{
            sendCommandUsage(sender);
        }
    }

    public static void sendCommandUsage(Player p){
        p.sendMessage(prefixError + "Bitte benutze '/do <befehl> [spieler]'\nFolgende Möglichkeiten sind gegeben '/do <gm0 | gm1 | gm2 | gm3 | heal> [spieler]");
    }

}