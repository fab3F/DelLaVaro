package fab3f.dellavaro.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import static fab3f.dellavaro.DelLaVaro.prefix;

public class TestCommand implements CommandExecutor {


    /**
     * Executes the given command, returning its success.
     * <br>
     * If false is returned, then the "usage" plugin.yml entry for this command
     * (if defined) will be sent to the player.
     *
     * @param sender  Source of the command
     * @param command Command which was executed
     * @param label   Alias of the command which was used
     * @param args    Passed command arguments
     * @return true if a valid command, otherwise false
     *
     * Addition by fa3F
     * Zum Beispiel bei dem DoCommand gebe ich selbstständig die
     * richtige Benutzung des Befehls zurück, deswegen
     * setzte ich 'return true' ein, damit die Benutzung aus
     * der "plugin.yml" nicht auch noch ausgegeben wird.
     * Trotzdem sollte die 'usage' in "plugin.yml" definiert
     * werden damit sie bei z.B. '/help /do' für den Befehl
     * angezeigt werden kann!
     *
     */


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        sender.sendMessage(prefix + "Test ausgeführt!");
        return true;
    }
}
