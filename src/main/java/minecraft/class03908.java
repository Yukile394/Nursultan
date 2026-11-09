package minecraft;

public interface class03908 extends class03877 {
   @Override
   default void N(double[] var1, class03912 var2) {
      var2.N(var1, this);
   }

   @Override
   default class03877 N(class03881 var1) {
      return var1.apply(this);
   }
}
