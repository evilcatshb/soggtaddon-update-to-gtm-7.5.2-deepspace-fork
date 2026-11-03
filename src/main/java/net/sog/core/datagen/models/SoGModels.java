package net.sog.core.datagen.models;

import com.gregtechceu.gtceu.api.machine.multiblock.IBatteryData;
import com.gregtechceu.gtceu.common.block.BatteryBlock;

import net.minecraft.world.level.block.Block;
import net.sog.core.sogcore;

import com.tterrag.registrate.providers.DataGenContext;
import com.tterrag.registrate.providers.RegistrateBlockstateProvider;
import com.tterrag.registrate.util.nullness.NonNullBiConsumer;

public class SoGModels {

    public static NonNullBiConsumer<DataGenContext<Block, BatteryBlock>, RegistrateBlockstateProvider> createBatteryBlockModel(IBatteryData batteryData) {
        return (ctx, prov) -> {
            prov.simpleBlock(ctx.getEntry(), prov.models().cubeBottomTop(ctx.getName(),
                    sogcore.id("block/casings/battery/" + batteryData.getBatteryName() + "/side"),
                    sogcore.id("block/casings/battery/" + batteryData.getBatteryName() + "/top"),
                    sogcore.id("block/casings/battery/" + batteryData.getBatteryName() + "/top")));
        };
    }
}
