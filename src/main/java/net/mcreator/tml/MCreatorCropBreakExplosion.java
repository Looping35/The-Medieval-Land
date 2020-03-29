package net.mcreator.tml;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

@Elementstml.ModElement.Tag
public class MCreatorCropBreakExplosion extends Elementstml.ModElement {
	public MCreatorCropBreakExplosion(Elementstml instance) {
		super(instance, 9);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorCropBreakExplosion!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorCropBreakExplosion!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorCropBreakExplosion!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorCropBreakExplosion!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		{
			TileEntity tileEntity = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
			if (tileEntity != null)
				tileEntity.getTileData().putDouble("randomBlastBreak", Math.random());
		}
		if (((new Object() {
			public double getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "randomBlastBreak")) <= 0.5)) {
			if (!world.isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world, x, y, z, new ItemStack(MCreatorStrangeWoodSeed.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.addEntity(entityToSpawn);
			}
		} else if (((new Object() {
			public double getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "randomBlastBreak")) > 0.5)) {
			if (((new Object() {
				public double getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(new BlockPos((int) x, (int) y, (int) z), "randomBlastBreak")) <= 0.75)) {
				if (!world.isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world, x, y, z, new ItemStack(MCreatorStrangeWoodSeed.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
				if (!world.isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world, x, y, z, new ItemStack(MCreatorStrangeWoodSeed.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			} else if (((new Object() {
				public double getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(new BlockPos((int) x, (int) y, (int) z), "randomBlastBreak")) > 0.75)) {
				if (!world.isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world, x, y, z, new ItemStack(MCreatorStrangeWoodSeed.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
				if (!world.isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world, x, y, z, new ItemStack(MCreatorStrangeWoodSeed.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
				if (!world.isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world, x, y, z, new ItemStack(MCreatorStrangeWoodSeed.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			}
		}
	}
}
