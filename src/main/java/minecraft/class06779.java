package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class06779(class01894 functionId) implements class07220<class02796> {
   public static final MapCodec<class06779> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class01894.N.fieldOf("Name").forGetter(class06779::y)).apply(var0, class06779::new)
   );

   public class06779(class01894 functionId) {
      super();
      this.functionId = functionId;
   }

   public class01894 y() {
      return this.functionId;
   }

   @Override
   public MapCodec<class06779> N() {
      return N;
   }

   public void N(class02796 var1, class00754<class02796> var2, long var3) {
      class03800 class03800 = var1.Nr();
      class03800.N(this.functionId).ifPresent(var1x -> class03800.N((class07684<class07701>)var1x, class03800.L()));
   }
}
