package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class class01006 extends class04297 {
   public static final MapCodec<class01006> N = class02142.N(0, 256).fieldOf("count").xmap(class01006::new, var0 -> var0.L);
   private final class02142 L;

   private class01006(class02142 var1) {
      super();
      this.L = var1;
   }

   private static int N(class01034 var0, int var1, int var2, int var3, int var4) {
      class07218 class07218 = new class07218(var1, var2, var3);
      int i = 0;
      class00500 class00500x = var0.N(class07218);

      for (int j = var2; j >= var0.N() + 1; j--) {
         class07218.method_10099(j - 1);
         class00500 class00500x = var0.N(class07218);
         if (!N(class00500x) && N(class00500x) && !class00500x.N(class00869.q)) {
            if (i == var4) {
               return class07218.method_10264() + 1;
            }

            i++;
         }

         class00500x = class00500x;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean N(class00500 var0) {
      return var0.P() || var0.N(class00869.K) || var0.N(class00869.V);
   }

   @Override
   public class04323<?> N() {
      return class04323.Z;
   }

   public static class01006 N(class02142 var0) {
      return new class01006(var0);
   }

   @Override
   public Stream<class07209> N(class01034 var1, class06069 var2, class07209 var3) {
      Builder builder = Stream.builder();
      int i = 0;

      boolean flag;
      do {
         flag = false;

         for (int j = 0; j < this.L.N(var2); j++) {
            int k = var2.y(16) + var3.method_10263();
            int l = var2.y(16) + var3.method_10260();
            int i1 = var1.N(class07830.field_13197, k, l);
            int j1 = N(var1, k, i1, l, i);
            if (j1 != Integer.MAX_VALUE) {
               builder.add(new class07209(k, j1, l));
               flag = true;
            }
         }

         i++;
      } while (flag);

      return builder.build();
   }

   public static class01006 N(int var0) {
      return N(class02151.N(var0));
   }
}
