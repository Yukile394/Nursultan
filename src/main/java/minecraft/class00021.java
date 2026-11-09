package minecraft;

import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;
import java.util.UUID;

class class00021 extends class00037 {
   private class00753 u;

   public class00021(UUID var1, class00028 var2, class00753 var3) {
      super(Either.left(var1), var2, class00025.field_59779);
      this.u = var3;
   }

   public class00021(Either<UUID, String> var1, class00028 var2, class00667 var3) {
      super(var1, var2, class00025.field_59779);
      this.u = new class00753(var3.E(), var3.E(), var3.E());
   }

   @Override
   public void y(ByteBuf var1) {
      class01657.N(var1, this.u.method_10263());
      class01657.N(var1, this.u.method_10264());
      class01657.N(var1, this.u.method_10260());
   }

   @Override
   public double N(class07049 var1) {
      return var1.method_5707(class06889.y(this.u));
   }

   @Override
   public class00036 N(class07299 var1, class00007 var2, class00945 var3) {
      class06889 class06889 = var2.N(this.N(var1, var3));
      boolean flag = class06889.Z > 1.0;
      double d0 = flag ? -class06889.B : class06889.B;
      if (d0 < -1.0) {
         return class00036.field_60425;
      } else if (d0 > 1.0) {
         return class00036.field_60424;
      } else {
         if (flag) {
            if (class06889.B > 0.0) {
               return class00036.field_60424;
            }

            if (class06889.B < 0.0) {
               return class00036.field_60425;
            }
         }

         return class00036.field_60423;
      }
   }

   @Override
   public double N(class07299 var1, class00023 var2, class00945 var3) {
      class06889 class06889 = var2.y().u(this.N(var1, var3)).U();
      float f = (float)class04995.u(class06889.L(), class06889.N()) * (180.0F / (float)Math.PI);
      return class04995.u(var2.N(), f);
   }

   private class06889 N(class07299 var1, class00945 var2) {
      return this.L
         .left()
         .map(var1::method_66347)
         .map(var2x -> var2x.method_24515().method_19455(this.u) > 3 ? null : var2x.method_5836(var2.apply(var2x)))
         .orElseGet(() -> class06889.y(this.u));
   }

   @Override
   public void N(class00037 var1) {
      if (var1 instanceof class00021 class00021) {
         this.u = class00021.u;
      } else {
         class00037.N.warn("Unsupported Waypoint update operation: {}", var1.getClass());
      }
   }
}
