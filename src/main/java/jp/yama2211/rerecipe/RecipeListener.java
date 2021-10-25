package jp.yama2211.rerecipe;

import org.bukkit.Material;

import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class RecipeListener implements Listener {

    public ShapedRecipe recipeGoldApple() {
        //エンチャントされた金りんご
        ItemStack GoldApple = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE);

        ShapedRecipe GoldAppleRecipe = new ShapedRecipe(GoldApple);
        GoldAppleRecipe.shape("GGG","GAG","GGG");
        GoldAppleRecipe.setIngredient('G',Material.GOLD_BLOCK);
        GoldAppleRecipe.setIngredient('A',Material.APPLE);
        return GoldAppleRecipe;
    }

    public ShapedRecipe ReCraftTable() {
        //作業台
        ItemStack OAK = new ItemStack(Material.OAK_PLANKS,4);

        ShapedRecipe ReCraftTable = new ShapedRecipe(OAK);
        ReCraftTable.shape("AAA","ACA","AAA");
        ReCraftTable.setIngredient('C',Material.CRAFTING_TABLE);
        ReCraftTable.setIngredient('A',Material.AIR);
        return ReCraftTable;
    }

}