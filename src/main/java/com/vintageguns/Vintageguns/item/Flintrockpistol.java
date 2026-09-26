package com.vintageguns.Vintageguns.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
	import net.minecraftforge.registries.DeferredRegister;
			import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Flintlockpistol; {
    
    //レジストリ
    public static final DeferredRegister<Item> ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, "vintage_guns");
    
    //レジストリにアイテムを追加
		    public static final RegistryObject<Item> MUSKET = ITEM.register("flintlock_pistol", () -> new Item(new Item.Properties()));
    
        public static void register(IEventBus eventBus) {
           ITEM.register(eventBus);
       
      
}