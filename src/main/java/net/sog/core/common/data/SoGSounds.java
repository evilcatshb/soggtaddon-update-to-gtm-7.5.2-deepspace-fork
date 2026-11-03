package net.sog.core.common.data;

import com.gregtechceu.gtceu.api.sound.SoundEntry;

import net.sog.core.sogcore;

import static net.sog.core.common.registry.SoGRegistration.REGISTRATE;

public class SoGSounds {

    public static final SoundEntry COLLIDER = REGISTRATE.sound(sogcore.id("collider")).build();

    public static void init() {}
}
