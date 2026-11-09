package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class08986 extends class08981 implements class02674 {
   public static final MapCodec<class08986> i = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class02774.field_46493.fieldOf("weathering_state").forGetter(class01108::i), t()).apply(var0, class08986::new)
   );

   public class02774 i() {
      return this.y();
   }

   public class08986(class02774 var1, class01362 var2) {
      super(var1, var2);
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      this.a_(var1, var2, var3, var4);
   }

   @Override
   public MapCodec<class08986> N() {
      return i;
   }

   @Override
   protected class07082 N(class06584 var1, class00500 var2, class07299 var3, class07209 var4, class08036 var5, class07050 var6, class06183 var7) {
      if (var3.method_8321(var4) instanceof class08965 class08965) {
         if (!var1.N(class01226.Ly)) {
            if (var1.N(class06570.wR)) {
               return class07082.i;
            }

            this.N(var3, var2, var4, var5);
            return class07082.N;
         }

         if (this.i().equals(class02774.field_28704)) {
            class08982 class08982 = class08965.N(var2);
            var1.N(1, var5, var6.N());
            if (class08982 != null) {
               var3.method_8649(class08982);
               var3.method_8650(var4, false);
               return class07082.N;
            }
         }
      }

      return class07082.i;
   }

   @Override
   protected boolean e_(class00500 var1) {
      return class02674.L(var1.i()).isPresent();
   }
}
