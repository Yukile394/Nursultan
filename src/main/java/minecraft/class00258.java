package minecraft;

import Nursultan.class10758;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class class00258 implements class05544 {
   private final class01990 y;
   private final class03556<class06581> L;
   private final class06510 u;
   private final class06510 i;
   private final Map<String, class06915<?>> R = new LinkedHashMap<>();
   @Nullable
   private String M;

   private class00258(class01990 var1, class03556<class06581> var2, class06510 var3, class06510 var4) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
      this.i = var4;
   }

   private class05946 N(class05946 var1, class03719 var2) {
      return class05946.N(var1.L(), var2.getRecipeIdentifier(var1.N()));
   }

   private void N(class05946<class06521<?>> var1) {
      if (this.R.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + var1.N());
      }
   }

   @Override
   public void N(class03719 var1, class05946<class06521<?>> var2) {
      var2 = this.N(var2, var1);
      this.N(var2);
      class07165 class07165 = var1.method_53818().N("has_the_recipe", class00812.N(var2)).N(class10758.L(var2)).N(class03741.y);
      this.R.forEach(class07165::N);
      class08690 class08690 = new class08690(Objects.requireNonNullElse(this.M, ""), class05544.N(this.y), this.u, this.i, new class08604(this.L.N()));
      var1.method_53819(var2, class08690, class07165.y(var2.N().R("recipes/" + this.y.N() + "/")));
   }

   public static class00258 N(class01990 var0, class06510 var1, class06510 var2, class06581 var3) {
      return new class00258(var0, var3.i(), var1, var2);
   }

   public class00258 y(String var1, class06915<?> var2) {
      this.R.put(var1, var2);
      return this;
   }

   public class00258 y(@Nullable String var1) {
      this.M = var1;
      return this;
   }

   @Override
   public class06581 N() {
      return this.L.N();
   }
}
