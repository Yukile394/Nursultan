package minecraft;

public enum class02019 implements class05033 {
   field_55158("wall"),
   field_55159("ceiling"),
   field_55160("ceiling_middle");

   private final String field_55161;

   private class02019(String var3) {
      this.field_55161 = var3;
   }

   public static class02019 N(class00500 var0) {
      if (var0.i() instanceof class03787) {
         return var0.L(class06665.N) ? field_55160 : field_55159;
      } else {
         return field_55158;
      }
   }

   @Override
   public String method_15434() {
      return this.field_55161;
   }
}
