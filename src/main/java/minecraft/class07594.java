package minecraft;

import com.google.common.collect.Sets;
import java.util.Set;

public class class07594 {
   public static final class00587 N = class00587.N()
      .N(class00608.Z, class00589.z, new class00614(0.6F, 0.75F))
      .N(class00608.N, class00589.B, class02566.N(1.0F, 0.5F, 0.5F, 0.6F))
      .N(class00608.U, class00589.z, new class00614(0.24F, 0.5F))
      .N(class00608.w, class00585.i, new class00601(4.0F, 0.3125F))
      .N(class00608.b, class00589.i, class02566.N(0.3125F, class07593.M))
      .N(class00608.j, class00585.i, new class00601(0.24F, 0.3125F))
      .N(class00608.T, 0.0F)
      .N(class00608.z, class00589.Z, class02566.N(1.0F, 0.5F, 0.5F, 0.6F))
      .N(class00608.X, true)
      .N();
   public static final class00587 y = class00587.N()
      .N(class00608.Z, class00589.z, new class00614(0.24F, 0.94F))
      .N(class00608.N, class00589.B, class02566.N(1.0F, 0.25F, 0.25F, 0.3F))
      .N(class00608.U, class00589.z, new class00614(0.095F, 0.94F))
      .N(class00608.w, class00585.i, new class00601(4.0F, 0.52734375F))
      .N(class00608.b, class00589.i, class02566.N(0.52734375F, class07593.M))
      .N(class00608.j, class00585.i, new class00601(0.24F, 0.52734375F))
      .N(class00608.T, 0.0F)
      .N(class00608.z, class00589.Z, class02566.N(1.0F, 0.25F, 0.25F, 0.3F))
      .N(class00608.X, true)
      .N();
   private static final Set<class00607<?>> L = Sets.union(N.y(), y.y());

   public class07594() {
      super();
   }

   public static void N(class00594 var0, class07609 var1) {
      for (class00607<?> class00607 : L) {
         N(var0, var1, class00607);
      }
   }

   private static <Value> void N(class00594 var0, class07609 var1, class00607<Value> var2) {
      class00599 class00599x = N.N(var2);
      class00599 class00599x = y.N(var2);
      var0.N(var2, (var4x, var5) -> {
         float f = var1.y();
         float f1 = var1.N() - f;
         if (class00599x != null && f1 > 0.0F) {
            Object object = class00599x.N(var4x);
            var4x = var2.N().i().apply(f1, var4x, object);
         }

         if (class00599 != null && f > 0.0F) {
            Object object1 = class00599.N(var4x);
            var4x = var2.N().i().apply(f, var4x, object1);
         }

         return var4x;
      });
   }
}
