package org.nonolbc1.opb;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModCreativeTab {
    public static final ItemGroup OP_BLOCKS_GROUP = FabricItemGroup.builder()
        .icon(() -> new ItemStack(Blocks.COMMAND_BLOCK))
        .displayName(Text.translatable("itemGroup.opblocks.tab"))
        .entries((context, entries) -> {
            // Commands
            entries.add(Blocks.COMMAND_BLOCK.asItem());
            entries.add(Blocks.CHAIN_COMMAND_BLOCK.asItem());
            entries.add(Blocks.REPEATING_COMMAND_BLOCK.asItem());
            entries.add(Items.COMMAND_BLOCK_MINECART);

            // Debug stick
            entries.add(Items.DEBUG_STICK);

            // Barrier block
            entries.add(Blocks.BARRIER.asItem());

            // Structurals blocks
            entries.add(Blocks.STRUCTURE_VOID.asItem());
            entries.add(Blocks.JIGSAW.asItem());
            entries.add(Blocks.STRUCTURE_BLOCK.asItem());

            // AUTRES
            entries.add(Blocks.SPAWNER.asItem());

            // Light
            entries.add(Blocks.LIGHT.asItem());
        })
        .build();

    public static void registerTabs() {
        Registry.register(Registries.ITEM_GROUP, Identifier.of("opblocks", "tab"), OP_BLOCKS_GROUP);
    }
}
