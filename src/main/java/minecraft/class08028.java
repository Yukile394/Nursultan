package minecraft;

import java.util.List;

public class class08028 extends class08039 {
   public static final float u = 4.0F;

   public class08028(class07078<? extends class08028> var1, class07299 var2) {
      super(var1, var2);
   }

   public class08028(class07299 var1, class07438 var2, class06889 var3) {
      super(class07078.c, var2, var3, var1);
   }

   @Override
   protected class07126 u() {
      return class00473.N(class07107.Z, 1.0F);
   }

   @Override
   protected void N(class07089 var1) {
      super.N(var1);
      if (var1.N() != class07113.field_1331 || !this.u(((class06145)var1).L())) {
         if (!this.method_73183().method_8608()) {
            List<class07438> list = this.method_73183().N(class07438.class, this.method_5829().L(4.0, 2.0, 4.0));
            class07048 class07048 = new class07048(this.method_73183(), this.method_23317(), this.method_23318(), this.method_23321());
            class07049 class07049 = this.z();
            if (class07049 instanceof class07438) {
               class07048.N((class07438)class07049);
            }

            class07048.N(class00473.N(class07107.Z, 1.0F));
            class07048.N(3.0F);
            class07048.N(600);
            class07048.u((7.0F - class07048.N()) / class07048.u());
            class07048.y(0.25F);
            class07048.N(new class07055(class07047.M, 1, 1));
            if (!list.isEmpty()) {
               for (class07438 class07438 : list) {
                  if (this.method_5858(class07438) < 16.0) {
                     class07048.method_5814(class07438.method_23317(), class07438.method_23318(), class07438.method_23321());
                     break;
                  }
               }
            }

            this.method_73183().N(2006, this.method_24515(), this.method_5701() ? -1 : 1);
            this.method_73183().method_8649(class07048);
            this.method_31472();
         }
      }
   }

   @Override
   protected boolean ad_() {
      return false;
   }
}
