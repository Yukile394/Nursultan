package minecraft;

public enum class08059 implements class05033 {
   field_12609(class07211.field_11033),
   field_12607(class07211.field_11036);

   private final class07211 field_47101;

   private class08059(class07211 var3) {
      this.field_47101 = var3;
   }

   @Override
   public String toString() {
      return this.method_15434();
   }

   public class08059 y() {
      return this == field_12609 ? field_12607 : field_12609;
   }

   public class07211 N() {
      return this.field_47101;
   }

   @Override
   public String method_15434() {
      return this == field_12609 ? "upper" : "lower";
   }
}
