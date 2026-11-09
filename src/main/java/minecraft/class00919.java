package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class00919 extends class05050 implements class02674 {
   public static final MapCodec<class00919> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class02774.field_46493.fieldOf("weathering_state").forGetter(class00919::i), t()).apply(var0, class00919::new)
   );
   private final class02774 M;

   public class00919(class02774 var1, class01362 var2) {
      super(var2);
      this.M = var1;
   }

   public class02774 i() {
      return this.M;
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      this.a_(var1, var2, var3, var4);
   }

   @Override
   public MapCodec<class00919> N() {
      return N;
   }

   @Override
   protected boolean e_(class00500 var1) {
      return class02674.L(var1.i()).isPresent();
   }
}
