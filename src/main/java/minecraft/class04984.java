package minecraft;

import com.mojang.serialization.MapCodec;

public class class04984 extends class00891 implements class00873 {
   public static final MapCodec<class04984> N = y(class04984::new);

   public class04984(class01362 var1) {
      super(var1);
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (!y(var1, var2, var3)) {
         var2.method_8501(var3, class00869.id.W());
      }
   }

   private static boolean y(class00500 var0, class05487 var1, class07209 var2) {
      class07209 class07209 = var2.method_10084();
      class00500 class00500 = var1.method_8320(class07209);
      return class05015.N(var0, class00500, class07211.field_11036, class00500.z()) < 15;
   }

   private void N(class00751<class03238<?, ?>> var1, class05946<class03238<?, ?>> var2, class04782 var3, class08088 var4, class06069 var5, class07209 var6) {
      var1.N(var2).ifPresent(var4x -> ((class03238)var4x.N()).N(var3, var4, var5, var6));
   }

   @Override
   public MapCodec<class04984> N() {
      return N;
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return var1.method_8320(var2.method_10084()).P();
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return true;
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      class00500 class00500 = var1.method_8320(var3);
      class07209 class07209 = var3.method_10084();
      class08088 class08088 = var1.method_14178().U();
      class00751 class00751 = var1.method_30349().L(class04227.Nh);
      if (class00500.N(class00869.sn)) {
         this.N(class00751, class03161.B, var1, class08088, var2, class07209);
      } else if (class00500.N(class00869.sE)) {
         this.N(class00751, class03161.z, var1, class08088, var2, class07209);
         this.N(class00751, class03161.E, var1, class08088, var2, class07209);
         if (var2.y(8) == 0) {
            this.N(class00751, class03161.m, var1, class08088, var2, class07209);
         }
      }
   }

   @Override
   public class00901 ay_() {
      return class00901.field_47834;
   }
}
