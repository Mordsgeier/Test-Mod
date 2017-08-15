package mordsgeier.test.init;

import mordsgeier.test.Reference;
import mordsgeier.test.init.blocks.CustomOre;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockInit {
	
	public static Block tree_ore;
	
	public static void init() {
		
		tree_ore = new CustomOre("tree_ore", 2.0F, 4.0F, 2);
		
	}
	
	public static void register() {
		
		registerBlock(tree_ore);
		
	}
	
	public static void registerBlock(Block block) {
	
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "iventory"));
		
	}
	
}