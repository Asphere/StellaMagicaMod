package stellamagicamod.core.Energy

import net.minecraft.nbt.NBTTagCompound
import stellamagicamod.core.Energy.APSV.*

/**
 * # 日本語
 * このmodで追加される機械の段階を管理するEnumです。
 * @property StellaValorem 段階における魔力保持量[APSV]です。原則、各機械の電圧はその機械の段階によって決定されます。
 */

enum class RitualTier(val StellaValorem: APSV) {
    NoTier(ZeroSV),
    Tier1(Mercuries),
    Tier2(Tellus),
    Tier3(Jupiter),
    Tier4(Uranus),
    Tier5(Pluto),
    Tier6(Luna);

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
         *
         * # English
         * @param tier the tier of machine
         * @return Enum of [tier]
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