package com.example.starerosionera.init;

import com.example.starerosionera.StarErosionEra;
import com.example.starerosionera.blocks.BlazeCoreBlock;
import com.example.starerosionera.blocks.TideCoreBlock;
import com.example.starerosionera.blocks.StormCoreBlock;
import com.example.starerosionera.blocks.EarthCoreBlock;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    // 创建延迟注册器
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(StarErosionEra.MODID);

    // 烈焰晶核注册
    public static final DeferredBlock<Block> BLAZE_CORE =
            BLOCKS.register("blaze_core", BlazeCoreBlock::new);

    // 潮汐晶核注册
    public static final DeferredBlock<Block> TIDE_CORE =
            BLOCKS.register("tide_core", TideCoreBlock::new);

    // 风暴晶核注册
    public static final DeferredBlock<Block> STORM_CORE =
            BLOCKS.register("storm_core", StormCoreBlock::new);

    // 大地晶核注册
    public static final DeferredBlock<Block> EARTH_CORE =
            BLOCKS.register("earth_core", EarthCoreBlock::new);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus); // 向事件总线注册
    }
}
