//Remove from HEI
def yeetFromHEI = [
    'backpack:stick:0',
    'backpack:stick:1',
    'travelersbackpack:sleeping_bag_bottom',
    'appliedenergistics2:grindstone' //To-do: Add recipes for nether quartz dust and flour using either mortar or macerator. Probably macerator
]

for(toBeYeeted in yeetFromHEI) {
    mods.hei.removeAndHide(item(toBeYeeted))
}

//Hide from JEI

//Removes categories from JEI
mods.jei.hideCategory('appliedenergistics2.grinder')

//Remove recipes
def recipesToRemove = [
    'endercore:shapeless_paper',
    'enderio:tweak_wood_hopper',
    'enderio:tweak_chest_from_wood',
    'enderio:tweak_stick_from_wood',
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
    'ceramics:uncrafting/clay_block',
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
    'extendedcrafting:black_iron_slate',
    'ironchest:chest/copper/vanilla_copper_chest',
    'ironchest:chest/iron/vanilla_iron_chest',
    'ironchest:chest/silver/vanilla_silver_chest',
    'ironchest:chest/gold/vanilla_gold_chest',
    'ironchest:chest/diamond/vanilla_diamond_chest',
    'ironchest:chest/iron/copper_iron_chest',
    'ironchest:chest/silver/iron_silver_chest',
    'ironchest:chest/silver/copper_silver_chest',
    'ironchest:chest/gold/silver_gold_chest',
    'ironchest:chest/gold/iron_gold_chest',
    'ironchest:chest/diamond/gold_diamond_chest',
    'ironchest:chest/diamond/silver_diamond_chest',
    'travelersbackpack:travelers_backpack_standard',
    'gregtech:dust_bronze',
    'atum:stick'
]

for(name in recipesToRemove) {
    crafting.remove(name)
}

def removeOutputs = [

    'tconstruct:tooltables:1',
    'tconstruct:tooltables:2',
    'tconstruct:tooltables:3',
    'extendedcrafting:material:14',
    'extendedcrafting:material:15',
    'extendedcrafting:material:16',
    'extendedcrafting:material:17',
    'extendedcrafting:material:18',
    'extendedcrafting:material:19',
    'harvestcraft:tool_cuttingboarditem',
    'harvestcraft:tool_potitem',
    'harvestcraft:tool_skilletitem',
    'harvestcraft:tool_saucepanitem',
    'harvestcraft:tool_bakewareitem',
    'harvestcraft:tool_mortarandpestleitem',
    'harvestcraft:tool_mixingbowlitem',
    'harvestcraft:tool_juiceritem'

]
for(name in removeOutputs) {
    crafting.remove(name)
}

furnace.removeByInput(item('tconstruct:soil:0'))
furnace.removeByInput(item('backpack:bound_leather'))
furnace.removeByInput(item('biomesoplenty:white_sand'))

mods.tinkersconstruct.Alloying.removeByOutput(fluid('pigiron'))
mods.tinkersconstruct.Alloying.removeByOutput(fluid('alumite'))

mods.gregtech.lathe.removeByInput(120, [metaitem('plateNetherStar')], null)
mods.gregtech.compressor.removeByInput(4, [metaitem('dustFireclay')], null)
mods.gregtech.extruder.removeByInput(7, [metaitem('blockNeutronium')] * 128, null)