package fab3f.dellavaro;

import fab3f.dellavaro.commands.DoCommand;
import fab3f.dellavaro.commands.TestCommand;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class DelLaVaro extends JavaPlugin {

    public static String prefixError = ChatColor.RED + "[Del La Varo] " + ChatColor.YELLOW;
    public static String prefix = ChatColor.GREEN + "[Del La Varo] " + ChatColor.LIGHT_PURPLE;

    public static boolean debug = true;
    public static void println(String print){System.out.println(print);}
    public static void print(String print){System.out.print(print);}


    @Override // Plugin startup logic
    public void onEnable() {

        println(prefix + "Plugin aktiviert");
        getCommand("test").setExecutor(new TestCommand());
        getCommand("do").setExecutor(new DoCommand());


    }

    @Override // Plugin shutdown logic
    public void onDisable() {

        println(prefix + "Plugin deaktiviert");

    }
}