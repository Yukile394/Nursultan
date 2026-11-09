package minecraft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class class04589 extends class05096 {
   private static final class00392 M = class00392.L("debug.options.title");
   private static final class00392 B = class00392.L("debug.options.warning").y(-2142128);
   public static final class00392 N = class00392.L("debug.entry.always");
   public static final class00392 y = class00392.L("debug.entry.overlay");
   public static final class00392 L = class05220.L;
   public static final class00392 u = class00392.L("debug.options.notAllowed.tooltip");
   private static final class00392 Z = class00392.L("debug.options.search").L(class04927.field_62466);
   final class03686 i = new class03686(this, 61, 33);
   private class05980 z;
   private class04927 U;
   public final List<class05362> R = new ArrayList<>();

   public class04589() {
      super(M);
   }

   private void N(class05679 var1, class01885 var2) {
      class05362 class05362 = class05362.method_46430(class00392.L(var1.N()), var2x -> {
         ((class05731)this.field_22787.L_0).N(var1);
         ((class05731)this.field_22787.L_0).M();
         this.z.y();
         Iterator<class05362> iterator = this.R.iterator();

         while (iterator.hasNext()) {
            iterator.next().field_22763 = true;
         }

         var2x.field_22763 = false;
      }).N(120).N();
      class05362.field_22763 = !((class05731)this.field_22787.L_0).y(var1);
      this.R.add(class05362);
      var2.N(class05362);
   }

   public class05980 N() {
      return this.z;
   }

   @Override
   public void method_25426() {
      class01885 class01885xx = this.i.N(class01885.u().N(8));
      this.z = new class05980(this);
      int ix = this.z.method_25322();
      class01885 class01885x = class01885.i().N(8);
      class01885x.N(new class02057(ix / 3, 1));
      class01885x.N(new class02071(M, this.field_22793), class01885x.y().i());
      this.U = new class04927(this.field_22793, 0, 0, ix / 3, 20, this.U, Z);
      this.U.method_1863(var1x -> this.z.N(var1x));
      this.U.method_47404(Z);
      class01885x.N(this.U);
      class01885xx.N(class01885x, class02072::y);
      class01885xx.N(new class04230(B, this.field_22793).N(ix).N(true), class02072::y);
      this.i.L(this.z);
      class01885 class01885xx = this.i.y(class01885.i().N(8));
      this.N(class05679.field_61599, class01885xx);
      this.N(class05679.field_61600, class01885xx);
      class01885xx.N(class05362.method_46430(class05220.u, var1x -> this.method_25419()).N(60).N());
      this.i.method_48206(var1x -> {
         class06478 class06478 = this.method_37063(var1x);
      });
      this.method_48640();
   }

   @Override
   protected void method_56131() {
      this.method_48265(this.U);
   }

   @Override
   public void method_48640() {
      this.i.N();
      if (this.z != null) {
         this.z.method_57712(this.field_22789, this.i);
      }
   }

   @Override
   public void method_57734(class01054 var1) {
      ((class01056)this.field_22787.i_6).N(var1);
      super.method_57734(var1);
   }
}
