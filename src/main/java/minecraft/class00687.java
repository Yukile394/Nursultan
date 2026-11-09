package minecraft;

import org.jspecify.annotations.Nullable;

public class class00687 extends class07473 {
   private final class00682 N;

   public class00687(class00682 var1) {
      super();
      this.N = var1;
   }

   @Override
   public void i() {
      class04782 class04782 = (class04782)this.N.method_73183();
      class07052 class07052 = class04782.method_8404(this.N.method_24515());
      this.N.N(false);
      this.N.M(true);
      this.N.u(0);
      class00672 class00672 = class07078.NY.N(class04782, class06113.field_16461);
      if (class00672 != null) {
         class00672.method_24203(this.N.method_23317(), this.N.method_23318(), this.N.method_23321());
         class00672.N(true);
         class04782.method_8649(class00672);
         class07146 class07146x = this.N(class07052, this.N);
         if (class07146x != null) {
            class07146x.method_5804(this.N);
            class04782.y(class07146x);

            for (int i = 0; i < 3; i++) {
               class07862 class07862 = this.N(class07052);
               if (class07862 != null) {
                  class07146 class07146x = this.N(class07052, class07862);
                  if (class07146x != null) {
                     class07146x.method_5804(class07862);
                     class07862.method_5762(this.N.method_59922().N(0.0, 1.1485), 0.0, this.N.method_59922().N(0.0, 1.1485));
                     class04782.y(class07862);
                  }
               }
            }
         }
      }
   }

   private void N(class07146 var1, class07085 var2, class07052 var3) {
      class06584 class06584 = var1.method_6118(var2);
      class06584.N(class02484.P, class02710.N);
      class07323.N(class06584, var1.method_73183().method_30349(), class02251.N, var3, var1.method_59922());
      var1.method_5673(var2, class06584);
   }

   @Nullable
   private class07146 N(class07052 var1, class07862 var2) {
      class07146 class07146 = class07078.ym.N(var2.method_73183(), class06113.field_16461);
      if (class07146 != null) {
         class07146.N((class04782)var2.method_73183(), var1, class06113.field_16461, null);
         class07146.method_5814(var2.method_23317(), var2.method_23318(), var2.method_23321());
         class07146.field_6008 = 60;
         class07146.NW();
         if (class07146.method_6118(class07085.field_6169).R()) {
            class07146.method_5673(class07085.field_6169, new class06584(class06570.bT));
         }

         this.N(class07146, class07085.field_6173, var1);
         this.N(class07146, class07085.field_6169, var1);
      }

      return class07146;
   }

   @Nullable
   private class07862 N(class07052 var1) {
      class00682 class00682 = class07078.yP.N(this.N.method_73183(), class06113.field_16461);
      if (class00682 != null) {
         class00682.N((class04782)this.N.method_73183(), var1, class06113.field_16461, null);
         class00682.method_5814(this.N.method_23317(), this.N.method_23318(), this.N.method_23321());
         class00682.field_6008 = 60;
         class00682.NW();
         class00682.M(true);
         class00682.u(0);
      }

      return class00682;
   }

   @Override
   public boolean N() {
      return this.N.method_73183().N(this.N.method_23317(), this.N.method_23318(), this.N.method_23321(), 10.0);
   }
}
