package net.minecraft.src;

import java.util.List;

public class ItemAppleRubis extends ItemFood
{
    public ItemAppleRubis(int par1, int par2, float par3, boolean par4)
    {
        super(par1, par2, par3, par4);
    }

    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return true;
    }

    /**
     * Return an item rarity from EnumRarity
     */
    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return EnumRarity.epic;
    }

    protected void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    	par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 100, 1));
        par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 40));
        par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 300, 1));
        
        par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(Item.rubis, 1));
    }
    
}
