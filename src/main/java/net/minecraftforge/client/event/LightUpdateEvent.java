package net.minecraftforge.client.event;

import net.minecraft.util.math.SectionPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.LightType;
import net.minecraftforge.eventbus.api.Event;

/**
 * Fired just before the light engine informs the WorldRenderer of a change in lighting.
 */
public class LightUpdateEvent extends Event {
    private final IBlockReader world;
    private final LightType type;
    private final SectionPos pos;

    public LightUpdateEvent(IBlockReader world, LightType type, SectionPos pos) {
        this.world = world;
        this.type = type;
        this.pos = pos;
    }

    public IBlockReader getWorld() {
        return world;
    }

    public LightType getType() {
        return type;
    }

    public SectionPos getPos() {
        return pos;
    }
}
