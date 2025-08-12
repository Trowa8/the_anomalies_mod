package net.mcreator.anomalies.client.model;

import net.minecraft.world.entity.Mob;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelthe_consumed<T extends Mob> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("anomalies", "modelthe_consumed"), "main");
	public final ModelPart Head;
	public final ModelPart bone;
	public final ModelPart JawLower;
	public final ModelPart Body;
	public final ModelPart ArmL;
	public final ModelPart bone9;
	public final ModelPart bone2;
	public final ModelPart ArmR;
	public final ModelPart bone8;
	public final ModelPart bone3;
	public final ModelPart LegR;
	public final ModelPart bone4;
	public final ModelPart bone7;
	public final ModelPart LegL;
	public final ModelPart bone6;
	public final ModelPart bone5;

	public Modelthe_consumed(ModelPart root) {
		this.Head = root.getChild("Head");
		this.bone = this.Head.getChild("bone");
		this.JawLower = root.getChild("JawLower");
		this.Body = root.getChild("Body");
		this.ArmL = root.getChild("ArmL");
		this.bone9 = this.ArmL.getChild("bone9");
		this.bone2 = this.ArmL.getChild("bone2");
		this.ArmR = root.getChild("ArmR");
		this.bone8 = this.ArmR.getChild("bone8");
		this.bone3 = this.ArmR.getChild("bone3");
		this.LegR = root.getChild("LegR");
		this.bone4 = this.LegR.getChild("bone4");
		this.bone7 = this.LegR.getChild("bone7");
		this.LegL = root.getChild("LegL");
		this.bone6 = this.LegL.getChild("bone6");
		this.bone5 = this.LegL.getChild("bone5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 21).addBox(1.0F, -39.0F, -5.0F, 4.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(26, 20)
				.addBox(1.0F, -32.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(30, 20).addBox(3.0F, -32.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 24.0F, 0.0F));
		PartDefinition bone = Head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(4.0F, -32.0F, 0.0F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(28, 20).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.0F, -4.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(30, 29).addBox(1.0F, -7.2F, -5.0F, 2.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition JawLower = partdefinition.addOrReplaceChild("JawLower", CubeListBuilder.create(), PartPose.offset(0.0F, -6.0F, 0.0F));
		PartDefinition cube_r3 = JawLower.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(32, 20).addBox(-1.0F, -1.0F, -1.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 34)
				.addBox(-5.0F, -1.0F, -1.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 34).addBox(-3.0F, -1.0F, -1.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -1.0F, -3.8F, 0.48F, 0.0F, 0.0F));
		PartDefinition cube_r4 = JawLower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(20, 21).addBox(-3.0F, -2.0F, -5.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -13.0F, -2.0F, 8.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, 0.0F));
		PartDefinition ArmL = partdefinition.addOrReplaceChild("ArmL", CubeListBuilder.create().texOffs(36, 12).addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -4.0F, 0.0F));
		PartDefinition bone9 = ArmL.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(44, 42).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, 0.0F));
		PartDefinition bone2 = ArmL.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(26, 0).addBox(-1.0F, 8.0F, -2.0F, 2.0F, 17.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, 0.0F));
		PartDefinition ArmR = partdefinition.addOrReplaceChild("ArmR", CubeListBuilder.create().texOffs(44, 22).addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -4.0F, 0.0F));
		PartDefinition bone8 = ArmR.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(0, 46).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 0.0F, 0.0F));
		PartDefinition bone3 = ArmR.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(20, 29).addBox(-1.0F, 8.0F, -2.0F, 2.0F, 17.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 0.0F, 0.0F));
		PartDefinition LegR = partdefinition.addOrReplaceChild("LegR", CubeListBuilder.create(), PartPose.offset(-4.0F, 24.0F, 0.0F));
		PartDefinition bone4 = LegR.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(0, 34).addBox(0.0F, -8.0F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone7 = LegR.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(30, 42).addBox(0.0F, -14.0F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition LegL = partdefinition.addOrReplaceChild("LegL", CubeListBuilder.create(), PartPose.offset(1.0F, 24.0F, 0.0F));
		PartDefinition bone6 = LegL.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(44, 12).addBox(0.0F, -14.0F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone5 = LegL.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(36, 0).addBox(0.0F, -8.0F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		JawLower.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ArmL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ArmR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LegR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LegL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}