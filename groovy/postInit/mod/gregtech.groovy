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

crafting.shapedBuilder()
        .name('workbench')
        .output(metaitem('workbench'))
        .matrix('CsC',
                'PcP',
                'PsP')
        .key('C', ore('chestWood'))
        .key('S', ore('toolSaw'))
        .key('s', ore('slabWood'))
        .key('P', ore('plankWood'))
        .key('c', item('tconstruct:tooltables'))
        .replace()
        .register()

crafting.replaceShapeless('compressed_clay', metaitem('compressed.clay'), [metaitem('wooden_form.brick'), item('minecraft:clay')])