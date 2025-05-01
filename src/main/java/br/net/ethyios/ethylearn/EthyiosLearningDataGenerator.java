package br.net.ethyios.ethylearn;

import br.net.ethyios.ethylearn.datagen.EthyBlockTagProvider;
import br.net.ethyios.ethylearn.datagen.EthyItemTagProvider;
import br.net.ethyios.ethylearn.datagen.EthyLootTableGenerator;
import br.net.ethyios.ethylearn.datagen.EthyModelProvider;
import br.net.ethyios.ethylearn.datagen.EthyRecipeGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class EthyiosLearningDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(EthyBlockTagProvider::new);
		pack.addProvider(EthyItemTagProvider::new);
		pack.addProvider(EthyLootTableGenerator::new);
		pack.addProvider(EthyModelProvider::new);
		pack.addProvider(EthyRecipeGenerator::new);
	}
}
