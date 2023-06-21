crafting.shapedBuilder()
        .name('wooden_frame_backpack')
        .output(item('backpack:backpack_frame:0'))
        .matrix('SWS',
                'WsW',
                'SWS')
        .key('s', metaitem('screwWroughtIron'))
        .key('S', metaitem('stickTreatedWood'))
        .key('W', item('minecraft:string'))
        .replace()
        .register()

crafting.shapedBuilder()
        .name('stone_frame_backpack')
        .output(item('backpack:backpack_frame:1'))
        .matrix('SWS',
                'WsW',
                'SWS')
        .key('W', item('galacticraftcore:canvas'))
        .key('S', metaitem('ringSteel'))
        .key('s', metaitem('frameSteel'))
        .replace()
        .register()

crafting.shapedBuilder()
        .name('iron_frame_backpack')
        .output(item('backpack:backpack_frame:2'))
        .matrix('SWS',
                'WsW',
                'SWS')
        .key('W', item('galacticraftcore:canvas'))
        .key('S', metaitem('ringAluminium'))
        .key('s', metaitem('frameAluminium'))
        .replace()
        .register()

mods.tinkersconstruct.drying.add(item('backpack:bound_leather'), item('backpack:tanned_leather'), 12000)