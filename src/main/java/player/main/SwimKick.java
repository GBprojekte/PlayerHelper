package player.main;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerKickEvent;
import cn.nukkit.event.player.PlayerToggleSwimEvent;

public class SwimKick implements Listener {

    @EventHandler
    public void swim(PlayerToggleSwimEvent event) {
        Player p = event.getPlayer();
        p.kick(PlayerKickEvent.Reason.KICKED_BY_ADMIN);
    }
}
