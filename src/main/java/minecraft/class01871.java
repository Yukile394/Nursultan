package minecraft;

public class class01871 extends class05096 {
   private static final int N = 600;
   private final class00642 y;
   private class05362 L;
   private int u;
   private final class01885 i = class01885.u();

   public class01871(class00392 var1, class00642 var2) {
      super(var1);
      this.y = var2;
   }

   @Override
   public void method_25426() {
      this.i.L().y().N(10);
      this.i.N(new class02071(this.field_22785, this.field_22793));
      this.L = this.i.N(class05362.method_46430(class05220.T, var1 -> this.y.method_10747(class05763.y)).N());
      this.L.field_22763 = false;
      this.i.N();
      this.i.method_48206(var1 -> {
         class06478 class06478 = this.method_37063(var1);
      });
      this.method_48640();
   }

   @Override
   public boolean method_25422() {
      return false;
   }

   @Override
   public void method_48640() {
      class02077.N(this.i, this.method_48202());
   }

   @Override
   public void method_25393() {
      super.method_25393();
      this.u++;
      if (this.u == 600) {
         this.L.field_22763 = true;
      }

      if (this.y.method_10758()) {
         this.y.method_10754();
      } else {
         this.y.method_10768();
      }
   }
}
