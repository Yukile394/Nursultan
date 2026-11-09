package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class06775 extends class06781 implements class07190 {
   public static final MapCodec<class06775> N = y(class06775::new);
   public static final class08064<class06677> y = class06665.yZ;

   @Override
   protected void L(class07299 var1, class07209 var2, class00500 var3) {
      if (!var1.method_8397().y(var2, this)) {
         int i = this.i(var1, var2, var3);
         class00394 class00394 = var1.method_8321(var2);
         int j = class00394 instanceof class00382 ? ((class00382)class00394).N() : 0;
         if (i != j || var3.L(L) != this.N(var1, var2, var3)) {
            class00763 class00763 = this.y(var1, var2, var3) ? class00763.field_9310 : class00763.field_9314;
            var1.N(var2, this, 2, class00763);
         }
      }
   }

   public class06775(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(R, class07211.field_11043).y(L, false).y(y, class06677.field_12576));
   }

   private int i(class07299 var1, class07209 var2, class00500 var3) {
      int i = this.y(var1, var2, var3);
      if (i == 0) {
         return 0;
      } else {
         int j = this.N((class03589)var1, var2, var3);
         if (j > i) {
            return 0;
         } else {
            return var3.L(y) == class06677.field_12578 ? i - j : i;
         }
      }
   }

   @Override
   protected int U(class00500 var1) {
      return 2;
   }

   @Override
   protected int y(class07299 var1, class07209 var2, class00500 var3) {
      int i = super.y(var1, var2, var3);
      class07211 class07211 = var3.L(R);
      class07209 class07209 = var2.method_10093(class07211);
      class00500 class00500 = var1.method_8320(class07209);
      if (class00500.v()) {
         i = class00500.N(var1, class07209, class07211.b());
      } else if (i < 15 && class00500.u(var1, class07209)) {
         class07209 = class07209.method_10093(class07211);
         class00500 = var1.method_8320(class07209);
         class00679 class00679 = this.N(var1, class07211, class07209);
         int j = Math.max(
            class00679 == null ? Integer.MIN_VALUE : class00679.m(), class00500.v() ? class00500.N(var1, class07209, class07211.b()) : Integer.MIN_VALUE
         );
         if (j != Integer.MIN_VALUE) {
            i = j;
         }
      }

      return i;
   }

   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class00382(var1, var2);
   }

   @Override
   protected boolean N(class00500 var1, class07299 var2, class07209 var3, int var4, int var5) {
      super.N(var1, var2, var3, var4, var5);
      class00394 class00394 = var2.method_8321(var3);
      return class00394 != null && class00394.N(var4, var5);
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      this.R(var2, var3, var1);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(R, y, L);
   }

   @Override
   public MapCodec<class06775> N() {
      return N;
   }

   @Override
   protected int N(class07290 var1, class07209 var2, class00500 var3) {
      class00394 class00394 = var1.method_8321(var2);
      return class00394 instanceof class00382 ? ((class00382)class00394).N() : 0;
   }

   @Override
   public class00500 N(class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8) {
      return var5 == class07211.field_11033 && !this.N(var2, var6, var7) ? class00869.N.W() : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Nullable
   private class00679 N(class07299 var1, class07211 var2, class07209 var3) {
      List<class00679> list = var1.N(
         class00679.class,
         new class00734(
            var3.method_10263(), var3.method_10264(), var3.method_10260(), var3.method_10263() + 1, var3.method_10264() + 1, var3.method_10260() + 1
         ),
         var1x -> var1x.method_5735() == var2
      );
      return list.size() == 1 ? list.get(0) : null;
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (!var4.method_31549().i) {
         return class07082.i;
      } else {
         var1 = var1.N(y);
         float f = var1.L(y) == class06677.field_12578 ? 0.55F : 0.5F;
         var2.method_8396(var4, var3, class04909.RA, class04911.field_15245, 0.3F, f);
         var2.method_8652(var3, var1, 2);
         this.R(var2, var3, var1);
         return class07082.N;
      }
   }

   @Override
   protected boolean N(class07299 var1, class07209 var2, class00500 var3) {
      int i = this.y(var1, var2, var3);
      if (i == 0) {
         return false;
      } else {
         int j = this.N((class03589)var1, var2, var3);
         return i > j ? true : i == j && var3.L(y) == class06677.field_12576;
      }
   }

   private void R(class07299 var1, class07209 var2, class00500 var3) {
      int i = this.i(var1, var2, var3);
      class00394 class00394 = var1.method_8321(var2);
      int j = 0;
      if (class00394 instanceof class00382 class00382) {
         j = class00382.N();
         class00382.N(i);
      }

      if (j != i || var3.L(y) == class06677.field_12576) {
         boolean flag1 = this.N(var1, var2, var3);
         boolean flag = var3.L(L);
         if (flag && !flag1) {
            var1.method_8652(var2, var3.y(L, false), 2);
         } else if (!flag && flag1) {
            var1.method_8652(var2, var3.y(L, true), 2);
         }

         this.u(var1, var2, var3);
      }
   }
}
