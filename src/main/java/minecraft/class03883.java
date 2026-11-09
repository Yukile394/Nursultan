package minecraft;

public record class03883(class03891 type, class03877 input, double minValue, double maxValue) implements class03899 {
   @Override
   public class03979<? extends class03877> L() {
      return this.type.field_37087;
   }

   protected class03883(class03891 type, class03877 input, double minValue, double maxValue) {
      super();
      this.type = type;
      this.input = input;
      this.minValue = minValue;
      this.maxValue = maxValue;
   }

   public class03891 i() {
      return this.type;
   }

   @Override
   public double y() {
      return this.maxValue;
   }

   public class03883 N(class03881 var1) {
      return N(this.type, this.input.N(var1));
   }

   @Override
   public double N(double var1) {
      return N(this.type, var1);
   }

   @Override
   public double N() {
      return this.minValue;
   }

   private static double N(class03891 var0, double var1) {
      return switch (var0) {
         case field_36555 -> Math.abs(var1);
         case field_36556 -> var1 * var1;
         case field_36557 -> var1 * var1 * var1;
         case field_36558 -> var1 > 0.0 ? var1 : var1 * 0.5;
         case field_36559 -> var1 > 0.0 ? var1 : var1 * 0.25;
         case field_61470 -> 1.0 / var1;
         case field_36560 -> {
            double d0 = class04995.N(var1, -1.0, 1.0);
            yield d0 / 2.0 - d0 * d0 * d0 / 24.0;
         }
      };
   }

   public static class03883 N(class03891 var0, class03877 var1) {
      double d0 = var1.N();
      double d1 = var1.y();
      double d2 = N(var0, d0);
      double d3 = N(var0, d1);
      if (var0 == class03891.field_61470) {
         return d0 < 0.0 && d1 > 0.0 ? new class03883(var0, var1, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY) : new class03883(var0, var1, d3, d2);
      } else {
         return var0 != class03891.field_36555 && var0 != class03891.field_36556
            ? new class03883(var0, var1, d2, d3)
            : new class03883(var0, var1, Math.max(0.0, d0), Math.max(d2, d3));
      }
   }

   @Override
   public class03877 az_() {
      return this.input;
   }
}
