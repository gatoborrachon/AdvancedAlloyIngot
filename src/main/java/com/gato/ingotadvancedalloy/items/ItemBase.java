package com.gato.ingotadvancedalloy.items;

import com.gato.ingotadvancedalloy.Main;
import com.gato.ingotadvancedalloy.init.ModItems;
import com.gato.ingotadvancedalloy.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
	
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
