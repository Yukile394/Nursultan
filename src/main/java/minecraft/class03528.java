package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public class class03528 extends class03532 {
   public static final MapCodec<class03528> N = RecordCodecBuilder.mapCodec(
         var0 -> N(var0)
            .and(
               var0.group(
                  Codec.intRange(0, 4096).fieldOf("spacing").forGetter(class03528::N),
                  Codec.intRange(0, 4096).fieldOf("separation").forGetter(class03528::y),
                  class03553.field_36423.optionalFieldOf("spread_type", class03553.field_36421).forGetter(class03528::L)
               )
            )
            .apply(var0, class03528::new)
      )
      .validate(class03528::N);
   private final int L;
   private final int u;
   private final class03553 i;

   public class03553 L() {
      return this.i;
   }

   public class03528(class00753 var1, class03555 var2, float var3, int var4, Optional<class03538> var5, int var6, int var7, class03553 var8) {
      super(var1, var2, var3, var4, var5);
      this.L = var6;
      this.u = var7;
      this.i = var8;
   }

   public class03528(int var1, int var2, class03553 var3, int var4) {
      this(class00753.field_11176, class03555.field_37782, 1.0F, var4, Optional.empty(), var1, var2, var3);
   }

   @Override
   public class03549<?> i() {
      return class03549.N;
   }

   public int y() {
      return this.u;
   }

   private static DataResult<class03528> N(class03528 var0) {
      return var0.L <= var0.u ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success(var0);
   }

   @Override
   protected boolean N(class02045 var1, int var2, int var3) {
      class07321 class07321 = this.N(var1.u(), var2, var3);
      return class07321.B == var2 && class07321.Z == var3;
   }

   public class07321 N(long var1, int var3, int var4) {
      int ix = Math.floorDiv(var3, this.L);
      int j = Math.floorDiv(var4, this.L);
      class07836 class07836 = new class07836(new class06075(0L));
      class07836.N(var1, ix, j, this.Z());
      int k = this.L - this.u;
      int l = this.i.N(class07836, k);
      int i1 = this.i.N(class07836, k);
      return new class07321(ix * this.L + l, j * this.L + i1);
   }

   public int N() {
      return this.L;
   }
}
