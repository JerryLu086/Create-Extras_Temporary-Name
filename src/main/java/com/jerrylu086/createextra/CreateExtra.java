package com.jerrylu086.createextra;

import com.jerrylu086.createextra.compat.another_furniture.AnotherFurnitureCompat;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateExtra implements ModInitializer {
	public static final String ID = "createextra";
	public static final Logger LOGGER = LoggerFactory.getLogger(ID);

	@Override
	public void onInitialize() {
		if (FabricLoader.getInstance().isModLoaded("another_furniture"))
			AnotherFurnitureCompat.init();
	}

	public static ResourceLocation id(String path) {
		return new ResourceLocation(ID, path);
	}
}
