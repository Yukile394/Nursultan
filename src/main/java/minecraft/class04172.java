package minecraft;

import java.util.Map;
import java.util.Map.Entry;

public class class04172 implements class01857 {
   final class06202 N;
   private double y = Double.MIN_VALUE;
   private final int L = 12;
   private class04164 u;

   public class04172(class06202 var1) {
      super();
      this.N = var1;
   }

   @Override
   public void N(double var1, double var3, double var5, class00457 var7, class01383 var8, float var9) {
      double d0 = class07536.u();
      if (d0 - this.y > 3.0E9) {
         this.y = d0;
         class08337 var12 = this.N.Na();
         if (var12 != null) {
            this.u = new class04164(this, var12, var1, var5);
         } else {
            this.u = null;
         }
      }

      if (this.u != null) {
         Map<class07321, String> map = this.u.y.getNow(null);
         double d1 = ((class03386)this.N.i_5).s().y().B * 0.85;

         for (Entry entry : this.u.N.entrySet()) {
            class07321 class07321 = (class07321)entry.getKey();
            String s = (String)entry.getValue();
            if (map != null) {
               s = s + map.get(class07321);
            }

            String[] astring = s.split("\n");
            byte b0 = 0;
            String[] astring1 = astring;
            int i = astring.length;

            for (int j = 0; j < i; j++) {
               class06724.N(astring1[j], new class06889(class01296.N(class07321.B, 8), d1 + b0, class01296.N(class07321.Z, 8)), class06715.N().N(2.4F)).N();
               b0 -= 2;
            }
         }
      }
   }
}
