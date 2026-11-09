package minecraft;

record class03913(class03892 type, class03877 argument1, class03877 argument2, double minValue, double maxValue) implements class03871 {
   class03913(class03892 type, class03877 argument1, class03877 argument2, double minValue, double maxValue) {
      super();
      this.type = type;
      this.argument1 = argument1;
      this.argument2 = argument2;
      this.minValue = minValue;
      this.maxValue = maxValue;
   }

   @Override
   public class03877 i() {
      return this.argument1;
   }

   @Override
   public class03892 u() {
      return this.type;
   }

   @Override
   public double y() {
      return this.maxValue;
   }

   @Override
   public double N(class03875 var1) {
      double d0 = this.argument1.N(var1);

      return switch (this.type) {
         case field_36544 -> d0 + this.argument2.N(var1);
         case field_36545 -> d0 == 0.0 ? 0.0 : d0 * this.argument2.N(var1);
         case field_36546 -> d0 < this.argument2.N() ? d0 : Math.min(d0, this.argument2.N(var1));
         case field_36547 -> d0 > this.argument2.y() ? d0 : Math.max(d0, this.argument2.N(var1));
      };
   }

   @Override
   public double N() {
      return this.minValue;
   }

   @Override
   public void N(double[] var1, class03912 var2) {
      this.argument1.N(var1, var2);
      switch (this.type) {
         case field_36544:
            double[] adouble = new double[var1.length];
            this.argument2.N(adouble, var2);

            for (int k = 0; k < var1.length; k++) {
               var1[k] += adouble[k];
            }
            break;
         case field_36545:
            for (int j = 0; j < var1.length; j++) {
               double d1 = var1[j];
               var1[j] = d1 == 0.0 ? 0.0 : d1 * this.argument2.N(var2.L(j));
            }
            break;
         case field_36546:
            double d3 = this.argument2.N();

            for (int l = 0; l < var1.length; l++) {
               double d4 = var1[l];
               var1[l] = d4 < d3 ? d4 : Math.min(d4, this.argument2.N(var2.L(l)));
            }
            break;
         case field_36547:
            double d0 = this.argument2.y();

            for (int i = 0; i < var1.length; i++) {
               double d2 = var1[i];
               var1[i] = d2 > d0 ? d2 : Math.max(d2, this.argument2.N(var2.L(i)));
            }
      }
   }

   @Override
   public class03877 N(class03881 var1) {
      return var1.apply(class03871.N(this.type, this.argument1.N(var1), this.argument2.N(var1)));
   }

   @Override
   public class03877 W() {
      return this.argument2;
   }
}
