package io.github.cyberanner.ironchests.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class DiamondChestBlock {
    public static FabricBlockSettings settings() {
            return(FabricBlockSettings.of(Material.METAL)
                    .hardness(5.0F)
                    .resistance(6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .breakByTool(FabricToolTags.PICKAXES, 1)
                    .requiresTool());
    }
}