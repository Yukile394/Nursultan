package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class05738 extends class05765<class07079> {
   private static final int N = 40;
   private int y;
   @Nullable
   private class00143 L;
   @Nullable
   private class07209 u;
   private float i;

   protected void L(class04782 var1, class07079 var2, long var3) {
      var2.method_18868().N(class05378.n, this.L);
      var2.f().N(this.L, (double)this.i);
   }

   public class05738() {
      this(150, 250);
   }

   public class05738(int var1, int var2) {
      super(ImmutableMap.of(class05378.I, class05367.field_18458, class05378.n, class05367.field_18457, class05378.m, class05367.field_18456), var1, var2);
   }

   protected void u(class04782 var1, class07079 var2, long var3) {
      class00143 class00143 = var2.f().Z();
      class01289<?> class01289 = var2.method_18868();
      if (this.L != class00143) {
         this.L = class00143;
         class01289.N(class05378.n, class00143);
      }

      if (class00143 != null && this.u != null) {
         class05352 class05352 = class01289.L(class05378.m).get();
         if (class05352.N().y().method_10262(this.u) > 4.0 && this.N(var2, class05352, var1.N())) {
            this.u = class05352.N().y();
            this.L(var1, var2, var3);
         }
      }
   }

   protected void y(class04782 var1, class07079 var2, long var3) {
      if (var2.method_18868().N(class05378.m) && !this.N(var2, var2.method_18868().L(class05378.m).get()) && var2.f().b()) {
         this.y = var1.method_8409().y(40);
      }

      var2.f().W();
      var2.method_18868().y(class05378.m);
      var2.method_18868().y(class05378.n);
      this.L = null;
   }

   protected boolean N(class04782 var1, class07079 var2) {
      if (this.y > 0) {
         this.y--;
         return false;
      } else {
         class01289<?> class01289 = var2.method_18868();
         class05352 class05352 = class01289.L(class05378.m).get();
         boolean flag = this.N(var2, class05352);
         if (!flag && this.N(var2, class05352, var1.N())) {
            this.u = class05352.N().y();
            return true;
         } else {
            class01289.y(class05378.m);
            if (flag) {
               class01289.y(class05378.I);
            }

            return false;
         }
      }
   }

   private boolean N(class07079 var1, class05352 var2, long var3) {
      class07209 class07209 = var2.N().y();
      this.L = var1.f().N(class07209, 0);
      this.i = var2.y();
      class01289<?> class01289 = var1.method_18868();
      if (this.N(var1, var2)) {
         class01289.y(class05378.I);
      } else {
         if (this.L != null && this.L.z()) {
            class01289.y(class05378.I);
         } else if (!class01289.N(class05378.I)) {
            class01289.N(class05378.I, var3);
         }

         if (this.L != null) {
            return true;
         }

         class06889 class06889 = class05475.N((class07475)var1, 10, 7, class06889.L(class07209), (float) (Math.PI / 2));
         if (class06889 != null) {
            this.L = var1.f().N(class06889.M, class06889.B, class06889.Z, 0);
            return this.L != null;
         }
      }

      return false;
   }

   protected boolean N(class04782 var1, class07079 var2, long var3) {
      if (this.L != null && this.u != null) {
         Optional<class05352> optional = var2.method_18868().L(class05378.m);
         boolean flag = optional.<Boolean>map(class05738::N).orElse(false);
         return !var2.f().U() && optional.isPresent() && !this.N(var2, optional.get()) && !flag;
      } else {
         return false;
      }
   }

   private boolean N(class07079 var1, class05352 var2) {
      return var2.N().y().method_19455(var1.method_24515()) <= var2.L();
   }

   private static boolean N(class05352 var0) {
      class05779 class05779 = var0.N();
      return class05779 instanceof class05751 ? ((class05751)class05779).L().method_7325() : false;
   }
}
