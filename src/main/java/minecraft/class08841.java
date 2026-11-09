package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public record class08841(int defaultColor) implements class08843 {
   public static final MapCodec<class08841> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06338.E.fieldOf("default").forGetter(class08841::y)).apply(var0, class08841::new)
   );

   public class08841() {
      this(class02716.L.N());
   }

   public class08841(int defaultColor) {
      this.defaultColor = defaultColor;
   }

   public int y() {
      return this.defaultColor;
   }

   @Override
   public MapCodec<class08841> N() {
      return N;
   }

   @Override
   public int N(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3) {
      class02716 class02716 = var1.method_58694(class02484.A);
      return class02716 != null ? class02566.M(class02716.N()) : class02566.M(this.defaultColor);
   }
}
