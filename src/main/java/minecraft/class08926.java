package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public record class08926(int index) implements class06572 {
   public static final MapCodec<class08926> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06338.T.optionalFieldOf("index", 0).forGetter(class08926::y)).apply(var0, class08926::new)
   );

   public class08926(int index) {
      super();
      this.index = index;
   }

   public int y() {
      return this.index;
   }

   @Override
   public MapCodec<class08926> N() {
      return N;
   }

   @Override
   public float N(class06584 var1, @Nullable class03448 var2, @Nullable class08961 var3, int var4) {
      class02845 class02845 = var1.method_58694(class02484.j);
      if (class02845 != null) {
         Float f = class02845.N(this.index);
         if (f != null) {
            return f;
         }
      }

      return 0.0F;
   }
}
