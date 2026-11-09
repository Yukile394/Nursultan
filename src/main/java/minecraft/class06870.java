package minecraft;

import Nursultan.class10758;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class class06870 implements class05544 {
   private final class02055<class06581> y;
   private final class01990 L;
   private final class06581 u;
   private final int i;
   private final List<String> R = Lists.newArrayList();
   private final Map<Character, class06510> M = Maps.newLinkedHashMap();
   private final Map<String, class06915<?>> B = new LinkedHashMap<>();
   @Nullable
   private String Z;
   private boolean z = true;

   public class06870 y(@Nullable String var1) {
      this.Z = var1;
      return this;
   }

   private class06870(class02055<class06581> var1, class01990 var2, class07310 var3, int var4) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3.B();
      this.i = var4;
   }

   @Override
   public class06581 N() {
      return this.u;
   }

   @Override
   public void N(class03719 var1, class05946<class06521<?>> var2) {
      var2 = this.N(var2, var1);
      class04493 class04493 = this.N(var2);
      class07165 class07165 = var1.method_53818().N("has_the_recipe", class00812.N(var2)).N(class10758.L(var2)).N(class03741.y);
      this.B.forEach(class07165::N);
      class07329 class07329 = new class07329(Objects.requireNonNullElse(this.Z, ""), class05544.N(this.L), class04493, new class06584(this.u, this.i), this.z);
      var1.method_53819(var2, class07329, class07165.y(var2.N().R("recipes/" + this.L.N() + "/")));
   }

   public class06870 N(boolean var1) {
      this.z = var1;
      return this;
   }

   private class04493 N(class05946<class06521<?>> var1) {
      if (this.B.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + var1.N());
      } else {
         return class04493.N(this.M, this.R);
      }
   }

   private class05946 N(class05946 var1, class03719 var2) {
      return class05946.N(var1.L(), var2.getRecipeIdentifier(var1.N()));
   }

   public class06870 N(Character var1, class06510 var2) {
      if (this.M.containsKey(var1)) {
         throw new IllegalArgumentException("Symbol '" + var1 + "' is already defined!");
      } else if (var1 == ' ') {
         throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
      } else {
         this.M.put(var1, var2);
         return this;
      }
   }

   public class06870 N(Character var1, class07310 var2) {
      return this.N(var1, class06510.method_8101(var2));
   }

   public class06870 N(Character var1, class03530<class06581> var2) {
      return this.N(var1, class06510.method_8106(this.y.y(var2)));
   }

   public static class06870 N(class02055<class06581> var0, class01990 var1, class07310 var2, int var3) {
      return new class06870(var0, var1, var2, var3);
   }

   public class06870 N(String var1) {
      if (!this.R.isEmpty() && var1.length() != this.R.get(0).length()) {
         throw new IllegalArgumentException("Pattern must be the same width on every line!");
      } else {
         this.R.add(var1);
         return this;
      }
   }

   public class06870 y(String var1, class06915<?> var2) {
      this.B.put(var1, var2);
      return this;
   }

   public static class06870 N(class02055<class06581> var0, class01990 var1, class07310 var2) {
      return N(var0, var1, var2, 1);
   }
}
