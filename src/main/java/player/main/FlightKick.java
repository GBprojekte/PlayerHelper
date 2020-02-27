package player.main;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerKickEvent;
import cn.nukkit.event.player.PlayerToggleFlightEvent;

public class FlightKick implements Listener {

    @EventHandler
    public void flight(PlayerToggleFlightEvent event) {
        Player p = event.getPlayer();
        p.kick(PlayerKickEvent.Reason.FLYING_DISABLED);
    }
}
