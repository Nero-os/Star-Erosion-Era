package com.example.starerosionera.events;

import com.example.starerosionera.StarErosionEra;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;

@EventBusSubscriber(modid = StarErosionEra.MODID)
public class ModEventHandlers {
    @SubscribeEvent
    public static void onEntityDeath(LivingDeathEvent event) {
        // 这里可以添加其他死亡事件处理逻辑
    }
}
