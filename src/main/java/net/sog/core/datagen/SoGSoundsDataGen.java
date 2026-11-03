package net.sog.core.datagen;

import com.gregtechceu.gtceu.api.registry.registrate.SoundEntryBuilder;

import net.minecraft.data.PackOutput;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sog.core.sogcore;

@Mod.EventBusSubscriber(modid = sogcore.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SoGSoundsDataGen {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        PackOutput packOutput = event.getGenerator().getPackOutput();

        if (event.includeClient()) {
            event.getGenerator().addProvider(
                    true,
                    new SoundEntryBuilder.SoundEntryProvider(packOutput, sogcore.MOD_ID));
        }
    }
}
