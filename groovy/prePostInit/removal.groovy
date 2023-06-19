//Remove from JEI
/*mods.jei.yeet(item('libvulpes:productplate'))
mods.jei.yeet(item('libvulpes:productgear'))
mods.jei.yeet(item('libvulpes:productrod'))
mods.jei.yeet(item('libvulpes:productnugget'))
mods.jei.yeet(item('advancedrocketry:platepress'))*/
mods.jei.yeet(item('appliedenergistics2:grindstone')) //Add recipes for nether quartz dust and flour using either mortar or macerator. Probably macerator

//Hide from JEI

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
    'minecraft:oak_wooden_slab',
    'ceramics:uncrafting/porcelain_extension',
    'ceramics:uncrafting/porcelain_extension',
    'ceramics:uncrafting/porcelain_barrel',
    'ceramics:uncrafting/faucet',
    'ceramics:uncrafting/channel',
    'quark:custom_chest',
    'quark:custom_chest_1',
    'minecraft:charcoal',
    'avaritia:items/resource/crystal_matrix_ingot',
    'avaritia:items/resource/diamond_lattice',
    'extendedcrafting:ender_ingot',
    'extendedcrafting:ender_crafter',
    'extendedcrafting:ender_alternator',
    'extendedcrafting:black_iron_ingot',
    'extendedcrafting:luminessence',
    'extendedcrafting:black_iron_rod',
    'extendedcrafting:black_iron_slate'
]

for(name in recipesToRemove) {
    crafting.remove(name)
}

crafting.removeByOutput(item('tconstruct:tooltables:1'))
crafting.removeByOutput(item('avaritia:neutron_collector'))
crafting.removeByOutput(item('extendedcrafting:material:14'))
crafting.removeByOutput(item('extendedcrafting:material:15'))
crafting.removeByOutput(item('extendedcrafting:material:16'))
crafting.removeByOutput(item('extendedcrafting:material:17'))
crafting.removeByOutput(item('extendedcrafting:material:18'))
crafting.removeByOutput(item('extendedcrafting:material:19'))

furnace.removeByInput(item('tconstruct:soil:0'))
furnace.removeByInput(item('biomesoplenty:white_sand'))

mods.gregtech.lathe.removeByInput(120, [metaitem('plateNetherStar')], null)