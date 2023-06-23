crafting.shapedBuilder()
        .name('flint_knife')
        .output(item('gregtech:knife').withNbt(["DisallowContainerItem": (byte) 0, "GT.Tool": ["Material": "flint", "MaxDurability": 32, "Durability": 0, "AttackDamage": 2.0F, "AttackSpeed": 2.5F], "HideFlags": 2, "GT.Behaviours": []]))
        .matrix('  F',
                ' S ',
                '   ')
        .key('F', item('minecraft:flint'))
        .key('S', ore('stickWood'))
        .register()

crafting.shapedBuilder()
        .name('flint_sword')
        .output(item('gregtech:sword').withNbt(["DisallowContainerItem": (byte) 0, "GT.Tool": ["Material": "flint", "MaxDurability": 32, "Durability": 0, "AttackDamage": 2.0F, "AttackSpeed": 1.0F, "HarvestLevel": 1], "HideFlags": 2, "GT.Behaviours": [], "RepairCost": 3, "ench": [["id": 20, "lvl": (short) 2]]]))
        .matrix(' F ',
                ' F ',
                ' S ')
        .key('F', item('minecraft:flint'))
        .key('S', ore('stickWood'))
        .mirrored()
        .register()

crafting.shapedBuilder()
        .name('flint_axe')
        .output(item('gregtech:axe').withNbt(["DisallowContainerItem": (byte) 0, "GT.Tool": ["Material": "flint", "MaxDurability": 32, "Durability": 0, "AttackDamage": 2.0F, "AttackSpeed": 2.5F], "HideFlags": 2, "GT.Behaviours": []]))
        .matrix('FF ',
                'FS ',
                ' S ')
        .key('F', item('minecraft:flint'))
        .key('S', ore('stickWood'))
        .mirrored()
        .register()

crafting.shapedBuilder()
        .name('flint_saw')
        .output(item('gregtech:saw').withNbt(["DisallowContainerItem": (byte) 0, "GT.Tool": ["Material": "flint", "MaxDurability": 16, "Durability": 0, "AttackDamage": 1.0F, "AttackSpeed": -2.6F], "HideFlags": 2, "GT.Behaviours": ["HarvestIce": (byte) 1]]))
        .matrix('   ',
                'FFS',
                'FFM')
        .key('F', item('minecraft:flint'))
        .key('S', ore('stickWood'))
        .key('M', ore('toolMallet'))
        .mirrored()
        .register()

crafting.shapedBuilder()
        .name('iron_butchery_knife')
        .output(item('gregtech:butchery_knife').withNbt(["DisallowContainerItem": (byte) 0, "GT.Tool": ["Material": "iron", "MaxDurability": 256, "Durability": 0, "AttackDamage": 3.5F, "AttackSpeed": -1.3F, "HarvestLevel": 2], "HideFlags": 2, "ench": [["id": 21, "lvl": (short) 3]], "GT.Behaviours": []]))
        .matrix('PPF',
                'PP ',
                'RH ')
        .key('P', metaitem('plateIron'))
        .key('R', metaitem('stickIron'))
        .key('F', ore('toolHammer'))
        .key('H', ore('toolFile'))
        .register()