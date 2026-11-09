package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class01201 extends class01219 {
   public static final MapCodec<class01201> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class03541.N(class04227.Z).optionalFieldOf("rottable_blocks").forGetter(var0x -> var0x.y),
            Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter(var0x -> var0x.L)
         )
         .apply(var0, class01201::new)
   );
   private final Optional<class03543<class00891>> y;
   private final float L;

   private class01201(Optional<class03543<class00891>> var1, float var2) {
      super();
      this.L = var2;
      this.y = var1;
   }

   public class01201(float var1) {
      this(Optional.empty(), var1);
   }

   public class01201(class03543<class00891> var1, float var2) {
      this(Optional.of(var1), var2);
   }

   @Override
   protected class05235<?> N() {
      return class05235.R;
   }

   @Nullable
   @Override
   public class01228 N(class05487 var1, class07209 var2, class07209 var3, class01228 var4, class01228 var5, class01233 var6) {
      class06069 class06069 = var6.y(var5.N());
      return (!this.y.isPresent() || var4.y().N(this.y.get())) && !(class06069.z() <= this.L) ? null : var5;
   }
}
