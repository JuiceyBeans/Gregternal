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

crafting.shapedBuilder()
        .name('compressedclay')
        .output(metaitem('compressed.clay') * 4)
        .matrix('CCC',
                'CFC',
                'CCC')
        .key('C', metaitem('dustClay'))
        .key('F', metaitem('wooden_form.brick'))
        .replace()
        .register()

mods.gregtech.extractor.recipeBuilder()
        .inputs(item('gregtechfoodoption:gtfo_leaves_1:12'))
        .fluidOutputs(fluid('gtfo_rainbow_sap') * 10)
        .duration(200)
        .EUt(32)
        .buildAndRegister()