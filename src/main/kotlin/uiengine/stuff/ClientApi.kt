package ru.airdead.uiengine.stuff

import net.minecraft.client.MinecraftClient
import net.minecraft.client.render.Tessellator

/**
 * A wrapper class to provide access to Minecraft client instances and utilities.
 */
class ClientApi {

    /**
     * Returns the instance of [MinecraftClient].
     *
     * @return The Minecraft client instance.
     */
    fun minecraft(): MinecraftClient = MinecraftClient.getInstance()

    /**
     * Returns the instance of [Tessellator].
     *
     * @return The tessellator instance.
     */
    fun tessellator(): Tessellator = Tessellator.getInstance()
}