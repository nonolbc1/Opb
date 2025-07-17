package org.nonolbc1.opb;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModCreativeTab {
    public static final ItemGroup OPB_GROUP = FabricItemGroup.builder(
                    new Identifier("opblocks", "tab")
            )
            .displayName(Text.translatable("itemGroup.opblocks.tab"))
            .icon(() -> new ItemStack(Items.COMMAND_BLOCK))
            .build();

    public static void register() {
        ItemGroupEvents.modifyEntriesEvent(OPB_GROUP).register(entries -> {
            entries.add(Items.COMMAND_BLOCK);
            entries.add(Items.CHAIN_COMMAND_BLOCK);
            entries.add(Items.REPEATING_COMMAND_BLOCK);
            entries.add(Items.COMMAND_BLOCK_MINECART);

            entries.add(Items.DEBUG_STICK);
            entries.add(Items.BARRIER);
            entries.add(Items.STRUCTURE_VOID);
            entries.add(Items.JIGSAW);
            entries.add(Items.STRUCTURE_BLOCK);

            entries.add(Items.SPAWNER);
            entries.add(Items.LIGHT);
        });
    }
}
