package fr.poudlardrp.mod.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import fr.poudlardrp.mod.renderer.RenderBook;
import fr.poudlardrp.mod.renderer.RenderDetraqueur;
import fr.poudlardrp.mod.tileentity.TileEntityBook;
import fr.poudlardrp.mod.tileentity.TileEntityDetraqueur;

public class ClientProxy extends CommonProxy
{    
    public static int detraqueur, book;
    
    public void registerRenders()
    {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDetraqueur.class, new RenderDetraqueur());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBook.class, new RenderBook());
        
        detraqueur = RenderingRegistry.getNextAvailableRenderId();
        book = RenderingRegistry.getNextAvailableRenderId();
    }
}