package minecraft;

import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class05637 implements class05663 {
   private final Map<class05946<class05660>, class06581> N;
   private final int y;
   private final int L;
   private final int u;

   public class05637(int var1, int var2, int var3, Map<class05946<class05660>, class06581> var4) {
      super();
      Set<class05946<class05660>> set = class04206.l.B();
      this.N(set).filter(var1x -> !var4.containsKey(var1x)).findAny().ifPresent(var0 -> {
         throw new IllegalStateException("Missing trade for villager type: " + var0);
      });
      this.N = var4;
      this.y = var1;
      this.L = var2;
      this.u = var3;
   }

   private Stream N(Set var1) {
      return Stream.empty();
   }

   private Object N(Object var1, CallbackInfoReturnable var2) {
      if (var1 == null) {
         var2.setReturnValue(null);
      }

      return var1;
   }

   @Nullable
   @Override
   public class07324 N(class04782 var1, class07049 var2, class06069 var3) {
      if (var2 instanceof class05645) {
         class05946<class05660> class05946 = ((class05645)var2).t().N().i().orElse(null);
         if (class05946 == null) {
            return null;
         } else {
            class02680 class02680 = new class02680((class07310)object, this.y);
            Object object1 = this.N.get(class05946);
            CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
            Object object = this.N(object1, callbackinforeturnable);
            if (callbackinforeturnable.isCancelled()) {
               return (class07324)callbackinforeturnable.getReturnValue();
            } else {
               class02680 class02680x = class02680;
               return new class07324(class02680x, new class06584(class06570.Ty), this.L, this.u, 0.05F);
            }
         }
      } else {
         return null;
      }
   }
}
