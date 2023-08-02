import gregtech.api.GregTechAPI.MaterialEvent
import gregtech.api.unification.material.Material
import gregtech.api.unification.Elements
import gregtech.api.unification.material.properties.ToolProperty
import gregtech.api.unification.material.properties.BlastProperty
import gregtech.api.fluids.fluidType.FluidType

println("[Gregternal] Started registering materials!")

// register an event listener
event_manager.listen { MaterialEvent event ->

    new Material.Builder(3200, resource("gregternal:titanium_aluminide"))
    	.ingot().fluid()
    	.color(0xA297A7)
    	.flags("generate_plate", "generate_rod", "generate_gear")
    	.components(material('aluminium') * 1, material('titanium') * 1)
    	.build()
	println("[Gregternal] Registered titanium aluminide!")

	new Material.Builder(32003, resource("gregternal:neutronium_grout"))
		.ingot().fluid()
		.color(0x737373).iconSet("shiny")
		.components(material('neutronium') * 1, material('stone') * 2)
		.build()
	println("[Gregternal] Registered neutronium grout!")

	new Material.Builder(32005, resource("gregternal:estradiol"))
		.fluid().ingot().dust()
		.color(0xca90d6).iconSet("dull")
		.flags("generate_plate", "generate_foil")
		.build()
	println("[Gregternal] Registered estradiol! (Madeline Celeste reference)")

	new Material.Builder(32006, "argent")
		.ingot().fluid().plasma().dust()
		.color(0xff2b2b)
		.iconSet("quartz")
		.flags("no_unification", "disable_decomposition", "flammable", "generate_rod", "generate_frame")
		.build()
	println("[Gregternal] Registered argent matter.")

	new Material.Builder(32007, resource("gregternal:flux_matter"))
		.fluid()
		.color(0x2d0359)
		.build()
	println("[Gregternal] Registered flux matter.")

	new Material.Builder(32008, resource("gregternal:molten_pig"))
		.fluid()
		.color(0xd8a9db)
		.build()
}

println("[Gregternal] Finished registering 5 materials!")