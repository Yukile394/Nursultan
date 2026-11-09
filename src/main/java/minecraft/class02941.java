package minecraft;

public abstract class class02941<T extends class08004, S extends class08278, M extends class03089<S>> extends class04256<T, S, M> {
   private static final class01894 N = class01894.y("textures/entity/zombie/zombie.png");

   public class02941(class04832 var1, M var2, M var3, class08118<M> var4, class08118<M> var5) {
      super(var1, (M)var2, (M)var3, 0.5F);
      this.N(new class02562<>(this, var4, var5, var1.B()));
   }

   protected boolean L(S var1) {
      return super.L((S)var1) || var1.y;
   }

   public class01894 N(S var1) {
      return N;
   }

   public class01180 N(T var1, class07070 var2) {
      class08186 class08186 = var1.method_61420(var2.N()).method_58694(class02484.a);
      return class08186 != null && class08186.N() == class08155.field_63400 ? class01180.field_63543 : super.N((T)var1, var2);
   }

   public void method_62354(T var1, S var2, float var3) {
      super.method_62354((T)var1, (S)var2, var3);
      var2.N = var1.Nl();
      var2.y = var1.d();
   }
}
