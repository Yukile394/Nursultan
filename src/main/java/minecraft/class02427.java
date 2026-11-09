package minecraft;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import org.jspecify.annotations.Nullable;

public class class02427 {
   public static final int N = 105;
   public static final int y = 10;
   private static final int L = 5;
   private final class01590 u;
   @Nullable
   private class04681 i;
   private String R = "root";
   private int M = 0;

   public class02427(class01590 var1) {
      super();
      this.u = var1;
   }

   public void y(int var1) {
      if (this.i != null) {
         List<class05005> list = this.i.N(this.R);
         if (!list.isEmpty()) {
            class05005 class05005 = list.remove(0);
            if (var1 == 0) {
               if (!class05005.u.isEmpty()) {
                  int ix = this.R.lastIndexOf(30);
                  if (ix >= 0) {
                     this.R = this.R.substring(0, ix);
                  }
               }
            } else {
               var1--;
               if (var1 < list.size() && !"unspecified".equals(list.get(var1).u)) {
                  if (!this.R.isEmpty()) {
                     this.R = this.R + "\u001e";
                  }

                  this.R = this.R + list.get(var1).u;
               }
            }
         }
      }
   }

   public void N(@Nullable class04681 var1) {
      this.i = var1;
   }

   public void N(class01054 var1) {
      if (this.i != null) {
         List<class05005> list = this.i.N(this.R);
         class05005 class05005 = list.removeFirst();
         int ix = var1.N() - 105 - 10;
         int j = ix - 105;
         int k = ix + 105;
         int l = list.size() * 9;
         int i1 = var1.y() - this.M - 5;
         int j1 = i1 - l;
         byte b0 = 62;
         int k1 = j1 - 62 - 5;
         var1.N(j - 5, k1 - 62 - 5, k + 5, i1 + 5, -1873784752);
         var1.N(list, j, k1 - 62 + 10, k, k1 + 62);
         DecimalFormat decimalformat = new DecimalFormat("##0.00", DecimalFormatSymbols.getInstance(Locale.ROOT));
         String s = class04681.y(class05005.u);
         String s1 = "";
         if (!"unspecified".equals(s)) {
            s1 = s1 + "[0] ";
         }

         if (s.isEmpty()) {
            s1 = s1 + "ROOT ";
         } else {
            s1 = s1 + s + " ";
         }

         byte b1 = -1;
         int l1 = k1 - 62;
         var1.y(this.u, s1, j, l1, -1);
         s1 = decimalformat.format(class05005.y) + "%";
         var1.y(this.u, s1, k - this.u.y(s1), l1, -1);

         for (int i2 = 0; i2 < list.size(); i2++) {
            class05005 class05005x = list.get(i2);
            StringBuilder stringbuilder = new StringBuilder();
            if ("unspecified".equals(class05005x.u)) {
               stringbuilder.append("[?] ");
            } else {
               stringbuilder.append("[").append(i2 + 1).append("] ");
            }

            String s2 = stringbuilder.append(class05005x.u).toString();
            int j2 = j1 + i2 * 9;
            var1.y(this.u, s2, j, j2, class05005x.N());
            s2 = decimalformat.format(class05005x.N) + "%";
            var1.y(this.u, s2, k - 50 - this.u.y(s2), j2, class05005x.N());
            s2 = decimalformat.format(class05005x.y) + "%";
            var1.y(this.u, s2, k - this.u.y(s2), j2, class05005x.N());
         }
      }
   }

   public void N(int var1) {
      this.M = var1;
   }
}
