package minecraft;

public enum class03215 {
   field_34412("client"),
   field_34413("server");

   private final String field_34414;

   private class03215(String var3) {
      this.field_34414 = var3;
   }

   public String N() {
      return this.field_34414;
   }

   public static class03215 N(class02796 var0) {
      return var0.z() ? field_34413 : field_34412;
   }
}
