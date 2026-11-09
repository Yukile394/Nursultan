package minecraft;

import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;
import java.util.UUID;

class class00010 extends class00037 {
   private float u;

   public class00010(UUID var1, class00028 var2, float var3) {
      super(Either.left(var1), var2, class00025.field_59781);
      this.u = var3;
   }

   public class00010(Either<UUID, String> var1, class00028 var2, class00667 var3) {
      super(var1, var2, class00025.field_59781);
      this.u = var3.readFloat();
   }

   @Override
   public void y(ByteBuf var1) {
      var1.writeFloat(this.u);
   }

   @Override
   public double N(class07049 var1) {
      return Double.POSITIVE_INFINITY;
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
      return class04995.u(var2.N(), this.u * (180.0F / (float)Math.PI));
   }

   @Override
   public void N(class00037 var1) {
      if (var1 instanceof class00010 class00010) {
         this.u = class00010.u;
      } else {
         class00037.N.warn("Unsupported Waypoint update operation: {}", var1.getClass());
      }
   }
}
