package net.mcreator.tml;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

@Elementstml.ModElement.Tag
public class MCreatorSeedlvl5EntityWalksOnTheBlock extends Elementstml.ModElement {
	public MCreatorSeedlvl5EntityWalksOnTheBlock(Elementstml instance) {
		super(instance, 6);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorSeedlvl5EntityWalksOnTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((!(entity.isSneaking()))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 5, (int) 1, (true), (false)));
		}
	}
}
