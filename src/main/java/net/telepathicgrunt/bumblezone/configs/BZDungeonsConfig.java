package net.telepathicgrunt.bumblezone.configs;

import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.annotation.ConfigEntry;
import me.sargunvohra.mcmods.autoconfig1u.shadowed.blue.endless.jankson.Comment;

@Config(name = "Dungeons")
public class BZDungeonsConfig {

    @ConfigEntry.Gui.Tooltip(count = 2)
    @Comment(value = "How rare Bee Dungeons are. Higher numbers means more rare.\n" +
            "Default rate is 1. Setting to greater than 1000 will disable Bee Dungeons.")
    public int beeDungeonRarity = 1;

    @ConfigEntry.Gui.Tooltip(count = 2)
    @Comment(value = "How rare Spider Infested Bee Dungeons are. Higher numbers means more rare.\n" +
            "Default rate is 8. Setting to greater than 1000 will disable Spider Infested Bee Dungeons.")
    public int spiderInfestedBeeDungeonRarity = 8;

    @ConfigEntry.Gui.Tooltip(count = 2)
    @Comment(value = "How rare are Spider/Cave Spider Spawners in Spider Infested Bee Dungeons.\n" +
            "0 is no spawners, 1 is maximum spawners, and default is 0.2f")
    public float spawnerRateSpiderBeeDungeon = 0.2f;

}