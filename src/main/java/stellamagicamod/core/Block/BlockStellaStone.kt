package stellamagicamod.core.Block

import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.item.ItemStack
import net.minecraft.world.World
import stellamagicamod.core.SMMRegistry
import stellamagicamod.core.StellaMagicaModCore

class BlockStellaStone : Block(Material.iron){
    init{
        setBlockName("stellamagica:stella_stone")
        textureName = "${StellaMagicaModCore.MOD_ID}:stella_stone"
        setCreativeTab(SMMRegistry.tabStellaMagica_blocks)
        stepSound = soundTypeStone
        setHardness(5f)
        setResistance(5f)
        setHarvestLevel("pickaxe", 2)
    }
}