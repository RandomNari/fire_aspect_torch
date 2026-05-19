@Mixin(Player.class)
public abstract class PlayerMixin{
@inject(method = "attack", at = @At("Head"))
}