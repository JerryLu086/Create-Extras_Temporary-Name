package com.jerrylu086.createextras.mixin.client;

import com.simibubi.create.compat.trinkets.GoggleTrinketRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(GoggleTrinketRenderer.class)
public abstract class GoggleTrinketRendererMixin {

    @ModifyConstant(method = "render", constant = @Constant(floatValue = 180.0f, ordinal = 1))
    private float noFlip(float original) {
        return 0.0f;
    }

    @ModifyConstant(method = "render", constant = @Constant(doubleValue = -0.25, ordinal = 0))
    private double goLower(double original) {
        return -0.3125d;
    }

}
