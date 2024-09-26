package net.mrgeoves.mrgeovesanimalistic.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mrgeoves.mrgeovesanimalistic.MrGeovesAnimalistic;

public class ModItems {
    public static final Item FROG_LEG = registerItem("frog_leg", new Item(new Item.Settings().food(ModFoodComponents.FROG_LEG.build())));
    public static final Item COOKED_FROG_LEG = registerItem("cooked_frog_leg", new Item(new Item.Settings().food(ModFoodComponents.COOKED_FROG_LEG.build())));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MrGeovesAnimalistic.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MrGeovesAnimalistic.LOGGER.info("Registering Mod Items for " + MrGeovesAnimalistic.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(FROG_LEG);
            entries.add(COOKED_FROG_LEG);
        });
    }
}
