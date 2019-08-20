package tk.valoeghese.irishwolves.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

@Mixin(FoodComponent.class)
public class MixinSpud {
	
	@Inject(at = @At("HEAD"), method = "isMeat", cancellable = true)
	private void makeWolvesEatSpudz(CallbackInfoReturnable<Boolean> info) {
		FoodComponent self = (FoodComponent)((Object)this);
		if (self == FoodComponents.POTATO || self == FoodComponents.BAKED_POTATO || self == FoodComponents.POISONOUS_POTATO) {
			info.setReturnValue(true);
		}
	}
}
