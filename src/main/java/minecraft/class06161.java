package minecraft;

import Nursultan.class10758;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class class06161 implements class05544 {
   private final class01990 y;
   private final class06581 L;
   private final class06510 u;
   private final int i;
   private final Map<String, class06915<?>> R = new LinkedHashMap<>();
   @Nullable
   private String M;
   private final class06138<?> B;

   public class06161(class01990 var1, class06138<?> var2, class06510 var3, class07310 var4, int var5) {
      super();
      this.y = var1;
      this.B = var2;
      this.L = var4.B();
      this.u = var3;
      this.i = var5;
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
      class06184 class06184 = this.B.create(Objects.requireNonNullElse(this.M, ""), this.u, new class06584(this.L, this.i));
      var1.method_53819(var2, class06184, class07165.y(var2.N().R("recipes/" + this.y.N() + "/")));
   }

   public static class06161 N(class06510 var0, class01990 var1, class07310 var2) {
      return new class06161(var1, class06156::new, var0, var2, 1);
   }

   public static class06161 N(class06510 var0, class01990 var1, class07310 var2, int var3) {
      return new class06161(var1, class06156::new, var0, var2, var3);
   }

   public class06161 y(String var1, class06915<?> var2) {
      this.R.put(var1, var2);
      return this;
   }

   public class06161 y(@Nullable String var1) {
      this.M = var1;
      return this;
   }

   @Override
   public class06581 N() {
      return this.L;
   }
}
