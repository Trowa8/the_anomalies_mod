// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelpeacock_tail<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "peacock_tail"), "main");
	private final ModelPart PeacockTail;
	private final ModelPart ArmL;
	private final ModelPart ArmR;

	public Modelpeacock_tail(ModelPart root) {
		this.PeacockTail = root.getChild("PeacockTail");
		this.ArmL = this.PeacockTail.getChild("ArmL");
		this.ArmR = this.PeacockTail.getChild("ArmR");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition PeacockTail = partdefinition.addOrReplaceChild("PeacockTail",
				CubeListBuilder.create().texOffs(0, 9)
						.addBox(-2.0F, -11.0F, 4.45F, 4.0F, 20.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, 7.0F, 1.0F, 6.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r1 = PeacockTail
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(24, 0).addBox(-3.0F, -20.0F, 0.51F, 4.0F, 20.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 9.0F, 4.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r2 = PeacockTail
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(16, 9).addBox(-3.0F, -20.0F, 0.5F, 4.0F, 20.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 9.0F, 4.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r3 = PeacockTail.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(24, 20).addBox(-3.0F, -20.0F, 0.5F, 4.0F, 20.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 11.0F, 4.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r4 = PeacockTail
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(8, 9).addBox(-3.0F, -20.0F, 0.4F, 4.0F, 20.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 10.0F, 4.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition ArmL = PeacockTail.addOrReplaceChild("ArmL", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition ArmR = PeacockTail.addOrReplaceChild("ArmR", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		PeacockTail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}