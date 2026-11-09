package minecraft;

public enum class06640 implements class05033 {
   field_1472("integer"),
   field_1471("hearts");

   private final String field_1469;
   public static final class05031<class06640> field_41683 = class05033.N(class06640::values);

   private class06640(String var3) {
      this.field_1469 = var3;
   }

   public static class06640 N(String var0) {
      return field_41683.N(var0, field_1472);
   }

   public String N() {
      return this.field_1469;
   }

   @Override
   public String method_15434() {
      return this.field_1469;
   }
}
