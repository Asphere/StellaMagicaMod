package stellamagicamod.core

import c6h2cl2.YukariLib.Util.BlockUtil
import cpw.mods.fml.common.network.NetworkRegistry
import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.init.Items.*
import net.minecraft.item.Item
import org.jetbrains.annotations.Contract
import stellamagicamod.core.StellaMagicaModCore.Companion.MOD_ID
import stellamagicamod.core.Block.*
import stellamagicamod.core.Item.*

object SMMRegistry {
    val tabStellaMagica_blocks = object : CreativeTabs("stellamagica_blocks") {
        @Contract(pure = true)
        override fun getTabIconItem(): Item {
            return apple
        }
    }
    val tabStellaMagica_items = object : CreativeTabs("stellamagica_items") {
        @Contract(pure = true)
        override fun getTabIconItem(): Item {
            return diamond
        }
    }
    val tabStellaMagica_tools = object : CreativeTabs("stellamagica_tools") {
            @Contract(pure = true)
            override fun getTabIconItem(): Item {
                return iron_sword
            }
    }
    //ブロック
    val stella_stone_brick = BlockUtil.CreateBlock("stellamagica:stella_stone_brick", "stella_stone_brick", MOD_ID, Material.iron, tabStellaMagica_blocks)
    val stella_stone_stairs = BlockUtil.CreateBlock("stellamagica:stella_stone_stairs", "stella_stone_stairs", MOD_ID, Material.iron, tabStellaMagica_blocks)
    val stella_stone_slab = BlockUtil.CreateBlock("stellamagica:stella_stone_slab", "stella_stone_slab", MOD_ID, Material.iron, tabStellaMagica_blocks)
    val pillar_stella_stone = BlockUtil.CreateBlock("stellamagica:pillar_stella_stone", "pillar_stella_stone", MOD_ID, Material.iron, tabStellaMagica_blocks)
    val chiseled_stella_stone = BlockUtil.CreateBlock("stellamagica:chiseled_stella_stone", "chiseledstella_stone", MOD_ID, Material.iron, tabStellaMagica_blocks)
    val crystal = BlockUtil.CreateBlock("stellamagica:customore.11", "crystal", MOD_ID, Material.iron, tabStellaMagica_blocks)
    val sol_rune = BlockUtil.CreateBlock("stellamagica:rune.0", "sol_rune", MOD_ID, Material.iron, tabStellaMagica_blocks)
    val sol_solid = BlockUtil.CreateBlock("stellamagica:solid.0", "sol_solid", MOD_ID, Material.iron, tabStellaMagica_blocks)
    val stella_stone: Block = BlockStellaStone()
    val ritualstone: Block = BlockStellaRitualStone()
    val sol_ore: Block = BlockSolOre()

    //ツール類


    //素材アイテム
    val sol_shard: Item = Crystal()

    fun handleInit(){
        //Entity
        NetworkRegistry.INSTANCE.registerGuiHandler(StellaMagicaModCore.INSTANCE, SMMGuiHandler())

    }
}