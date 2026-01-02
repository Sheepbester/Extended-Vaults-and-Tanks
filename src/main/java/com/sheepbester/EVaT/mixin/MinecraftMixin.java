package com.sheepbester.EVaT.mixin;

import com.sheepbester.EVaT.ExtendedVaultsAndTanks;

import net.minecraft.client.Minecraft;

import net.minecraft.client.main.GameConfig;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MinecraftMixin {
	@Inject(method = "<init>", at = @At("TAIL"))
	private void EVaT$init(GameConfig gameConfig, CallbackInfo ci) {
		ExtendedVaultsAndTanks.LOGGER.info("Hello from {}", ExtendedVaultsAndTanks.NAME);
	}
}
