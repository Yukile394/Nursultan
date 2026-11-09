package minecraft;

public enum class06657 implements class05033 {
   field_12475("floor"),
   field_12471("wall"),
   field_12473("ceiling");

   private final String field_12472;

   private class06657(String var3) {
      this.field_12472 = var3;
   }

   @Override
   public String method_15434() {
      return this.field_12472;
   }
}
