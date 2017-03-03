package stellamagicamod.core.Energy

import net.minecraft.nbt.NBTTagCompound
import stellamagicamod.core.Energy.APSV.*
import stellamagicamod.core.Energy.EnergyGroup.*

/**
 * このmodで追加される機械の段階を管理するEnumです。
 * @property StellaValorem 段階における魔力保持量[APSV]です
 */

enum class RitualTier(val StellaValorem: APSV, val group: EnergyGroup) {
    NoTier(ZeroSV, NonGroup),
    Tier1(Mercuries, Mer),
    Tier2(Tellus, Tel),
    Tier3(Jupiter, Jup),
    Tier4(Uranus, Ura),
    Tier5(Pluto, Plu),
    Tier6(Luna, Lun);

    fun writeToNBT(tagCompound: NBTTagCompound): NBTTagCompound {
        tagCompound.setInteger(TIER, ordinal)
        return tagCompound
    }

    fun readFromNBT(tagCompound: NBTTagCompound): RitualTier {
        return getFromTier(tagCompound.getInteger(TIER))
    }

    companion object {
        /**
         * # 日本語
         * Tierの値から、Enumを返します。
         * @param tier 機械のTierです。
         * @return 引数[tier]に対応するEnumです。
         */
        fun getFromTier(tier: Int): RitualTier {
            return when (tier) {
                1 -> Tier1
                2 -> Tier2
                3 -> Tier3
                4 -> Tier4
                5 -> Tier5
                6 -> Tier6
                else -> NoTier
            }
        }
    }
}