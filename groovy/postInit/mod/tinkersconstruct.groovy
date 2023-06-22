crafting.addShaped('stencil_table', item('tconstruct:tooltables:1'), [
        [null, item('tconstruct:pattern'), null],
        [ore('slabWood'), ore('slabWood'), ore('slabWood')],
        [item('minecraft:fence'), null, item('minecraft:fence')]
])

crafting.addShaped('part_builder', item('tconstruct:tooltables:2'), [
        [null, item('tconstruct:pattern'), null],
        [ore('logWood'), ore('logWood'), ore('logWood')],
        [item('minecraft:fence'), null, item('minecraft:fence')]
])

crafting.addShaped('tool_table', item('tconstruct:tooltables:3'), [
        [null, item('tconstruct:pattern'), null],
        [ore('slabWood'), ore('slabWood'), ore('slabWood')],
        [ore('logWood'), null, ore('logWood')]
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