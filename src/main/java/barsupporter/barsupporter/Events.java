package barsupporter.barsupporter;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

import javax.swing.text.html.parser.Entity;

public class Events implements Listener {
    @EventHandler
    public void onCreatureSpawn(CreatureSpawnEvent event){
        new Spawn().spawnMain(event);
    }

    @EventHandler
    public void onPlayerTeleport(PlayerTeleportEvent event){
        new EnterEnd().enterEndMain(event);
    }

    @EventHandler
    public void onEntityDamage(EntityDamageEvent event){
        new Damage().entityDamage(event);
    }

    @EventHandler
    public void onEntityDeath(EntityDeathEvent event){
        new Death().entityDeathMain(event);
    }
}
