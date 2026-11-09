package minecraft;

import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;
import java.util.UUID;

class class00019 extends class00037 {
   private class07321 u;

   public class00019(UUID var1, class00028 var2, class07321 var3) {
      super(Either.left(var1), var2, class00025.field_59780);
      this.u = var3;
   }

   public class00019(Either<UUID, String> var1, class00028 var2, class00667 var3) {
      super(var1, var2, class00025.field_59780);
      this.u = new class07321(var3.E(), var3.E());
   }

   @Override
   public void y(ByteBuf var1) {
      class01657.N(var1, this.u.B);
      class01657.N(var1, this.u.Z);
   }

   @Override
   public double N(class07049 var1) {
      return var1.method_5707(class06889.y(this.u.L(var1.method_31478())));
   }

   @Override
   public class00036 N(class07299 var1, class00007 var2, class00945 var3) {
      double d0 = var2.N();
      if (d0 < -1.0) {
         return class00036.field_60425;
      } else {
         return d0 > 1.0 ? class00036.field_60424 : class00036.field_60423;
      }
   }

   @Override
   public double N(class07299 var1, class00023 var2, class00945 var3) {
      class06889 class06889x = var2.y();
      class06889 class06889x = class06889x.u(this.N(class06889x.y())).U();
      float f = (float)class04995.u(class06889x.L(), class06889x.N()) * (180.0F / (float)Math.PI);
      return class04995.u(var2.N(), f);
   }

   private class06889 N(double var1) {
      return class06889.y(this.u.L((int)var1));
   }

   @Override
   public void N(class00037 var1) {
      if (var1 instanceof class00019 class00019) {
         this.u = class00019.u;
      } else {
         class00037.N.warn("Unsupported Waypoint update operation: {}", var1.getClass());
      }
   }
}
