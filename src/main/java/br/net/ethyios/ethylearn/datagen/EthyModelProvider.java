package br.net.ethyios.ethylearn.datagen;

import br.net.ethyios.ethylearn.registration.EthyItemRegistration;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class EthyModelProvider extends FabricModelProvider {

    public EthyModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(EthyItemRegistration.RAW_REDSTONE_CRYSTAL, Models.GENERATED);
        itemModelGenerator.register(EthyItemRegistration.REDSTONE_CRYSTAL, Models.GENERATED);
    }
}
