package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Set;

public record class06329(String name) implements class06348 {
   public static final MapCodec<class06329> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.STRING.fieldOf("name").forGetter(class06329::L)).apply(var0, class06329::new)
   );

   public String L() {
      return this.name;
   }

   public class06329(String name) {
      super();
      this.name = name;
   }

   @Override
   public Set<class07491<?>> y() {
      return Set.of();
   }

   @Override
   public class01766 N(class05908 var1) {
      return class01766.N(this.name);
   }

   public static class06348 N(String var0) {
      return new class06329(var0);
   }

   @Override
   public class06353 N() {
      return class06332.y;
   }
}
