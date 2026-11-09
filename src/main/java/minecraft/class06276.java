package minecraft;

public enum class06276 implements class05033 {
   field_61593("alwaysOn"),
   field_61594("inOverlay"),
   field_61595("never");

   public static final class05031<class06276> field_61596 = class05033.N(class06276::values);
   private final String field_61597;

   private class06276(String var3) {
      this.field_61597 = var3;
   }

   @Override
   public String method_15434() {
      return this.field_61597;
   }
}
