package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public final class class02820 implements class02694 {
   public static final class02820 N = new class02820(List.of());
   public static final Codec<class02820> y = class06584.y.listOf().xmap(class02820::new, var0 -> var0.u);
   public static final class02362<class04247, class02820> L = class06584.z.N_33(class02389.N()).N_10(class02820::new, var0 -> var0.u);
   private final List<class06584> u;

   private class02820(List<class06584> var1) {
      super();
      this.u = (List<class06584>)var1;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class02820 class02820 && class06584.N(this.u, class02820.u);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.u + "]";
   }

   @Override
   public int hashCode() {
      return class06584.N(this.u);
   }

   public boolean y() {
      return this.u.isEmpty();
   }

   private static void N(class06591 var0, Consumer<class00392> var1, class06584 var2, int var3) {
      if (var3 == 1) {
         var1.accept(class00392.N("item.minecraft.crossbow.projectile.single", var2.V()));
      } else {
         var1.accept(class00392.N("item.minecraft.crossbow.projectile.multiple", var3, var2.V()));
      }

      class08562 class08562 = var2.a_(class02484.v, class08562.L);
      var2.N(var0, class08562, null, class06497.N, var1x -> var1.accept(class00392.y("  ").y(var1x).N(class06541.field_1080)));
   }

   public static class02820 N(List<class06584> var0) {
      return new class02820(List.copyOf(Lists.transform(var0, class06584::t)));
   }

   public List<class06584> N() {
      return Lists.transform(this.u, class06584::t);
   }

   public static class02820 N(class06584 var0) {
      return new class02820(List.of(var0.t()));
   }

   public boolean N(class06581 var1) {
      Iterator<class06584> iterator = this.u.iterator();

      while (iterator.hasNext()) {
         if (iterator.next().N(var1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public void N(class06591 var1, Consumer<class00392> var2, class06497 var3, class02666 var4) {
      class06584 class06584x = null;
      int i = 0;

      for (class06584 class06584x : this.u) {
         if (class06584x == null) {
            class06584x = class06584x;
            i = 1;
         } else if (class06584.N(class06584x, class06584x)) {
            i++;
         } else {
            N(var1, var2, class06584x, i);
            class06584x = class06584x;
            i = 1;
         }
      }

      if (class06584x != null) {
         N(var1, var2, class06584x, i);
      }
   }
}
