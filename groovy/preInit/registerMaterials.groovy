import gregtech.api.GregTechAPI.MaterialEvent
import gregtech.api.unification.material.Material
import gregtech.api.unification.Elements
import gregtech.api.unification.material.properties.ToolProperty
import gregtech.api.unification.material.properties.BlastProperty
import gregtech.api.fluids.fluidType.FluidType;

println("[Gregternal] Started registering materials!")
Elements.add(149, 264, -1, null, "Draconium", "Dc", false)

// register an event listener
event_manager.listen { MaterialEvent event ->

    new Material.Builder(3200, "titanium_aluminide")
    	.ingot().fluid()
    	.color(0xA297A7)
    	.flags("generate_plate", "generate_rod", "generate_gear")
    	.components(material('aluminium') * 1, material('titanium') * 1)
    	.build()
	println("[Gregternal] Registered titanium aluminide!")

    new Material.Builder(32001, "draconium")
		.ingot().fluid().ore()
		.element("Draconium")
		.color(0xbe49ed).iconSet("metallic")
		.blastTemp(6800, BlastProperty.GasTier.HIGHER)
		.cableProperties(524288, 1, 0, true)
		.flags("generate_plate", "generate_rod", "generate_gear", "generate_dense")
		.build()
	println("[Gregternal] Registered draconium!")

	new Material.Builder(32003, "neutronium_grout")
		.ingot().fluid()
		.color(0x737373).iconSet("shiny")
		.components(material('neutronium') * 1, material('stone') * 2)
		.build()
	println("[Gregternal] Registered neutronium grout!")

/*new Material.Builder(32004, "ender_ingot").ingot().dust().color(0x1b5423).iconSet("shiny").components(material('iron') * 1, material('beryllium') * 1, material('potassium') * 4, material('nitrogen')* 5).flags("generate_plate").build()
*/

	new Material.Builder(32005, "estradiol")
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
	println("[Gregternal] Registered \u00A7cargent matter.")

	new Material.Builder(32007, "flux_matter")
		.fluid()
		.color(0x2d0359)
		.build()
	println("[Gregternal] Registered \u00A75flux matter.")
}

println("[Gregternal] Finished registering 5 materials!")