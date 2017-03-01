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

    val block = BlockUtil.CreateBlock("stellamagica:stella_stone", "stella_stone", MOD_ID, Material.rock, tabStellaMagica_blocks)
}