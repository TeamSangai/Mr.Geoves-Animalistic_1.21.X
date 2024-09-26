package net.mrgeoves.mrgeovesanimalistic.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.mrgeoves.mrgeovesanimalistic.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

//testing repo

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> FROG_LEG_COOKABLE = List.of(ModItems.FROG_LEG);

        offerSmelting(exporter, FROG_LEG_COOKABLE, RecipeCategory.FOOD, ModItems.COOKED_FROG_LEG, 0.25f, 200, "cooked_frog_leg");

    }
}
