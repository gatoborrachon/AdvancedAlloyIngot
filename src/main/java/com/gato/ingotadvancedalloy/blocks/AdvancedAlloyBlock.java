package com.gato.ingotadvancedalloy.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AdvancedAlloyBlock extends BlockBase {

	public AdvancedAlloyBlock(String name, Material material) {
		super(name, material);

		setSoundType(SoundType.METAL);
		setHardness(15.0F);
		setResistance(6000.0f);
		setHarvestLevel("pickaxe", 3);
	}
}