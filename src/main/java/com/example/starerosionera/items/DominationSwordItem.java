package com.example.starerosionera.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.level.Level;

import javax.annotation.Nonnull;

public class DominationSwordItem extends SwordItem {
    public DominationSwordItem() {
        super(
                Tiers.NETHERITE,
                new Item.Properties()
                        .durability(0)
                        .fireResistant()
                        .rarity(Rarity.EPIC)
                        .attributes(
                                SwordItem.createAttributes(
                                        Tiers.NETHERITE,
                                        999,
                                        1.6f
                                )
                        )
        );
    }

    @Override
    public boolean isEnchantable(@Nonnull ItemStack stack) {
        return false;
    }

    @Override
    public boolean hurtEnemy(@Nonnull ItemStack stack, @Nonnull LivingEntity target, @Nonnull LivingEntity attacker) {
        if (attacker instanceof Player) {
            target.setHealth(0);
        }
        return true;
    }

    @Override
    @Nonnull
    public InteractionResultHolder<ItemStack> use(@Nonnull Level world, @Nonnull Player player, @Nonnull InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (!world.isClientSide) {
            world.getEntities(player, player.getBoundingBox().inflate(10.0D))
                    .forEach(e -> {
                        if (e instanceof LivingEntity && !(e instanceof Player)) {
                            e.remove(Entity.RemovalReason.KILLED);
                        }
                    });
        }
        return InteractionResultHolder.success(stack);
    }

    @Override
    public void inventoryTick(@Nonnull ItemStack stack, @Nonnull Level world, @Nonnull Entity entity, int slot, boolean selected) {
        if (selected && entity instanceof Player player) {
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4, false, false));
            player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0, false, false));
        }
    }

    @Override
    public boolean isFoil(@Nonnull ItemStack stack) {
        return true;
    }
}
