package com.example.starerosionera.items;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class EarthCoreItem extends BlockItem {
    public EarthCoreItem(Block block) {
        super(block, new Item.Properties()
                .stacksTo(64) // 中等堆叠限制
        );
    }
}
