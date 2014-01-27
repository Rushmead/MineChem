package pixlepix.minechem.particlephysics.gui;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import pixlepix.minechem.particlephysics.tile.EmitterTileEntity;

public class SlotEmitterFuel extends Slot {
	EmitterTileEntity emitter;

	public SlotEmitterFuel(IInventory par1iInventory, int par2, int par3,
	                       int par4) {
		super(par1iInventory, par2, par3, par4);

		emitter = (EmitterTileEntity) par1iInventory;
	}

	@Override
	public boolean isItemValid(@NotNull ItemStack stack) {
		return emitter.isValidFuel(stack.itemID);
	}

}
