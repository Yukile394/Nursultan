package minecraft;

import org.jspecify.annotations.Nullable;

public enum class00073 {
   field_60233(1, "icon/ping_5"),
   field_60234(2, "icon/ping_4"),
   field_60235(3, "icon/ping_3"),
   field_60236(4, "icon/ping_2"),
   field_60237(5, "icon/ping_unknown");

   final int field_60238;
   private final class01894 field_60239;

   private class00073(int var3, String var4) {
      this.field_60238 = var3;
      this.field_60239 = class01894.y(var4);
   }

   public class01894 y() {
      return this.field_60239;
   }

   public int N() {
      return this.field_60238;
   }

   @Nullable
   public static class00073 N(int var0) {
      for (class00073 class00073 : values()) {
         if (class00073.N() == var0) {
            return class00073;
         }
      }

      return null;
   }
}
