package minecraft;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import org.jspecify.annotations.Nullable;

public class class04240 extends class08813 {
   private static final int N = 32;
   private static final String y = "telemetry.event.required";
   private static final String L = "telemetry.event.optional";
   private static final String u = "telemetry.event.optional.disabled";
   private static final class00392 i = class00392.L("telemetry_info.property_title").N(class06541.field_1073);
   private final class01590 R;
   private class04229 M;
   @Nullable
   private DoubleConsumer B;

   private int L() {
      return this.field_22758 - this.method_65512();
   }

   public class04240(int var1, int var2, int var3, int var4, class01590 var5) {
      super(var1, var2, var3, var4, class00392.i());
      this.R = var5;
      this.M = this.y(class06202.Nq().yz());
   }

   private class04229 y(boolean var1) {
      class04217 class04217 = new class04217(this.L());
      ArrayList arraylist = new ArrayList<>(class02129.M());
      arraylist.sort(Comparator.comparing(class02129::u));

      for (int ix = 0; ix < arraylist.size(); ix++) {
         class02129 class02129 = (class02129)arraylist.get(ix);
         boolean flag = class02129.u() && !var1;
         this.N(class04217, class02129, flag);
         if (ix < arraylist.size() - 1) {
            class04217.N(9);
         }
      }

      return class04217.N();
   }

   public void y() {
      this.M = this.y(class06202.Nq().yz());
      this.method_65506();
   }

   private void N(class02129 var1, class04217 var2, boolean var3) {
      for (class02117<?> class02117 : var1.y()) {
         var2.N(this.R, this.N(class02117.N(), var3));
      }
   }

   private void N(class04217 var1, class02129 var2, boolean var3) {
      String s = var2.u() ? (var3 ? "telemetry.event.optional.disabled" : "telemetry.event.optional") : "telemetry.event.required";
      var1.y(this.R, this.N(class00392.N(s, var2.i()), var3));
      var1.y(this.R, var2.R().N(class06541.field_1080));
      var1.N(4);
      var1.N(this.R, this.N(i, var3), 2);
      this.N(var2, var1, var3);
   }

   private class00392 N(class00392 var1, boolean var2) {
      return (class00392)(var2 ? var1.L().N(class06541.field_1080) : var1);
   }

   public void N(boolean var1) {
      this.M = this.y(var1);
      this.method_65506();
   }

   public void N(@Nullable DoubleConsumer var1) {
      this.B = var1;
   }

   @Override
   protected void method_44389(class01054 var1, int var2, int var3, float var4) {
      int ix = this.method_65514();
      int j = this.method_65513();
      var1.i().pushMatrix();
      var1.i().translate(j, ix);
      this.M.N().method_48206(var4x -> var4x.method_25394(var1, var2, var3, var4));
      var1.i().popMatrix();
   }

   @Override
   protected int method_44391() {
      return this.M.N().method_25364();
   }

   @Override
   public void method_44382(double var1) {
      super.method_44382(var1);
      if (this.B != null) {
         this.B.accept(this.method_44387());
      }
   }

   @Override
   protected void method_47399(class03428 var1) {
      var1.N(class03457.field_33788, this.M.y());
   }

   @Override
   protected double method_44393() {
      return 9.0;
   }
}
