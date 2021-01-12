/*
 * Minecraft Forge
 * Copyright (c) 2016-2020.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation version 2.1
 * of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

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
