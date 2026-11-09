package minecraft;

final class class07223 extends class07214 {
   class07223(String var1, int var2) {
      super();
   }

   @Override
   public class07185 N(class07185 var1) {
      switch (var1) {
         case field_11048:
            return class07185.field_11051;
         case field_11052:
            return class07185.field_11048;
         case field_11051:
            return class07185.field_11052;
         default:
            throw new IllegalArgumentException();
      }
   }

   @Override
   public class07214 N() {
      return field_10963;
   }

   @Override
   public double N(double var1, double var3, double var5, class07185 var7) {
      return var7.N(var3, var5, var1);
   }

   @Override
   public int N(int var1, int var2, int var3, class07185 var4) {
      return var4.N(var2, var3, var1);
   }
}
