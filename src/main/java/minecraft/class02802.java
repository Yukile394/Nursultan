package minecraft;

public abstract class class02802<T extends class07528, S extends class08443> extends class04256<T, S, class02153<S>> {
   public class02802(class04832 var1, class01134 var2, class08118<class01134> var3) {
      this(var1, var3, new class02153<>(var1.N(var2)));
   }

   public class02802(class04832 var1, class08118<class01134> var2, class02153<S> var3) {
      super(var1, var3, 0.5F);
      this.N(new class02562<>(this, class08118.N(var2, var1.R(), class02153::new), var1.B()));
   }

   protected boolean L(S var1) {
      return var1.a;
   }

   public void method_62354(T var1, S var2, float var3) {
      super.method_62354((T)var1, (S)var2, var3);
      var2.y = var1.Nl();
      var2.a = var1.n();
      var2.p = var1.method_6047().N(class06570.sx);
   }

   protected class01180 N(T var1, class07070 var2) {
      return var1.method_6068() == var2 && var1.Nl() && var1.method_6047().N(class06570.sx) ? class01180.field_3403 : super.N((T)var1, var2);
   }
}
