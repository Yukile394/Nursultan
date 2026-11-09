package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class06149 extends class06555 {
   private static final int L = -1;
   public static final Codec<class06149> N = RecordCodecBuilder.create(
      var0 -> var0.group(Codec.INT.optionalFieldOf("map", -1).forGetter(var0x -> var0x.u)).apply(var0, class06149::new)
   );
   public static final class08413<class06149> y = new class08413<>("idcounts", class06149::new, N, class05715.field_45080);
   private int u;

   public class06149() {
      this(-1);
   }

   public class06149(int var1) {
      super();
      this.u = var1;
   }

   public class02265 N() {
      class02265 class02265 = new class02265(++this.u);
      this.method_80();
      return class02265;
   }
}
