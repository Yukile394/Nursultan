package minecraft;

public abstract class class03739<T extends class08007, S extends class02789> extends class04507<T, S> {
   private final class02434 N;

   public class03739(class04832 var1) {
      super(var1);
      this.N = new class02434(var1.N(class04802.z));
   }

   public void method_62354(T var1, S var2, float var3) {
      super.method_62354((T)var1, (S)var2, var3);
      var2.y = var1.method_61414(var3);
      var2.L = var1.method_61415(var3);
      var2.u = var1.L - var3;
   }

   protected abstract class01894 N(S var1);

   public void method_3936(S var1, class01421 var2, class01237 var3, class06959 var4) {
      var2.N();
      var2.N(class02058.u.N(var1.L - 90.0F));
      var2.N(class02058.R.N(var1.y));
      var3.N(this.N, var1, var2, class06851.R(this.N((S)var1)), var1.G, class01384.u, var1.l, null);
      var2.y();
      super.method_3936((S)var1, var2, var3, var4);
   }
}
