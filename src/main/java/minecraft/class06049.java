package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class06049 extends class00891 implements class02674 {
   public static final MapCodec<class06049> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class02774.field_46493.fieldOf("weathering_state").forGetter(class01108::i), t()).apply(var0, class06049::new)
   );
   private final class02774 y;

   public class06049(class02774 var1, class01362 var2) {
      super(var2);
      this.y = var1;
   }

   public class02774 i() {
      return this.y;
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      this.a_(var1, var2, var3, var4);
   }

   @Override
   public MapCodec<class06049> N() {
      return N;
   }

   @Override
   protected boolean e_(class00500 var1) {
      return class02674.L(var1.i()).isPresent();
   }
}
