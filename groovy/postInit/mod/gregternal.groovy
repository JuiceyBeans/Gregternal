mods.gregtech.chemical_reactor.recipeBuilder()
    .fluidInputs(fluid('neutronium') * 50)
    .fluidInputs(fluid('stone') * 72)
    .outputs(item('gregternal:cosmic_brick'))
    .duration(200)
    .EUt(98304)
    .buildAndRegister()

mods.extendedcrafting.combinationcrafting.recipeBuilder()
    .cost(8000000)
    .perTick(20000)
    .output(item('gregternal:gregternal'))
    .input(metaitem('nan.certificate'))
    .pedestals(item('gregternal:gregorioust'), item('gregternal:eternal_hat'), item('gregternal:argent_sign'), item('gregternal:thaumic_goggles'))
    .register() //Registers your recipe. Very important!

mods.extendedcrafting.tablecrafting.shapedBuilder()
    .output(item('gregternal:gregorioust'))
    .matrix(
        '  N  ',
        ' ncn ',
        'NcfcN',
        ' ncn ',
        '  N  '
        )
        .key('N', metaitem('credit.neutronium'))
        .key('n', metaitem('credit.naquadah'))
        .key('f', metaitem('field.generator.uv'))
        .key('c', metaitem('coin.chocolate'))
        .tier(2)
        .register()

mods.extendedcrafting.tablecrafting.shapedBuilder()
    .output(item('gregternal:unformed_goggles'))
    .matrix(
        '       ',
        '   F   ',
        ' BBTBB ',
        'BLLGLLB',
        'BLLBLLB',
        ' BBfBB ',
        '       '   
        )
        .key('F', item('galacticraftcore:basic_item:19'))
        .key('B', metaitem('plateDoubleBrass'))
        .key('L', metaitem('lensNetherStar'))
        .key('G', metaitem('nightvision_goggles'))
        .key('f', item('gregternal:flux'))
        .key('T', item('biomesoplenty:terrestrial_artifact'))
        .tier(3)
        .register()

mods.gregtech.vacuum_freezer.recipeBuilder()
    .fluidInputs(fluid('plasma.argent') * 5000, fluid('neutronium') * 5000)
    .outputs(item('gregternal:argent_matter') * 72)
    .duration(6000)
    .EUt(98304)
    .buildAndRegister()

mods.gregtech.extractor.recipeBuilder()
    .inputs(item('gregternal:argent_matter'))
    .fluidOutputs(fluid('argent') * 72)
    .duration(6000)
    .EUt(98304)
    .buildAndRegister()

mods.gregtech.extractor.recipeBuilder()
        .inputs(item('gregternal:flux') * 16)
        .fluidOutputs(fluid('flux_matter') * 100)
        .duration(600)
        .EUt(512)
        .buildAndRegister()

mods.gregtech.chemical_reactor.recipeBuilder()
    .fluidInputs(fluid('flux_matter') * 1000, fluid('xenon') * 1000)
    .inputs(item('gregternal:unformed_goggles'))
    .outputs(item('gregternal:thaumic_goggles'))
    .duration(6000)
    .EUt(2048)
    .buildAndRegister()

mods.gregtech.fusion_reactor.recipeBuilder()
    .fluidInputs(fluid('flux_matter') * 1000, fluid('neutronium') * 1000)
    .fluidOutputs(fluid('plasma.argent') * 1500)
    .duration(6000)
    .EUt(2048)
    .buildAndRegister()