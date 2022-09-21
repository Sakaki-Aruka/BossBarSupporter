package barsupporter.barsupporter;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent;

import static barsupporter.barsupporter.EnterEnd.showPlayers;
import static barsupporter.barsupporter.Spawn.*;

public class Damage {
    public void entityDamage(EntityDamageEvent event){
        if(event.getEntityType().equals(EntityType.ENDER_DRAGON) && enderDragonHealth - event.getDamage() >= 0){
            enderDragonHealth -= event.getDamage();
            double enderProgress = enderDragonHealth / enderDragonMaxHealth;
            bossBar.setProgress(enderProgress);
        }
    }
}
