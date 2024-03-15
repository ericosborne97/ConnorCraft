package com.Unreal32.ConnorCraft.items;

import com.Unreal32.ConnorCraft.Main;
import com.Unreal32.ConnorCraft.init.ModItems;
import com.Unreal32.ConnorCraft.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRender(this, 0, "inventory");
		
	}

}
