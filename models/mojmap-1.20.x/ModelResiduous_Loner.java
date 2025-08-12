// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelResiduous_Loner<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "residuous_loner"), "main");
	private final ModelPart Body;
	private final ModelPart TeethUpper;
	private final ModelPart TeethLower;
	private final ModelPart Eye;
	private final ModelPart Tail;
	private final ModelPart Spikes;
	private final ModelPart TailEnd;

	public ModelResiduous_Loner(ModelPart root) {
		this.Body = root.getChild("Body");
		this.TeethUpper = this.Body.getChild("TeethUpper");
		this.TeethLower = this.Body.getChild("TeethLower");
		this.Eye = this.Body.getChild("Eye");
		this.Tail = root.getChild("Tail");
		this.Spikes = this.Tail.getChild("Spikes");
		this.TailEnd = this.Tail.getChild("TailEnd");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-9.0F, -12.0F, -9.0F, 18.0F, 12.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, -8.0F));

		PartDefinition TeethUpper = Body.addOrReplaceChild("TeethUpper", CubeListBuilder.create(),
				PartPose.offset(0.0F, -9.0F, -9.0F));

		PartDefinition cube_r1 = TeethUpper.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(-2, 0)
						.addBox(-1.0F, -2.0F, -0.7F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(-2, 0)
						.addBox(3.0F, -2.0F, -0.7F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(-2, 0)
						.addBox(-5.0F, -2.0F, -0.7F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(-2, 0)
						.addBox(-9.0F, -2.0F, -0.7F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 2.0F, 0.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition TeethLower = Body.addOrReplaceChild("TeethLower", CubeListBuilder.create(),
				PartPose.offset(0.0F, -6.0F, -9.0F));

		PartDefinition cube_r2 = TeethLower.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(-2, 0)
						.addBox(-2.0F, -1.6F, -0.7F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(-2, 0)
						.addBox(-6.0F, -1.6F, -0.7F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(-2, 0)
						.addBox(-10.0F, -1.6F, -0.7F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 1.0F, -2.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Eye = Body.addOrReplaceChild("Eye", CubeListBuilder.create().texOffs(50, 30).addBox(-4.0F, -7.0F,
				-17.0F, 8.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -12.0F, 10.0F));

		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 30)
				.addBox(-7.0F, -10.0F, -5.0F, 14.0F, 10.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 6.0F));

		PartDefinition Spikes = Tail.addOrReplaceChild("Spikes", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition cube_r3 = Spikes.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(4, -2)
						.addBox(1.0F, -2.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, -2)
						.addBox(1.0F, -2.0F, 2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, -2)
						.addBox(1.0F, -2.0F, 5.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.0F, -3.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition cube_r4 = Spikes.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(4, -2)
						.addBox(1.0F, -2.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, -2)
						.addBox(1.0F, -2.0F, 2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, -2)
						.addBox(1.0F, -2.0F, 5.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -9.0F, -3.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition TailEnd = Tail.addOrReplaceChild("TailEnd", CubeListBuilder.create().texOffs(50, 48).addBox(
				-5.0F, -8.0F, -4.0F, 10.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 10.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}