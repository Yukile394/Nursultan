package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class07300(int base, int perLevelAboveFirst) {
   public static final Codec<class07300> N = RecordCodecBuilder.create(
      var0 -> var0.group(Codec.INT.fieldOf("base").forGetter(class07300::N), Codec.INT.fieldOf("per_level_above_first").forGetter(class07300::y))
         .apply(var0, class07300::new)
   );

   public class07300(int base, int perLevelAboveFirst) {
      this.base = base;
      this.perLevelAboveFirst = perLevelAboveFirst;
   }

   public int y() {
      return this.perLevelAboveFirst;
   }

   public int N() {
      return this.base;
   }

   public int N(int var1) {
      return this.base + this.perLevelAboveFirst * (var1 - 1);
   }
}
