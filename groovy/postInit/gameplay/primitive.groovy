//Add recipes
crafting.shapedBuilder()
        .name('furnace')
        .output(item('minecraft:furnace'))
        .matrix('CCC',
                'FFF',
                'CCC')
        .key('C', ore('cobblestone'))
        .key('F', item('minecraft:flint'))
        .replace()
        .register()

crafting.shapedBuilder()
        .name('craftingtable')
        .output(item('minecraft:crafting_table'))
        .matrix('FF ',
                'WW ',
                '   ')
        .key('W', ore('logWood'))
        .key('F', item('minecraft:flint'))
        .replace()
        .register()

crafting.replaceShapeless('manual_logToPlank', item('minecraft:planks') * 2, [ore('logWood')])
crafting.replaceShapeless('craftingstation', item('tconstruct:tooltables:0'), [ore('craftingTableWood'), ore('toolsSaw')])