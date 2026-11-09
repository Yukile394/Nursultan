package minecraft;

import org.jspecify.annotations.Nullable;

public record class08035(class00392 message) {
   private static String[] L;
   public static Object y_0 = new class08035(class00392.L(L[0]));
   public static Object y_1 = new class08035(class00392.L(L[1]));
   public static Object y_2 = new class08035(null);
   public static Object y_3 = new class08035(class00392.L(L[2]));

   private static void L() {
      L = new String[3];
      L[0] = "block.minecraft.bed.too_far_away";
      L[1] = "block.minecraft.bed.obstructed";
      L[2] = "block.minecraft.bed.not_safe";
   }

   public class08035(@Nullable class00392 message) {
      this.message = message;
   }

   static {
      L();
      u();
   }

   private static void u() {
   }

   @Nullable
   public class00392 N() {
      return this.message;
   }
}
