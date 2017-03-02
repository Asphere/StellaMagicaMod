package stellamagicamod.core.Energy

import c6h2cl2.YukariLib.Util.BlockPos
import net.minecraft.nbt.NBTTagCompound
import net.minecraft.world.World

interface IAPAccessible {
    val StellaValorem: APSV
    val tier: RitualTier
    fun writeToNBT(tagCompound: NBTTagCompound, name: String): NBTTagCompound
    fun readFromNBT(tagCompound: NBTTagCompound, name: String): IAPAccessible
    fun writeToNBT(tagCompound: NBTTagCompound)
    fun readFromNBT(tagCompound: NBTTagCompound)
    fun getPos(): BlockPos
    fun getEnergyValue(): Int
    fun getEnergyStorageValue(): Int
    fun explode(value: Int, voltage: APSV, world: World, blockPos: BlockPos)
}