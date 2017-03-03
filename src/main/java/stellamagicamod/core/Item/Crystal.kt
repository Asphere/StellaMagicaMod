package stellamagicamod.core.Item

import net.minecraft.item.Item
import stellamagicamod.core.SMMRegistry
import stellamagicamod.core.StellaMagicaModCore

class Crystal : Item(){
    init{
        unlocalizedName = "stellamagica:shard.11"
        setTextureName("${StellaMagicaModCore.MOD_ID}:crystal")
        creativeTab = SMMRegistry.tabStellaMagica_items
        setMaxStackSize(64)
    }
}