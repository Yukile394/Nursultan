package minecraft;

public class class07530 extends class07150 {
   private float N = 0.5F;
   private int y;
   private static final class02131<Byte> L = class03289.N(class07530.class, class02154.N);

   public static class05300 M() {
      return class07150.Y().N(class05298.u, 6.0).N(class05298.l, 0.23F).N(class05298.P, 48.0);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(L, (byte)0);
   }

   @Override
   public boolean method_5809() {
      return this.B();
   }

   @Override
   public float method_5718() {
      return 1.0F;
   }

   public class07530(class07078<? extends class07530> var1, class07299 var2) {
      super(var1, var2);
      this.N(class04425.field_18, -1.0F);
      this.N(class04425.field_14, 8.0F);
      this.N(class04425.field_9, 0.0F);
      this.N(class04425.field_3, 0.0F);
      this.J = 10;
   }

   private boolean B() {
      return (this.field_6011.N(L) & 1) != 0;
   }

   @Override
   protected class04891 s() {
      return class04909.Lj;
   }

   void N(boolean var1) {
      byte b0 = this.field_6011.N(L);
      if (var1) {
         b0 = (byte)(b0 | 1);
      } else {
         b0 = (byte)(b0 & -2);
      }

      this.field_6011.N(L, b0);
   }

   @Override
   protected void N(class04782 var1) {
      this.y--;
      if (this.y <= 0) {
         this.y = 100;
         this.N = (float)this.field_5974.N(0.5, 6.891);
      }

      class07438 class07438 = this.T();
      if (class07438 != null && class07438.method_23320() > this.method_23320() + this.N && this.method_18395(class07438)) {
         class06889 class06889 = this.method_18798();
         this.method_18799(this.method_18798().y(0.0, (0.3F - class06889.B) * 0.3F, 0.0));
         this.field_64356 = true;
      }

      super.N(var1);
   }

   @Override
   protected void l_() {
      this.e.N(4, new class07565(this));
      this.e.N(5, new class07976(this, 1.0));
      this.e.N(7, new class07957(this, 1.0, 0.0F));
      this.e.N(8, new class07962(this, class08036.class, 8.0F));
      this.e.N(8, new class07956(this));
      this.H.N(1, new class07989(this).N());
      this.H.N(2, new class07952<>(this, class08036.class, true));
   }

   @Override
   public class04891 method_6002() {
      return class04909.Ln;
   }

   @Override
   public void method_6007() {
      if (!this.method_24828() && this.method_18798().B < 0.0) {
         this.method_18799(this.method_18798().u(1.0, 0.6, 1.0));
      }

      if (this.method_73183().method_8608()) {
         if (this.field_5974.y(24) == 0 && !this.method_5701()) {
            this.method_73183()
               .method_8486(
                  this.method_23317() + 0.5,
                  this.method_23318() + 0.5,
                  this.method_23321() + 0.5,
                  class04909.Lv,
                  this.method_5634(),
                  1.0F + this.field_5974.z(),
                  this.field_5974.z() * 0.7F + 0.3F,
                  false
               );
         }

         for (int i = 0; i < 2; i++) {
            this.method_73183().method_8406(class07107.Ny, this.method_23322(0.5), this.method_23319(), this.method_23325(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.method_6007();
   }

   @Override
   public boolean method_29503() {
      return true;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.Lt;
   }
}
