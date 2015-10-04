package net.amigocraft.bardingcraft;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class BardingCraft extends JavaPlugin {
	
	public void onEnable(){
		Recipe iron = new ShapedRecipe(new ItemStack(Material.IRON_BARDING, 1)).shape("XXI", "IWI", "III")
				.setIngredient('I', Material.IRON_INGOT).setIngredient('W', Material.WOOL, -1);
		Recipe gold = new ShapedRecipe(new ItemStack(Material.GOLD_BARDING, 1)).shape("XXG", "GWG", "GGG")
				.setIngredient('G', Material.GOLD_INGOT).setIngredient('W', Material.WOOL, -1);
		Recipe diamond = new ShapedRecipe(new ItemStack(Material.DIAMOND_BARDING, 1)).shape("XXD", "DWD", "DDD")
				.setIngredient('D', Material.DIAMOND).setIngredient('W', Material.WOOL, -1);
		getServer().addRecipe(iron);
		getServer().addRecipe(gold);
		getServer().addRecipe(diamond);
	}
}
