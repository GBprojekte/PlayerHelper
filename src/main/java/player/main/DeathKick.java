package player.main;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerDeathEvent;
import cn.nukkit.event.player.PlayerKickEvent;

public class DeathKick implements Listener {

    @EventHandler
    public void death(PlayerDeathEvent event) {
        Player p =event.getEntity();
        p.kick(PlayerKickEvent.Reason.KICKED_BY_ADMIN);
    }
}
