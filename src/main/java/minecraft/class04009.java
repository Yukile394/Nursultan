package minecraft;

import java.util.Arrays;

public enum class04009 {
   field_38120(0, class04909.IN, class04909.IZ),
   field_38121(40, class04909.gr, class04909.Iz),
   field_38122(80, class04909.Iy, class04909.Iz);

   private static final class04009[] field_38123 = class07536.N(
      values(), var0 -> Arrays.sort(var0, (var0x, var1) -> Integer.compare(var1.field_38124, var0x.field_38124))
   );
   private final int field_38124;
   private final class04891 field_38125;
   private final class04891 field_38732;

   public class04891 L() {
      return this.field_38732;
   }

   private class04009(int var3, class04891 var4, class04891 var5) {
      this.field_38124 = var3;
      this.field_38125 = var4;
      this.field_38732 = var5;
   }

   public boolean u() {
      return this == field_38122;
   }

   public class04891 y() {
      return this.field_38125;
   }

   public static class04009 N(int var0) {
      for (class04009 class04009 : field_38123) {
         if (var0 >= class04009.field_38124) {
            return class04009;
         }
      }

      return field_38120;
   }

   public int N() {
      return this.field_38124;
   }
}
