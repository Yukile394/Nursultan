package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;

public class class00653 extends class07688 {
   public static final MapCodec<class00653> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class07030.y.fieldOf("kind").forGetter(class07688::y), t()).apply(var0, class00653::new)
   );
   public static final class08064<class07211> u = class07101.R;
   private static final Map<class07211, class00494> y = class00389.L(class00891.L(8.0, 8.0, 16.0));

   public class00653(class07030 var1, class01362 var2) {
      super(var1, var2);
      this.P(this.W().y(u, class07211.field_11043));
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      super.N(var1);
      var1.N(u);
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(u)));
   }

   @Override
   public MapCodec<? extends class00653> N() {
      return L;
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(u, var2.N(var1.L(u)));
   }

   @Override
   public class00500 N(class06942 var1) {
      class00500 class00500 = super.N(var1);
      class07299 class07299 = var1.method_8045();
      class07209 class07209 = var1.method_8037();

      for (class07211 class07211x : var1.i()) {
         if (class07211x.z().L()) {
            class07211 class07211x = class07211x.b();
            class00500 = class00500.y(u, class07211x);
            if (!class07299.method_8320(class07209.method_10093(class07211x)).N(var1)) {
               return class00500;
            }
         }
      }

      return null;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return y.get(var1.L(u));
   }
}
