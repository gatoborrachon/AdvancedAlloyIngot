package com.gato.ingotadvancedalloy.init;

import java.util.ArrayList;
import java.util.List;

import com.gato.ingotadvancedalloy.blocks.AdvancedAlloyBlock;
import com.gato.ingotadvancedalloy.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ADVANCED_ALLOY_BLOCK = new AdvancedAlloyBlock("advanced_alloy_block", Material.IRON);
}