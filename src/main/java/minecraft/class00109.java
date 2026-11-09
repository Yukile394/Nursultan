package minecraft;

public class class00109 extends class04708 {
   private final class05129 y;
   private final class00093 L;
   private final class01885 u = class01885.u();

   public class00109(class05096 var1, class00093 var2, class05129 var3) {
      super(var1, var3);
      this.y = var3;
      this.L = var2;
   }

   @Override
   protected void N() {
      this.y.i();
      super.N();
   }

   @Override
   public void method_25426() {
      super.method_25426();
      if (this.L.u() != null && this.L.u().N() != null) {
         class01885 class01885 = class01885.i().N(10);
         class02071 class02071 = new class02071(class00392.N("mco.connect.region", class00392.L(this.L.u().N().field_60201)), this.field_22793);
         class01885.N(class02071);
         class01894 class01894 = this.L.u().y() != null ? this.L.u().y().y() : class00073.field_60237.y();
         class01885.N(class03608.N(10, 8, class01894), class02072::u);
         this.u.N(class01885, var0 -> var0.L(40));
         this.u.method_48206(var1x -> {
            class06478 class06478 = this.method_37063(var1x);
         });
         this.method_48640();
      }
   }

   @Override
   public void method_48640() {
      super.method_48640();
      int i = this.N.method_46427() + this.N.method_25364();
      class03255 class03255 = new class03255(0, i, this.field_22789, this.field_22790 - i);
      this.u.N();
      class02077.N(this.u, class03255, 0.5F, 0.0F);
   }

   @Override
   public void method_25393() {
      super.method_25393();
      this.y.L();
   }
}
