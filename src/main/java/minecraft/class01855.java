package minecraft;

public enum class01855 {
   field_45403,
   field_45404;

   private class01855() {
   }

   void N(class02060 var1, int var2) {
      switch (this) {
         case field_45403:
            var1.N(var2);
            break;
         case field_45404:
            var1.y(var2);
      }
   }

   public <T extends class02102> T N(class02060 var1, T var2, int var3, class02072 var4) {
      return (T)(switch (this) {
         case field_45403 -> (class02102)var1.N(var2, 0, var3, var4);
         case field_45404 -> (class02102)var1.N(var2, var3, 0, var4);
      });
   }
}
