@Mixin(Player.class)
public abstract class PlayerMixin{
    @Shadow public abstract ItemStack getWeaponItem();
    @Inject(method = "attack", at = @At("TAIL"))
    public void fire_aspect_torch(Entity entity, CallbackInfo ci) {

    if (entity instanceof LivingEntity theEntity) {

        ItemStack attackingItemStack = this.getWeaponItem();
        if (attackingItemStack.is(Items.TORCH)) {
            theEntity.igniteForSeconds(4);
        }

    }
}