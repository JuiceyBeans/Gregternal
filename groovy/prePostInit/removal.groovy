//Hide from JEI
mods.jei.yeet(item('libvulpes:productplate'))
mods.jei.yeet(item('libvulpes:productgear'))
mods.jei.yeet(item('libvulpes:productrod'))
mods.jei.yeet(item('libvulpes:productnugget'))
mods.jei.yeet(item('advancedrocketry:platepress'))
mods.jei.yeet(item('appliedenergistics2:grindstone')) //Add recipes for nether quartz dust and flour using either mortar or macerator. Probably macerator

//Removes categories from JEI
mods.jei.hideCategory('zmaster587.AR.platePresser')
mods.jei.hideCategory('appliedenergistics2.grinder')

//Remove recipes
def recipesToRemove = [
    'enderio:tweak_wood_hopper',
    'enderio:tweak_chest_from_wood',
    'quark:hopper',
    'quark:chest',
    'quark:chest_1',
    'quark:trapdoor',
    'minecraft:oak_wooden_slab'
    ]

for(name in recipesToRemove) {
    crafting.remove(name)
}

furnace.removeByInput(item('tconstruct:soil:0'))
furnace.removeByInput(item('biomesoplenty:white_sand'))