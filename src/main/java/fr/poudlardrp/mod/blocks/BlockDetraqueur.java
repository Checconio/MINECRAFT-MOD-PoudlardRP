package fr.poudlardrp.mod.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.poudlardrp.mod.proxy.ClientProxy;
import fr.poudlardrp.mod.tileentity.TileEntityDetraqueur;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockDetraqueur extends Block
{
    public BlockDetraqueur(Material p_i45394_1_)
    {
        super(p_i45394_1_);
    }
    
    @Override
    public TileEntity createTileEntity(World world, int metadata)
    {
        return new TileEntityDetraqueur();
    }

    @Override
    public boolean hasTileEntity(int metadata)
    {
        return true;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public int getRenderType()
    {
        return ClientProxy.detraqueur;
    }
}