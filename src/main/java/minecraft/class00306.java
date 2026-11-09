package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class class00306 extends class01474 {
   public static final MapCodec<class00306> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.floatRange(0.0F, 1.0F).fieldOf("leaves_probability").forGetter(var0x -> var0x.L),
            Codec.floatRange(0.0F, 1.0F).fieldOf("trunk_probability").forGetter(var0x -> var0x.u),
            Codec.floatRange(0.0F, 1.0F).fieldOf("ground_probability").forGetter(var0x -> var0x.i)
         )
         .apply(var0, class00306::new)
   );
   private final float L;
   private final float u;
   private final float i;

   public class00306(float var1, float var2, float var3) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var3;
   }

   @Override
   protected class05930<?> N() {
      return class05930.L;
   }

   @Override
   public void N(class05894 var1) {
      class06069 class06069 = var1.y();
      class05974 class05974 = (class05974)var1.N();
      List<class07209> list = class07536.N(var1.L(), class06069);
      if (!list.isEmpty()) {
         class07209 class07209 = Collections.min(list, Comparator.comparingInt(class00753::method_10264));
         if (class06069.z() < this.i) {
            class05974.method_30349()
               .method_46759(class04227.Nh)
               .flatMap(var0 -> var0.N(class03193.H))
               .ifPresent(var3x -> var3x.N().N(class05974, class05974.method_8410().method_14178().U(), class06069, class07209.method_10084()));
         }

         var1.L().forEach(var3x -> {
            if (class06069.z() < this.u) {
               class07209 class07209x = var3x.method_10074();
               if (var1.N(class07209x)) {
                  N(class07209x, var1);
               }
            }
         });
         var1.u().forEach(var3x -> {
            if (class06069.z() < this.L) {
               class07209 class07209x = var3x.method_10074();
               if (var1.N(class07209x)) {
                  N(class07209x, var1);
               }
            }
         });
      }
   }

   private static void N(class07209 var0, class05894 var1) {
      while (var1.N(var0.method_10074()) && !(var1.y().z() < 0.5)) {
         var1.N(var0, class00869.nS.W().y(class00288.y, false));
         var0 = var0.method_10074();
      }

      var1.N(var0, class00869.nS.W().y(class00288.y, true));
   }
}
