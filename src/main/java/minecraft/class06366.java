package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.function.Supplier;

public class class06366<T> extends class06308 implements class06744 {
   public static final BooleanSupplier N = () -> class06202.Nq().U();
   private static final List<Boolean> y = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final Supplier<T> L;
   private final class00392 u;
   private int i;
   private T R;
   private final class06363<T> M;
   private final Function<T, class00392> B;
   private final Function<class06366<T>, class05216> Z;
   private final class06355<T> z;
   private final class06343 U;
   private final class04355<T> E;
   private final class06372<T> W;

   private class00392 L(T var1) {
      return (class00392)(this.U == class06343.field_64540 ? this.B.apply((T)var1) : this.u((T)var1));
   }

   public class05216 L() {
      return method_32602((class00392)(this.U == class06343.field_64540 ? this.u(this.R) : this.method_25369()));
   }

   class06366(
      int var1,
      int var2,
      int var3,
      int var4,
      class00392 var5,
      class00392 var6,
      int var7,
      T var8,
      Supplier<T> var9,
      class06363<T> var10,
      Function<T, class00392> var11,
      Function<class06366<T>, class05216> var12,
      class06355<T> var13,
      class04355<T> var14,
      class06343 var15,
      class06372<T> var16
   ) {
      super(var1, var2, var3, var4, var5);
      this.u = var6;
      this.i = var7;
      this.L = var9;
      this.R = (T)var8;
      this.M = var10;
      this.B = var11;
      this.Z = var12;
      this.z = var13;
      this.U = var15;
      this.E = var14;
      this.W = var16;
      this.u();
   }

   private void u() {
      this.method_47400(this.E.apply(this.R));
   }

   private class05216 u(T var1) {
      return class05220.N(this.u, this.B.apply((T)var1));
   }

   private T y(int var1) {
      List list = this.M.N();
      return (T)list.get(class04995.L(this.i + var1, list.size()));
   }

   public T y() {
      return this.R;
   }

   private void y(T var1) {
      class00392 class00392 = this.L((T)var1);
      this.method_25355(class00392);
      this.R = (T)var1;
      this.u();
   }

   public static class06347<Boolean> N(class00392 var0, class00392 var1, boolean var2) {
      return new class06347<>(var2x -> var2x == Boolean.TRUE ? var0 : var1, () -> var2).N(y);
   }

   public static <T> class06347<T> N(Function<T, class00392> var0, T var1) {
      return new class06347<>(var0, () -> (T)var1);
   }

   public static class06347<Boolean> N(boolean var0) {
      return new class06347<>(var0x -> var0x == Boolean.TRUE ? class05220.y : class05220.L, () -> var0).N(y);
   }

   @Override
   public void N() {
      this.N(this.L.get());
   }

   public void N(T var1) {
      int ix = this.M.N().indexOf(var1);
      if (ix != -1) {
         this.i = ix;
      }

      this.y((T)var1);
   }

   private void N(int var1) {
      List list = this.M.N();
      this.i = class04995.L(this.i + var1, list.size());
      Object object = list.get(this.i);
      this.y((T)object);
      this.z.onValueChange(this, (T)object);
   }

   public static <T> class06347<T> N_58(Function<T, class00392> var0, Supplier<T> var1) {
      return new class06347<>(var0, var1);
   }

   @Override
   public boolean method_25401(double var1, double var3, double var5, double var7) {
      if (var7 > 0.0) {
         this.N(-1);
      } else if (var7 < 0.0) {
         this.N(1);
      }

      return true;
   }

   @Override
   public void method_25306(class06611 var1) {
      if (var1.W()) {
         this.N(-1);
      } else {
         this.N(1);
      }
   }

   @Override
   protected void method_75752(class01054 var1, int var2, int var3, float var4) {
      class01894 class01894 = this.W.apply(this, this.y());
      if (class01894 != null) {
         var1.N(class08394.Na, class01894, this.method_46426(), this.method_46427(), this.method_25368(), this.method_25364());
      } else {
         this.method_75794(var1);
      }

      if (this.U != class06343.field_64541) {
         this.method_75793(var1.N(this, class01065.field_63850));
      }
   }

   @Override
   public void method_47399(class03428 var1) {
      var1.N(class03457.field_33788, this.method_25360());
      if (this.field_22763) {
         Object object = this.y(1);
         class00392 class00392 = this.L((T)object);
         if (this.method_25370()) {
            var1.N(class03457.field_33791, class00392.N("narration.cycle_button.usage.focused", class00392));
         } else {
            var1.N(class03457.field_33791, class00392.N("narration.cycle_button.usage.hovered", class00392));
         }
      }
   }

   @Override
   protected class05216 method_25360() {
      return this.Z.apply(this);
   }
}
