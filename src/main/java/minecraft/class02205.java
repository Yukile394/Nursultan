package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Set;

public record class02205(boolean active) implements class05957 {
   public static final MapCodec<class02205> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.BOOL.fieldOf("active").forGetter(class02205::i)).apply(var0, class02205::new)
   );

   public static class05952 L() {
      return () -> new class02205(true);
   }

   public class02205(boolean active) {
      super();
      this.active = active;
   }

   public boolean i() {
      return this.active;
   }

   public static class05952 u() {
      return () -> new class02205(false);
   }

   @Override
   public Set<class07491<?>> y() {
      return Set.of(class06551.m);
   }

   @Override
   public class05955 N() {
      return class07693.j;
   }

   public boolean test(class05908 var1) {
      return var1.y(class06551.m) == this.active;
   }
}
