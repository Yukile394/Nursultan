package minecraft;

public class class08021 extends class08005 {
   @Override
   public void method_31471(class07276 var1) {
      super.method_31471(var1);
      class06889 class06889 = var1.Z();

      for (int i = 0; i < 7; i++) {
         double d0 = 0.4 + 0.1 * i;
         this.method_73183()
            .method_8406(class07107.NE, this.method_23317(), this.method_23318(), this.method_23321(), class06889.M * d0, class06889.B, class06889.Z * d0);
      }

      this.method_18799(class06889);
   }

   @Override
   protected void method_5693(class04293 var1) {
   }

   @Override
   public void method_5773() {
      super.method_5773();
      class06889 class06889 = this.method_18798();
      class07089 class07089 = class08038.N(this, this::N);
      this.y(class07089);
      double d0 = this.method_23317() + class06889.M;
      double d1 = this.method_23318() + class06889.B;
      double d2 = this.method_23321() + class06889.Z;
      this.T();
      float f = 0.99F;
      if (this.method_73183().N(this.method_5829()).noneMatch(class01339::P)) {
         this.method_31472();
      } else if (this.method_5799()) {
         this.method_31472();
      } else {
         this.method_18799(class06889.L(0.99F));
         this.method_56990();
         this.method_5814(d0, d1, d2);
      }
   }

   @Override
   protected double method_7490() {
      return 0.06;
   }

   public class08021(class07078<? extends class08021> var1, class07299 var2) {
      super(var1, var2);
   }

   public class08021(class07299 var1, class00683 var2) {
      this(class07078.NO, var1);
      this.L(var2);
      this.method_5814(
         var2.method_23317() - (var2.method_17681() + 1.0F) * 0.5 * class04995.m(var2.fields_4212a028292fd3c078969e3ee4c71d9e8_0 * (float) (Math.PI / 180.0)),
         var2.method_23320() - 0.1F,
         var2.method_23321() + (var2.method_17681() + 1.0F) * 0.5 * class04995.P(var2.fields_4212a028292fd3c078969e3ee4c71d9e8_0 * (float) (Math.PI / 180.0))
      );
   }

   @Override
   protected void N(class06183 var1) {
      super.N(var1);
      if (!this.method_73183().method_8608()) {
         this.method_31472();
      }
   }

   @Override
   protected void N(class06145 var1) {
      super.N(var1);
      if (this.z() instanceof class07438 class07438) {
         class07049 class07049 = var1.L();
         class07072 class07072 = this.method_48923().y(this, class07438);
         if (this.method_73183() instanceof class04782 class04782 && class07049.method_64397(class04782, class07072, 1.0F)) {
            class07323.N(class04782, class07049, class07072);
         }
      }
   }
}
