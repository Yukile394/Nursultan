package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class04219(class04421 filter) implements class04233 {
   public static final MapCodec<class04219> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class04421.N.fieldOf("pattern").forGetter(class04219::y)).apply(var0, class04219::new)
   );

   public class04219(class04421 filter) {
      this.filter = filter;
   }

   public class04421 y() {
      return this.filter;
   }

   @Override
   public MapCodec<class04219> N() {
      return y;
   }

   @Override
   public void N(class01089 var1, class04205 var2) {
      var2.N(this.filter.L());
   }
}
