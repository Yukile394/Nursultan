package minecraft;

import Nursultan.class10758;
import java.util.LinkedHashMap;
import java.util.Map;

public class class03243 {
   private final class01990 N;
   private final class06510 y;
   private final class06510 L;
   private final class06510 u;
   private final class03556<class03246> i;
   private final Map<String, class06915<?>> R = new LinkedHashMap<>();

   public class03243(class01990 var1, class06510 var2, class06510 var3, class06510 var4, class03556<class03246> var5) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
   }

   public void N(class03719 var1, class05946<class06521<?>> var2) {
      var2 = this.N(var2, var1);
      this.N(var2);
      class07165 class07165 = var1.method_53818().N("has_the_recipe", class00812.N(var2)).N(class10758.L(var2)).N(class03741.y);
      this.R.forEach(class07165::N);
      class03259 class03259 = new class03259(this.y, this.L, this.u, this.i);
      var1.method_53819(var2, class03259, class07165.y(var2.N().R("recipes/" + this.N.N() + "/")));
   }

   private void N(class05946<class06521<?>> var1) {
      if (this.R.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + var1.N());
      }
   }

   private class05946 N(class05946 var1, class03719 var2) {
      return class05946.N(var1.L(), var2.getRecipeIdentifier(var1.N()));
   }

   public class03243 N(String var1, class06915<?> var2) {
      this.R.put(var1, var2);
      return this;
   }

   public static class03243 N(class06510 var0, class06510 var1, class06510 var2, class03556<class03246> var3, class01990 var4) {
      return new class03243(var4, var0, var1, var2, var3);
   }
}
