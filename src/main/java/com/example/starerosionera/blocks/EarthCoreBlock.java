package com.example.starerosionera.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

public class EarthCoreBlock extends Block {
    public EarthCoreBlock() {
        super(BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_BROWN)
                .lightLevel(state -> 5) // 柔和的土黄色光
                .strength(4.0f, 12.0f) // 高耐久度
                .requiresCorrectToolForDrops()
                .sound(SoundType.STONE)
                .friction(0.8f) // 较高的摩擦系数
        );
    }
}
