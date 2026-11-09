package minecraft;

import Nursultan.class10758;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class class06895 implements class05544 {
   private final class02055<class06581> y;
   private final class01990 L;
   private final class06584 u;
   private final List<class06510> i = new ArrayList<>();
   private final Map<String, class06915<?>> R = new LinkedHashMap<>();
   @Nullable
   private String M;

   private class06895(class02055<class06581> var1, class01990 var2, class06584 var3) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
   }

   public class06895 y(String var1, class06915<?> var2) {
      this.R.put(var1, var2);
      return this;
   }

   public class06895 y(@Nullable String var1) {
      this.M = var1;
      return this;
   }

   @Override
   public class06581 N() {
      return this.u.B();
   }

   @Override
   public void N(class03719 var1, class05946<class06521<?>> var2) {
      var2 = this.N(var2, var1);
      this.N(var2);
      class07165 class07165 = var1.method_53818().N("has_the_recipe", class00812.N(var2)).N(class10758.L(var2)).N(class03741.y);
      this.R.forEach(class07165::N);
      class06523 class06523 = new class06523(Objects.requireNonNullElse(this.M, ""), class05544.N(this.L), this.u, this.i);
      var1.method_53819(var2, class06523, class07165.y(var2.N().R("recipes/" + this.L.N() + "/")));
   }

   private void N(class05946<class06521<?>> var1) {
      if (this.R.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + var1.N());
      }
   }

   private class05946 N(class05946 var1, class03719 var2) {
      return class05946.N(var1.L(), var2.getRecipeIdentifier(var1.N()));
   }

   public class06895 N(class03530<class06581> var1) {
      return this.N(class06510.method_8106(this.y.y(var1)));
   }

   public static class06895 N(class02055<class06581> var0, class01990 var1, class07310 var2, int var3) {
      return new class06895(var0, var1, var2.B().E().L(var3));
   }

   public static class06895 N(class02055<class06581> var0, class01990 var1, class07310 var2) {
      return N(var0, var1, var2, 1);
   }

   public static class06895 N(class02055<class06581> var0, class01990 var1, class06584 var2) {
      return new class06895(var0, var1, var2);
   }

   public class06895 N(class06510 var1, int var2) {
      for (int ix = 0; ix < var2; ix++) {
         this.i.add(var1);
      }

      return this;
   }

   public class06895 N(class06510 var1) {
      return this.N(var1, 1);
   }

   public class06895 N(class07310 var1, int var2) {
      for (int ix = 0; ix < var2; ix++) {
         this.N(class06510.method_8101(var1));
      }

      return this;
   }

   public class06895 N(class07310 var1) {
      return this.N(var1, 1);
   }
}
