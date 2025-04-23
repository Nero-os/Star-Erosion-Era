package com.example.starerosionera.init;

import com.example.starerosionera.StarErosionEra;
import com.example.starerosionera.blocks.BlazeCoreBlock;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    // 创建延迟注册器
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(StarErosionEra.MODID);

    // 注册方块（使用DeferredBlock类型）
    public static final DeferredBlock<Block> BLAZE_CORE =
            BLOCKS.register("blaze_core", BlazeCoreBlock::new);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus); // 向事件总线注册
    }
}
