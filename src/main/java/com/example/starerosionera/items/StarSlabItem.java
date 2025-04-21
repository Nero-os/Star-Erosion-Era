package com.example.starerosionera.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class StarSlabItem extends Item {
    public StarSlabItem() {
        super(new Item.Properties()
                .rarity(Rarity.RARE)
                .stacksTo(16)
                .fireResistant());
    }
}
