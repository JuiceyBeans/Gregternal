import net.minecraftforge.event.entity.player.ItemTooltipEvent

event_manager.listen { ItemTooltipEvent event ->
    if (ItemStack.areItemsEqual(event.getItemStack(), item('gregternal:thaumic_goggles'))) {
        event.getToolTip().add('\u00A75H-how is this even here??? How do I get rid of this?!')
    }
    if (ItemStack.areItemsEqual(event.getItemStack(), item('gregternal:eternal_hat'))) {
        event.getToolTip().add('Pride is eternal.')
    }
    if (ItemStack.areItemsEqual(event.getItemStack(), item('gregternal:argent_sign'))) {
        event.getToolTip().add('\u00A7cWith wrench and sign of cosmic strength, the Slayer set to banishing all that were left unbroken by her savagery to the Void.')
    }
    if (ItemStack.areItemsEqual(event.getItemStack(), item('gregternal:gregorioust'))) {
        event.getToolTip().add('\u00A7bHoly Gregorius Techneticies!')
    }
    if (ItemStack.areItemsEqual(event.getItemStack(), item('gregternal:gregternal'))) {
        event.getToolTip().add('Open your eyes and behold in It\'s beauty.')
    }
    if (ItemStack.areItemsEqual(event.getItemStack(), item('gregternal:flux'))) {
        event.getToolTip().add('\u00A75What is this and how do I get rid of it?')
    }
    if (ItemStack.areItemsEqual(event.getItemStack(), item('gregternal:argent_matter'))) {
        event.getToolTip().add('\u00A7cA form of renewable energy produced by neutron activation of Argent Plasma')
    }
}