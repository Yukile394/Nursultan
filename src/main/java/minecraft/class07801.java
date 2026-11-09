package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class07801 extends class00891 implements class06084 {
   public static final MapCodec<class07801> N = y(class07801::new);
   public static final class06667 y = class06665.q;

   public class07801(class01362 var1) {
      super(var1);
      this.P(this.W().y(y, false));
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(y) ? class04684.L.N(false) : super.u(var1);
   }

   @Override
   protected float y(class00500 var1, class07290 var2, class07209 var3) {
      return 1.0F;
   }

   @Override
   protected boolean y(class00500 var1) {
      return var1.Y().W();
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
   }

   @Override
   public class06584 N(@Nullable class07438 var1, class07284 var2, class07209 var3, class00500 var4) {
      return var1 instanceof class08036 && ((class08036)var1).method_68878() ? class06084.super.N(var1, var2, var3, var4) : class06584.E;
   }

   @Override
   public boolean N(@Nullable class07438 var1, class07290 var2, class07209 var3, class00500 var4, class04651 var5) {
      return var1 instanceof class08036 && ((class08036)var1).method_68878() ? class06084.super.N(var1, var2, var3, var4, var5) : false;
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      return this.W().y(y, var1.method_8045().method_8316(var1.method_8037()).N() == class04684.L);
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(y)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public MapCodec<class07801> N() {
      return N;
   }

   @Override
   protected class06898 d_(class00500 var1) {
      return class06898.field_11455;
   }
}
