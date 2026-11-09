package minecraft;

public class class02626 extends class07049 {
   private static final int y = 60;
   private static final int L = 120;
   private static final String u = "spawn_item_after_ticks";
   private static final String i = "item";
   private static final class02131<class06584> R = class03289.N(class02626.class, class02154.B);
   public static final int N = 36;
   private long M;

   private void L() {
      if (this.method_73183().N() % 5L == 0L) {
         this.N();
      }
   }

   @Override
   public boolean method_5696() {
      return true;
   }

   @Override
   public class04641 method_5657() {
      return class04641.field_15975;
   }

   @Override
   protected void method_5693(class04293 var1) {
      var1.N(R, class06584.E);
   }

   @Override
   public void method_5773() {
      super.method_5773();
      if (this.method_73183() instanceof class04782 class04782) {
         this.N(class04782);
      } else {
         this.L();
      }
   }

   @Override
   public final boolean method_64397(class04782 var1, class07072 var2, float var3) {
      return false;
   }

   @Override
   protected void method_5652(class08329 var1) {
      if (!this.y().R()) {
         var1.N("item", class06584.y, this.y());
      }

      var1.N("spawn_item_after_ticks", this.M);
   }

   @Override
   protected void method_5749(class08299 var1) {
      this.N(var1.<class06584>N("item", class06584.y).orElse(class06584.E));
      this.M = var1.N("spawn_item_after_ticks", 0L);
   }

   @Override
   protected boolean method_5818(class07049 var1) {
      return false;
   }

   @Override
   protected boolean method_48921() {
      return false;
   }

   @Override
   protected void method_5627(class07049 var1) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   public class02626(class07078<? extends class02626> var1, class07299 var2) {
      super(var1, var2);
      this.field_5960 = true;
   }

   private void u() {
      if (this.method_73183() instanceof class04782 class04782) {
         class06584 class06584 = this.y();
         if (!class06584.R()) {
            Object object;
            if (class06584.B() instanceof class02661 class02661) {
               object = this.N(class04782, class02661, class06584);
            } else {
               object = new class00717(class04782, this.method_23317(), this.method_23318(), this.method_23321(), class06584);
               class04782.method_8649((class07049)object);
            }

            class04782.N(3021, this.method_24515(), 1);
            class04782.N((class07049)object, class01194.v, this.method_73189());
            this.N(class06584.E);
         }
      }
   }

   public class06584 y() {
      return this.method_5841().N(R);
   }

   private void N(class06584 var1) {
      this.method_5841().N(R, var1);
   }

   public static class02626 N(class07299 var0, class06584 var1) {
      class02626 class02626 = new class02626(class07078.Np, var0);
      class02626.M = var0.field_9229.N(60, 120);
      class02626.N(var1);
      return class02626;
   }

   private void N(class04782 var1) {
      if (this.field_6012 == this.M - 36L) {
         var1.N(null, this.method_24515(), class04909.mD, class04911.field_15254);
      }

      if (this.field_6012 >= this.M) {
         this.u();
         this.method_5768(var1);
      }
   }

   private class07049 N(class04782 var1, class02661 var2, class06584 var3) {
      class02649 class02649 = var2.N();
      class02649.i().ifPresent(var2x -> var1.N(var2x, this.method_24515(), 0));
      class07211 class07211 = class07211.field_11033;
      class08005 class08005 = class08005.N(
         var2.N(var1, this.method_73189(), var3, class07211), var1, var3, class07211.P(), class07211.s(), class07211.T(), class02649.u(), class02649.L()
      );
      class08005.L(this);
      return class08005;
   }

   public void N() {
      class06889 class06889xx = this.method_73189();
      int ix = this.field_5974.N(1, 3);

      for (int j = 0; j < ix; j++) {
         double d0 = 0.4;
         class06889 class06889x = new class06889(
            this.method_23317() + 0.4 * (this.field_5974.E() - this.field_5974.E()),
            this.method_23318() + 0.4 * (this.field_5974.E() - this.field_5974.E()),
            this.method_23321() + 0.4 * (this.field_5974.E() - this.field_5974.E())
         );
         class06889 class06889xx = class06889xx.N(class06889x);
         this.method_73183()
            .method_8406(class07107.yM, class06889xx.N(), class06889xx.y(), class06889xx.L(), class06889xx.N(), class06889xx.y(), class06889xx.L());
      }
   }
}
