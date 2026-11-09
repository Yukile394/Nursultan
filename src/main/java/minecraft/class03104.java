package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class03104 extends class00624 implements class02674 {
   public static final MapCodec<class03104> M = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class01960.N.fieldOf("block_set_type").forGetter(class00624::L), class02774.field_46493.fieldOf("weathering_state").forGetter(class03104::i), t()
         )
         .apply(var0, class03104::new)
   );
   private final class02774 Z;

   public class03104(class01960 var1, class02774 var2, class01362 var3) {
      super(var1, var3);
      this.Z = var2;
   }

   public class02774 i() {
      return this.Z;
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      this.a_(var1, var2, var3, var4);
   }

   @Override
   public MapCodec<class03104> N() {
      return M;
   }

   @Override
   protected boolean e_(class00500 var1) {
      return class02674.L(var1.i()).isPresent();
   }
}
