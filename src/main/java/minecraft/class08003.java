package minecraft;

import java.util.Optional;

public class class08003 extends class05668 {
   private static final class01325 N = class01325.L(0.0F, 0.0F);

   @Override
   public void method_5711(byte var1) {
      if (var1 == 3) {
         double d0 = 0.08;

         for (int i = 0; i < 8; i++) {
            this.method_73183()
               .method_8406(
                  new class07092(class07107.S, this.L()),
                  this.method_23317(),
                  this.method_23318(),
                  this.method_23321(),
                  (this.field_5974.z() - 0.5) * 0.08,
                  (this.field_5974.z() - 0.5) * 0.08,
                  (this.field_5974.z() - 0.5) * 0.08
               );
         }
      }
   }

   public class08003(class07299 var1, double var2, double var4, double var6, class06584 var8) {
      super(class07078.a, var2, var4, var6, var1, var8);
   }

   public class08003(class07299 var1, class07438 var2, class06584 var3) {
      super(class07078.a, var2, var1, var3);
   }

   public class08003(class07078<? extends class08003> var1, class07299 var2) {
      super(var1, var2);
   }

   @Override
   protected void N(class06145 var1) {
      super.N(var1);
      var1.L().method_64419(this.method_48923().y(this, this.z()), 0.0F);
   }

   @Override
   protected class06581 N() {
      return class06570.jO;
   }

   @Override
   protected void N(class07089 var1) {
      super.N(var1);
      if (!this.method_73183().method_8608()) {
         if (this.field_5974.y(8) == 0) {
            byte b0 = 1;
            if (this.field_5974.y(32) == 0) {
               b0 = 4;
            }

            for (int i = 0; i < b0; i++) {
               class07628 class07628 = class07078.Q.N(this.method_73183(), class06113.field_16461);
               if (class07628 != null) {
                  class07628.u(-24000);
                  class07628.method_5808(this.method_23317(), this.method_23318(), this.method_23321(), this.method_36454(), 0.0F);
                  Optional.ofNullable(this.L().method_58694(class02484.Np)).flatMap(var1x -> var1x.N(this.method_56673())).ifPresent(class07628::N);
                  if (!class07628.method_60490(N)) {
                     break;
                  }

                  this.method_73183().method_8649(class07628);
               }
            }
         }

         this.method_73183().method_8421(this, (byte)3);
         this.method_31472();
      }
   }
}
