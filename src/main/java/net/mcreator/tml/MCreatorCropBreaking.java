package net.mcreator.tml;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.Entity;

@Elementstml.ModElement.Tag
public class MCreatorCropBreaking extends Elementstml.ModElement {
	public MCreatorCropBreaking(Elementstml instance) {
		super(instance, 8);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorCropBreaking!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorCropBreaking!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorCropBreaking!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorCropBreaking!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorCropBreaking!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		{
			TileEntity tileEntity = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
			if (tileEntity != null)
				tileEntity.getTileData().putDouble("randomPlayerBreak", Math.random());
		}
		if ((!((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).abilities.isCreativeMode : false))) {
			if (((new Object() {
				public double getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(new BlockPos((int) x, (int) y, (int) z), "randomPlayerBreak")) <= 0.5)) {
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
			}.getValue(new BlockPos((int) x, (int) y, (int) z), "randomPlayerBreak")) > 0.5)) {
				if (((new Object() {
					public double getValue(BlockPos pos, String tag) {
						TileEntity tileEntity = world.getTileEntity(pos);
						if (tileEntity != null)
							return tileEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(new BlockPos((int) x, (int) y, (int) z), "randomPlayerBreak")) <= 0.75)) {
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
				}.getValue(new BlockPos((int) x, (int) y, (int) z), "randomPlayerBreak")) > 0.75)) {
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
}
