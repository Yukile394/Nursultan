package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class08148(class06889 direction, class06889 coordinateScale, class02546 magnitude) implements class02560 {
   public static final MapCodec<class08148> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class06889.N.fieldOf("direction").forGetter(class08148::y),
            class06889.N.fieldOf("coordinate_scale").forGetter(class08148::L),
            class02546.y.fieldOf("magnitude").forGetter(class08148::u)
         )
         .apply(var0, class08148::new)
   );
   private static final int M = 10;

   public class06889 L() {
      return this.coordinateScale;
   }

   public class08148(class06889 direction, class06889 coordinateScale, class02546 magnitude) {
      super();
      this.direction = direction;
      this.coordinateScale = coordinateScale;
      this.magnitude = magnitude;
   }

   public class02546 u() {
      return this.magnitude;
   }

   public class06889 y() {
      return this.direction;
   }

   @Override
   public void N(class04782 var1, int var2, class02525 var3, class07049 var4, class06889 var5) {
      class06889 class06889 = var4.method_5720().z(this.direction).B(this.coordinateScale).L((double)this.magnitude.N(var2));
      var4.method_45319(class06889);
      var4.field_6037 = true;
      var4.field_64356 = true;
      if (var4 instanceof class08036) {
         ((class08036)var4).method_76731(10);
      }
   }

   @Override
   public MapCodec<class08148> N() {
      return N;
   }
}
