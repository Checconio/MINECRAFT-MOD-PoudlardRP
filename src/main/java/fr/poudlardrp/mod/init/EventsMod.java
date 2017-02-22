package fr.poudlardrp.mod.init;

import fr.poudlardrp.mod.events.GameStart;
import net.minecraftforge.common.MinecraftForge;

public class EventsMod
{
    public static void init()
    {
        MinecraftForge.EVENT_BUS.register(new GameStart());
    }
}