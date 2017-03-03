package stellamagicamod.core;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import stellamagicamod.core.Energy.TileEntity.TileStellaRitualStone;
import stellamagicamod.core.GUI.RitualStoneContainer;
import stellamagicamod.core.GUI.RitualStoneGUI;

/**
 * Created by Asphere on 2017/03/03.
 */
public class SMMGuiHandler implements IGuiHandler {
    public static final int GuiID_RitualStone = 334;

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID){
            case GuiID_RitualStone: return new RitualStoneContainer(x, y, z,(TileStellaRitualStone)(world.getTileEntity(x,y,z)),player.inventory);
            default:return null;
        }
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID){
            case GuiID_RitualStone: return new RitualStoneGUI(x, y, z,(TileStellaRitualStone)(world.getTileEntity(x,y,z)),player.inventory);
            default:return null;
        }
    }
}
