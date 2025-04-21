package com.example.starerosionera.loot;

import com.example.starerosionera.init.ModItems;
import com.example.starerosionera.init.ModTags;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.entity.Mob;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.common.loot.LootModifier;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;

public class StarDustLootModifier extends LootModifier {
    public static final MapCodec<StarDustLootModifier> CODEC =
            RecordCodecBuilder.mapCodec(inst -> codecStart(inst).apply(inst, StarDustLootModifier::new));

    public StarDustLootModifier(LootItemCondition[] conditionsIn) {
        super(conditionsIn);
    }

    @Nonnull
    @Override
    protected ObjectArrayList<ItemStack> doApply(@NotNull ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        if (context.getParamOrNull(LootContextParams.THIS_ENTITY) instanceof Mob mob) {
            if (isElementalMob(mob)) {
                if (context.getRandom().nextFloat() < 0.8f) {
                    generatedLoot.add(new ItemStack(ModItems.STAR_DUST.get()));
                }
            }
        }
        return generatedLoot;
    }

    private boolean isElementalMob(Mob mob) {
        return mob.getType().is(ModTags.Entities.ELEMENTAL_MOBS);
    }

    @Override
    public MapCodec<? extends IGlobalLootModifier> codec() {
        return CODEC;
    }
}