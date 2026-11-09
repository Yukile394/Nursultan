package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public record class08358(int defaultColor) implements class08843 {
   public static final MapCodec<class08358> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06338.E.fieldOf("default").forGetter(class08358::y)).apply(var0, class08358::new)
   );

   public class08358(int defaultColor) {
      super();
      this.defaultColor = defaultColor;
   }

   public int y() {
      return this.defaultColor;
   }

   @Override
   public MapCodec<class08358> N() {
      return N;
   }

   @Override
   public int N(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3) {
      if (var3 != null) {
         class00502 class00502 = var3.method_5781();
         if (class00502 != null) {
            class06541 class06541 = class00502.P();
            if (class06541.i() != null) {
               return class02566.M(class06541.i());
            }
         }
      }

      return class02566.M(this.defaultColor);
   }
}
