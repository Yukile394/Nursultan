package minecraft;

import Nursultan.class09413;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class00942(class01894 atlas, class01894 sprite) implements class00926 {
   public static final class01894 N = class08589.u;
   public static final MapCodec<class00942> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class01894.N.optionalFieldOf("atlas", N).forGetter(class00942::u), class01894.N.fieldOf("sprite").forGetter(class00942::i))
         .apply(var0, class00942::new)
   );

   @Override
   public String L() {
      String s = N(this.sprite);
      return this.atlas.equals(N) ? "[" + s + "]" : "[" + s + "@" + N(this.atlas) + "]";
   }

   public class00942(class01894 atlas, class01894 sprite) {
      super();
      this.atlas = atlas;
      this.sprite = sprite;
   }

   public class01894 i() {
      return this.sprite;
   }

   public class01894 u() {
      return this.atlas;
   }

   @Override
   public class00949 y() {
      return new class09413(this.atlas, this.sprite);
   }

   private static String N(class01894 var0) {
      return var0.y().equals("minecraft") ? var0.N() : var0.toString();
   }

   @Override
   public MapCodec<class00942> N() {
      return y;
   }
}
