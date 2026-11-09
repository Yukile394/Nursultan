package minecraft;

import com.mojang.serialization.MapCodec;

public abstract class class07204 extends class00891 implements class06344 {
   public class07204(class01362 var1) {
      super(var1);
   }

   public static boolean U(class00500 var0) {
      return var0.P() || var0.N(class01210.Nh) || var0.T() || var0.d();
   }

   protected int y() {
      return 2;
   }

   protected void N(class00701 var1) {
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      if (var4.y(16) == 0) {
         class07209 class07209 = var3.method_10074();
         if (U(var2.method_8320(class07209))) {
            class02615.N(var2, var3, var4, new class07105(class07107.O, var1));
         }
      }
   }

   public abstract int N(class00500 var1, class07290 var2, class07209 var3);

   @Override
   protected abstract MapCodec<? extends class07204> N();

   @Override
   protected void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      var2.N(var3, this, this.y());
   }

   @Override
   public class00500 N(class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8) {
      var3.N(var4, this, this.y());
      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (U(var2.method_8320(var3.method_10074())) && var3.method_10264() >= var2.method_31607()) {
         class00701 class00701 = class00701.N(var2, var3, var1);
         this.N(class00701);
      }
   }
}
