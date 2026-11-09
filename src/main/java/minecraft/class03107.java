package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class03107 extends class03135 implements class02674 {
   public static final MapCodec<class03107> u = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class02774.field_46493.fieldOf("weathering_state").forGetter(class03107::i), t()).apply(var0, class03107::new)
   );
   private final class02774 i;

   public class03107(class02774 var1, class01362 var2) {
      super(var2);
      this.i = var1;
   }

   public class02774 i() {
      return this.i;
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      this.a_(var1, var2, var3, var4);
   }

   @Override
   protected MapCodec<class03107> N() {
      return u;
   }

   @Override
   protected boolean e_(class00500 var1) {
      return class02674.L(var1.i()).isPresent();
   }
}
