package com.sheepbester.evat;

import com.sheepbester.evat.blocks.Sheepcube_Block;
import com.sheepbester.evat.items.Sheepface_Item;
import com.sheepbester.evat.registry.EvatGroup;
import com.simibubi.create.Create;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExtendedVaultsAndTanks implements ModInitializer {
	public static final String ID = "evat";
	public static final String NAME = "Extended Vaults and Tanks";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	@Override
	public void onInitialize() {
		Sheepcube_Block.initialize();
		Sheepface_Item.initialize();
		EvatGroup.initialize();
		LOGGER.info("Create addon mod [{}] is loading alongside Create [{}]!", NAME, Create.VERSION);
		LOGGER.info(EnvExecutor.unsafeRunForDist(
				() -> () -> "{} is accessing Porting Lib from the client!",
				() -> () -> "{} is accessing Porting Lib from the server!"
		), NAME);
	}

}
