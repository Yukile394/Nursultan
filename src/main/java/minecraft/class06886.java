package minecraft;

import Nursultan.class10758;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class class06886 implements class05544 {
   private final class01990 y;
   private final class03774 L;
   private final class06581 u;
   private final class06510 i;
   private final float R;
   private final int M;
   private final Map<String, class06915<?>> B = new LinkedHashMap<>();
   @Nullable
   private String Z;
   private final class07293<?> z;

   public static class06886 L(class06510 var0, class01990 var1, class07310 var2, float var3, int var4) {
      return new class06886(var1, N(var2), var2, var0, var3, var4, class05654::new);
   }

   private static class03774 L(class07310 var0) {
      return var0.B() instanceof class06918 ? class03774.field_40243 : class03774.field_40244;
   }

   private class06886(class01990 var1, class03774 var2, class07310 var3, class06510 var4, float var5, int var6, class07293<?> var7) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3.B();
      this.i = var4;
      this.R = var5;
      this.M = var6;
      this.z = var7;
   }

   public static class06886 u(class06510 var0, class01990 var1, class07310 var2, float var3, int var4) {
      return new class06886(var1, class03774.field_40242, var2, var0, var3, var4, class05636::new);
   }

   public static class06886 y(class06510 var0, class01990 var1, class07310 var2, float var3, int var4) {
      return new class06886(var1, L(var2), var2, var0, var3, var4, class05641::new);
   }

   private static class03774 N(class07310 var0) {
      if (var0.B().R().N(class02484.d)) {
         return class03774.field_40242;
      } else {
         return var0.B() instanceof class06918 ? class03774.field_40243 : class03774.field_40244;
      }
   }

   private class05946 N(class05946 var1, class03719 var2) {
      return class05946.N(var1.L(), var2.getRecipeIdentifier(var1.N()));
   }

   private static class03774 N(class06514<? extends class07313> var0, class07310 var1) {
      if (var0 == class06514.s) {
         return N(var1);
      } else if (var0 == class06514.T) {
         return L(var1);
      } else if (var0 != class06514.b && var0 != class06514.j) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return class03774.field_40242;
      }
   }

   private void N(class05946<class06521<?>> var1) {
      if (this.B.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + var1.N());
      }
   }

   public static <T extends class07313> class06886 N(
      class06510 var0, class01990 var1, class07310 var2, float var3, int var4, class06514<T> var5, class07293<T> var6
   ) {
      return new class06886(var1, N(var5, var2), var2, var0, var3, var4, var6);
   }

   public static class06886 N(class06510 var0, class01990 var1, class07310 var2, float var3, int var4) {
      return new class06886(var1, class03774.field_40242, var2, var0, var3, var4, class05869::new);
   }

   public class06886 y(String var1, class06915<?> var2) {
      this.B.put(var1, var2);
      return this;
   }

   public class06886 y(@Nullable String var1) {
      this.Z = var1;
      return this;
   }

   @Override
   public class06581 N() {
      return this.u;
   }

   @Override
   public void N(class03719 var1, class05946<class06521<?>> var2) {
      var2 = this.N(var2, var1);
      this.N(var2);
      class07165 class07165 = var1.method_53818().N("has_the_recipe", class00812.N(var2)).N(class10758.L(var2)).N(class03741.y);
      this.B.forEach(class07165::N);
      class07313 class07313 = this.z.create(Objects.requireNonNullElse(this.Z, ""), this.L, this.i, new class06584(this.u), this.R, this.M);
      var1.method_53819(var2, class07313, class07165.y(var2.N().R("recipes/" + this.y.N() + "/")));
   }
}
