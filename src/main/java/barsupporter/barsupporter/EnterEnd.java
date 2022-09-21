package barsupporter.barsupporter;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerTeleportEvent;

import java.util.ArrayList;

import static barsupporter.barsupporter.Spawn.bossBar;

public class EnterEnd {
    public static ArrayList<Player> showPlayers;

    public void enterEndMain(PlayerTeleportEvent event){
        String uuidStr = event.getPlayer().getUniqueId().toString();
        String goTo = event.getTo().getWorld().getName();
        String from = event.getFrom().getWorld().getName();

        if(uuidStr.startsWith("00000000") && bossBar != null && goTo.equalsIgnoreCase("weekly_end") && !(from.equalsIgnoreCase("weekly_end"))){
            //BE player(throw geyser)
            Player player = event.getPlayer();
            bossBar.addPlayer(player);
            showPlayers.add(player);
        }else if(!(goTo.equalsIgnoreCase("weekly_end")) && from.equalsIgnoreCase("weekly_end")){
            bossBar.removePlayer(event.getPlayer());
            showPlayers.remove(event.getPlayer());
        }
    }
}
