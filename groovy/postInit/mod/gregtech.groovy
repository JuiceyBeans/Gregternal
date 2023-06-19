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

/*crafting.shapeless('neutronium_nugget', item('avaritia:resource:3') * 9, [metaitem('ingotNeutronium')])

crafting.shapeless('neutronium_nugget_conversion', item('avaritia:resource:4'), [metaitem('nuggetNeutronium')])
crafting.shapeless('neutronium_ingot_conversion', item('avaritia:resource:3'), [metaitem('ingotNeutronium')])*/

mods.gregtech.extractor.recipeBuilder()
        .inputs(item('gregtechfoodoption:gtfo_leaves_1:12'))
        .fluidOutputs(fluid('gtfo_rainbow_sap') * 10)
        .duration(200)
        .EUt(32)
        .buildAndRegister()

mods.gregtech.lathe.recipeBuilder()
        .inputs(metaitem('plateNetherStar'))
        .outputs(metaitem('dustSmallNetherStar') * 1)
        .chancedOutput(metaitem('dustSmallNetherStar') * 3, 2000, 1000)
        .chancedOutput(metaitem('lensNetherStar'), 1500, 1000)
        .duration(400)
        .EUt(128)
        .buildAndRegister()
