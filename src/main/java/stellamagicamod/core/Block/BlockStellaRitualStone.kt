package stellamagicamod.core.Block

import cpw.mods.fml.relauncher.Side
import cpw.mods.fml.relauncher.SideOnly
import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.client.renderer.texture.IIconRegister
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.util.IIcon
import net.minecraft.world.World
import stellamagicamod.core.SMMRegistry
import stellamagicamod.core.StellaMagicaModCore
import stellamagicamod.core.SMMGuiHandler
import stellamagicamod.core.Energy.TileEntity.TileStellaRitualStone
import c6h2cl2.YukariLib.Block.BlockWithTileEntity

class BlockStellaRitualStone : Block(Material.iron){
    init{
        setBlockName("stellamagica:stella_ritual_stone")
        textureName = "${StellaMagicaModCore.MOD_ID}:stella_ritual_stone_side"
        setCreativeTab(SMMRegistry.tabStellaMagica_blocks)
        stepSound = soundTypeMetal
        setHardness(5f)
        setResistance(5f)
        setHarvestLevel("pickaxe", 2)
    }

    @SideOnly(Side.CLIENT)
    var icons = arrayOfNulls<IIcon>(2)

    //override fun createNewTileEntity(p_149915_1_: World?, p_149915_2_: Int): TileEntity = TileStellaRitualStone()

    override fun registerBlockIcons(register: IIconRegister?) {
        icons[0] = register!!.registerIcon("${StellaMagicaModCore.MOD_ID}:stella_ritual_stone_side")
        icons[1] = register.registerIcon("${StellaMagicaModCore.MOD_ID}:stella_ritual_stone_top")
    }

    override fun getIcon(side: Int, meta: Int): IIcon? {
        return when (side) {
            0, 2, 3, 4, 5 -> icons[0]!!
            1 -> icons[1]!!
            else -> icons[0]!!
        }
    }

    override fun onBlockActivated(world: World?, x: Int, y: Int, z: Int, player: EntityPlayer?, side: Int, hitX: Float, hitY: Float, hitZ: Float): Boolean {
        player!!.openGui(StellaMagicaModCore.INSTANCE, SMMGuiHandler.GuiID_RitualStone, world, x, y, z)
        return true
    }

}