
package net.rocky.tools.client.renderer;

import net.rocky.tools.entity.RockysEntity;
import net.rocky.tools.client.model.Modelrockys;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class RockysRenderer extends MobRenderer<RockysEntity, LivingEntityRenderState, Modelrockys> {
	private RockysEntity entity = null;

	public RockysRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelrockys(context.bakeLayer(Modelrockys.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(RockysEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("the_tools_and_other:textures/entities/rockys.png");
	}
}
