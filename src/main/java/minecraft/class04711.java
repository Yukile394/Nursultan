package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class04711(float value) implements class06378 {
   public static final MapCodec<class04711> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.FLOAT.fieldOf("value").forGetter(class04711::L)).apply(var0, class04711::new)
   );
   public static final Codec<class04711> y = Codec.FLOAT.xmap(class04711::new, class04711::L);

   public float L() {
      return this.value;
   }

   public class04711(float value) {
      this.value = value;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 != null && this.getClass() == var1.getClass() ? Float.compare(((class04711)var1).value, this.value) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.value != 0.0F ? Float.floatToIntBits(this.value) : 0;
   }

   @Override
   public float y(class05908 var1) {
      return this.value;
   }

   public static class04711 N(float var0) {
      return new class04711(var0);
   }

   @Override
   public class06341 N() {
      return class06339.y;
   }
}
