package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public record class08811(int defaultColor) implements class08843 {
   public static final MapCodec<class08811> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06338.E.fieldOf("default").forGetter(class08811::y)).apply(var0, class08811::new)
   );

   public class08811() {
      this(-13083194);
   }

   public class08811(int defaultColor) {
      this.defaultColor = defaultColor;
   }

   public int y() {
      return this.defaultColor;
   }

   @Override
   public MapCodec<class08811> N() {
      return N;
   }

   @Override
   public int N(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3) {
      class06517 class06517 = var1.method_58694(class02484.h);
      return class06517 != null ? class02566.M(class06517.N(this.defaultColor)) : class02566.M(this.defaultColor);
   }
}
