package minecraft;

public enum class08080 implements class05033 {
   field_12665("north_south"),
   field_12674("east_west"),
   field_12667("ascending_east"),
   field_12666("ascending_west"),
   field_12670("ascending_north"),
   field_12668("ascending_south"),
   field_12664("south_east"),
   field_12671("south_west"),
   field_12672("north_west"),
   field_12663("north_east");

   private final String field_12669;

   private class08080(String var3) {
      this.field_12669 = var3;
   }

   @Override
   public String toString() {
      return this.field_12669;
   }

   public boolean y() {
      return this == field_12670 || this == field_12667 || this == field_12668 || this == field_12666;
   }

   public String N() {
      return this.field_12669;
   }

   @Override
   public String method_15434() {
      return this.field_12669;
   }
}
