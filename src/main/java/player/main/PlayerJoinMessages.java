package player.main;

import cn.nukkit.Nukkit;
import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;

public class PlayerJoinMessages implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player p = event.getPlayer();

        if (p.isOp()) {
            p.sendMessage("§cWillkommen auf §aMC§cLove");
            p.sendMessage("§eNukkit für§b " + Nukkit.MINECRAFT_VERSION);
            p.sendMessage("§eNukkit API Version =§b " + Nukkit.API_VERSION);
        }else{
            p.sendMessage("§cWillkommen auf §aMC§cLove");
            p.sendMessage("§cBITTE KEINE ITEMS IM SLOT GANZ LINKS AUFBEWAHREN!!!!!!!");
        }
    }

}
