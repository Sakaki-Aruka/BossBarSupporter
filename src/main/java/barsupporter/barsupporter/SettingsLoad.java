package barsupporter.barsupporter;

import org.bukkit.configuration.file.FileConfiguration;

public class SettingsLoad {
    public static FileConfiguration FC;

    public void fc(FileConfiguration fileConfiguration){
        FC = fileConfiguration;
        this.loadMain();
    }

    private void loadMain(){
        //
    }
}
