package minecraft;

public enum class06638 implements class05033 {
   field_12569("single"),
   field_12574("left"),
   field_12571("right");

   private final String field_12572;

   private class06638(String var3) {
      this.field_12572 = var3;
   }

   public class06638 N() {
      return switch (this) {
         case field_12569 -> field_12569;
         case field_12574 -> field_12571;
         case field_12571 -> field_12574;
      };
   }

   @Override
   public String method_15434() {
      return this.field_12572;
   }
}
