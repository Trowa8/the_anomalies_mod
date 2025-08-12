package net.mcreator.anomalies.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.anomalies.entity.ResiduousLonerEntity;
import net.mcreator.anomalies.client.model.animations.Residuous_LonerAnimation;
import net.mcreator.anomalies.client.model.ModelResiduous_Loner;

public class ResiduousLonerRenderer extends MobRenderer<ResiduousLonerEntity, ModelResiduous_Loner<ResiduousLonerEntity>> {
	public ResiduousLonerRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelResiduous_Loner.LAYER_LOCATION)), 1.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ResiduousLonerEntity entity) {
		return ResourceLocation.parse("anomalies:textures/entities/residuous_loner.png");
	}

	private static final class AnimatedModel extends ModelResiduous_Loner<ResiduousLonerEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<ResiduousLonerEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(ResiduousLonerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, Residuous_LonerAnimation.idle, ageInTicks, 1f);
				this.animateWalk(Residuous_LonerAnimation.walk, limbSwing, limbSwingAmount, 1f, 1f);
				this.animate(entity.animationState2, Residuous_LonerAnimation.walk, ageInTicks, 1.4f);
				this.animate(entity.animationState3, Residuous_LonerAnimation.attack, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(ResiduousLonerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}