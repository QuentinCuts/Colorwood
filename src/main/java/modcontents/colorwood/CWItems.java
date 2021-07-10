package modcontents.colorwood;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class CWItems {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "colorwood");
    public static RegistryObject<BlockItem> PURRRRPLE_WOOD = ITEMS.register("purrrrple_log", ()-> new BlockItem(CWBlocks.WOOD.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static RegistryObject<BlockItem> PURRRRPLE_PLANKS = ITEMS.register("purrrrple_planks",()-> new BlockItem(CWBlocks.PLANKS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static RegistryObject<PickaxeItem> PURRRRPLE_PICKAXE = ITEMS.register("purrrrple_pickaxe",()-> new PickaxeItem(ItemsTiers.PURRRRPLE, 0, -2.8F, new Item.Properties().group(ItemGroup.TOOLS)));
}
