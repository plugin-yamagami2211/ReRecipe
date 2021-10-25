package jp.yama2211.rerecipe;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {
    private String Pex;
    @Override
    public void onEnable() {
        // Plugin startup logic
        Update();
        Pex = "[" + ChatColor.AQUA + "ReRecipe" + ChatColor.RESET + "]";
        RecipeListener recipeListener = new RecipeListener();
        getServer().getPluginManager().registerEvents(recipeListener,this);
        getServer().addRecipe(recipeListener.recipeGoldApple());
        getServer().addRecipe(recipeListener.ReCraftTable());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void Update() {
        if(getConfig().getBoolean("Update2")){
            UpdateCheck updateCheck = new UpdateCheck("Update");
            String nowVer = getDescription().getVersion();
            String version = updateCheck.getVersion();

            if(version == null){
                Bukkit.getConsoleSender().sendMessage(Pex + "バージョンチェックに失敗しました。");
            } else if(!nowVer.equals(version)){
                Bukkit.getConsoleSender().sendMessage(Pex + "利用可能なアップデートがあります。");
                Bukkit.getConsoleSender().sendMessage(Pex + "現在のバージョン:"+ nowVer + "/最新のバージョン:" + version);
            }

        }
    }
}
