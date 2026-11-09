package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class06033 extends class07746 implements class02674 {
   public static final MapCodec<class06033> M = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class02774.field_46493.fieldOf("weathering_state").forGetter(class01108::i), class00500.N.fieldOf("base_state").forGetter(var0x -> var0x.R), t()
         )
         .apply(var0, class06033::new)
   );
   private final class02774 Z;

   public class02774 i() {
      return this.Z;
   }

   public class06033(class02774 var1, class00500 var2, class01362 var3) {
      super(var2, var3);
      this.Z = var1;
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      this.a_(var1, var2, var3, var4);
   }

   @Override
   public MapCodec<class06033> N() {
      return M;
   }

   @Override
   protected boolean e_(class00500 var1) {
      return class02674.L(var1.i()).isPresent();
   }
}
