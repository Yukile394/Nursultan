package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class08190(class01894 id) implements class08159 {
   public static final MapCodec<class08190> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class01894.N.fieldOf("id").forGetter(class08190::y)).apply(var0, class08190::new)
   );

   public class08190(class01894 id) {
      super();
      this.id = id;
   }

   public class01894 y() {
      return this.id;
   }

   public static class08190 N(String var0) {
      return N(class01894.y(var0));
   }

   @Override
   public MapCodec<class08190> N() {
      return L;
   }

   public static class08190 N(class01894 var0) {
      return new class08190(var0);
   }
}
