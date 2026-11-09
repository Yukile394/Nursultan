package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class08139 extends class07100 implements class02674 {
   public static final MapCodec<class08139> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class02774.field_46493.fieldOf("weathering_state").forGetter(class08139::i), t()).apply(var0, class08139::new)
   );
   private final class02774 Z;

   public class08139(class02774 var1, class01362 var2) {
      super(var2);
      this.Z = var1;
   }

   public class02774 i() {
      return this.Z;
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      this.a_(var1, var2, var3, var4);
   }

   @Override
   public MapCodec<class08139> N() {
      return N;
   }

   @Override
   protected boolean e_(class00500 var1) {
      return class02674.L(var1.i()).isPresent();
   }
}
