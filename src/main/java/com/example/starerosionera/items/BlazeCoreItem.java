package com.example.starerosionera.items;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;

public class BlazeCoreItem extends BlockItem {
    public BlazeCoreItem(Block block) {
        super(block, new Item.Properties()
                .rarity(Rarity.UNCOMMON)
                .fireResistant()
        );
    }
}
