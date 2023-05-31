package com.teamabode.guarding.core.init;

import com.teamabode.scribe.core.api.config.Group;
import com.teamabode.scribe.core.api.config.GroupBuilder;

public class GuardingConfig {

    public static final Group GENERAL = new GroupBuilder("general").addBooleanProperty("no_shield_block_delay", true).addBooleanProperty("netherite_shield_enabled", false).build();
    public static final Group PARRY = new GroupBuilder("parry").addFloatProperty("exhaustion_cost", 2.0f).addFloatProperty("knockback_strength", 0.5f).build();
    public static final Group BARBED = new GroupBuilder("barbed").addFloatProperty("damage_amount", 2.0f).addFloatProperty("damage_chance", 0.3f).build();
    public static final Group PUMMELING = new GroupBuilder("pummeling").addFloatProperty("additional_knockback_strength_per_level", 0.15f).build();
    public static final Group RETRIBUTION = new GroupBuilder("retribution").addIntProperty("slowness_amplifier", 1).addBooleanProperty("is_treasure", true).build();

}