package minecraft;

import com.mojang.serialization.MapCodec;

public class class06021 extends class00891 implements class00873 {
   public static final MapCodec<class06021> N = y(class06021::new);

   public class06021(class01362 var1) {
      super(var1);
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      boolean flag = false;
      boolean flag1 = false;

      for (class07209 class07209 : class07209.method_10097(var3.method_10069(-1, -1, -1), var3.method_10069(1, 1, 1))) {
         class00500 class00500 = var1.method_8320(class07209);
         if (class00500.N(class00869.sE)) {
            flag1 = true;
         }

         if (class00500.N(class00869.sn)) {
            flag = true;
         }

         if (flag1 && flag) {
            break;
         }
      }

      if (flag1 && flag) {
         var1.method_8652(var3, var2.Z() ? class00869.sE.W() : class00869.sn.W(), 3);
      } else if (flag1) {
         var1.method_8652(var3, class00869.sE.W(), 3);
      } else if (flag) {
         var1.method_8652(var3, class00869.sn.W(), 3);
      }
   }

   @Override
   public MapCodec<class06021> N() {
      return N;
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return true;
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      if (!var1.method_8320(var2.method_10084()).Z()) {
         return false;
      } else {
         for (class07209 class07209 : class07209.method_10097(var2.method_10069(-1, -1, -1), var2.method_10069(1, 1, 1))) {
            if (var1.method_8320(class07209).N(class01210.Nr)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public class00901 ay_() {
      return class00901.field_47834;
   }
}
