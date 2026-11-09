package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class06806 extends class07774 {
   public static final MapCodec<class06806> i = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06787.N.forGetter(var0x -> var0x.R), t()).apply(var0, class06806::new)
   );
   private final class00891 R;

   public class06806(class00891 var1, class01362 var2) {
      super(var2);
      this.R = var1;
   }

   @Override
   public MapCodec<class06806> N() {
      return i;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var5.b() == var1.L(L) && !var1.N(var2, var4)) {
         return class00869.N.W();
      } else {
         if (var1.L(u)) {
            var3.N(var4, class04684.L, class04684.L.N(var2));
         }

         this.N(var1, var2, var3, var8, var4);
         return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (!L(var1, var2, var3)) {
         var2.method_8652(var3, this.R.W().y(u, false).y(L, var1.L(L)), 2);
      }
   }

   @Override
   protected void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      this.N(var1, var2, var2, var2.field_9229, var3);
   }
}
