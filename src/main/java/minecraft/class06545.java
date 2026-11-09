package minecraft;

import java.util.Map;
import org.jspecify.annotations.Nullable;

public class class06545 extends class05765<class07475> {
   double N;
   float y;

   private boolean L(class07475 var1) {
      class07438 class07438 = this.y(var1);
      return var1.method_5649(class07438.method_23317(), class07438.method_23318(), class07438.method_23321()) > this.y;
   }

   protected void L(class04782 var1, class07475 var2, long var3) {
      class07438 class07438 = this.y(var2);
      class07049 class07049 = var2.method_5668();
      float f = 1.0F;
      if (class07049 instanceof class07079) {
         f = ((class07079)class07049).K_();
      }

      var2.method_18868().N(class05378.P, new class05751(class07438, true));
      var2.f().N(class07438, f * this.N);
   }

   public class06545(double var1, float var3) {
      super(Map.of(class05378.NE, class05367.field_18457));
      this.N = var1;
      this.y = var3 * var3;
   }

   protected void u(class04782 var1, class07475 var2, long var3) {
      var2.f().W();
      var2.method_18868().N(class05378.NE, class06537.field_64630);
   }

   @Nullable
   private class07438 y(class07475 var1) {
      return var1.method_18868().L(class05378.s).orElse(null);
   }

   protected boolean y(class04782 var1, class07475 var2, long var3) {
      return this.N(var2) && this.L(var2);
   }

   @Override
   protected boolean N(long var1) {
      return false;
   }

   private boolean N(class07475 var1) {
      return this.y(var1) != null && var1.method_6047().L(class02484.X);
   }

   protected void N(class04782 var1, class07475 var2, long var3) {
      var2.R(true);
      var2.method_18868().N(class05378.NE, class06537.field_64629);
      super.u(var1, var2, var3);
   }

   protected boolean N(class04782 var1, class07475 var2) {
      return this.N(var2) && !var2.method_6115();
   }
}
