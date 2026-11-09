package minecraft;

record class03901(class03907 specificType, class03877 input, double minValue, double maxValue, double argument) implements class03871, class03899 {
   public double P() {
      return this.argument;
   }

   class03901(class03907 specificType, class03877 input, double minValue, double maxValue, double argument) {
      super();
      this.specificType = specificType;
      this.input = input;
      this.minValue = minValue;
      this.maxValue = maxValue;
      this.argument = argument;
   }

   @Override
   public class03877 i() {
      return class03865.N(this.argument);
   }

   public class03907 m() {
      return this.specificType;
   }

   @Override
   public class03892 u() {
      return this.specificType == class03907.field_36568 ? class03892.field_36545 : class03892.field_36544;
   }

   @Override
   public double y() {
      return this.maxValue;
   }

   @Override
   public class03877 N(class03881 var1) {
      class03877 class03877 = this.input.N(var1);
      double d0 = class03877.N();
      double d1 = class03877.y();
      double d2;
      double d3;
      if (this.specificType == class03907.field_36569) {
         d2 = d0 + this.argument;
         d3 = d1 + this.argument;
      } else if (this.argument >= 0.0) {
         d2 = d0 * this.argument;
         d3 = d1 * this.argument;
      } else {
         d2 = d1 * this.argument;
         d3 = d0 * this.argument;
      }

      return new class03901(this.specificType, class03877, d2, d3, this.argument);
   }

   @Override
   public double N() {
      return this.minValue;
   }

   @Override
   public double N(double var1) {
      return switch (this.specificType) {
         case field_36568 -> var1 * this.argument;
         case field_36569 -> var1 + this.argument;
      };
   }

   @Override
   public class03877 W() {
      return this.input;
   }

   @Override
   public class03877 az_() {
      return this.input;
   }
}
