package com.example.starerosionera.items;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class TideCoreItem extends BlockItem {
    public TideCoreItem(Block block) {
        super(block, new Item.Properties()
                .stacksTo(64) // 特殊堆叠限制
        );
    }
}
