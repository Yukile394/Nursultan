package minecraft;

public enum class01180 {
   field_3409(false, false),
   field_3410(false, false),
   field_3406(false, false),
   field_3403(true, true),
   field_63542(false, true),
   field_3405(true, true),
   field_3408(true, true),
   field_27434(false, false),
   field_39071(false, false),
   field_42877(false, false),
   field_63543("SPEAR", 10, false, true) {
      @Override
      public <S extends class08827> void N(S var1, class01421 var2, float var3, class07070 var4, class06584 var5) {
         class06733.N(var1, var2, var3, var4, var5);
      }
   };

   private final boolean field_25722;
   private final boolean field_64557;

   class01180(boolean var3, boolean var4) {
      this.field_25722 = var3;
      this.field_64557 = var4;
   }

   public boolean y() {
      return this.field_64557;
   }

   public <S extends class08827> void N(S var1, class01421 var2, float var3, class07070 var4, class06584 var5) {
   }

   public boolean N() {
      return this.field_25722;
   }
}
