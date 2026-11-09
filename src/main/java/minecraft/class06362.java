package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Set;

public record class06362(class06348 target, String score, float scale) implements class06378 {
   public static final MapCodec<class06362> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class06332.N.fieldOf("target").forGetter(class06362::L),
            Codec.STRING.fieldOf("score").forGetter(class06362::u),
            Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(class06362::i)
         )
         .apply(var0, class06362::new)
   );

   public class06348 L() {
      return this.target;
   }

   public class06362(class06348 target, String score, float scale) {
      this.target = target;
      this.score = score;
      this.scale = scale;
   }

   public float i() {
      return this.scale;
   }

   public String u() {
      return this.score;
   }

   @Override
   public float y(class05908 var1) {
      class01766 class01766 = this.target.N(var1);
      if (class01766 == null) {
         return 0.0F;
      } else {
         class06394 class06394 = var1.u().method_14170();
         class00518 class00518 = class06394.N(this.score);
         if (class00518 == null) {
            return 0.0F;
         } else {
            class01788 class01788 = class06394.y(class01766, class00518);
            return class01788 == null ? 0.0F : class01788.y() * this.scale;
         }
      }
   }

   @Override
   public Set<class07491<?>> y() {
      return this.target.y();
   }

   public static class06362 N(class05919 var0, String var1) {
      return N(var0, var1, 1.0F);
   }

   @Override
   public class06341 N() {
      return class06339.i;
   }

   public static class06362 N(class05919 var0, String var1, float var2) {
      return new class06362(class06340.N(var0), var1, var2);
   }
}
