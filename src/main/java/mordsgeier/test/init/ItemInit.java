package mordsgeier.test.init;

import mordsgeier.test.Reference;
import mordsgeier.test.init.items.CustomIngot;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemInit {
	
	public static Item tree_ingot;
	
	public static void init() {
		
		tree_ingot = new CustomIngot("tree_ingot");
		
	}

	public static void register() {
		
		registerItem(tree_ingot);
		
	}
	
	public static void registerItem(Item item) {
		
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
			
	}
	
}
