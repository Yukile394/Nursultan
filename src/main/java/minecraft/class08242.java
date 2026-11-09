package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public record class08242(List<class07055> effects, float probability) implements class08200 {
   public static final MapCodec<class08242> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class07055.u.listOf().fieldOf("effects").forGetter(class08242::y),
            Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(class08242::L)
         )
         .apply(var0, class08242::new)
   );
   public static final class02362<class04247, class08242> y = class02362.N(
      class07055.i.N_33(class02389.N()), class08242::y, class02389.E, class08242::L, class08242::new
   );

   public float L() {
      return this.probability;
   }

   public class08242(List<class07055> effects, float probability) {
      this.effects = effects;
      this.probability = probability;
   }

   public class08242(class07055 var1) {
      this(var1, 1.0F);
   }

   public class08242(List<class07055> var1) {
      this(var1, 1.0F);
   }

   public class08242(class07055 var1, float var2) {
      this(List.of(var1), var2);
   }

   public List<class07055> y() {
      return this.effects;
   }

   @Override
   public class08217<class08242> N() {
      return class08217.N;
   }

   @Override
   public boolean N(class07299 var1, class06584 var2, class07438 var3) {
      if (var3.method_59922().z() >= this.probability) {
         return false;
      } else {
         boolean flag = false;

         for (class07055 class07055 : this.effects) {
            if (var3.method_6092(new class07055(class07055))) {
               flag = true;
            }
         }

         return flag;
      }
   }
}
