package minecraft;

import org.jspecify.annotations.Nullable;

public class class04810 extends class06918 implements class04799 {
   private final class04891 N;

   public class04810(class00891 var1, class04891 var2, class06573 var3) {
      super(var1, var3);
      this.N = var2;
   }

   @Override
   public boolean N(@Nullable class07438 var1, class07299 var2, class07209 var3, @Nullable class06183 var4) {
      if (var2.method_24794(var3) && var2.R(var3)) {
         if (!var2.method_8608()) {
            var2.method_8652(var3, this.L().W(), 3);
         }

         var2.N(var1, class01194.w, var3);
         var2.method_8396(var1, var3, this.N, class04911.field_15245, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected class04891 N(class00500 var1) {
      return this.N;
   }

   @Override
   public class07082 N(class06501 var1) {
      class07082 class07082 = super.N(var1);
      class08036 class08036 = var1.method_8036();
      if (class07082.N() && class08036 != null) {
         class08036.method_6122(var1.method_20287(), class06913.y(var1.method_8041(), class08036));
      }

      return class07082;
   }
}
