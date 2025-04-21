package com.example.starerosionera.events;

import com.example.starerosionera.StarErosionEra;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Zombie;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import org.apache.logging.log4j.LogManager;
import com.example.starerosionera.init.ModTags;

@EventBusSubscriber(modid = StarErosionEra.MODID)
public class ModEventHandlers {
    @SubscribeEvent
    public static void onEntityDeath(LivingDeathEvent event) {
        if (event.getEntity() instanceof Zombie) {
            EntityType<?> type = event.getEntity().getType();
            // 在日志中检查输出
            LogManager.getLogger().info("Is zombie elemental? {}", type.is(ModTags.Entities.ELEMENTAL_MOBS));
        }
    }
}
