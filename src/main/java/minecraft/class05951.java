package minecraft;

public class class05951 extends class06478 {
   final class05949 N;
   private boolean y;

   public class05951(class05949 var1, int var2, int var3) {
      super(var2, var3, 26, 26, var1.field_24581);
      this.N = var1;
   }

   private void y(class01054 var1) {
      var1.N(class08394.Na, class05954.y, this.method_46426(), this.method_46427(), 26, 26);
   }

   public void N(boolean var1) {
      this.y = var1;
   }

   private void N(class01054 var1) {
      var1.N(class08394.Na, class05954.N, this.method_46426(), this.method_46427(), 26, 26);
   }

   @Override
   public boolean method_25367() {
      return super.method_25367() || this.y;
   }

   @Override
   public void method_47399(class03428 var1) {
      this.method_37021(var1);
   }

   @Override
   public void method_48579(class01054 var1, int var2, int var3, float var4) {
      this.N(var1);
      if (this.y) {
         this.y(var1);
      }

      this.N.N(var1, this.method_46426() + 5, this.method_46427() + 5);
   }
}
