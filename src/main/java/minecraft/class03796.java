package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class03796(class05934 options, class03764 dimensions) {
   public static final Codec<class03796> N = RecordCodecBuilder.create(
      var0 -> var0.group(class05934.N.forGetter(class03796::N), class03764.N.forGetter(class03796::y)).apply(var0, var0.stable(class03796::new))
   );

   public class03796(class05934 options, class03764 dimensions) {
      this.options = options;
      this.dimensions = dimensions;
   }

   public class03764 y() {
      return this.dimensions;
   }

   public static <T> DataResult<T> N(DynamicOps<T> var0, class05934 var1, class01042 var2) {
      return N(var0, var1, new class03764(var2.L(class04227.yI)));
   }

   public class05934 N() {
      return this.options;
   }

   public static <T> DataResult<T> N(DynamicOps<T> var0, class05934 var1, class03764 var2) {
      return N.encodeStart(var0, new class03796(var1, var2));
   }
}
