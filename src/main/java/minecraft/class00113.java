package minecraft;

import org.jspecify.annotations.Nullable;

public class class00113<T extends class09032> extends class00134<T> {
   public class00113(@Nullable class05096 var1, T var2, class08781 var3) {
      super(var1, (T)var2, var3);
   }

   protected void N(class03686 var1, class08770 var2, T var3, class08781 var4) {
      super.N(var1, var2, (T)var3, var4);
      class01885 class01885 = class01885.i().N(8);

      for (class08734 class08734 : var3.y()) {
         class01885.N(var2.N(class08734).N());
      }

      var1.y(class01885);
   }
}
