package minecraft;

enum class06430 {
   field_13457("GRANT", 0, "grant") {
      @Override
      protected boolean N(class04770 var1, class03711 var2) {
         class08019 class08019 = var1.method_14236().y(var2);
         if (class08019.N()) {
            return false;
         } else {
            for (String s : class08019.i()) {
               var1.method_14236().N(var2, s);
            }

            return true;
         }
      }

      @Override
      protected boolean N(class04770 var1, class03711 var2, String var3) {
         return var1.method_14236().N(var2, var3);
      }
   },
   field_13456("REVOKE", 1, "revoke") {
      @Override
      protected boolean N(class04770 var1, class03711 var2) {
         class08019 class08019 = var1.method_14236().y(var2);
         if (!class08019.y()) {
            return false;
         } else {
            for (String s : class08019.R()) {
               var1.method_14236().y(var2, s);
            }

            return true;
         }
      }

      @Override
      protected boolean N(class04770 var1, class03711 var2, String var3) {
         return var1.method_14236().y(var2, var3);
      }
   };

   private final String field_13454;

   class06430(String var3) {
      this.field_13454 = "commands.advancement." + var3;
   }

   protected String N() {
      return this.field_13454;
   }

   protected abstract boolean N(class04770 var1, class03711 var2);

   protected abstract boolean N(class04770 var1, class03711 var2, String var3);

   public int N(class04770 var1, Iterable<class03711> var2, boolean var3) {
      int i = 0;
      if (!var3) {
         var1.method_14236().N(var1, true);
      }

      for (class03711 class03711 : var2) {
         if (this.N(var1, class03711)) {
            i++;
         }
      }

      if (!var3) {
         var1.method_14236().N(var1, false);
      }

      return i;
   }
}
