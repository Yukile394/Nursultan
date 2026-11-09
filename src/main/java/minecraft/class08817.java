package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class08817 extends class00729 {
   public static final MapCodec<class08817> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.BOOL.fieldOf("open").forGetter(var0x -> var0x.R.field_55072), t()).apply(var0, class08817::new)
   );
   private static final int u = 3;
   private static final int i = 2;
   private final class08846 R;

   private boolean L(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (var2.method_75728().N(class00608.o, var3).y(this.R.field_55072) == this.R.field_55072) {
         return false;
      } else {
         class08846 class08846 = this.R.L();
         var2.method_8652(var3, class08846.y(), 3);
         var2.N(class01194.L, var3, class01164.N(var1));
         class08846.N(var2, var3, var4);
         class07209.method_10097(var3.method_10069(-3, -2, -3), var3.method_10069(3, 2, 3)).forEach(var4x -> {
            if (var2.method_8320(var4x) == var1) {
               double d0 = Math.sqrt(var3.method_10262(var4x));
               int ix = var4.N((int)(d0 * 5.0), (int)(d0 * 10.0));
               var2.N(var4x, var1.i(), ix);
            }
         });
         return true;
      }
   }

   public class08817(boolean var1, class01362 var2) {
      super(class08846.N(var1).field_55073, class08846.N(var1).field_55074, var2);
      this.R = class08846.N(var1);
   }

   public class08817(class08846 var1, class01362 var2) {
      super(var1.field_55073, var1.field_55074, var2);
      this.R = var1;
   }

   @Override
   public class07055 y() {
      return new class07055(class07047.j, 25);
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (this.L(var1, var2, var3, var4)) {
         var2.method_8396(null, var3, this.R.L().field_55075, class04911.field_15245, 1.0F, 1.0F);
      }

      super.y_2(var1, var2, var3, var4);
   }

   @Override
   public MapCodec<? extends class08817> N() {
      return N;
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class07049 var4, class08400 var5, boolean var6) {
      if (!var2.method_8608()
         && var2.y() != class07086.field_5801
         && var4 instanceof class04626 class04626
         && class04626.N(var1)
         && !class04626.method_6059(class07047.j)) {
         class04626.method_6092(this.y());
      }
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      if (this.R.u() && var4.y(700) == 0 && var2.method_8320(var3.method_10074()).N(class00869.nf)) {
         var2.method_8486(var3.method_10263(), var3.method_10264(), var3.method_10260(), class04909.Un, class04911.field_15256, 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (this.L(var1, var2, var3, var4)) {
         var2.method_8396(null, var3, this.R.L().field_55076, class04911.field_15245, 1.0F, 1.0F);
      }

      super.N(var1, var2, var3, var4);
   }
}
