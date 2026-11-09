package minecraft;

public enum class08075 implements class05033 {
   field_12686("up"),
   field_12689("side"),
   field_12687("none");

   private final String field_12685;

   private class08075(String var3) {
      this.field_12685 = var3;
   }

   @Override
   public String toString() {
      return this.method_15434();
   }

   public boolean N() {
      return this != field_12687;
   }

   @Override
   public String method_15434() {
      return this.field_12685;
   }
}
