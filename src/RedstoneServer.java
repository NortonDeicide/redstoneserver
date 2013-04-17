package redstoneserver.src;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.SidedProxy;

@Mod (modid = "RedstoneServerMod", name = "Redstone Server Modding", version = "0.0.2")
@NetworkMod (clientSideRequired = true, serverSideRequired = false, versionBounds = "1.0")

public class RedstoneServer
{
	@Instance("TestModID")
	public static RedstoneServer instance;
	
	public static EnumToolMaterial apple = EnumHelper.addToolMaterial("APPLE", 9999, 9999, 9999F, 9999, 9999);
	
	public static Item sawSword = new ItemSawSwordRS(7868, EnumToolMaterial.EMERALD).setItemName("sawSword").setIconCoord(0, 0);
	public static Item greatApple = new ItemApple(7869, apple).setItemName("greatApple").setIconCoord(1, 0);
	
	
	@Init
	public void load(FMLInitializationEvent event)
	{
		LanguageRegistry.addName(sawSword, "Serrated Sword");
		LanguageRegistry.addName(greatApple, "Secret Apple");
		GameRegistry.addRecipe(new ItemStack(sawSword, 1), new Object[] {"AII", "ISI", "SIA", 'A', Item.diamond, 'I', Item.ingotIron, 'S', Item.stick});
		GameRegistry.addRecipe(new ItemStack(greatApple, 1), new Object[] {"A", 'A', Item.stick});
	}

	@PreInit
	public void preLoad(FMLPreInitializationEvent event)
	{
		
	}

	@PostInit
	public void postLoad(FMLPostInitializationEvent event)
	{
		
	}
}
