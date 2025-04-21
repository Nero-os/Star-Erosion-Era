package com.example.starerosionera.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class StarFragmentItem extends Item {
    public StarFragmentItem() {
        super(new Item.Properties()
                .rarity(Rarity.RARE)
                .stacksTo(64)
                .fireResistant());
    }
}
