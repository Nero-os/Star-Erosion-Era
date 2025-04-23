package com.example.starerosionera.init;

import com.example.starerosionera.StarErosionEra;
import com.example.starerosionera.items.*;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(StarErosionEra.MODID);

    // 注册物品 TODO 材质都改为32x32
    public static final DeferredItem<Item> STAR_DUST = ITEMS.register("star_dust",
            StarDustItem::new);

    public static final DeferredItem<Item> EMBLEM = ITEMS.register("emblem",
            EmblemItem::new);

    public static final DeferredItem<Item> STAR_FRAGMENT = ITEMS.register("star_fragment",
            StarFragmentItem::new);

    public static final DeferredItem<Item> STAR_SLAB = ITEMS.register("star_slab",
            StarSlabItem::new);

    public static final DeferredItem<Item> BLAZE_CORE = ITEMS.register("blaze_core",
            () -> new BlazeCoreItem(ModBlocks.BLAZE_CORE.get()));

    public static final DeferredItem<Item> TIDE_CORE = ITEMS.register("tide_core",
            () -> new TideCoreItem(ModBlocks.TIDE_CORE.get()));

    public static final DeferredItem<Item> STORM_CORE = ITEMS.register("storm_core",
            () -> new StormCoreItem(ModBlocks.STORM_CORE.get()));

    public static final DeferredItem<Item> EARTH_CORE = ITEMS.register("earth_core",
            () -> new EarthCoreItem(ModBlocks.EARTH_CORE.get()));

    public static final DeferredItem<Item> DOMINATION_SWORD = ITEMS.register("domination_sword", DominationSwordItem::new);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
