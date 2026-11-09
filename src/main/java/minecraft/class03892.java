package minecraft;

import java.util.function.BiFunction;

public enum class03892 implements class05033 {
   field_36544("add"),
   field_36545("mul"),
   field_36546("min"),
   field_36547("max");

   final class03979<class03871> field_37111 = class03865.N(
      (BiFunction<class03877, class03877, class03871>)((var1x, var2x) -> class03871.N(this, var1x, var2x)), class03871::i, class03871::W
   );
   private final String field_37112;

   private class03892(String var3) {
      this.field_37112 = var3;
   }

   @Override
   public String method_15434() {
      return this.field_37112;
   }
}
