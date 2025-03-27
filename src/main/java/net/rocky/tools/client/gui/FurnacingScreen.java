package net.rocky.tools.client.gui;

import net.rocky.tools.world.inventory.FurnacingMenu;
import net.rocky.tools.procedures.Arrow4Procedure;
import net.rocky.tools.procedures.Arrow3Procedure;
import net.rocky.tools.procedures.Arrow2Procedure;
import net.rocky.tools.procedures.Arrow1Procedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class FurnacingScreen extends AbstractContainerScreen<FurnacingMenu> {
	private final static HashMap<String, Object> guistate = FurnacingMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public FurnacingScreen(FurnacingMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("the_tools_and_other:textures/screens/furnacing.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(RenderType::guiTextured, texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		if (Arrow1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("the_tools_and_other:textures/screens/flecha1.png"), this.leftPos + 60, this.topPos + 34, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("the_tools_and_other:textures/screens/flecha2.png"), this.leftPos + 60, this.topPos + 34, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("the_tools_and_other:textures/screens/flecha3.png"), this.leftPos + 60, this.topPos + 34, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("the_tools_and_other:textures/screens/flecha4.png"), this.leftPos + 60, this.topPos + 34, 0, 0, 16, 16, 16, 16);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.the_tools_and_other.furnacing.label_furnacing"), 51, 7, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
