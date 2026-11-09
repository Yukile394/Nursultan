package minecraft;

public class class03392 extends class05724<class03376> {
   public class03392(class03418 var1, class06202 var2) {
      super(var2, var1.field_22789, var1.N(), var1.y.L(), 18);
      this.N = var1;

      for (class03380 class03380 : class03380.values()) {
         if (!class03380.N(var1.L).contains(class03380)) {
            this.method_25321(new class03376(this, class03380));
         }
      }
   }

   public void method_25313(class03376 var1) {
      super.method_25313(var1);
      this.N.N = var1 != null ? var1.N() : null;
   }

   public class03376 N(class03380 var1) {
      return this.method_25396().stream().filter(var1x -> var1x.N == var1).findFirst().orElse(null);
   }

   @Override
   public int method_25322() {
      return 320;
   }
}
