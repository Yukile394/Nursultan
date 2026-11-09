package minecraft;

import org.jspecify.annotations.Nullable;

public class class02752 {
   public class02752() {
      super();
   }

   @Nullable
   public static class02733 N(class07299 var0, @Nullable class07211 var1, @Nullable class07211 var2) {
      if (var0.method_45162().y(class03794.L)) {
         class02733 class02733 = class02733.N(var0.field_9229).N(class02759.field_52681);
         if (var2 != null) {
            class02733 = class02733.N(var2);
         }

         if (var1 != null) {
            class02733 = class02733.y(var1);
         }

         return class02733;
      } else {
         return null;
      }
   }

   @Nullable
   public static class02733 N(@Nullable class02733 var0, class07211 var1) {
      return var0 == null ? null : var0.y(var1);
   }
}
