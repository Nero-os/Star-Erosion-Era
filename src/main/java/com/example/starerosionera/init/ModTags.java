package com.example.starerosionera.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import com.example.starerosionera.StarErosionEra;

public class ModTags {
    public static class Entities {
        public static final TagKey<EntityType<?>> ELEMENTAL_MOBS =
                TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(StarErosionEra.MODID, "elemental_mobs"));
    }
}