package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class08563(class00816 range) implements class08568 {
   public static final MapCodec<class08563> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class00816.u.fieldOf("range").forGetter(class08563::y)).apply(var0, class08563::new)
   );

   public class08563(class00816 range) {
      super();
      this.range = range;
   }

   public class00816 y() {
      return this.range;
   }

   public boolean test(class08579 var1) {
      class08165 class08165 = var1.L().N(class00608.s, class06889.y(var1.N()));
      float f = class07376.U[class08165.N()];
      return this.range.u(f);
   }

   @Override
   public MapCodec<class08563> N() {
      return N;
   }
}
