package player.main;

import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.plugin.PluginManager;
import cn.nukkit.utils.Config;
import java.io.File;
import static java.lang.Boolean.TRUE;

public class main extends PluginBase implements Listener {

    @Override
    public void onEnable() {
        this.Config();
        this.registerListener();
        this.Tester();
     this.getLogger().info("PlayerHelper geladen!");
        super.onEnable();
    }

    private void Config() {
        this.getLogger().info("private void Config() geladen");
        if (getResource("config.yml") != null) {
            saveResource("config.yml");
        }

        if (getResource("NukkitStarter.bat") != null) {
            saveResource("NukkitStarter.bat");
        }

        if (getResource("LIESMICH.txt") != null) {
            saveResource("LIESMICH.txt");
        }
        new Config(new File(getDataFolder(), "config.yml"), Config.YAML);
    }

    private void Tester(){
        this.getLogger().info("private void Tester() geladen");

        if (getConfig().getBoolean("DeathKick", TRUE)) {
            this.DeathKicker();
        }else{
            getLogger().info("§cSpieler werden jetzt nicht mehr nach dem Sterben gekickt");
        }

        if (getConfig().getBoolean("ServerProtector", TRUE)) {
            this.ServerProtect();
        }else{
            this.getLogger().info("§cDein Server wird jetzt nicht mehr geschützt vor HackClients");
        }

        if (getConfig().getBoolean("SwimKick", TRUE)) {
            this.SwimKicker();
        }else{
            this.getLogger().info("§cSpieler werden jetzt nicht mehr beim Schwimmen gekickt");
        }

        if (getConfig().getBoolean("FlightKick", TRUE)) {
            this.FlightKicker();
        }else{
            this.getLogger().info("§cSpieler werden jetzt nicht mehr beim Versuch zu fliegen gekickt");
        }

        if (getConfig().getBoolean("BedKick", TRUE)) {
            this.BedKicker();
        }else{
            this.getLogger().info("§cSpieler werden jetzt nicht mehr beim versuch zu schlafen gekickt");
        }

        if (getConfig().getBoolean("JoinMessages", TRUE)) {
            this.JoinMessages();
        }else{
            this.getLogger().info("§cSpieler erhlaten beim Joinen jetzt nicht mehr die Messages von PlayerHelper");
        }

        if (getConfig().getBoolean("GrabHilfe", TRUE)) {
            PluginManager pm = this.getServer().getPluginManager();
            pm.registerEvents(new Grabhilfe(), this);
            this.grabhilfe();
        }else{
            getLogger().info("§cSpieler erhalten beim Sneaken jetzt keine Schaufeln mehr");
        }
    }

    private void DeathKicker() {
        this.getServer().getPluginManager().registerEvents(new DeathKick(), this);
    }

    private void ServerProtect() {
        this.getServer().getPluginManager().registerEvents(new Schaufel(), this);
    }

    private void BedKicker() {
        this.getServer().getPluginManager().registerEvents(new BedKick(), this);
    }

    private void SwimKicker() {
        this.getServer().getPluginManager().registerEvents(new SwimKick(), this);
    }

    private void FlightKicker() {
        this.getServer().getPluginManager().registerEvents(new FlightKick(), this);
    }

    private void JoinMessages() {
        this.getServer().getPluginManager().registerEvents(new PlayerJoinMessages(), this);
    }

    private void grabhilfe() {
        PluginManager pm = this.getServer().getPluginManager();
        this.getServer().getPluginManager().registerEvents(new Grabhilfe(), this);
        this.getLogger().info("Private void grabhilfe() geladen");
    }

    private void registerListener() {
        PluginManager pm = this.getServer().getPluginManager();
        this.getServer().getPluginManager().registerEvents(new Schaufel(), this);
        this.getLogger().info("Private void registerListener() geladen");
    }

    @Override
    public void onDisable() {
        this.getLogger().info("PlayerHelper entladen!");
        super.onDisable();
    }

}
