package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class05349(int nutrition, float saturation, boolean canAlwaysEat) implements class08237 {
   public static final Codec<class05349> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06338.T.fieldOf("nutrition").forGetter(class05349::N),
            Codec.FLOAT.fieldOf("saturation").forGetter(class05349::y),
            Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(class05349::L)
         )
         .apply(var0, class05349::new)
   );
   public static final class02362<class04247, class05349> y = class02362.N(
      class02389.B, class05349::N, class02389.E, class05349::y, class02389.y, class05349::L, class05349::new
   );

   public boolean L() {
      return this.canAlwaysEat;
   }

   public class05349(int nutrition, float saturation, boolean canAlwaysEat) {
      super();
      this.nutrition = nutrition;
      this.saturation = saturation;
      this.canAlwaysEat = canAlwaysEat;
   }

   public float y() {
      return this.saturation;
   }

   @Override
   public void N(class07299 var1, class07438 var2, class06584 var3, class08209 var4) {
      class06069 class06069 = var2.method_59922();
      var1.method_43128(
         null, var2.method_23317(), var2.method_23318(), var2.method_23321(), var4.i().N(), class04911.field_15254, 1.0F, class06069.N(1.0F, 0.4F)
      );
      if (var2 instanceof class08036 class08036) {
         class08036.method_7344().N(this);
         var1.method_43128(
            null,
            class08036.method_23317(),
            class08036.method_23318(),
            class08036.method_23321(),
            class04909.GS,
            class04911.field_15248,
            0.5F,
            class04995.y(class06069, 0.9F, 1.0F)
         );
      }
   }

   public int N() {
      return this.nutrition;
   }
}
