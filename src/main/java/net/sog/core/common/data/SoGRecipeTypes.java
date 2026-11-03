package net.sog.core.common.data;

import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.common.mui.GTGuiTextures;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;

public class SoGRecipeTypes {

    public static GTRecipeType HIGH_ENERGY_COLLIDER;

    public static void init() {
        HIGH_ENERGY_COLLIDER = register("high_energy_collider", MULTIBLOCK)
                .setMaxIOSize(4, 2, 8, 4)
                .UI(builder -> {
                    for (int i = 0; i < 4; i++) {
                        builder.setItemSlotOverlay(IO.IN, i, GTGuiTextures.BOX_OVERLAY);
                    }
                    return builder.setProgressBar(GTGuiTextures.PROGRESS_COMPRESS);
                })
                .setSound(SoGSounds.COLLIDER)
                .setEUIO(IO.IN);
    }
}
