package stellamagicamod.core.Energy.Block

import c6h2cl2.YukariLib.Block.BlockWithTileEntity
import cpw.mods.fml.relauncher.Side
import cpw.mods.fml.relauncher.SideOnly
import net.minecraft.block.material.Material
import net.minecraft.util.IIcon
import stellamagicamod.core.Energy.RitualTier
import stellamagicamod.core.SMMRegistry


class BlockStellaRitualStone(val tire: RitualTier) : BlockWithTileEntity<TileStellaRitualStone>(
        Material.rock, TileStellaRitualStone::class, { world, meta -> TileStellaRitualStone(tier)}
    ){
        //ブロックテクスチャ―
    @SideOnly(Side.CLIENT)
    private var Front_OFF: IIcon? = null
    @SideOnly(Side.CLIENT)
    private var Front_ON: IIcon? = null
    @SideOnly(Side.CLIENT)
    private var AnotherIcon: IIcon? = null

    init {
        //他modとの競合回避でAPつけた
        setBlockName("stellaritualstoneAP")
        setHardness(50f)
        setResistance(50f)
        setHarvestLevel("pickaxe", 3)
        setCreativeTab(SMMRegistry.tabStellaMagica_blocks)
    }
}
