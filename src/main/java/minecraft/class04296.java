package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.stream.Stream;

public class class04296 extends class04297 {
   private final class07211 L;
   private final class04025 u;
   private final class04025 i;
   private final int R;
   public static final MapCodec<class04296> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class07211.field_35088.fieldOf("direction_of_search").forGetter(var0x -> var0x.L),
            class04025.y.fieldOf("target_condition").forGetter(var0x -> var0x.u),
            class04025.y.optionalFieldOf("allowed_search_condition", class04025.i()).forGetter(var0x -> var0x.i),
            Codec.intRange(1, 32).fieldOf("max_steps").forGetter(var0x -> var0x.R)
         )
         .apply(var0, class04296::new)
   );

   private class04296(class07211 var1, class04025 var2, class04025 var3, int var4) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var3;
      this.R = var4;
   }

   public static class04296 N(class07211 var0, class04025 var1, class04025 var2, int var3) {
      return new class04296(var0, var1, var2, var3);
   }

   @Override
   public Stream<class07209> N(class01034 var1, class06069 var2, class07209 var3) {
      class07218 class07218 = var3.method_25503();
      class05974 class05974 = var1.y();
      if (!this.i.test(class05974, class07218)) {
         return Stream.of();
      } else {
         for (int ix = 0; ix < this.R; ix++) {
            if (this.u.test(class05974, class07218)) {
               return Stream.of(class07218);
            }

            class07218.N(this.L);
            if (class05974.method_31601(class07218.method_10264())) {
               return Stream.of();
            }

            if (!this.i.test(class05974, class07218)) {
               break;
            }
         }

         return this.u.test(class05974, class07218) ? Stream.of(class07218) : Stream.of();
      }
   }

   public static class04296 N(class07211 var0, class04025 var1, int var2) {
      return N(var0, var1, class04025.i(), var2);
   }

   @Override
   public class04323<?> N() {
      return class04323.z;
   }
}
