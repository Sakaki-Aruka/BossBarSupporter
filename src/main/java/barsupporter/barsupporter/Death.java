package barsupporter.barsupporter;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDeathEvent;

import static barsupporter.barsupporter.EnterEnd.showPlayers;
import static barsupporter.barsupporter.Spawn.bossBar;
import static barsupporter.barsupporter.Spawn.enderDragonHealth;

public class Death {
    public void entityDeathMain(EntityDeathEvent event){
        if(event.getEntityType().equals(EntityType.ENDER_DRAGON)){
            for(Player loop : showPlayers){
                bossBar.removePlayer(loop);
                showPlayers.remove(loop);
                enderDragonHealth = 0;
            }
            Server server = Bukkit.getServer();
            server.getLogger().info("A EnderDragon was killed by "+event.getEntity().getKiller());
        }
    }
}
