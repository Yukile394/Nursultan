package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public record class08840(int defaultColor) implements class08843 {
   public static final MapCodec<class08840> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06338.E.fieldOf("default").forGetter(class08840::y)).apply(var0, class08840::new)
   );

   public class08840(int defaultColor) {
      super();
      this.defaultColor = defaultColor;
   }

   public int y() {
      return this.defaultColor;
   }

   @Override
   public MapCodec<class08840> N() {
      return N;
   }

   @Override
   public int N(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3) {
      return class02816.N(var1, this.defaultColor);
   }
}
