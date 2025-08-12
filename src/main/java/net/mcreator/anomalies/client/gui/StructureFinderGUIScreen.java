package net.mcreator.anomalies.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.mcreator.anomalies.world.inventory.StructureFinderGUIMenu;
import net.mcreator.anomalies.network.StructureFinderGUIButtonMessage;
import net.mcreator.anomalies.init.AnomaliesModScreens;
import net.mcreator.anomalies.AnomaliesMod;

import com.mojang.blaze3d.systems.RenderSystem;

public class StructureFinderGUIScreen extends AbstractContainerScreen<StructureFinderGUIMenu> implements AnomaliesModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	EditBox input;
	Button button_find;

	public StructureFinderGUIScreen(StructureFinderGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 112;
		this.imageHeight = 83;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("anomalies:textures/screens/structure_finder_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		input.render(guiGraphics, mouseX, mouseY, partialTicks);
		boolean customTooltipShown = false;
		if (mouseX > leftPos + 5 && mouseX < leftPos + 104 && mouseY > topPos + 28 && mouseY < topPos + 46) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.anomalies.structure_finder_gui.tooltip_input_tag_or_structure_name"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (!customTooltipShown)
			this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (input.isFocused())
			return input.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void containerTick() {
		super.containerTick();
		input.tick();
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String inputValue = input.getValue();
		super.resize(minecraft, width, height);
		input.setValue(inputValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.anomalies.structure_finder_gui.label_structure"), 14, 10, -1, false);
	}

	@Override
	public void init() {
		super.init();
		input = new EditBox(this.font, this.leftPos + 6, this.topPos + 29, 97, 18, Component.translatable("gui.anomalies.structure_finder_gui.input"));
		input.setHint(Component.translatable("gui.anomalies.structure_finder_gui.input"));
		input.setMaxLength(8192);
		input.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "input", content, false);
		});
		this.addWidget(this.input);
		button_find = Button.builder(Component.translatable("gui.anomalies.structure_finder_gui.button_find"), e -> {
			int x = StructureFinderGUIScreen.this.x;
			int y = StructureFinderGUIScreen.this.y;
			if (true) {
				AnomaliesMod.PACKET_HANDLER.sendToServer(new StructureFinderGUIButtonMessage(0, x, y, z));
				StructureFinderGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 32, this.topPos + 55, 46, 20).build();
		this.addRenderableWidget(button_find);
	}
}