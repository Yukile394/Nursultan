package minecraft;

public enum class06008 implements class05033 {
   field_22178("none"),
   field_22179("low"),
   field_22180("tall");

   private final String field_22181;

   private class06008(String var3) {
      this.field_22181 = var3;
   }

   @Override
   public String toString() {
      return this.method_15434();
   }

   @Override
   public String method_15434() {
      return this.field_22181;
   }
}
