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
createItem('grout_brick')
createItem('poor_charcoal')
createItem('leaf_bundle')
createItem('poor_cloth_bolt')
createItem('crystal_matrix_processor')
createItem('crystal_matrix_lens')
createItem('unformed_goggles')

//Foods
createItem('boston_pumpkin')

//Blocks
createBlock('cosmic_brick')
createBlock('crystal_fusion_glass')
createBlock('borosilicate_glass')

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

//mods.gregtech.blocks.HeatingCoils.add(<blockstate:minecraft:dirt:variant=dirt,snowy=false>, "dirt", 1400, 2, 4, 3, null)

println("[Gregternal] Finished creating content!")