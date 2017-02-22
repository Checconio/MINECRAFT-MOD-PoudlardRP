package fr.poudlardrp.mod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.poudlardrp.mod.References;
import fr.poudlardrp.mod.blocks.BlockBook;
import fr.poudlardrp.mod.blocks.BlockDetraqueur;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlocksMod
{
    public static Block detraqueur, book;
    
    public static void init()
    {
        detraqueur = new BlockDetraqueur(Material.rock).setBlockName("detraqueur").setBlockTextureName(References.MOD_ID + ":detraqueur");
        book = new BlockBook(Material.rock).setBlockName("book").setBlockTextureName(References.MOD_ID + ":book");
    }
    
    public static void register()
    {
        GameRegistry.registerBlock(detraqueur, detraqueur.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(book, book.getUnlocalizedName().substring(5));
    }
}