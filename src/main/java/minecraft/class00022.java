package minecraft;

import org.jspecify.annotations.Nullable;

public enum class00022 {
   field_5474("file"),
   field_5473("event");

   private final String field_5472;

   private class00022(String var3) {
      this.field_5472 = var3;
   }

   @Nullable
   public static class00022 N(String var0) {
      for (class00022 class00022 : values()) {
         if (class00022.field_5472.equals(var0)) {
            return class00022;
         }
      }

      return null;
   }
}
