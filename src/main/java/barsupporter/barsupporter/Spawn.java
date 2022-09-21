package barsupporter.barsupporter;

import org.bukkit.Bukkit;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.EntityType;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class Spawn {
    public static double enderDragonHealth;
    public static final double enderDragonMaxHealth = 200;
    public static BossBar bossBar;

    public void spawnMain(CreatureSpawnEvent event){
        Bukkit.broadcastMessage(event.getEntity().getName());
        if(event.getEntityType().equals(EntityType.ENDER_DRAGON)){
            enderDragonHealth = event.getEntity().getHealth();
            bossBar = Bukkit.createBossBar("Ender Dragon", BarColor.PURPLE, BarStyle.SOLID, BarFlag.DARKEN_SKY);
            bossBar.setProgress(1);
        }
    }
}
