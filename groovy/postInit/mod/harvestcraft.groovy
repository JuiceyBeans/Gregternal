crafting.addShaped('cutting_board', item('harvestcraft:cuttingboarditem'), [
        [null, null, null],
        [null, ore('toolButcheryKnife'), null],
        [metaitem('plateTreatedWood'), metaitem('plateTreatedWood'), metaitem('plateTreatedWood')]
])

crafting.shapedBuilder()
        .name('pot')
        .output(item('harvestcraft:potitem'))
        .matrix(' H ',
                'SBS',
                'sSs')
        .key('H', ore('toolHammer'))
        .key('S', metaitem('plateWroughtIron'))
        .key('s', metaitem('screwWroughtIron'))
        .key('B', item('minecraft:bucket'))
        .mirrored()
        .register()

crafting.shapedBuilder()
        .name('skillet')
        .output(item('harvestcraft:skilletitem'))
        .matrix('dSS',
                'sSS',
                'tsH')
        .key('H', ore('toolHammer'))
        .key('d', ore('toolScrewdriver'))
        .key('S', metaitem('plateWroughtIron'))
        .key('t', metaitem('stickTreatedWood'))
        .key('s', metaitem('screwWroughtIron'))
        .mirrored()
        .register()

crafting.shapedBuilder()
        .name('saucepan')
        .output(item('harvestcraft:saucepanitem'))
        .matrix('dst',
                'SSs',
                'SSH')
        .key('H', ore('toolHammer'))
        .key('d', ore('toolScrewdriver'))
        .key('S', metaitem('plateWroughtIron'))
        .key('t', metaitem('stickWroughtIron'))
        .key('s', metaitem('screwWroughtIron'))
        .mirrored()
        .register()

crafting.shapedBuilder()
        .name('bakeware')
        .output(item('harvestcraft:bakewareitem'))
        .matrix('H F',
                'S S',
                'SSS')
        .key('H', ore('toolHammer'))
        .key('F', ore('toolFile'))
        .key('S', metaitem('plateStainlessSteel'))
        .mirrored()
        .register()

crafting.shapedBuilder()
    .name('mortar')
    .output(item('harvestcraft:mortarandpestleitem'))
    .matrix('H F',
            'S S',
            'SSS')
    .key('H', ore('toolHammer'))
    .key('F', ore('toolFile'))
    .key('S', metaitem('plateStone'))
    .mirrored()
    .register()

crafting.shapedBuilder()
    .name('bowl')
    .output(item('harvestcraft:mixingbowlitem'))
    .matrix('H F',
            'S S',
            'sSs')
    .key('H', ore('toolHammer'))
    .key('F', ore('toolFile'))
    .key('S', metaitem('plateTreatedWood'))
    .key('s', metaitem('screwWroughtIron'))
    .mirrored()
    .register()

crafting.shapedBuilder()
    .name('juicer')
    .output(item('harvestcraft:juiceritem'))
    .matrix('H F',
            'SGS',
            'SSS')
    .key('H', ore('toolHammer'))
    .key('F', ore('toolFile'))
    .key('S', metaitem('plateStainlessSteel'))
    .key('G', metaitem('component.grinder.diamond'))
    .mirrored()
    .register()