import net.minecraft.item.EnumRarity
import net.minecraftforge.common.IRarity

println("[Gregternal] Started creating content!")

def int itemsCreated = 0
def int blocksCreated = 0

void createItem(String name){
        content.createItem(name)
            .register()
}

void createUncommonItem(String name){
        content.createItem(name)
            .setRarity(EnumRarity.UNCOMMON)
            .register()
}

void createRareItem(String name){
        content.createItem(name)
            .setRarity(EnumRarity.RARE)
            .register()
}

void createEpicItem(String name){
        content.createItem(name)
            .setRarity(EnumRarity.EPIC)
            .register()
}

void createBlock(String name){
        content.createBlock(name)
            .register()
}

//Items
def itemsToCreate = [
    'grout_brick',
    'poor_charcoal',
    'leaf_bundle',
    'poor_cloth_bolt',
    'crystal_matrix_processor',
    'crystal_matrix_lens',
    'unformed_goggles',
    'unsignedlongint',
    'hoal',
    'crushed_granite'
]

for(item in itemsToCreate) {
    createItem(item)
}
//Foods
createItem('boston_pumpkin')

//Blocks
def blocksToCreate = [
    'cosmic_brick',
    'borosilicate_glass_coal',
    'crystal_fusion_glass',
]

for(block in blocksToCreate) {
    createBlock(block)
}

println("[Gregternal] Created " + blocksCreated + " blocks!")

//Endgame content
createRareItem('thaumic_goggles')
createRareItem('eternal_hat')
createRareItem('argent_sign')
createRareItem('gregorioust')

createEpicItem('gregternal')

//Custom items
content.createItem('twilight_catalyst')
    .setEnchantedEffect() 
    .setRarity(EnumRarity.UNCOMMON)
    .register()

content.createItem('argent_matter')
    .setEnchantedEffect() 
    .setRarity(EnumRarity.UNCOMMON)
    .register()

content.createItem('flux')
    .setEnchantedEffect() 
    .setRarity(EnumRarity.UNCOMMON)
    .register()

println("[Gregternal] Created " + itemsCreated + " items!")

println("[Gregternal] Finished creating content!")