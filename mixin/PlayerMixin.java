@Mixin(Player.class)
public abstract class PlayerMixin{
@Inject(method = "attack", at = @At("TAIL"))
    public void fire_aspect_torch(Entity entity, CallbackInfo ci){
    if (entity instanceof LivingEntity)
        if (attackingItemStack==Items.TORCH)
        {
        onFire(entity) = true;
        }

    }
}