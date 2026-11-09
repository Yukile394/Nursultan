package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public record class08942(boolean normalize) implements class06572 {
   public static final MapCodec<class08942> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.BOOL.optionalFieldOf("normalize", true).forGetter(class08942::y)).apply(var0, class08942::new)
   );

   public class08942(boolean normalize) {
      super();
      this.normalize = normalize;
   }

   public boolean y() {
      return this.normalize;
   }

   @Override
   public MapCodec<class08942> N() {
      return N;
   }

   @Override
   public float N(class06584 var1, @Nullable class03448 var2, @Nullable class08961 var3, int var4) {
      float f = var1.c();
      float f1 = var1.U();
      return this.normalize ? class04995.N(f / f1, 0.0F, 1.0F) : class04995.N(f, 0.0F, f1);
   }
}
