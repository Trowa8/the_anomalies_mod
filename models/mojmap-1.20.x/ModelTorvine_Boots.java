// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelTorvine_Boots<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "torvine_boots"), "main");
	private final ModelPart LegR;
	private final ModelPart LegL;

	public ModelTorvine_Boots(ModelPart root) {
		this.LegR = root.getChild("LegR");
		this.LegL = root.getChild("LegL");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition LegR = partdefinition.addOrReplaceChild("LegR",
				CubeListBuilder.create().texOffs(0, 6)
						.addBox(-2.0F, 10.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-2.0F, 9.0F, -3.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 0)
						.addBox(-2.0F, 9.0F, 2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(-2.0F, 10.0F, 2.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 0)
						.addBox(-3.1F, 11.99F, -2.0F, 5.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 8)
						.addBox(2.0F, 10.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(23, 6)
						.addBox(-1.1F, 8.0F, 3.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition cube_r1 = LegR.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.0F, -2.0F, 0.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-2.0F, -3.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 12.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition LegL = partdefinition.addOrReplaceChild("LegL",
				CubeListBuilder.create().texOffs(10, 6)
						.addBox(-1.8F, 10.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 2)
						.addBox(-0.8F, 9.0F, -3.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 4)
						.addBox(-0.8F, 9.0F, 2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 9)
						.addBox(-1.8F, 10.0F, 2.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 4)
						.addBox(-1.9F, 11.99F, -2.0F, 5.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 8)
						.addBox(-1.8F, 10.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(23, 6)
						.addBox(1.1F, 8.0F, 3.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition cube_r2 = LegL.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 3)
						.addBox(-3.0F, -2.0F, 0.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 12)
						.addBox(-2.0F, -3.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2F, 12.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		LegR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LegL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}