package minecraft;

public enum class06082 implements class05033 {
   field_28718("none", true),
   field_28719("unstable", false),
   field_28720("partial", true),
   field_28721("full", true);

   private final String field_28722;
   private final boolean field_28723;

   private class06082(String var3, boolean var4) {
      this.field_28722 = var3;
      this.field_28723 = var4;
   }

   public boolean N() {
      return this.field_28723;
   }

   @Override
   public String method_15434() {
      return this.field_28722;
   }
}
