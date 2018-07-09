package jaredbgreat.climaticbiome.blocks.itemblocks;

import jaredbgreat.climaticbiome.Info;
import jaredbgreat.climaticbiome.blocks.ModBlockBase;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

// This may become a multi-block *IF* I add more wood types
public class BlockPinePlanks extends ModBlockBase {

	public BlockPinePlanks(String name) {
		super(Material.WOOD);
		setSoundType(SoundType.WOOD);
		setUnlocalizedName(name);
		setRegistryName(Info.ID + ":" + name);
		setHardness(1.0f);
		setHarvestLevel("axe", 0);
		setResistance(1.0f);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}

}
