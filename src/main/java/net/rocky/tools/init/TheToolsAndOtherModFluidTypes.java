
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.rocky.tools.init;

import net.rocky.tools.fluid.types.YellowWaterFluidType;
import net.rocky.tools.fluid.types.WaterFluidType;
import net.rocky.tools.fluid.types.ToxicFluidType;
import net.rocky.tools.fluid.types.RedWaterFluidType;
import net.rocky.tools.fluid.types.PurpleWaterFluidType;
import net.rocky.tools.fluid.types.PinkWaterFluidType;
import net.rocky.tools.fluid.types.PetrolleoFluidType;
import net.rocky.tools.fluid.types.OrangeWaterFluidType;
import net.rocky.tools.fluid.types.MilkFluidType;
import net.rocky.tools.fluid.types.LightBlueWaterFluidType;
import net.rocky.tools.fluid.types.GreenWaterFluidType;
import net.rocky.tools.fluid.types.CursedFluidType;
import net.rocky.tools.fluid.types.BrownWaterFluidType;
import net.rocky.tools.fluid.types.BlueWaterFluidType;
import net.rocky.tools.fluid.types.ArcoirisWaterFluidType;
import net.rocky.tools.fluid.types.AquaWaterFluidType;
import net.rocky.tools.TheToolsAndOtherMod;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

public class TheToolsAndOtherModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, TheToolsAndOtherMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> GREEN_WATER_TYPE = REGISTRY.register("green_water", () -> new GreenWaterFluidType());
	public static final DeferredHolder<FluidType, FluidType> RED_WATER_TYPE = REGISTRY.register("red_water", () -> new RedWaterFluidType());
	public static final DeferredHolder<FluidType, FluidType> LIGHT_BLUE_WATER_TYPE = REGISTRY.register("light_blue_water", () -> new LightBlueWaterFluidType());
	public static final DeferredHolder<FluidType, FluidType> MILK_TYPE = REGISTRY.register("milk", () -> new MilkFluidType());
	public static final DeferredHolder<FluidType, FluidType> CURSED_TYPE = REGISTRY.register("cursed", () -> new CursedFluidType());
	public static final DeferredHolder<FluidType, FluidType> TOXIC_TYPE = REGISTRY.register("toxic", () -> new ToxicFluidType());
	public static final DeferredHolder<FluidType, FluidType> YELLOW_WATER_TYPE = REGISTRY.register("yellow_water", () -> new YellowWaterFluidType());
	public static final DeferredHolder<FluidType, FluidType> PINK_WATER_TYPE = REGISTRY.register("pink_water", () -> new PinkWaterFluidType());
	public static final DeferredHolder<FluidType, FluidType> PURPLE_WATER_TYPE = REGISTRY.register("purple_water", () -> new PurpleWaterFluidType());
	public static final DeferredHolder<FluidType, FluidType> WATER_TYPE = REGISTRY.register("water", () -> new WaterFluidType());
	public static final DeferredHolder<FluidType, FluidType> ORANGE_WATER_TYPE = REGISTRY.register("orange_water", () -> new OrangeWaterFluidType());
	public static final DeferredHolder<FluidType, FluidType> ARCOIRIS_WATER_TYPE = REGISTRY.register("arcoiris_water", () -> new ArcoirisWaterFluidType());
	public static final DeferredHolder<FluidType, FluidType> PETROLLEO_TYPE = REGISTRY.register("petrolleo", () -> new PetrolleoFluidType());
	public static final DeferredHolder<FluidType, FluidType> BROWN_WATER_TYPE = REGISTRY.register("brown_water", () -> new BrownWaterFluidType());
	public static final DeferredHolder<FluidType, FluidType> AQUA_WATER_TYPE = REGISTRY.register("aqua_water", () -> new AquaWaterFluidType());
	public static final DeferredHolder<FluidType, FluidType> BLUE_WATER_TYPE = REGISTRY.register("blue_water", () -> new BlueWaterFluidType());
}
