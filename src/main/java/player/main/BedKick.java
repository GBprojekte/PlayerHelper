package player.main;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerBedEnterEvent;
import cn.nukkit.event.player.PlayerKickEvent;

public class BedKick implements Listener {

    @EventHandler
    public void Bed(PlayerBedEnterEvent event) {
        Player p = event.getPlayer();
        p.kick(PlayerKickEvent.Reason.KICKED_BY_ADMIN);
    }
}
