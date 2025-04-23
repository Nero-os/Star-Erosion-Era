package com.example.starerosionera.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class TideCoreBlock extends Block {
    public TideCoreBlock() {
        super(BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_BLUE)
                .lightLevel(state -> 8) // 蓝色冷光
                .strength(2.5f, 8.0f) // 较弱的耐久
                .requiresCorrectToolForDrops()
        );
    }
}
