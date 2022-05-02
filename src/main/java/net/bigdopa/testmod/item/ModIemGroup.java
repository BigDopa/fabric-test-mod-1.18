package net.bigdopa.testmod.item;

import net.bigdopa.testmod.TestMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModIemGroup {
    public static final ItemGroup CHEESE = FabricItemGroupBuilder.build(new Identifier(TestMod.MOD_ID, "cheese"),
            () -> new ItemStack(ModItems.CHEESE_INGOT));
}
