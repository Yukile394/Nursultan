package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class08897 implements class06572 {
   public static final MapCodec<class08897> N = MapCodec.unit(new class08897());

   public class08897() {
      super();
   }

   @Override
   public float N(class06584 var1, @Nullable class03448 var2, @Nullable class08961 var3, int var4) {
      class07438 class07438 = var3 == null ? null : var3.method_72393();
      if (class07438 == null) {
         return 0.0F;
      } else if (class06593.u(var1)) {
         return 0.0F;
      } else {
         int i = class06593.y(var1, class07438);
         return (float)class00334.N(var1, class07438) / i;
      }
   }

   @Override
   public MapCodec<class08897> N() {
      return N;
   }
}
