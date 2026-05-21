@Mixin(Player.class)
public abstract class PlayerMixin{
    @Shadow public abstract ItemStack getWeaponItem();
    @Inject(method = "attack", at = @At("TAIL"))
    public void fire_aspect_torch(Entity entity, CallbackInfo ci) {
        System.out.println("1 works");
    if (entity instanceof LivingEntity theEntity) {
        System.out.println("2 works");
        ItemStack attackingItemStack = this.getWeaponItem();
        if (attackingItemStack.is(Items.TORCH)) {
            theEntity.igniteForSeconds(4);
            System.out.println("3 works");
        }

    }
}