import net.minecraft.item.ItemStack
import net.minecraft.item.Item

println("[Gregternal] Started creating content!")

def int itemsCreated = 4
def int blocksCreated = 3

static void createItem(String name){
        content.createItem(name)
            .register()
}

static void createBlock(String name){
        content.createBlock(name)
            .register()
}

createItem('grout_brick')
createItem('poor_charcoal')
createItem('crystal_matrix_processor')
createItem('crystal_matrix_lens')
println("[Gregternal] Created " + itemsCreated + " items!")

createBlock('cosmic_brick')
createBlock('crystal_fusion_glass')

mods.gregtech.blocksHeatingCoils.add(item('dirt'), "dirt", 1400, 2, 4, 3, null)

println("[Gregternal] Created " + blocksCreated + " blocks!")

println("[Gregternal] Finished creating content!")