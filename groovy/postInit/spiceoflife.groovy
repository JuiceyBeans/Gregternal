crafting.shapedBuilder()
        .name('lunchbag')
        .output(item('spiceoflife:lunchbag'))
        .matrix('PRP',
                'P P',
                'RPR')
        .key('P', item('minecraft:paper'))
        .key('R', metaitem('rubber_drop'))
        .replace()
        .register()

crafting.shapedBuilder()
        .name('lunchbox')
        .output(item('spiceoflife:lunchbox'))
        .matrix('SRS',
                'DLD',
                'DPD')
        .key('L', item('spiceoflife:lunchbag'))
        .key('P', metaitem('plateIron'))
        .key('D', metaitem('plateDoubleIron'))
        .key('S', metaitem('screwIron'))
        .key('R', metaitem('stickIron'))
        .replace()
        .register()

crafting.replaceShapeless('food_journal', item('spiceoflife:bookfoodjournal'), [item('minecraft:wheat'), item('minecraft:book')])