package fr.poudlardrp.mod.container;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ContainerConnectionMod extends Container
{
    private final EntityPlayer thePlayer;
    
    public ContainerConnectionMod(IInventory playerInv, EntityPlayer tileEntity)
    {
        this.thePlayer = tileEntity;
        
        this.addSlotToContainer(new Slot(playerInv, playerInv.getSizeInventory() - 1, 44, 8)
        {
            public int getSlotStackLimit()
            {
                return 1;
            }

            public boolean isItemValid(ItemStack p_75214_1_)
            {
                if (p_75214_1_ == null) return false;
                return p_75214_1_.getItem().isValidArmor(p_75214_1_, 0, thePlayer);
            }

            @SideOnly(Side.CLIENT)
            public IIcon getBackgroundIconIndex()
            {
                return ItemArmor.func_94602_b(0);
            }
        });
        
        this.addSlotToContainer(new Slot(playerInv, playerInv.getSizeInventory() - 2, 116, 8)
        {
            public int getSlotStackLimit()
            {
                return 1;
            }

            public boolean isItemValid(ItemStack p_75214_1_)
            {
                if (p_75214_1_ == null) return false;
                return p_75214_1_.getItem().isValidArmor(p_75214_1_, 1, thePlayer);
            }

            @SideOnly(Side.CLIENT)
            public IIcon getBackgroundIconIndex()
            {
                return ItemArmor.func_94602_b(1);
            }
        });
        
        this.addSlotToContainer(new Slot(playerInv, playerInv.getSizeInventory() - 3, 44, 62)
        {
            public int getSlotStackLimit()
            {
                return 1;
            }

            public boolean isItemValid(ItemStack p_75214_1_)
            {
                if (p_75214_1_ == null) return false;
                return p_75214_1_.getItem().isValidArmor(p_75214_1_, 2, thePlayer);
            }

            @SideOnly(Side.CLIENT)
            public IIcon getBackgroundIconIndex()
            {
                return ItemArmor.func_94602_b(2);
            }
        });
        
        this.addSlotToContainer(new Slot(playerInv, playerInv.getSizeInventory() - 4, 116, 62)
        {
            public int getSlotStackLimit()
            {
                return 1;
            }

            public boolean isItemValid(ItemStack p_75214_1_)
            {
                if (p_75214_1_ == null) return false;
                return p_75214_1_.getItem().isValidArmor(p_75214_1_, 3, thePlayer);
            }

            @SideOnly(Side.CLIENT)
            public IIcon getBackgroundIconIndex()
            {
                return ItemArmor.func_94602_b(3);
            }
        });
    }
    
    @Override
    public boolean canInteractWith(EntityPlayer p_75145_1_)
    {
        return true;
    }
}