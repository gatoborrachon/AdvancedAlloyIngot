package com.gato.ingotadvancedalloy.util.compat;

import com.gato.ingotadvancedalloy.init.ModItems;

import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompat 
{
	public static void registerOres()
	{
		OreDictionary.registerOre("ingotAdvancedAlloy", ModItems.ADVANCED_ALLOY_INGOT);
		
	}
}
