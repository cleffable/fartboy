
package name.farts.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import static name.farts.Fartboy.LOGGER;
import static name.farts.Fartboy.MOD_ID;

public class ModItems {

    public static final Item POOP = registerItem("poop");
    public static final Item POOP_INGOT = registerItem("poop_ingot");

    private static Item registerItem(String name) {
        Identifier id = Identifier.of(MOD_ID, name);

        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);

        Item item = new Item(new Item.Settings().registryKey(key));

        return Registry.register(Registries.ITEM, key, item);
    }

    public static void RegisterModItems() {
        LOGGER.info("Registering Mod Items for " + MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(POOP);
            entries.add(POOP_INGOT);
        });
    }
}
