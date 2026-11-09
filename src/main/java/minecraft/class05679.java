package minecraft;

public enum class05679 implements class05033 {
   field_61599("default", "debug.options.profile.default"),
   field_61600("performance", "debug.options.profile.performance");

   public static final class05031<class05679> field_61601 = class05033.N(class05679::values);
   private final String field_61602;
   private final String field_61603;

   private class05679(String var3, String var4) {
      this.field_61602 = var3;
      this.field_61603 = var4;
   }

   public String N() {
      return this.field_61603;
   }

   @Override
   public String method_15434() {
      return this.field_61602;
   }
}
