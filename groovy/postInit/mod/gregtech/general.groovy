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
        .name('compressedcokeclay')
        .output(metaitem('compressed.coke_clay') * 3)
        .matrix('CCC',
                'SFS',
                'SSS')
        .key('C', item('minecraft:clay'))
        .key('S', ore('sand'))
        .key('F', metaitem('wooden_form.brick'))
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

crafting.shapedBuilder()
        .name('steel_frame')
        .output(metaitem('frameSteel') * 2)
        .matrix('SWS',
                'WsW',
                'SWS')
        .key('W', metaitem('stickSteel'))
        .key('S', metaitem('boltSteel'))
        .key('s', ore('toolWrench'))
        .replace()
        .register()

crafting.shapedBuilder()
        .name('aluminium_frame')
        .output(metaitem('frameAluminium') * 2)
        .matrix('SWS',
                'WsW',
                'SWS')
        .key('W', metaitem('stickAluminium'))
        .key('S', metaitem('boltAluminium'))
        .key('s', ore('toolWrench'))
        .replace()
        .register()

crafting.addShapeless('neutronium_ingot_conversion', item('avaritia:resource:4'), [metaitem('ingotNeutronium')])
crafting.addShapeless('neutronium_nugget_conversion', item('avaritia:resource:3'), [metaitem('nuggetNeutronium')])

crafting.replaceShapeless('clay_block_to_dust', metaitem('dustClay') * 1, [item('minecraft:clay'), ore('toolMortar')])
crafting.addShapeless('bronze_dust_manual', metaitem('dustBronze') * 3, [metaitem('dustCopper'), metaitem('dustCopper'), metaitem('dustCopper'), ore('dustTin')])

mods.gregtech.lathe.recipeBuilder()
        .inputs(metaitem('plateNetherStar'))
        .outputs(metaitem('dustSmallNetherStar') * 1)
        .chancedOutput(metaitem('dustSmallNetherStar') * 3, 2000, 1000)
        .chancedOutput(metaitem('lensNetherStar'), 1500, 1000)
        .duration(400)
        .EUt(128)
        .buildAndRegister()

mods.gregtech.compressor.recipeBuilder()
             .inputs(metaitem('dustFireclay') * 4)
             .outputs(metaitem('compressed.fireclay'))
             .duration(400)
             .EUt(4)
             .buildAndRegister()

mods.gregtech.extruder.recipeBuilder()
    .inputs(metaitem('blockNeutronium') * 64, metaitem('blockNeutronium') * 64)
    .outputs(metaitem('nan.certificate'))
    .duration(6000)
    .EUt(200000)
    .buildAndRegister()