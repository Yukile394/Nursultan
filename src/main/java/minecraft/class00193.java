package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class00193(class00213 weather) implements class00225 {
   public static final MapCodec<class00193> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class00213.field_56211.fieldOf("weather").forGetter(class00193::y)).apply(var0, class00193::new)
   );

   public class00193(class00213 weather) {
      this.weather = weather;
   }

   @Override
   public void y(class04782 var1) {
      var1.method_14195();
   }

   public class00213 y() {
      return this.weather;
   }

   @Override
   public void N(class04782 var1) {
      this.weather.N(var1);
   }

   @Override
   public MapCodec<class00193> N() {
      return L;
   }
}
