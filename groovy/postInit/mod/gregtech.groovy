crafting.shapedBuilder()
        .name('manual_woodplank')
        .output(metaitem('plateWood'))
        .matrix('WWS',
                'H  ',
                '   ')
        .key('W', ore('logWood'))
        .key('S', ore('toolSaw'))
        .key('H', ore('toolHammer'))
        .replace()
        .register()

crafting.replaceShapeless('compressed_clay', metaitem('compressed.clay'), [metaitem('wooden_form.brick'), item('minecraft:clay')])