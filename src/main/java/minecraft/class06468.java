package minecraft;

public enum class06468 {
   field_62004("MESSAGE", 0, "") {
      @Override
      public boolean N(class06450 var1) {
         return true;
      }
   },
   field_62005("COMMAND", 1, "/") {
      @Override
      public boolean N(class06450 var1) {
         return this == var1.y();
      }
   };

   private final String field_62006;

   class06468(String var3) {
      this.field_62006 = var3;
   }

   public abstract boolean N(class06450 var1);

   public String N() {
      return this.field_62006;
   }
}
