package minecraft;

public abstract class class06105<T extends class00675, S extends class08475> extends class02840<T, S, class01176<S>> {
   public class06105(class04832 var1, class01176<S> var2, float var3) {
      super(var1, var2, var3);
      this.N(new class02245<>(this, var1.R(), var1.U()));
   }

   public void method_62354(T var1, S var2, float var3) {
      super.method_62354((T)var1, (S)var2, var3);
      class08827.N(var1, var2, this.L, var3);
      var2.y = var1.method_5765();
      var2.p = var1.method_6068();
      var2.F = var1.M();
      var2.A = var2.F == class00703.field_7210 ? class06593.y(var1.method_6030(), var1) : 0;
      var2.f = var1.method_75120(var3);
      var2.C = var1.method_6055(var3);
      var2.a = var1.Nl();
   }
}
