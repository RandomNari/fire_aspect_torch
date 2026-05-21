package random.nari.fire_aspect_torch.mixin;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.world.entity.Entity;


@Mixin(Player.class)
public abstract class PlayerMixin{

    @Shadow
    public abstract ItemStack getWeaponItem();
    @Inject(method = "attack", at = @At("TAIL"))
    public void fire_aspect_torch(Entity entity, CallbackInfo ci) {
        ItemStack attackingItemStack = this.getWeaponItem();
        if (attackingItemStack.is(Items.TORCH)) {
            entity.igniteForSeconds(4);
        }
        if (attackingItemStack.is(Items.SOUL_TORCH)) {
            entity.igniteForSeconds(4);
        }
    }
}