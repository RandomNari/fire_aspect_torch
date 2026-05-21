@Mixin(Player.class)
public abstract class PlayerMixin{
@Inject(method = "attack", at = @At("TAIL"))
    public void fire_aspect_torch(Entity entity, CallbackInfo ci) {

    @Shadow public abstract ItemStack getWeaponItem();

    if (entity instanceof LivingEntity) {
    }
        ItemStack attackingItemStack = this.getWeaponItem();
        if (attackingItemStack == Items.TORCH) {
            entity.igniteForSeconds(4);
        }

    }
}