package stellamagicamod.core

import c6h2cl2.YukariLib.Util.BlockUtil
import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.init.Items.apple
import net.minecraft.init.Items.iron_sword
import net.minecraft.item.Item
import org.jetbrains.annotations.Contract
import stellamagicamod.core.StellaMagicaModCore.Companion.MOD_ID

object SMMRegistry {
    val tabStellaMagica_blocks = object : CreativeTabs("stellamagica_blocks") {
        @Contract(pure = true)
        override fun getTabIconItem(): Item {
            return apple
        }
    }
    val tabStellaMagica_tools = object : CreativeTabs("stellamagica_tools") {
        @Contract(pure = true)
        override fun getTabIconItem(): Item {
            return iron_sword
        }
    }
    //ブロック
    val stella_stone = BlockUtil.CreateBlock("stellamagica:stella_stone", "stella_stone", MOD_ID, Material.rock, tabStellaMagica_blocks)
    val stella_stone_brick = BlockUtil.CreateBlock("stellamagica:stella_stone_brick", "stella_stone_brick", MOD_ID, Material.rock, tabStellaMagica_blocks)
    val stella_stone_stairs = BlockUtil.CreateBlock("stellamagica:stella_stone_stairs", "stella_stone_stairs", MOD_ID, Material.rock, tabStellaMagica_blocks)
    val stella_stone_slab = BlockUtil.CreateBlock("stellamagica:stella_stone_slab", "stella_stone_slab", MOD_ID, Material.rock, tabStellaMagica_blocks)
    val pillar_stella_stone = BlockUtil.CreateBlock("stellamagica:pillar_stella_stone", "pillar_stella_stone", MOD_ID, Material.rock, tabStellaMagica_blocks)
    val chiseled_stella_stone = BlockUtil.CreateBlock("stellamagica:chiseled_stella_stone", "chiseledstella_stone", MOD_ID, Material.rock, tabStellaMagica_blocks)
    val stella_rituale_stone = BlockUtil.CreateBlock("stellamagica:stella_rituale_stone", "stella_rituale_stone", MOD_ID, Material.rock, tabStellaMagica_blocks)
    val sol_ore = BlockUtil.CreateBlock("stellamagica:customore.0", "sol_ore", MOD_ID, Material.rock, tabStellaMagica_blocks)
    val crystal = BlockUtil.CreateBlock("stellamagica:customore.11", "crystal", MOD_ID, Material.rock, tabStellaMagica_blocks)
    val sol_rune = BlockUtil.CreateBlock("stellamagica:rune.0", "sol_rune", MOD_ID, Material.rock, tabStellaMagica_blocks)
    val sol_solid = BlockUtil.CreateBlock("stellamagica:solid.0", "sol_solid", MOD_ID, Material.rock, tabStellaMagica_blocks)

    //ツール類


    //
}