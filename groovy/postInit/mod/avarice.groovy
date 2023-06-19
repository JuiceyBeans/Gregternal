mods.gregtech.compressor.recipeBuilder()
    .inputs(metaitem('plateDiamond') * 9)
    .outputs(item('avaritia:resource:0'))
    .duration(600)
    .EUt(512)
    .buildAndRegister()

mods.gregtech.chemical_reactor.recipeBuilder()
    .inputs(item('avaritia:resource:0') * 8)
    .inputs(metaitem('quantumstar'))
    .fluidInputs(fluid('tritium') * 1000)
    .outputs(item('avaritia:resource:1'))
    .fluidOutputs(fluid('tritium') * 100)
    .duration(600)
    .EUt(2048)
    .buildAndRegister()

mods.extendedcrafting.tablecrafting.shapedBuilder()
    .output(item('avaritia:neutron_collector'))
    .matrix(
        'ppppppppp',
        'pnnnnnnnp',
        'pnlllllnp',
        'pnlggglnp',
        'pnlgdglnp',
        'pnlcPclnp',
        'pnlllllnp',
        'pnnnnnnnp',
        'ppppppppp'
        )
        .key('p', metaitem('plateDoubleNeutronium'))
        .key('n', item('avaritia:resource:2'))
        .key('l', item('avaritia:resource:0'))
        .key('g', item('gregtech:transparent_casing:1'))
        .key('d', metaitem('lensDiamond'))
        .key('c', item('avaritia:resource:1'))
        .key('P', metaitem('circuit.crystal_mainframe'))
        .tier(4)
        .register()