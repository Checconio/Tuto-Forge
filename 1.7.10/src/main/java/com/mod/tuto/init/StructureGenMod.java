package com.mod.tuto.init;

import java.util.Random;

import com.mod.tuto.structures.StructureTuto1;

import net.minecraft.world.World;

public class StructureGenMod
{
    public static final String structureTuto1 = "structureTuto1";
    
    public boolean generate(String string, World world, Random random, int x, int y, int z)
    {
        switch(string)
        {
            case structureTuto1:
                StructureTuto1.init(world, x, y, z);
                break;
        }
        return true;
    }
}