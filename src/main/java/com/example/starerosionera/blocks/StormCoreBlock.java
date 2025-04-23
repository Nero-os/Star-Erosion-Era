package com.example.starerosionera.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

public class StormCoreBlock extends Block {
    public StormCoreBlock() {
        super(BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_LIGHT_GRAY)
                .lightLevel(state -> 12) // 高亮度白光
                .strength(2.0f, 6.0f) // 较脆弱但易获取
                .requiresCorrectToolForDrops()
                .sound(SoundType.GLASS) // 玻璃般的音效
        );
    }
}
