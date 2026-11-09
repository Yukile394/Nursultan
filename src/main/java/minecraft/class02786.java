package minecraft;

public class class02786<T extends class07877> extends class01660<T, class08784, class02436> {
   private final class01894 N;

   public class02786(class04832 var1, class02782 var2) {
      super(var1, new class02436(var1.N(var2.field_56098)), new class02436(var1.N(var2.field_56099)));
      this.N = var2.field_56097;
      this.N(
         new class00207<>(this, var1.B(), var2.field_56100, var0 -> var0.y, new class00236(var1.N(var2.field_56101)), new class00236(var1.N(var2.field_56102)))
      );
   }

   public class08784 method_55269() {
      return new class08784();
   }

   public class01894 N(class08784 var1) {
      return this.N;
   }

   public void method_62354(T var1, class08784 var2, float var3) {
      super.method_62354((T)var1, (class08784)var2, var3);
      var2.N = var1.v();
   }
}
