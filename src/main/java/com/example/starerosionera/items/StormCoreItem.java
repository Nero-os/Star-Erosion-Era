package com.example.starerosionera.items;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;

public class StormCoreItem extends BlockItem {
    public StormCoreItem(Block block) {
        super(block, new Item.Properties()
                .rarity(Rarity.UNCOMMON)
                .stacksTo(64) // 限制堆叠数量
        );
    }
}
