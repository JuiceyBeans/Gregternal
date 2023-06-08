//Hide from JEI
mods.jei.yeet(item('libvulpes:productplate'))
mods.jei.yeet(item('libvulpes:productgear'))
mods.jei.yeet(item('libvulpes:productrod'))
mods.jei.yeet(item('libvulpes:productnugget'))
mods.jei.yeet(item('advancedrocketry:platepress'))

//Removes categories from JEI
mods.jei.hideCategory('zmaster587.AR.platePresser')

//Remove recipes
def recipesToRemove = [
    'enderio:tweak_wood_hopper',
    'enderio:tweak_chest_from_wood',
    'quark:hopper',
    'quark:chest',
    'quark:chest_1',
    ]

for(name in recipesToRemove) {
    crafting.remove(name)
}

crafting.removeByOutput(item('minecraft:piston'))
