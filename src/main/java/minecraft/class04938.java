package minecraft;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public interface class04938 {
   DecimalFormat N = new DecimalFormat("########0.00", DecimalFormatSymbols.getInstance(Locale.ROOT));
   class04938 y = NumberFormat.getIntegerInstance(Locale.US)::format;
   class04938 L = var0 -> N.format(var0 * 0.1);
   class04938 u = var0 -> {
      double d0 = var0 / 100.0;
      double d1 = d0 / 1000.0;
      if (d1 > 0.5) {
         return N.format(d1) + " km";
      } else {
         return d0 > 0.5 ? N.format(d0) + " m" : var0 + " cm";
      }
   };
   class04938 i = var0 -> {
      double d0 = var0 / 20.0;
      double d1 = d0 / 60.0;
      double d2 = d1 / 60.0;
      double d3 = d2 / 24.0;
      double d4 = d3 / 365.0;
      if (d4 > 0.5) {
         return N.format(d4) + " y";
      } else if (d3 > 0.5) {
         return N.format(d3) + " d";
      } else if (d2 > 0.5) {
         return N.format(d2) + " h";
      } else {
         return d1 > 0.5 ? N.format(d1) + " min" : d0 + " s";
      }
   };

   String format(int var1);
}
