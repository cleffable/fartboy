package name.farts.item;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import static name.farts.Fartboy.LOGGER;
import static name.farts.Fartboy.MOD_ID;


public class ModItems {
    public static final Item POOP = registerItem("poop", new Item(new Item.Settings()));




    // le heckin evil static
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID,name), item);

    }


    public static void RegisterModItems(){
        LOGGER.info("Registering Mod Items for..." + MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
            entries.add(POOP);
        });
    }

}
