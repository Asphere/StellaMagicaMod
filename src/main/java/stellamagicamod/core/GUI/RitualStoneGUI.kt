package stellamagicamod.core.GUI

import net.minecraft.client.gui.inventory.GuiContainer
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.entity.player.InventoryPlayer
import net.minecraft.util.ResourceLocation
import net.minecraft.world.World
import org.lwjgl.input.Mouse
import stellamagicamod.core.Energy.TileEntity.TileStellaRitualStone
import stellamagicamod.core.StellaMagicaModCore
import stellamagicamod.core.GUI.RitualStoneContainer

class RitualStoneGUI(private val x: Int, private val y: Int, private val z: Int, private val tilestellaritualstone: TileStellaRitualStone, private val inventoryPlayer: InventoryPlayer) : GuiContainer(RitualStoneContainer(x, y, z, tilestellaritualstone, inventoryPlayer)) {

    private val mainGui = ResourceLocation(StellaMagicaModCore.MOD_ID.toLowerCase(), "textures/gui/furnace.png")

    init{

    }

    override fun initGui() {
        super.initGui()
    }

    override fun doesGuiPauseGame(): Boolean {
        return false
    }

    override fun drawGuiContainerForegroundLayer(x: Int, mouseZ: Int) {
        super.drawGuiContainerForegroundLayer(x, mouseZ)
        when (tilestellaritualstone.getSlotSize()) {
            2, 4 -> fontRendererObj.drawString("Stella Ritual Stone", xSize / 2 - 26, 8, 4210752, false)
            9 -> fontRendererObj.drawString("Stella Ritual Stone", xSize / 2 - 6, 8, 4210752, false)
        }
    }

    override fun drawGuiContainerBackgroundLayer(partialTick: Float, x: Int, y: Int) {
        val texture = when (tilestellaritualstone.getSlotSize()) {
            2 -> mainGui
            else -> mainGui
        }
        this.mc.renderEngine.bindTexture(texture)
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize)
    }

}