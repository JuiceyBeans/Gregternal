crafting.replaceShaped('stencil_table', item('tconstruct:tooltables:1'), [
        [null, item('tconstruct:pattern'), null],
        [item('minecraft:wooden_slab'), item('minecraft:wooden_slab'), item('minecraft:wooden_slab')],
        [item('minecraft:fence'), null, item('minecraft:fence')]
])

crafting.addShapeless('groutbricks', item('gregternal:grout_brick') * 2, [metaitem('wooden_form.brick'), item('tconstruct:soil:0')])

crafting.replaceShapeless('crafting_station', item('tconstruct:tooltables:0'), [ore('toolSaw'), ore('craftingTableWood')])
crafting.replaceShapeless('pattern', item('tconstruct:pattern:0'), [item('minecraft:paper'), item('minecraft:paper'), ore('stickWood'), ore('stickWood')])

furnace.add(item('gregternal:grout_brick'), item('tconstruct:materials:0'), 0.5f)

mods.gregtech.mixer.recipeBuilder()
        .inputs(item('minecraft:gravel'), ore('sand'), item('minecraft:clay_ball'))
        .outputs(item('tconstruct:soil:0') * 4)
        .duration(100)
        .EUt(16)
        .buildAndRegister()

mods.gregtech.centrifuge.recipeBuilder()
        .inputs(ore('blockSlimeCongealed') * 8)
        .outputs(metaitem('dustRawRubber'))
        .fluidOutputs(fluid('glue') * 100)
        .duration(40)
        .EUt(32)
        .buildAndRegister()