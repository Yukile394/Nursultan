package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class08984 extends class08950 implements class02674 {
   public static final MapCodec<class08984> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class02774.field_46493.fieldOf("weathering_state").forGetter(class08950::y),
            class04206.y.T().fieldOf("open_sound").forGetter(class00860::j),
            class04206.y.T().fieldOf("close_sound").forGetter(class00860::v),
            t()
         )
         .apply(var0, class08984::new)
   );

   @Override
   public boolean L() {
      return false;
   }

   public class08984(class02774 var1, class04891 var2, class04891 var3, class01362 var4) {
      super(var1, var2, var3, var4);
   }

   public class02774 i() {
      return this.y();
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (!var1.L(class00860.i).equals(class06638.field_12571)) {
         class00394 class00394 = var2.method_8321(var3);
         if (class00394 instanceof class00379 && ((class00379)class00394).j_().isEmpty()) {
            this.a_(var1, var2, var3, var4);
         }
      }
   }

   @Override
   public MapCodec<class08984> N() {
      return y;
   }

   @Override
   protected boolean e_(class00500 var1) {
      return class02674.L(var1.i()).isPresent();
   }
}
