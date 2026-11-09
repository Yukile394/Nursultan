package minecraft;

import java.util.EnumSet;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class class07962 extends class07473 {
   public static final float N = 0.02F;
   protected final class07079 y;
   @Nullable
   protected class07049 L;
   protected final float u;
   private int B;
   protected final float i;
   private final boolean Z;
   protected final Class<? extends class07438> R;
   protected final class01328 M;

   @Override
   public void L() {
      this.B = this.N(40 + this.y.method_59922().y(40));
   }

   public class07962(class07079 var1, Class<? extends class07438> var2, float var3) {
      this(var1, var2, var3, 0.02F);
   }

   public class07962(class07079 var1, Class<? extends class07438> var2, float var3, float var4, boolean var5) {
      super();
      this.y = var1;
      this.R = var2;
      this.u = var3;
      this.i = var4;
      this.Z = var5;
      this.N_71(EnumSet.of(class07430.field_18406));
      if (var2 == class08036.class) {
         Predicate predicate = class07042.y(var1);
         this.M = class01328.y().N(var3).N((var1x, var2x) -> predicate.test(var1x));
      } else {
         this.M = class01328.y().N(var3);
      }
   }

   public class07962(class07079 var1, Class<? extends class07438> var2, float var3, float var4) {
      this(var1, var2, var3, var4, false);
   }

   @Override
   public void i() {
      if (this.L.method_5805()) {
         double d0 = this.Z ? this.y.method_23320() : this.L.method_23320();
         this.y.p().N(this.L.method_23317(), d0, this.L.method_23321());
         this.B--;
      }
   }

   @Override
   public void u() {
      this.L = null;
   }

   @Override
   public boolean y() {
      if (!this.L.method_5805()) {
         return false;
      } else {
         return this.y.method_5858(this.L) > this.u * this.u ? false : this.B > 0;
      }
   }

   @Override
   public boolean N() {
      if (this.y.method_59922().z() >= this.i) {
         return false;
      } else {
         if (this.y.T() != null) {
            this.L = this.y.T();
         }

         class04782 class04782 = N(this.y);
         if (this.R == class08036.class) {
            this.L = class04782.N(this.M, this.y, this.y.method_23317(), this.y.method_23320(), this.y.method_23321());
         } else {
            this.L = class04782.N(
               this.y.method_73183().N(this.R, this.y.method_5829().L(this.u, 3.0, this.u), var0 -> true),
               this.M,
               this.y,
               this.y.method_23317(),
               this.y.method_23320(),
               this.y.method_23321()
            );
         }

         return this.L != null;
      }
   }
}
