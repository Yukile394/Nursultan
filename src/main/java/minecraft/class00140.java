package minecraft;

public enum class00140 {
   field_21858("front"),
   field_21859("side");

   private final String field_21860;

   private class00140(String var3) {
      this.field_21860 = var3;
   }

   public boolean N() {
      return this == field_21859;
   }

   public static class00140 N(String var0) {
      for (class00140 class00140 : values()) {
         if (class00140.field_21860.equals(var0)) {
            return class00140;
         }
      }

      throw new IllegalArgumentException("Invalid gui light: " + var0);
   }
}
