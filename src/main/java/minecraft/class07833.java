package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import net.fabricmc.fabric.mixin.registry.sync.DebugLevelSourceAccessor;

public class class07833 extends class08088 implements DebugLevelSourceAccessor {
   public static final MapCodec<class07833> u = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class03519.u(class00795.y)).apply(var0, var0.stable(class07833::new))
   );
   private static final int Z = 2;
   public static List<class00500> z = StreamSupport.stream(class04206.i.spliterator(), false)
      .flatMap(var0 -> var0.E().N().stream())
      .collect(Collectors.toList());
   public static int U = class04995.u(class04995.N((float)z.size()));
   public static int E = class04995.u((float)z.size() / U);
   protected static final class00500 i = class00869.N.W();
   protected static final class00500 R = class00869.ZX.W();
   public static final int M = 70;
   public static final int B = 60;

   @Override
   public int M() {
      return 0;
   }

   public class07833(class03529<class00780> var1) {
      super(new class00782(var1));
   }

   @Override
   public int i() {
      return 384;
   }

   @Override
   protected MapCodec<? extends class08088> y() {
      return u;
   }

   @Override
   public void N(class01607 var1, class05324 var2, class04084 var3, class08050 var4) {
   }

   @Override
   public void N(class01607 var1) {
   }

   public static class00500 N(int var0, int var1) {
      class00500 class00500 = i;
      if (var0 > 0 && var1 > 0 && var0 % 2 != 0 && var1 % 2 != 0) {
         var0 /= 2;
         var1 /= 2;
         if (var0 <= U && var1 <= E) {
            int ix = class04995.N(var0 * U + var1);
            if (ix < z.size()) {
               class00500 = z.get(ix);
            }
         }
      }

      return class00500;
   }

   @Override
   public void N(List<String> var1, class04084 var2, class07209 var3) {
   }

   @Override
   public class01376 N(int var1, int var2, class05474 var3, class04084 var4) {
      return new class01376(0, new class00500[0]);
   }

   @Override
   public int N(int var1, int var2, class07830 var3, class05474 var4, class04084 var5) {
      return 0;
   }

   @Override
   public void N(class05974 var1, class08050 var2, class05324 var3) {
      class07218 class07218 = new class07218();
      class07321 class07321 = var2.R();
      int ix = class07321.B;
      int j = class07321.Z;

      for (int k = 0; k < 16; k++) {
         for (int l = 0; l < 16; l++) {
            int i1 = class01296.N(ix, k);
            int j1 = class01296.N(j, l);
            var1.method_8652(class07218.N(i1, 60, j1), R, 2);
            class00500 class00500 = N(i1, j1);
            var1.method_8652(class07218.N(i1, 70, j1), class00500, 2);
         }
      }
   }

   @Override
   public CompletableFuture<class08050> N(class03001 var1, class04084 var2, class05324 var3, class08050 var4) {
      return CompletableFuture.completedFuture(var4);
   }

   @Override
   public void N(class01607 var1, long var2, class04084 var4, class05517 var5, class05324 var6, class08050 var7) {
   }

   @Override
   public int R() {
      return 63;
   }
}
