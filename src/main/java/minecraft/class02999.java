package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.BitSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public final class class02999 {
   private static final BitSet L = new BitSet(0);
   private static final Codec<BitSet> u = Codec.LONG_STREAM.xmap(var0 -> BitSet.valueOf(var0.toArray()), var0 -> LongStream.of(var0.toLongArray()));
   private static final Codec<class00549> i = class04206.W
      .T()
      .comapFlatMap(var0 -> var0 == class00549.L ? DataResult.error(() -> "target_status cannot be empty") : DataResult.success(var0), Function.identity());
   public static final Codec<class02999> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            i.fieldOf("target_status").forGetter(class02999::N),
            u.lenientOptionalFieldOf("missing_bedrock").forGetter(var0x -> var0x.B.isEmpty() ? Optional.empty() : Optional.of(var0x.B))
         )
         .apply(var0, class02999::new)
   );
   private static final Set<class05946<class00780>> R = Set.of(class00795.Ny, class00795.NN, class00795.NL);
   public static final class05474 y = new class03025();
   private final class00549 M;
   private final BitSet B;

   private class02999(class00549 var1, Optional<BitSet> var2) {
      super();
      this.M = var1;
      this.B = var2.orElse(L);
   }

   public boolean y() {
      return !this.B.isEmpty();
   }

   public void y(class07361 var1) {
      class05474 class05474 = var1.w();
      int ix = class05474.method_31607();
      int j = class05474.method_31600();

      for (int k = 0; k < 16; k++) {
         for (int l = 0; l < 16; l++) {
            if (this.N(k, l)) {
               class07209.method_10094(k, ix, l, k, j, l).forEach(var1x -> var1.N(var1x, class00869.N.W()));
            }
         }
      }
   }

   public static void N(class07361 var0) {
      byte b0 = 4;
      class07209.method_10094(0, 0, 0, 15, 4, 15).forEach(var1x -> {
         if (var0.method_8320(var1x).N(class00869.q)) {
            var0.N(var1x, class00869.nZ.W());
         }
      });
   }

   public class00549 N() {
      return this.M;
   }

   public boolean N(int var1, int var2) {
      return this.B.get((var2 & 15) * 16 + (var1 & 15));
   }

   public static class04330 N(class04330 var0, class08050 var1) {
      if (!var1.d()) {
         return var0;
      } else {
         Predicate predicate = R::contains;
         return (var3, var4, var5, var6) -> {
            class03556 class03556 = var0.method_38109(var3, var4, var5, var6);
            return class03556.N(predicate) ? class03556 : var1.method_16359(var3, 0, var5);
         };
      }
   }
}
