package minecraft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.fabricmc.fabric.impl.recipe.ingredient.ShapelessMatch;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06523 implements class05857 {
   final String N;
   final class03762 y;
   final class06584 L;
   final List<class06510> u;
   @Nullable
   private class02754 i;
   private boolean Z = false;

   public class06523(String var1, class03762 var2, class06584 var3, List<class06510> var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.N(var1, var2, var3, var4, null);
   }

   @Override
   public String y() {
      return this.N;
   }

   public class06584 method_8116(class02903 var1, class01929 var2) {
      return this.L.t();
   }

   @Override
   public List<class00265> N() {
      return List.of(new class00315(this.u.stream().map(class06510::method_64673).toList(), new class00302(this.L), new class00330(class06570.Rn)));
   }

   private void N(String var1, class03762 var2, class06584 var3, List var4, CallbackInfo var5) {
      Iterator iterator = var4.iterator();

      while (iterator.hasNext()) {
         if (((class06510)iterator.next()).requiresTesting()) {
            this.Z = true;
            break;
         }
      }
   }

   public void N(class02903 var1, class07299 var2, CallbackInfoReturnable var3) {
      if (this.Z) {
         ArrayList arraylist = new ArrayList(var1.i());

         for (int ix = 0; ix < var1.N(); ix++) {
            class06584 class06584 = var1.N(ix);
            if (!class06584.R()) {
               arraylist.add(class06584);
            }
         }

         var3.setReturnValue(ShapelessMatch.isMatch(arraylist, this.u));
      }
   }

   public boolean method_8115(class02903 var1, class07299 var2) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueZ();
      } else if (var1.i() != this.u.size()) {
         return false;
      } else {
         return var1.N() == 1 && this.u.size() == 1 ? this.u.getFirst().method_8093(var1.N(0)) : var1.L().N(this, null);
      }
   }

   @Override
   public class06514<class06523> method_8119() {
      return class06514.L;
   }

   @Override
   public class02754 method_61671() {
      if (this.i == null) {
         this.i = class02754.y(this.u);
      }

      return this.i;
   }

   @Override
   public class03762 method_45441() {
      return this.y;
   }
}
