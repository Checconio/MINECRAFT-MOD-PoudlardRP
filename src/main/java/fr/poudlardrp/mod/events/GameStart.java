package fr.poudlardrp.mod.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import fr.poudlardrp.mod.PoudlardRP;
import fr.poudlardrp.mod.handler.GuiHandlerMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;

public class GameStart
{
    @SubscribeEvent
    public void JoinWorld(PlayerSleepInBedEvent event)
    {        
        if(event.entity != null)
        {
            event.entityPlayer.openGui(PoudlardRP.instance, GuiHandlerMod.GUI_CONECTION, event.entityPlayer.worldObj, event.entity.serverPosX, event.entity.serverPosY, event.entity.serverPosZ);
        }
    }
}