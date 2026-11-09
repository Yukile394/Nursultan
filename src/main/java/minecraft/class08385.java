package minecraft;

import java.util.List;
import org.jspecify.annotations.Nullable;

public abstract class class08385 implements class03358<class07267, class00981> {
   private static final int N = -988212;
   private static final int y = class04995.Z(16);
   private final class01590 L;
   private final class08097 u;

   protected abstract class06889 L();

   public class08385(class04811 var1) {
      super();
      this.L = var1.M();
      this.u = var1.B();
   }

   public class00981 i() {
      return new class00981();
   }

   protected abstract float y();

   public void N(class07267 var1, class00981 var2, float var3, class06889 var4, @Nullable class08141 var5) {
      class03358.super.N(var1, var2, var3, var4, var5);
      var2.u = var1.M();
      var2.L = var1.R();
      var2.N = var1.L();
      var2.y = var1.u();
      var2.i = class06202.Nq().yi();
      var2.U = N(var1.d());
   }

   private static boolean N(class07209 var0) {
      class06202 class06202 = class06202.Nq();
      class04453 class04453 = (class04453)class06202.T_4;
      if (class04453 != null && ((class05630)class06202.i_7).NS().N() && class04453.method_31550()) {
         return true;
      } else {
         class07049 class07049 = class06202.F();
         return class07049 != null && class07049.method_5707(class06889.y(var0)) < y;
      }
   }

   public static int N(class03610 var0) {
      int i = var0.y().R();
      return i == class06563.field_7963.R() && var0.N() ? -988212 : class02566.y(i, 0.4F);
   }

   private void N(class00981 var1, class01421 var2, class01237 var3, boolean var4) {
      class03610 class03610 = var4 ? var1.N : var1.y;
      if (class03610 != null) {
         var2.N();
         this.N(var2, var4, this.L());
         int i = N(class03610);
         int j = 4 * var1.L / 2;
         class01028[] aclass01028 = class03610.N(var1.i, var2x -> {
            List<class01028> list = this.L.L(var2x, var1.u);
            return list.isEmpty() ? class01028.N : list.get(0);
         });
         int k;
         boolean flag;
         int l;
         if (class03610.N()) {
            k = class03610.y().R();
            flag = k == class06563.field_7963.R() || var1.U;
            l = 15728880;
         } else {
            k = i;
            flag = false;
            l = var1.Z;
         }

         for (int i1 = 0; i1 < 4; i1++) {
            class01028 class01028 = aclass01028[i1];
            float f = -this.L.N(class01028) / 2;
            var3.N(var2, f, i1 * var1.L - j, class01028, false, class01583.field_33995, l, k, 0, flag ? i : 0);
         }

         var2.y();
      }
   }

   public void N(class00981 var1, class01421 var2, class01237 var3, class06959 var4) {
      class00500 class00500 = var1.M;
      class07036 class07036 = (class07036)class00500.i();
      class06260 class06260 = this.N(class00500, class07036.L());
      this.N(var1, var2, class00500, class07036, class07036.L(), class06260, var1.z, var3);
   }

   protected abstract void N(class01421 var1, float var2, class00500 var3);

   protected abstract class05913 N(class05904 var1);

   protected abstract float N();

   private void N(class01421 var1, boolean var2, class06889 var3) {
      if (!var2) {
         var1.N(class02058.u.N(180.0F));
      }

      float f = 0.015625F * this.y();
      var1.N(var3);
      var1.y(f, -f, f);
   }

   protected abstract class06260 N(class00500 var1, class05904 var2);

   protected void N(class01421 var1, int var2, class05904 var3, class06260 var4, @Nullable class08141 var5, class01237 var6) {
      var1.N();
      float f = this.N();
      var1.y(f, -f, -f);
      class05913 class05913 = this.N(var3);
      class07311 class07311 = class05913.N(var4::method_23500);
      var6.N(var4, class06244.field_17274, var1, class07311, var2, class01384.u, -1, this.u.N(class05913), 0, var5);
      var1.y();
   }

   private void N(
      class00981 var1, class01421 var2, class00500 var3, class07036 var4, class05904 var5, class06260 var6, @Nullable class08141 var7, class01237 var8
   ) {
      var2.N();
      this.N(var2, -var4.U(var3), var3);
      this.N(var2, var1.Z, var5, var6, var7, var8);
      this.N(var1, var2, var8, true);
      this.N(var1, var2, var8, false);
      var2.y();
   }
}
