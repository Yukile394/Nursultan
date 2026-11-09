package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class07657(class06378 chance) implements class05957 {
   public static final MapCodec<class07657> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06339.N.fieldOf("chance").forGetter(class07657::L)).apply(var0, class07657::new)
   );

   public class06378 L() {
      return this.chance;
   }

   public class07657(class06378 chance) {
      super();
      this.chance = chance;
   }

   public static class05952 N(float var0) {
      return () -> new class07657(class04711.N(var0));
   }

   @Override
   public class05955 N() {
      return class07693.u;
   }

   public boolean test(class05908 var1) {
      float f = this.chance.y(var1);
      return var1.y().z() < f;
   }

   public static class05952 N(class06378 var0) {
      return () -> new class07657(var0);
   }
}
