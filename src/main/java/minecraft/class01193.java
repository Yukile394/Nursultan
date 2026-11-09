package minecraft;

public enum class01193 implements class05033 {
   field_28121("inactive"),
   field_28122("active"),
   field_44631("cooldown");

   private final String field_28124;

   private class01193(String var3) {
      this.field_28124 = var3;
   }

   @Override
   public String toString() {
      return this.field_28124;
   }

   @Override
   public String method_15434() {
      return this.field_28124;
   }
}
