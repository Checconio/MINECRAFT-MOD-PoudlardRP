package fr.poudlardrp.mod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.poudlardrp.mod.PoudlardRP;
import fr.poudlardrp.mod.handler.GuiHandlerMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemsMod
{
    public static Item test;
    
    public static void init()
    {
        test = new ItemTest().setUnlocalizedName("Test");
        GameRegistry.registerItem(test, test.getUnlocalizedName().substring(5));
    }
    
    public static class ItemTest extends Item
    {
        public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_)
        {
            p_77659_3_.openGui(PoudlardRP.instance, GuiHandlerMod.GUI_CONECTION, p_77659_2_, p_77659_3_.serverPosX, p_77659_3_.serverPosY, p_77659_3_.serverPosZ);
            return p_77659_1_;
        }
    }
}