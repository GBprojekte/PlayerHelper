package player.main;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.EventPriority;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerEvent;
import cn.nukkit.event.player.PlayerMoveEvent;
import cn.nukkit.event.player.PlayerToggleSneakEvent;
import cn.nukkit.item.Item;

import java.lang.annotation.Annotation;

public class Grabhilfe implements Listener {

    @EventHandler
    public void onPlayerSneaking(PlayerToggleSneakEvent event) {
        Player p = event.getPlayer();

        p.getInventory().setItem(0, Item.get( Item.DIAMOND_SHOVEL).setCustomName("§eGrabHilfe"));
    }
}
