import gregtech.api.GregTechAPI.MaterialEvent
import gregtech.api.unification.material.Material

// register an event listener
event_manager.listen { MaterialEvent event ->


    println("Groovy started registering materials")

    new Material.Builder(3200, "titanium_aluminide")
    .ingot().fluid()
    .color(0xA297A7)
    .flags(["generate_plate", "generate_rod", "generate_gear"])
    .components([material('aluminium') * 1, material('titanium') * 1])
    .build()

    println("Groovy finished registering materials")
}
