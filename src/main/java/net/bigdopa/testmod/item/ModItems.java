package net.bigdopa.testmod.item;

import net.bigdopa.testmod.TestMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{
    public static final Item GLIZZY_DOG = registerItem("glizzy_dog",
            new Item(new FabricItemSettings().group(ModIemGroup.CHEESE)));

    public static final Item CHEESE_INGOT = registerItem("cheese_ingot",
            new Item(new FabricItemSettings().group(ModIemGroup.CHEESE)));

    public static final Item RAW_CHEESE_ORE = registerItem("raw_cheese_ore",
            new Item(new FabricItemSettings().group(ModIemGroup.CHEESE)));
    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name), item);
    }
  public static void regsiterModItems()
  {
      TestMod.LOGGER.info("Registering mod items for " + TestMod.MOD_ID);
  }
}
