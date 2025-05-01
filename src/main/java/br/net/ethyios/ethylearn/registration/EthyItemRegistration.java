package br.net.ethyios.ethylearn.registration;

import br.net.ethyios.ethylearn.EthyiosLearning;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class EthyItemRegistration {

    public static final Item REDSTONE_CRYSTAL = registerItem("redstone_crystal", new Item(new Item.Settings()));
    public static final Item RAW_REDSTONE_CRYSTAL = registerItem("raw_redstone_crystal", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(EthyiosLearning.MOD_ID, name), item);
    }

    private static void customIngredients(FabricItemGroupEntries entries) {
        entries.add(REDSTONE_CRYSTAL);
        entries.add(RAW_REDSTONE_CRYSTAL);
    }

    public static void registerModItems() {
        EthyiosLearning.LOGGER.info("Registering Mod Items for " + EthyiosLearning.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(EthyItemRegistration::customIngredients);
    }

}
