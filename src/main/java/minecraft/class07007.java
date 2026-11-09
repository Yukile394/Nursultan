package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class07007 extends class00891 implements class06084 {
   public static final MapCodec<class07007> N = y(class07007::new);
   public static final class08064<class08054> y = class06665.yW;
   public static final class06667 L = class06665.q;
   private static final class00494 u = class00891.y(16.0, 0.0, 8.0);
   private static final class00494 i = class00891.y(16.0, 8.0, 16.0);

   public class07007(class01362 var1) {
      super(var1);
      this.P(this.W().y(y, class08054.field_12681).y(L, false));
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(L) ? class04684.L.N(false) : super.u(var1);
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(L)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public boolean N(class07284 var1, class07209 var2, class00500 var3, class04688 var4) {
      return var3.L(y) != class08054.field_12682 ? class06084.super.N(var1, var2, var3, var4) : false;
   }

   @Override
   public boolean N(@Nullable class07438 var1, class07290 var2, class07209 var3, class00500 var4, class04651 var5) {
      return var4.L(y) != class08054.field_12682 ? class06084.super.N(var1, var2, var3, var4, var5) : false;
   }

   @Override
   public MapCodec<? extends class07007> N() {
      return N;
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      switch (var2) {
         case field_50:
            return false;
         case field_48:
            return var1.Y().N(class01231.N);
         case field_51:
            return false;
         default:
            return false;
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return switch ((class08054)var1.L(y)) {
         case field_12679 -> i;
         case field_12681 -> u;
         case field_12682 -> class00389.y();
      };
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      class07209 class07209 = var1.method_8037();
      class00500 class00500x = var1.method_8045().method_8320(class07209);
      if (class00500x.N(this)) {
         return class00500x.y(y, class08054.field_12682).y(L, false);
      } else {
         class04688 class04688 = var1.method_8045().method_8316(class07209);
         class00500 class00500x = this.W().y(y, class08054.field_12681).y(L, class04688.N() == class04684.L);
         class07211 class07211 = var1.method_8038();
         return class07211 != class07211.field_11033 && (class07211 == class07211.field_11036 || !(var1.method_17698().B - class07209.method_10264() > 0.5))
            ? class00500x
            : class00500x.y(y, class08054.field_12679);
      }
   }

   @Override
   protected boolean N(class00500 var1, class06942 var2) {
      class06584 class06584 = var2.method_8041();
      class08054 class08054 = var1.L(y);
      if (class08054 == class08054.field_12682 || !class06584.N(this.B())) {
         return false;
      } else if (var2.y()) {
         boolean flag = var2.method_17698().B - var2.method_8037().method_10264() > 0.5;
         class07211 class07211 = var2.method_8038();
         return class08054 == class08054.field_12681
            ? class07211 == class07211.field_11036 || flag && class07211.z().L()
            : class07211 == class07211.field_11033 || !flag && class07211.z().L();
      } else {
         return true;
      }
   }

   @Override
   protected boolean a_(class00500 var1) {
      return var1.L(y) != class08054.field_12682;
   }
}
