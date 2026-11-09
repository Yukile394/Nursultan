package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.PrimitiveCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public record class00371(int index) implements class00372<String> {
   public static final PrimitiveCodec<String> N = Codec.STRING;
   public static final class00336<class00371, String> y = class00336.N(
      RecordCodecBuilder.mapCodec(var0 -> var0.group(class06338.T.optionalFieldOf("index", 0).forGetter(class00371::L)).apply(var0, class00371::new)), N
   );

   public int L() {
      return this.index;
   }

   public class00371(int index) {
      super();
      this.index = index;
   }

   @Override
   public Codec<String> y() {
      return N;
   }

   @Override
   public class00336<class00371, String> N() {
      return y;
   }

   @Nullable
   public String y(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3, int var4, class03662 var5) {
      class02845 class02845 = var1.method_58694(class02484.j);
      return class02845 != null ? class02845.L(this.index) : null;
   }
}
