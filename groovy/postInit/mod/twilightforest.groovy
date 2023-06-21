mods.extendedcrafting.tablecrafting.shapedBuilder()
        .output(item('gregternal:twilight_catalyst'))
        .matrix('BeB',
                'LDE',
                'BFB')
        .key('B', ore('circuitLv'))
        .key('L', metaitem('gemFlawlessLapis'))
        .key('D', metaitem('gemFlawlessDiamond'))
        .key('E', metaitem('gemFlawlessEmerald'))
        .key('F', metaitem('field.generator.lv'))
        .key('e', metaitem('emitter.lv'))
        .tier(1)
        .register()