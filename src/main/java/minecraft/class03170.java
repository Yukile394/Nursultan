package minecraft;

import java.util.List;

public class class03170 {
   public static final class04297 N = class02405.N(class07830.field_13197);
   public static final class04297 y = class02405.N(class07830.field_13203);
   public static final class04297 L = class02405.N(class07830.field_13195);
   public static final class04297 u = class02405.N(class07830.field_13194);
   public static final class04297 i = class02405.N(class07830.field_13200);
   public static final class04297 R = class04308.N(class06055.N(), class06055.y());
   public static final class04297 M = class04308.N(class06055.y(10), class06055.L(10));
   public static final class04297 B = class04308.N(class06055.y(8), class06055.L(8));
   public static final class04297 Z = class04308.N(class06055.y(4), class06055.L(4));
   public static final class04297 z = class04308.N(class06055.N(), class06055.N(256));

   public class03170() {
      super();
   }

   public static class04033 N(class00891 var0) {
      return class04033.N(class04025.N(var0.W(), class07209.field_10980));
   }

   public static class03556<class04336> N(class03556<class03238<?, ?>> var0, class04297... var1) {
      return class03556.N(new class04336(var0, List.of(var1)));
   }

   public static <FC extends class06386, F extends class06391<FC>> class03556<class04336> N(F var0, FC var1, class04297... var2) {
      return N(class03556.N(new class03238<>((F)var0, var1)), var2);
   }

   public static <FC extends class06386, F extends class06391<FC>> class03556<class04336> N(F var0, FC var1) {
      return N((F)var0, var1, class04025.L);
   }

   public static <FC extends class06386, F extends class06391<FC>> class03556<class04336> N(F var0, FC var1, class04025 var2) {
      return N((F)var0, var1, class04033.N(var2));
   }

   public static class04050 N() {
      return class04033.N(class04025.L);
   }

   public static class05946<class04336> N(String var0) {
      return class05946.N(class04227.ys, class01894.y(var0));
   }

   public static void N(class04116<class04336> var0, class05946<class04336> var1, class03556<class03238<?, ?>> var2, List<class04297> var3) {
      var0.N(var1, new class04336(var2, List.copyOf(var3)));
   }

   public static void N(class04116<class04336> var0, class05946<class04336> var1, class03556<class03238<?, ?>> var2, class04297... var3) {
      N(var0, var1, var2, List.of(var3));
   }

   public static class04297 N(int var0, float var1, int var2) {
      float f = 1.0F / var1;
      if (Math.abs(f - (int)f) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         class04540 class04540 = class04540.<class02151>y().N(class02151.N(var0), (int)f - 1).N(class02151.N(var0 + var2), 1).N();
         return class04321.N(new class03301(class04540));
      }
   }

   public static void N(class04116<class04336> var0) {
      class03151.N(var0);
      class03165.N(var0);
      class03181.N(var0);
      class03159.N(var0);
      class03187.N(var0);
      class03163.N(var0);
      class03178.N(var0);
      class03189.N(var0);
      class03180.N(var0);
   }
}
