import net.minecraft.item.ItemStack
import net.minecraft.item.Item

println("[Gregternal] Creating content")

def int itemsCreated = 0
def int blocksCreated = 0

static void createItem(String name){
        content.createItem(name)
            .register()
        def itemsCreated ++ 1
        
}

static void createBlock(String name){
        content.createBlock(name)
            .register()
        def blocksCreated ++ 1
        
}

createItem('grout_brick')
createItem('poor_charcoal')
createBlock('cosmic_brick')

println("[Gregternal] Created " + itemsCreated + "items!")
println("[Gregternal] Created " + blocksCreated + "blocks!")