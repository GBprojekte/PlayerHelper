package player.main;

import cn.nukkit.Nukkit;
import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.inventory.InventoryOpenEvent;
import cn.nukkit.event.player.*;
import cn.nukkit.inventory.Inventory;
import cn.nukkit.inventory.transaction.action.SlotChangeAction;
import cn.nukkit.item.Item;

import static cn.nukkit.Player.CREATIVE;
import static cn.nukkit.Player.SURVIVAL;

public class Schaufel implements Listener {

    @EventHandler
    public void death(PlayerDeathEvent event) {
    }

    @EventHandler
    public void Player1(PlayerMoveEvent event) {
        Player p = event.getPlayer();

        if (p.gamemode == CREATIVE) {
            if (p.isOp()) {
            }else{
                p.kick(PlayerKickEvent.Reason.KICKED_BY_ADMIN);
            }
        }

        if (p.isOnFire()) {
            p.setOnFire(1);
        }
    }
}
