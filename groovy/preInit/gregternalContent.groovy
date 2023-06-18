import net.minecraft.item.ItemStack
import net.minecraft.item.Item

println("[Gregternal] Creating content")

int itemsCreated

static void createItem(String name){
        content.createItem(name)
            .register()
}

createItem('grout_brick')
createItem('poor_charcoal')
createItem('neutronium_grout')

println("[Gregternal] Created " + itemsCreated + "items!")