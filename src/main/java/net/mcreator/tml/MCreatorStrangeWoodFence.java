package net.mcreator.tml;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.util.Direction;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import java.util.List;
import java.util.Collections;

@Elementstml.ModElement.Tag
public class MCreatorStrangeWoodFence extends Elementstml.ModElement {
	@ObjectHolder("tml:strangewoodfence")
	public static final Block block = null;

	public MCreatorStrangeWoodFence(Elementstml instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(MCreatorTheMedievalLandTAB.tab)).setRegistryName(block
				.getRegistryName()));
	}

	public static class CustomBlock extends FenceBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(3f, 15f).lightValue(0).harvestLevel(3)
					.harvestTool(ToolType.AXE));
			setRegistryName("strangewoodfence");
		}

		@Override
		public boolean func_220111_a(BlockState state, boolean checkattach, Direction face) {
			boolean flag = state.getBlock() instanceof FenceBlock && state.getMaterial() == this.material;
			boolean flag1 = state.getBlock() instanceof FenceGateBlock && FenceGateBlock.isParallel(state, face);
			return !cannotAttach(state.getBlock()) && checkattach || flag || flag1;
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public BlockRenderLayer getRenderLayer() {
			return BlockRenderLayer.CUTOUT;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
