package com.example.starerosionera.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class BlazeCoreBlock extends Block {
    public BlazeCoreBlock() {
        super(BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_ORANGE)
                .lightLevel(state -> 10) // 发光等级10
                .strength(3.0f, 10.0f) // 硬度3.0，爆炸抗性10
                .requiresCorrectToolForDrops() // 需要正确工具采集
        );
    }
}
