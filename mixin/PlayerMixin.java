@Mixin(Player.class)
public abstract class PlayerMixin{
@inject(method = "attack", at = @At("Tail"))
    public static void fire_aspect_torch(final Entity entity){
    if (entity instanceof LivingEntity)
        if (attackingItemStack=Items.TORCH)
        {

        }

    }
}