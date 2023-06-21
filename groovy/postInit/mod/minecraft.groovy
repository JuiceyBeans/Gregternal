crafting.addShapeless('saw_oakplanks', item('minecraft:planks:0') * 4, [ore('toolSaw'), item('minecraft:log:0')])
crafting.addShapeless('saw_oakplanks', item('minecraft:planks:1') * 4, [ore('toolSaw'), item('minecraft:log:1')])
crafting.addShapeless('saw_oakplanks', item('minecraft:planks:2') * 4, [ore('toolSaw'), item('minecraft:log:2')])
crafting.addShapeless('saw_oakplanks', item('minecraft:planks:3') * 4, [ore('toolSaw'), item('minecraft:log:3')])
crafting.addShapeless('saw_oakplanks', item('minecraft:planks:4') * 4, [ore('toolSaw'), item('minecraft:log:4')])
crafting.addShapeless('saw_oakplanks', item('minecraft:planks:5') * 4, [ore('toolSaw'), item('minecraft:log:5')])

crafting.shapedBuilder()
        .name('manual_ladder')
        .output(item('minecraft:ladder') * 4)
        .matrix('SMS',
                'SWS',
                'SHS')
        .key('W', metaitem('boltWood'))
        .key('S', ore('stickWood'))
        .key('M', ore('toolMallet'))
        .key('H', ore('toolHammer'))
        .replace()
        .register()

crafting.shapedBuilder()
        .name('manual_fence')
        .output(item('minecraft:fence') * 2)
        .matrix('M S',
                'PsP',
                'PsP')
        .key('P', ore('plankWood'))
        .key('S', ore('toolSaw'))
        .key('M', ore('toolMallet'))
        .key('s', ore('stickWood'))
        .replace()
        .register()

crafting.shapedBuilder()
        .name('bed')
        .output(item('minecraft:bed'))
        .matrix(' M ',
                'WWW',
                'FPF')
        .key('W', item('minecraft:wool:0'))
        .key('P', metaitem('plateWood'))
        .key('M', ore('toolMallet'))
        .key('F', ore('fenceWood'))
        .replace()
        .register()

crafting.shapedBuilder()
        .name('manual_trapdoor')
        .output(item('minecraft:trapdoor'))
        .matrix('SsS',
                'sTs',
                'SsS')
        .key('S', ore('stickWood'))
        .key('T', ore('toolSaw'))
        .key('s', ore('slabWood'))
        .replace()
        .register()

crafting.shapedBuilder()
        .name('clay_block_manual')
        .output(item('minecraft:clay') * 2)
        .matrix('ccc',
                'cTc',
                'ccc')
        .key('c', item('minecraft:clay_ball'))
        .key('T', fluid('water'))
        .register()