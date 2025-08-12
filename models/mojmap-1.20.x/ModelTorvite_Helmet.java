// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelTorvite_Helmet<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "torvite_helmet"), "main");
	private final ModelPart TorvineHelmet;

	public ModelTorvite_Helmet(ModelPart root) {
		this.TorvineHelmet = root.getChild("TorvineHelmet");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition TorvineHelmet = partdefinition.addOrReplaceChild("TorvineHelmet",
				CubeListBuilder.create().texOffs(1, 1)
						.addBox(-5.0F, -8.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(35, 15)
						.addBox(-6.0F, -11.0F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(35, 18)
						.addBox(3.0F, -11.0F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = TorvineHelmet.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(35, 12).addBox(3.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, -4.0F, 1.5708F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = TorvineHelmet.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(31, 55).addBox(3.0F, -1.0F, -3.0F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -2.0F, -4.0F, 1.5708F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = TorvineHelmet.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 55).addBox(-2.0F, -1.0F, -3.0F, 7.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -2.0F, 5.0F, 1.5708F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = TorvineHelmet.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(1, 42).addBox(-2.0F, -1.0F, -5.0F, 7.0F, 1.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r5 = TorvineHelmet.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(1, 21).addBox(-2.0F, -1.0F, -5.0F, 7.0F, 1.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -2.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		TorvineHelmet.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}