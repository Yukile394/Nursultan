package minecraft;

import java.util.EnumSet;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class class07464<T extends class07438> extends class07473 {
   protected final class07475 N;
   private final double Z;
   private final double z;
   @Nullable
   protected T y;
   protected final float L;
   @Nullable
   protected class00143 u;
   protected final class07623 i;
   protected final Class<T> R;
   protected final Predicate<? super class07438> M;
   protected final Predicate<? super class07438> B;
   private final class01328 U;

   @Override
   public void L() {
      this.i.N(this.u, this.Z);
   }

   public class07464(class07475 var1, Class<T> var2, float var3, double var4, double var6) {
      this(var1, var2, var0 -> true, var3, var4, var6, class07042.i);
   }

   public class07464(class07475 var1, Class<T> var2, Predicate<class07438> var3, float var4, double var5, double var7, Predicate<? super class07438> var9) {
      super();
      this.N = var1;
      this.R = var2;
      this.M = var3;
      this.L = var4;
      this.Z = var5;
      this.z = var7;
      this.B = var9;
      this.i = var1.f();
      this.N_71(EnumSet.of(class07430.field_18405));
      this.U = class01328.N().N(var4).N((var2x, var3x) -> var9.test(var2x) && var3.test(var2x));
   }

   public class07464(class07475 var1, Class<T> var2, float var3, double var4, double var6, Predicate<? super class07438> var8) {
      this(var1, var2, var0 -> true, var3, var4, var6, var8);
   }

   @Override
   public void i() {
      if (this.N.method_5858(this.y) < 49.0) {
         this.N.f().N(this.z);
      } else {
         this.N.f().N(this.Z);
      }
   }

   @Override
   public void u() {
      this.y = null;
   }

   @Override
   public boolean y() {
      return !this.i.U();
   }

   @Override
   public boolean N() {
      this.y = N(this.N)
         .N(
            this.N.method_73183().N(this.R, this.N.method_5829().L(this.L, 3.0, this.L), var0 -> true),
            this.U,
            this.N,
            this.N.method_23317(),
            this.N.method_23318(),
            this.N.method_23321()
         );
      if (this.y == null) {
         return false;
      } else {
         class06889 class06889 = class05475.N(this.N, 16, 7, this.y.method_73189());
         if (class06889 == null) {
            return false;
         } else if (this.y.method_5649(class06889.M, class06889.B, class06889.Z) < this.y.method_5858(this.N)) {
            return false;
         } else {
            this.u = this.i.N(class06889.M, class06889.B, class06889.Z, 0);
            return this.u != null;
         }
      }
   }
}
