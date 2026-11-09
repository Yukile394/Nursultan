package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class class07711 extends class00891 {
   public static final MapCodec<class07711> N = y(class07711::new);
   public static final int y = 6;
   public static final int L = 64;
   private static final class07211[] u = class07211.values();

   public class07711(class01362 var1) {
      super(var1);
   }

   private boolean y(class07299 var1, class07209 var2) {
      return class07209.method_49925(var2, 6, 65, (var0, var1x) -> {
         int i = u.length;

         for (int j = 0; j < i; j++) {
            class07211 class07211 = u[j];
            var1x.accept(var0.method_10093(class07211));
         }
      }, var2x -> {
         if (var2x.equals(var2)) {
            return class07192.field_55165;
         } else {
            class00500 class00500 = var1.method_8320(var2x);
            if (!var1.method_8316(var2x).N(class01231.N)) {
               return class07192.field_55166;
            } else if (class00500.i() instanceof class00886 class00886 && !class00886.N(null, var1, var2x, class00500).R()) {
               return class07192.field_55165;
            } else {
               if (class00500.i() instanceof class07117) {
                  var1.method_8652(var2x, class00869.N.W(), 3);
               } else {
                  if (!class00500.N(class00869.Wh) && !class00500.N(class00869.Wr) && !class00500.N(class00869.yJ) && !class00500.N(class00869.yo)) {
                     return class07192.field_55166;
                  }

                  class00394 class00394 = class00500.k() ? var1.method_8321(var2x) : null;
                  N(class00500, var1, var2x, class00394);
                  var1.method_8652(var2x, class00869.N.W(), 3);
               }

               return class07192.field_55165;
            }
         }
      }) > 1;
   }

   @Override
   public MapCodec<class07711> N() {
      return N;
   }

   protected void N(class07299 var1, class07209 var2) {
      if (this.y(var1, var2)) {
         var1.method_8652(var2, class00869.Nx.W(), 2);
         var1.method_8396(null, var2, class04909.QP, class04911.field_15245, 1.0F, 1.0F);
      }
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4, @Nullable class02733 var5, boolean var6) {
      this.N(var2, var3);
      super.N(var1, var2, var3, var4, var5, var6);
   }

   @Override
   protected void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      if (!var4.N(var1.i())) {
         this.N(var2, var3);
      }
   }
}
