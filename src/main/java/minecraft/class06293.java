package minecraft;

import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class class06293 {
   private static void L(class07438 var0, class07438 var1) {
      N(var0, var1);
      N(var1, var0);
   }

   private class06293() {
      super();
   }

   public static boolean y(class07438 var0, class07438 var1) {
      class01289<?> class01289 = var0.method_18868();
      return !class01289.N(class05378.B) ? false : class01289.L(class05378.B).get().N(var1);
   }

   private static void y(class07438 var0, class07438 var1, float var2, int var3) {
      N(var0, (class07049)var1, var2, var3);
      N(var1, (class07049)var0, var2, var3);
   }

   public static boolean N(class07438 var0, class07438 var1, double var2) {
      Optional<class07438> optional = var0.method_18868().L(class05378.s);
      if (optional.isEmpty()) {
         return false;
      } else {
         double d0 = var0.method_5707(optional.get().method_73189());
         return var0.method_5707(var1.method_73189()) > d0 + var2 * var2;
      }
   }

   public static class07438 N(class07438 var0, class07438 var1, class07438 var2) {
      class06889 class06889x = var1.method_73189();
      class06889 class06889x = var2.method_73189();
      return var0.method_5707(class06889x) < var0.method_5707(class06889x) ? var1 : var2;
   }

   public static Optional<class07438> N(class07438 var0, class05378<UUID> var1) {
      return var0.method_18868()
         .<UUID>L(var1)
         .map(var1x -> var0.method_73183().method_66347(var1x))
         .map(var0x -> var0x instanceof class07438 ? (class07438)var0x : null);
   }

   public static class07438 N(class07438 var0, Optional<class07438> var1, class07438 var2) {
      return var1.isEmpty() ? var2 : N(var0, (class07438)var1.get(), var2);
   }

   public static boolean N(class07438 var0) {
      return var0.method_18868().N(class05378.j);
   }

   @Nullable
   public static class06889 N(class07475 var0, int var1, int var2) {
      class06889 class06889 = class05475.N(var0, var1, var2);
      int i = 0;

      while (class06889 != null && !var0.method_73183().method_8320(class07209.method_49638(class06889)).N(class08791.field_48) && i++ < 10) {
         class06889 = class05475.N(var0, var1, var2);
      }

      return class06889;
   }

   public static void N(class07438 var0, class07049 var1, float var2, int var3) {
      N(var0, new class05751(var1, true), var2, var3);
   }

   public static void N(class07438 var0, class07438 var1) {
      var0.method_18868().N(class05378.P, new class05751(var1, true));
   }

   private static boolean N(class01289<?> var0, class05378<? extends class07438> var1, Predicate<class07438> var2) {
      return var0.<class07438>L(var1).filter(var2).filter(class07438::method_5805).filter(var1x -> N(var0, var1x)).isPresent();
   }

   public static boolean N(class01289<?> var0, class05378<? extends class07438> var1, class07078<?> var2) {
      return N(var0, var1, var1x -> var1x.method_5864() == var2);
   }

   public static boolean N(class01289<?> var0, class07438 var1) {
      Optional<class04051> optional = var0.L(class05378.B);
      return optional.isPresent() && optional.get().N(var1);
   }

   public static void N(class07438 var0, class07438 var1, float var2, int var3) {
      L(var0, var1);
      y(var0, var1, var2, var3);
   }

   public static boolean N(class07079 var0, class07438 var1, int var2) {
      if (var0.method_6047().B() instanceof class06577 class06577 && var0.y(var0.method_6047())) {
         int i = class06577.y() - var2;
         return var0.method_24516(var1, i);
      } else {
         return var0.L(var1);
      }
   }

   public static class01296 N(class04782 var0, class01296 var1, int var2) {
      int i = var0.method_19498(var1);
      return class01296.N(var1, var2).filter(var2x -> var0.method_19498(var2x) < i).min(Comparator.comparingInt(var0::method_19498)).orElse(var1);
   }

   public static void N(class07438 var0, class06584 var1, class06889 var2, class06889 var3, float var4) {
      double d0 = var0.method_23320() - var4;
      class00717 class00717 = new class00717(var0.method_73183(), var0.method_23317(), d0, var0.method_23321(), var1);
      class00717.N(var0);
      class06889 class06889 = var2.u(var0.method_73189());
      class06889 = class06889.u().u(var3.M, var3.B, var3.Z);
      class00717.method_18799(class06889);
      class00717.L();
      var0.method_73183().method_8649(class00717);
   }

   public static void N(class07438 var0, class06584 var1, class06889 var2) {
      class06889 class06889 = new class06889(0.3F, 0.3F, 0.3F);
      N(var0, var1, var2, class06889, 0.3F);
   }

   public static void N(class07438 var0, class05779 var1, float var2, int var3) {
      class05352 class05352 = new class05352(var1, var2, var3);
      var0.method_18868().N(class05378.P, var1);
      var0.method_18868().N(class05378.m, class05352);
   }

   public static void N(class07438 var0, class07209 var1, float var2, int var3) {
      N(var0, new class05744(var1), var2, var3);
   }
}
