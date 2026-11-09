package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public record class06340(class05919 target) implements class06348 {
   public static final MapCodec<class06340> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class05919.field_45792.fieldOf("target").forGetter(class06340::L)).apply(var0, class06340::new)
   );
   public static final Codec<class06340> y = class05919.field_45792.xmap(class06340::new, class06340::L);

   public class05919 L() {
      return this.target;
   }

   public class06340(class05919 target) {
      super();
      this.target = target;
   }

   @Override
   public Set<class07491<?>> y() {
      return Set.of(this.target.N());
   }

   @Nullable
   @Override
   public class01766 N(class05908 var1) {
      return var1.L(this.target.N());
   }

   public static class06348 N(class05919 var0) {
      return new class06340(var0);
   }

   @Override
   public class06353 N() {
      return class06332.L;
   }
}
