package minecraft;

public enum class05648 implements class05033 {
   field_17098("floor"),
   field_17099("ceiling"),
   field_17100("single_wall"),
   field_17101("double_wall");

   private final String field_17102;

   private class05648(String var3) {
      this.field_17102 = var3;
   }

   @Override
   public String method_15434() {
      return this.field_17102;
   }
}
