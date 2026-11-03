package net.sog.core.common.data;

import net.sog.core.common.registry.SoGRegistration;

import static net.sog.core.sogcore.SOG_CREATIVE_TAB;

public class SoGItems {

    static {
        SoGRegistration.REGISTRATE.creativeModeTab(() -> SOG_CREATIVE_TAB);
    }

    public static void init() {}
}
