package org.nonolbc1.opb;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ModCreativeTab {

    public static final ItemGroup OPB_GROUP = FabricItemGroupBuilder.create(
                    new Identifier("opblocks", "tab")
            )
            .icon(() -> new ItemStack(Items.COMMAND_BLOCK))
            .appendItems(stacks -> {

                stacks.add(new ItemStack(Items.COMMAND_BLOCK));
                stacks.add(new ItemStack(Items.CHAIN_COMMAND_BLOCK));
                stacks.add(new ItemStack(Items.REPEATING_COMMAND_BLOCK));
                stacks.add(new ItemStack(Items.COMMAND_BLOCK_MINECART));

                stacks.add(new ItemStack(Items.DEBUG_STICK));
                stacks.add(new ItemStack(Items.BARRIER));
                stacks.add(new ItemStack(Items.STRUCTURE_VOID));
                stacks.add(new ItemStack(Items.JIGSAW));
                stacks.add(new ItemStack(Items.STRUCTURE_BLOCK));

                stacks.add(new ItemStack(Items.SPAWNER));
                stacks.add(new ItemStack(Items.LIGHT));
            })
            .build();

    public static void register() {
    }
}
