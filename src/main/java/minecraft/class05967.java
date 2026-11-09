package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DataResult.Error;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.function.Function;

public record class05967(int minY, int height, int noiseSizeHorizontal, int noiseSizeVertical) {
   public static final Codec<class05967> N = RecordCodecBuilder.create(
         var0 -> var0.group(
               Codec.intRange(class07376.i, class07376.u).fieldOf("min_y").forGetter(class05967::L),
               Codec.intRange(0, class07376.L).fieldOf("height").forGetter(class05967::u),
               Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(class05967::i),
               Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(class05967::R)
            )
            .apply(var0, class05967::new)
      )
      .comapFlatMap(class05967::N, Function.identity());
   public static final class05967 y = N(-64, 384, 1, 2);
   public static final class05967 L = N(0, 128, 1, 2);
   public static final class05967 u = N(0, 128, 2, 1);
   public static final class05967 i = N(-64, 192, 1, 2);
   public static final class05967 R = N(0, 256, 2, 1);

   public int L() {
      return this.minY;
   }

   public class05967(int minY, int height, int noiseSizeHorizontal, int noiseSizeVertical) {
      this.minY = minY;
      this.height = height;
      this.noiseSizeHorizontal = noiseSizeHorizontal;
      this.noiseSizeVertical = noiseSizeVertical;
   }

   public int i() {
      return this.noiseSizeHorizontal;
   }

   public int u() {
      return this.height;
   }

   public int y() {
      return class01146.L(this.i());
   }

   public class05967 N(class05474 var1) {
      int ix = Math.max(this.minY, var1.method_31607());
      int j = Math.min(this.minY + this.height, var1.method_31600() + 1) - ix;
      return new class05967(ix, j, this.noiseSizeHorizontal, this.noiseSizeVertical);
   }

   public int N() {
      return class01146.L(this.R());
   }

   public static class05967 N(int var0, int var1, int var2, int var3) {
      class05967 class05967 = new class05967(var0, var1, var2, var3);
      N(class05967).error().ifPresent(var0x -> {
         throw new IllegalStateException(var0x.message());
      });
      return class05967;
   }

   private static DataResult<class05967> N(class05967 var0) {
      if (var0.L() + var0.u() > class07376.u + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (class07376.u + 1));
      } else if (var0.u() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return var0.L() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success(var0);
      }
   }

   public int R() {
      return this.noiseSizeVertical;
   }
}
