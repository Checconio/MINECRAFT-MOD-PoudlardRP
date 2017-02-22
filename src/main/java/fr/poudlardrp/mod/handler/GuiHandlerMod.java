package fr.poudlardrp.mod.handler;

import cpw.mods.fml.common.network.IGuiHandler;
import fr.poudlardrp.mod.container.ContainerConnectionMod;
import fr.poudlardrp.mod.gui.GuiConnectionMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiHandlerMod implements IGuiHandler
{
    public static final int GUI_CONECTION = 0;
    
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if(ID == GUI_CONECTION)
        {
            return new ContainerConnectionMod(player.inventory, player);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if(ID == GUI_CONECTION)
        {
            return new GuiConnectionMod(player.inventory, player);
        }
        return null;
    }
}