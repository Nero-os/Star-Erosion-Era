package com.example.starerosionera.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class StarDustItem extends Item {
    public StarDustItem() {
        super(new Item.Properties()
                .rarity(Rarity.UNCOMMON)
                .stacksTo(64));
    }
}
