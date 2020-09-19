package com.gato.ingotadvancedalloy.util.compat;

import com.gato.ingotadvancedalloy.init.ModBlocks;
import com.gato.ingotadvancedalloy.init.ModItems;

import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompat 
{
	public static void registerOres()
	{
		//Ingot
		OreDictionary.registerOre("ingotAdvancedAlloy", ModItems.ADVANCED_ALLOY_INGOT);
		OreDictionary.registerOre("ingotChrome", ModItems.CHROME_INGOT);

		
		//blocks
		OreDictionary.registerOre("blockAdvancedAlloy", ModBlocks.ADVANCED_ALLOY_BLOCK);
		
	}
}
