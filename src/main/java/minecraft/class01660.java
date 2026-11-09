package minecraft;

public abstract class class01660<T extends class07862, S extends class08490, M extends class06078<? super S>> extends class02795<T, S, M> {
   public class01660(class04832 var1, M var2, M var3) {
      super(var1, (M)var2, (M)var3, 0.75F);
   }

   public void method_62354(T var1, S var2, float var3) {
      super.method_62354((T)var1, (S)var2, var3);
      var2.y = var1.method_6118(class07085.field_55946).t();
      var2.L = var1.NZ().t();
      var2.u = var1.method_5782();
      var2.R = var1.u(var3);
      var2.M = var1.i(var3);
      var2.B = var1.R(var3);
      var2.i = var1.i > 0;
   }
}
