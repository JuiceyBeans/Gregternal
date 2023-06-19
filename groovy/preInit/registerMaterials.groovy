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

    new Material.Builder(32001, "draconium")
		.ingot().fluid().ore()
		.element("Draconium")
		.color(0xbe49ed).iconSet("metallic")
		.blastTemp(6800, BlastProperty.GasTier.HIGHER)
		.cableProperties(524288, 1, 0, true)
		.flags("generate_plate", "generate_rod", "generate_gear", "generate_dense")
		.build()

	new Material.Builder(32003, "neutronium_grout")
	.ingot().fluid()
	.color(0x737373).iconSet("shiny")
	.components(material('neutronium') * 1, material('stone') * 2)
	.build()

	new Material.Builder(32004, "ender_ingot")
	.ingot().dust()
	.color(0x1b5423).iconSet("shiny")
	.components(material('iron') * 1, material('beryllium') * 1, material('potassium') * 4, material('nitrogen')* 5)
	.flags("generate_plate")
	.build()

	new Material.Builder(32005, "estradiol")
	.fluid()
	.color(0xca90d6).iconSet("shiny")
	.build()
}

println("[Gregternal] Finished registering materials!")