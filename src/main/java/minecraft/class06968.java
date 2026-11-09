package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.UUID;

public abstract class class06968<T> {
   protected final class00455<T> N;
   private final Set<UUID> y = new ObjectOpenHashSet();

   public class06968(class00455<T> var1) {
      super();
      this.N = var1;
   }

   protected void y(class04782 var1) {
   }

   protected void y(class04770 var1, class07321 var2) {
   }

   protected void y(class04770 var1, class07049 var2) {
   }

   protected final void N(class04782 var1, class07049 var2, class00381<? super class07280> var3) {
      var1.method_14178().L.N(var2, var3, var1x -> this.y.contains(var1x.method_5667()));
   }

   protected final void N(class04782 var1, class07321 var2, class00381<? super class07280> var3) {
      class06265 class06265 = var1.method_14178().L;

      for (UUID uuid : this.y) {
         if (var1.N(uuid) instanceof class04770 class04770 && class06265.N(class04770, var2.B, var2.Z)) {
            class04770.field_13987.method_14364(var3);
         }
      }
   }

   private void N(class04770 var1) {
      this.y.add(var1.method_5667());
      var1.method_52372().N(var2 -> {
         if (!var1.field_13987.field_45026.N(var2.y())) {
            this.N(var1, var2);
         }
      });
      var1.method_51469().method_14178().L.N(var1, var2 -> this.N(var1, var2));
   }

   public final void N(class04782 var1) {
      for (class04770 class04770 : var1.method_18456()) {
         boolean flag = this.y.contains(class04770.method_5667());
         boolean flag1 = class04770.method_74538().contains(this.N);
         if (flag1 != flag) {
            if (flag1) {
               this.N(class04770);
            } else {
               this.y.remove(class04770.method_5667());
            }
         }
      }

      this.y.removeIf(var1x -> var1.N(var1x) == null);
      if (!this.y.isEmpty()) {
         this.y(var1);
      }
   }

   public final void N(class04770 var1, class07321 var2) {
      if (this.y.contains(var1.method_5667())) {
         this.y(var1, var2);
      }
   }

   public final void N(class04770 var1, class07049 var2) {
      if (this.y.contains(var1.method_5667())) {
         this.y(var1, var2);
      }
   }

   protected void N() {
   }
}
