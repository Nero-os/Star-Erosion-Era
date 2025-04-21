package com.example.starerosionera.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class EmblemItem extends Item {
    public EmblemItem() {
        super(new Item.Properties()
                .stacksTo(64) // 最大堆叠数量
                .rarity(Rarity.UNCOMMON));
    }
}
