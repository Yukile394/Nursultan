package minecraft;

import org.jspecify.annotations.Nullable;

public class class06107 extends class06918 {
   @Nullable
   @Override
   public class06942 L(class06942 var1) {
      class07209 class07209 = var1.method_8037();
      class07299 class07299 = var1.method_8045();
      class00500 class00500 = class07299.method_8320(class07209);
      class00891 class00891 = this.L();
      if (!class00500.N(class00891)) {
         return class06089.N(class07299, class07209) == 7 ? null : var1;
      } else {
         class07211 class07211;
         if (var1.method_8046()) {
            class07211 = var1.method_17699() ? var1.method_8038().b() : var1.method_8038();
         } else {
            class07211 = var1.method_8038() == class07211.field_11036 ? var1.method_8042() : class07211.field_11036;
         }

         int i = 0;
         class07218 class07218 = class07209.method_25503().N(class07211);

         while (i < 7) {
            if (!class07299.method_8608() && !class07299.method_24794(class07218)) {
               class08036 class08036 = var1.method_8036();
               int j = class07299.method_31600();
               if (class08036 instanceof class04770 && class07218.method_10264() > j) {
                  ((class04770)class08036).method_43502(class00392.N("build.tooHigh", j).N(class06541.field_1061), true);
               }
               break;
            }

            class00500 = class07299.method_8320(class07218);
            if (!class00500.N(this.L())) {
               if (class00500.N(var1)) {
                  return class06942.N(var1, class07218, class07211);
               }
               break;
            }

            class07218.N(class07211);
            if (class07211.z().L()) {
               i++;
            }
         }

         return null;
      }
   }

   public class06107(class00891 var1, class06573 var2) {
      super(var1, var2);
   }

   @Override
   protected boolean y() {
      return false;
   }
}
