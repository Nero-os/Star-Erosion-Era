package com.example.starerosionera.init;

import com.example.starerosionera.StarErosionEra;
import com.example.starerosionera.items.StarSlabItem;
import com.example.starerosionera.items.StarFragmentItem;
import com.example.starerosionera.items.EmblemItem;
import com.example.starerosionera.items.StarDustItem;
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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
