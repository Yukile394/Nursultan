package minecraft;

import java.util.Optional;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariantAttributes;
import net.fabricmc.fabric.impl.transfer.fluid.FluidVariantCache;
import net.fabricmc.fabric.impl.transfer.fluid.FluidVariantImpl;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class04651 implements FluidVariantCache {
   public static final class00742<class04688> L = new class00742<>();
   protected final class00507<class04651, class04688> u;
   private class04688 N;
   private final class03529<class04651> y;
   private final FluidVariant i = new FluidVariantImpl(this, class02678.N);

   public abstract float L();

   public abstract boolean L(class04688 var1);

   @Nullable
   public class00734 L(class04688 var1, class07290 var2, class07209 var3) {
      if (this.y()) {
         return null;
      } else {
         float f = var1.N(var2, var3);
         return new class00734(
            var3.method_10263(), var3.method_10264(), var3.method_10260(), var3.method_10263() + 1.0, var3.method_10264() + f, var3.method_10260() + 1.0
         );
      }
   }

   public final class04688 M() {
      return this.N;
   }

   public class04651() {
      super();
      this.y = class04206.L.R(this);
      class00517 class00517 = new class00517<>(this);
      this.N(class00517);
      this.u = class00517.N(class04651::M, class04688::new);
      this.R(this.u.y());
   }

   @Nullable
   public class07126 B() {
      return null;
   }

   public boolean Z() {
      return false;
   }

   @Deprecated
   public class03529<class04651> U() {
      return this.y;
   }

   public Optional<class04891> z() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (Optional)callbackinforeturnable.getReturnValue() : Optional.empty();
   }

   public abstract int u(class04688 var1);

   public abstract class00500 y(class04688 var1);

   public boolean y() {
      return false;
   }

   public abstract class00494 y(class04688 var1, class07290 var2, class07209 var3);

   public void y(class04782 var1, class07209 var2, class00500 var3, class04688 var4) {
   }

   @Deprecated
   public boolean N(class03530<class04651> var1) {
      return this.y.N(var1);
   }

   public boolean N(class04651 var1) {
      return var1 == this;
   }

   public void N(CallbackInfoReturnable var1) {
      Optional optional = FluidVariantAttributes.getHandlerOrDefault(this).getFillSound(FluidVariant.of(this));
      if (optional.isPresent()) {
         var1.setReturnValue(optional);
      }
   }

   public void N(class07299 var1, class07209 var2, class04688 var3, class06069 var4) {
   }

   public abstract class06581 N();

   protected void N(class00517<class04651, class04688> var1) {
   }

   public abstract float N(class04688 var1, class07290 var2, class07209 var3);

   public abstract boolean N(class04688 var1, class07290 var2, class07209 var3, class04651 var4, class07211 var5);

   public abstract int N(class05487 var1);

   public abstract class06889 N(class07290 var1, class07209 var2, class04688 var3);

   public void N(class04782 var1, class07209 var2, class04688 var3, class06069 var4) {
   }

   public void N(class07299 var1, class07209 var2, class07049 var3, class08400 var4) {
   }

   public abstract float N(class04688 var1);

   protected final void R(class04688 var1) {
      this.N = var1;
   }

   public class00507<class04651, class04688> R() {
      return this.u;
   }

   public FluidVariant fabric_getCachedFluidVariant() {
      return this.i;
   }
}
