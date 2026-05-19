@Mixin(Player.class)
public abstract class PlayerMixin{
@inject(method = "attack", at = @At("TAIL"))
    public void fire_aspect_torch(final Entity entity){
    if (entity instanceof LivingEntity)
        if (attackingItemStack=Items.TORCH)
        {
        onFire(entity) = true;
        }

    }
}