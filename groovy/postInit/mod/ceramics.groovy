//Add recipes
crafting.shapedBuilder()
        .name('claybukkit')
        .output(item('ceramics:unfired_clay:0'))
        .matrix('   ',
                'CMC',
                'CCC')
        .key('C', metaitem('compressed.clay'))
        .replace()
        .register()

crafting.shapedBuilder()
        .name('clayplate')
        .output(item('ceramics:unfired_clay:8'))
        .matrix(' C ',
                'C  ',
                '   ')
        .key('C', metaitem('compressed.clay'))
        .replace()
        .register()

crafting.shapedBuilder()
        .name('clayshears')
        .output(item('ceramics:unfired_clay:1'))
        .matrix(' C ',
                'C  ',
                '   ')
        .key('C', metaitem('compressed.clay'))
        .replace()
        .register()