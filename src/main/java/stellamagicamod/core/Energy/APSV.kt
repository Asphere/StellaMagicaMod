package stellamagicamod.core.Energy

import net.minecraft.nbt.NBTTagCompound

enum class APSV constructor(val maxEnergy: Int) :Comparable<APSV>{
    ZeroSV(0),
    Mercuries(512),
    Tellus(1024),
    Jupiter(16384),
    Uranus(65536),
    Pluto(524288),
    Luna(268435456);

    fun getVoltageFromEnergy(maxEnergy: Int): APSV {
        return when (maxEnergy) {
            512 -> Mercuries
            1024 -> Tellus
            16384 -> Jupiter
            65536 -> Uranus
            524288 -> Pluto
            268435456 -> Luna
            else -> ZeroSV
        }
    }

    fun writeToNBT(tagCompound: NBTTagCompound): Unit {
        val tag: NBTTagCompound = NBTTagCompound()
        tag.setInteger(ENERGY, maxEnergy)
        tagCompound.setTag(SV, tag)
    }

    fun readFromNBT(tagCompound: NBTTagCompound): APSV {
        val tag = tagCompound.getCompoundTag(SV)
        return getVoltageFromEnergy(tag.getInteger(ENERGY))
    }

    override fun toString(): String {
        return when (maxEnergy) {
            512 -> "Mercuries"
            1024 -> "Tellus"
            16384 -> "Jupiter"
            65536 -> "Uranus"
            524288 -> "Pluto"
            268435456 -> "Luna"
            else -> "ZeroSV"
        }
    }

}