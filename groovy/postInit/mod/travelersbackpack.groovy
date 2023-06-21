crafting.shapedBuilder()
        .name('travelers_backpack')
        .output(item('travelersbackpack:travelers_backpack'))
        .matrix('rpr',
                'csc',
                'tbt')
        .key('s', ore('bigBackpack'))
        .key('r', metaitem('ringStainlessSteel'))
        .key('b', item('openblocks:sleeping_bag'))
        .key('p', metaitem('plateStainlessSteel'))
        .key('c', metaitem('large_fluid_cell.steel'))
        .key('t', item('backpack:tanned_leather'))
        .register()

crafting.shapedBuilder()
        .name('sleepy_bag')
        .output(item('openblocks:sleeping_bag'))
        .matrix(' m ',
                'sbr',
                '   ')
        .key('s', ore('toolSaw'))
        .key('m', ore('toolMallet'))
        .key('b', ore('bed'))
        .key('r', metaitem('stickAluminium'))
        .replace()
        .register()