package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class07133 extends class00741 {
   public static final MapCodec<class07133> i = y(class07133::new);

   protected void L(class00500 var1, class07299 var2, class07209 var3) {
      if (var2.method_75728().N(class00608.Y, var3)) {
         var2.method_8650(var3, false);
      } else {
         var2.method_8501(var3, y());
         var2.method_8492(var3, y().i(), null);
      }
   }

   public class07133(class01362 var1) {
      super(var1);
   }

   public static class00500 y() {
      return class00869.K.W();
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (var2.method_8314(class00772.field_9282, var3) > 11 - var1.z()) {
         this.L(var1, var2, var3);
      }
   }

   @Override
   public MapCodec<? extends class07133> N() {
      return i;
   }

   @Override
   public void N(class07299 var1, class08036 var2, class07209 var3, class00500 var4, @Nullable class00394 var5, class06584 var6) {
      super.N(var1, var2, var3, var4, var5, var6);
      if (!class07323.N(var6, class02625.j)) {
         if (var1.method_75728().N(class00608.Y, var3)) {
            var1.method_8650(var3, false);
            return;
         }

         class00500 class00500 = var1.method_8320(var3.method_10074());
         if (class00500.M() || class00500.T()) {
            var1.method_8501(var3, y());
         }
      }
   }
}
