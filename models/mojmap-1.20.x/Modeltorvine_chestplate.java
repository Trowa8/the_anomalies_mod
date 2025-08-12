// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltorvine_chestplate<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "torvine_chestplate"), "main");
	private final ModelPart ArmR;
	private final ModelPart ArmL;
	private final ModelPart TorvineChestplate;

	public Modeltorvine_chestplate(ModelPart root) {
		this.ArmR = root.getChild("ArmR");
		this.ArmL = root.getChild("ArmL");
		this.TorvineChestplate = root.getChild("TorvineChestplate");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition ArmR = partdefinition.addOrReplaceChild("ArmR",
				CubeListBuilder.create().texOffs(38, 16)
						.addBox(-3.0F, -3.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -5.0F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition cube_r1 = ArmR.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(38, 30).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0F, -2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r2 = ArmR.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(38, 26).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0F, 3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r3 = ArmR.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(38, 8).addBox(-3.0F, -1.0F, -1.0F, 6.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -1.0F, 0.0F, 0.0F, 1.5708F, -1.5708F));

		PartDefinition ArmL = partdefinition.addOrReplaceChild("ArmL",
				CubeListBuilder.create().texOffs(38, 21)
						.addBox(-1.0F, -3.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(4.0F, -5.0F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition cube_r4 = ArmL.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(38, 12).addBox(-3.0F, -1.0F, -1.0F, 6.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -1.0F, 0.0F, 0.0F, 1.5708F, -1.5708F));

		PartDefinition cube_r5 = ArmL
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(38, 38).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 1.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, -1.0F, 3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r6 = ArmL.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(38, 34).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -1.0F, -2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition TorvineChestplate = partdefinition.addOrReplaceChild("TorvineChestplate",
				CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r7 = TorvineChestplate.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 37).addBox(-4.0F, -2.0F, -8.0F, 8.0F, 0.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.001F, 3.0F, 0.0F, 0.0F, -1.5708F, 1.5708F));

		PartDefinition cube_r8 = TorvineChestplate.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 26).addBox(-4.0F, -2.0F, -8.0F, 8.0F, 0.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.001F, 3.0F, 0.0F, 0.0F, -1.5708F, 1.5708F));

		PartDefinition cube_r9 = TorvineChestplate
				.addOrReplaceChild("cube_r9",
						CubeListBuilder.create().texOffs(0, 13).addBox(-4.0F, -2.0F, -8.0F, 8.0F, 2.0F, 11.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 3.0F, 4.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r10 = TorvineChestplate
				.addOrReplaceChild("cube_r10",
						CubeListBuilder.create().texOffs(38, 45).addBox(-3.0F, -2.0F, -8.0F, 6.0F, 2.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 4.0F, 4.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r11 = TorvineChestplate
				.addOrReplaceChild("cube_r11",
						CubeListBuilder.create().texOffs(38, 42).addBox(-3.0F, -2.0F, -8.0F, 6.0F, 2.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 4.0F, -2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r12 = TorvineChestplate
				.addOrReplaceChild("cube_r12",
						CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -2.0F, -8.0F, 8.0F, 2.0F, 11.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 3.0F, -2.0F, 1.5708F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 80, 80);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		ArmR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ArmL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		TorvineChestplate.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}