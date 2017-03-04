package stellamagicamod.core.Block

import cpw.mods.fml.relauncher.Side
import cpw.mods.fml.relauncher.SideOnly
import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.client.renderer.texture.IIconRegister
import net.minecraft.item.ItemStack
import net.minecraft.util.IIcon
import net.minecraft.world.World
import stellamagicamod.core.SMMRegistry
import stellamagicamod.core.StellaMagicaModCore

class BlockSolOre : Block(Material.iron){
    init{
        setBlockName("stellamagica.customore.0")
        textureName = "${StellaMagicaModCore.MOD_ID}:sol_ore"
        setCreativeTab(SMMRegistry.tabStellaMagica_blocks)
        stepSound = soundTypeStone
        setHardness(6f)
        setResistance(5f)
        setHarvestLevel("pickaxe", 3)
    }

    override fun dropBlockAsItem(p_149642_1_: World?, p_149642_2_: Int, p_149642_3_: Int, p_149642_4_: Int, p_149642_5_: ItemStack?) {
        super.dropBlockAsItem(p_149642_1_, p_149642_2_, p_149642_3_, p_149642_4_, p_149642_5_)
    }



}