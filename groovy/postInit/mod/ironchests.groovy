crafting.shapedBuilder()
        .name('copper_chest_new')
        .output(item('ironchest:iron_chest:3'))
        .matrix('SPS',
                'PCP',
                'PPP')
        .key('C', ore('chestWood'))
        .key('P', metaitem('plateCopper'))
        .key('S', metaitem('stickCopper'))
        .register()

crafting.shapedBuilder()
        .name('iron_chest_new')
        .output(item('ironchest:iron_chest:0'))
        .matrix('SPS',
                'PCP',
                'PPP')
        .key('C', item('ironchest:iron_chest:3'))
        .key('P', metaitem('plateIron'))
        .key('S', metaitem('screwIron'))
        .register()

crafting.shapedBuilder()
        .name('silver_chest_new')
        .output(item('ironchest:iron_chest:4'))
        .matrix('SPS',
                'PCP',
                'PPP')
        .key('C', item('ironchest:iron_chest:0'))
        .key('P', metaitem('plateSilver'))
        .key('S', metaitem('screwSilver'))
        .register()

crafting.shapedBuilder()
        .name('gold_chest_new')
        .output(item('ironchest:iron_chest:1'))
        .matrix('SPS',
                'PCP',
                'PPP')
        .key('C', item('ironchest:iron_chest:4'))
        .key('P', metaitem('plateGold'))
        .key('S', metaitem('screwGold'))
        .register()

crafting.shapedBuilder()
        .name('diamond_chest_new')
        .output(item('ironchest:iron_chest:2'))
        .matrix('SPS',
                'PCP',
                'PPP')
        .key('C', item('ironchest:iron_chest:1'))
        .key('P', metaitem('plateDiamond'))
        .key('S', metaitem('screwDiamond'))
        .register()