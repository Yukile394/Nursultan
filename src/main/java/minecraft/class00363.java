package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.PrimitiveCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public record class00363(String property) implements class00372<String> {
   public static final PrimitiveCodec<String> N = Codec.STRING;
   public static final class00336<class00363, String> y = class00336.N(
      RecordCodecBuilder.mapCodec(var0 -> var0.group(Codec.STRING.fieldOf("block_state_property").forGetter(class00363::L)).apply(var0, class00363::new)), N
   );

   public String L() {
      return this.property;
   }

   public class00363(String property) {
      this.property = property;
   }

   @Override
   public Codec<String> y() {
      return N;
   }

   @Override
   public class00336<class00363, String> N() {
      return y;
   }

   @Nullable
   public String y(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3, int var4, class03662 var5) {
      class02841 class02841 = var1.method_58694(class02484.Nl);
      return class02841 == null ? null : class02841.y().get(this.property);
   }
}
