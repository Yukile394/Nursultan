package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public record class08818(int index, int defaultColor) implements class08843 {
   public static final MapCodec<class08818> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06338.T.optionalFieldOf("index", 0).forGetter(class08818::y), class06338.E.fieldOf("default").forGetter(class08818::L))
         .apply(var0, class08818::new)
   );

   public int L() {
      return this.defaultColor;
   }

   public class08818(int index, int defaultColor) {
      super();
      this.index = index;
      this.defaultColor = defaultColor;
   }

   public int y() {
      return this.index;
   }

   @Override
   public MapCodec<class08818> N() {
      return N;
   }

   @Override
   public int N(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3) {
      class02845 class02845 = var1.method_58694(class02484.j);
      if (class02845 != null) {
         Integer integer = class02845.u(this.index);
         if (integer != null) {
            return class02566.M(integer);
         }
      }

      return class02566.M(this.defaultColor);
   }
}
