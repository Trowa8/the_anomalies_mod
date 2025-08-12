package net.mcreator.anomalies.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.anomalies.entity.TheConsumedEntity;
import net.mcreator.anomalies.client.model.animations.the_consumedAnimation;
import net.mcreator.anomalies.client.model.Modelthe_consumed;

public class TheConsumedRenderer extends MobRenderer<TheConsumedEntity, Modelthe_consumed<TheConsumedEntity>> {
	public TheConsumedRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelthe_consumed.LAYER_LOCATION)), 0.9f);
	}

	@Override
	public ResourceLocation getTextureLocation(TheConsumedEntity entity) {
		return ResourceLocation.parse("anomalies:textures/entities/the_consumed.png");
	}

	private static final class AnimatedModel extends Modelthe_consumed<TheConsumedEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<TheConsumedEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(TheConsumedEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, the_consumedAnimation.Idle, ageInTicks, 1f);
				this.animateWalk(the_consumedAnimation.RunAnim, limbSwing, limbSwingAmount, 0.6f, 1f);
				this.animate(entity.animationState2, the_consumedAnimation.RunAnim, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(TheConsumedEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}