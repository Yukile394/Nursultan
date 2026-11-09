package minecraft;

import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public enum class03086 implements class05033 {
   field_39780("secure"),
   field_39781("modified"),
   field_39782("not_secure");

   public static final Codec<class03086> field_40801 = class05033.N(class03086::values);
   private final String field_40802;

   private class03086(String var3) {
      this.field_40802 = var3;
   }

   @Nullable
   public class03054 N(class03926 var1) {
      return switch (this) {
         case field_39781 -> class03054.N(var1.L());
         case field_39782 -> class03054.L();
         default -> null;
      };
   }

   private static boolean N(class00405 var0) {
      return !var0.E().equals(class00949.y);
   }

   public static class03086 N(class03926 var0, class00392 var1, Instant var2) {
      if (!var0.Z() || var0.y(var2)) {
         return field_39782;
      } else {
         return N(var0, var1) ? field_39781 : field_39780;
      }
   }

   private static boolean N(class03926 var0, class00392 var1) {
      if (!var1.getString().contains(var0.L())) {
         return true;
      } else {
         class00392 class00392 = var0.m();
         return class00392 == null ? false : N(class00392);
      }
   }

   private static boolean N(class00392 var0) {
      return var0.<Boolean>N((var0x, var1) -> N(var0x) ? Optional.of(true) : Optional.empty(), class00405.N).orElse(false);
   }

   public boolean N() {
      return this == field_39782;
   }

   @Override
   public String method_15434() {
      return this.field_40802;
   }
}
