package barsupporter.barsupporter;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import static barsupporter.barsupporter.EnterEnd.showPlayers;
import static barsupporter.barsupporter.Spawn.bossBar;

public final class BarSupporter extends JavaPlugin implements CommandExecutor {

    public void load(){
        new SettingsLoad().fc(getConfig());
    }

    @Override
    public void onEnable() {
        this.load();
        getServer().getPluginManager().registerEvents(new Events(),this);
        getCommand("forceremovebar").setExecutor(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command,String label,String[] args){
        if(sender.isOp()){
            for(Player loop : showPlayers){
                bossBar.removePlayer(loop);
                showPlayers.remove(showPlayers);
            }
            sender.sendMessage("force remove complete.");
            sender.sendMessage("players:"+showPlayers);
            return true;
        }else{
            return false;
        }
    }
}
