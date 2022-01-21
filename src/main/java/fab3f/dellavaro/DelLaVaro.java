package fab3f.dellavaro;

import fab3f.dellavaro.commands.DoCommand;
import fab3f.dellavaro.commands.HomeCommand;
import fab3f.dellavaro.commands.SetHomeCommand;
import fab3f.dellavaro.commands.TestCommand;
import fab3f.dellavaro.listeners.BlockListener;
import fab3f.dellavaro.listeners.ConnectionListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.plugin.PluginManager;
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
        getCommand("home").setExecutor(new HomeCommand());
        getCommand("sethome").setExecutor(new SetHomeCommand());

        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new BlockListener(), this);
        pluginManager.registerEvents(new ConnectionListener(), this);

    }

    @Override // Plugin shutdown logic
    public void onDisable() {

        println(prefix + "Plugin deaktiviert");

    }
}