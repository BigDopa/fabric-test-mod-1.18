package net.bigdopa.testmod.blocks;

import net.bigdopa.testmod.TestMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlock
{
    public static final Block CHEESE_BLOCK = registerBlock("cheese_block",
            new Block(FabricBlockSettings.of(Material.SOLID_ORGANIC).strength(6f).requiresTool()), ItemGroup.MISC);

    public static final Block CHEESE_ORE = registerBlock("cheese_ore",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.5f).requiresTool()), ItemGroup.MISC);

    public static final Block DEEPSLATE_CHEESE_ORE = registerBlock("deepslate_cheese_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ItemGroup.MISC);

    public static final Block NETHERACK_CHEESE_ORE = registerBlock("netherack_cheese_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ItemGroup.MISC);

    private static Block registerBlock(String name, Block block, ItemGroup group)
{
    registerBlockItem(name, block, group);
    return Registry.register(Registry.BLOCK, new Identifier(TestMod.MOD_ID, name), block);
}
    private static Item registerBlockItem(String name, Block block, ItemGroup group)
    {
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings().group(group)));

    }
    public static void registerModBlock()
    {
        TestMod.LOGGER.info("Registering Mod Block for " +TestMod.MOD_ID);
    }
}
