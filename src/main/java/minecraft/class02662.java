package minecraft;

public class class02662<T extends class07049 & class05640> extends class04507<T, class08275> {
   private final class08943 N;
   private final float y;
   private final boolean L;

   public class02662(class04832 var1, float var2, boolean var3) {
      super(var1);
      this.N = var1.y();
      this.y = var2;
      this.L = var3;
   }

   public class02662(class04832 var1) {
      this(var1, 1.0F, false);
   }

   public class08275 method_55269() {
      return new class08275();
   }

   public void method_62354(T var1, class08275 var2, float var3) {
      super.method_62354((T)var1, var2, var3);
      this.N.N(var2.N, ((class05640)var1).L(), class03662.field_4318, var1);
   }

   public void method_3936(class08275 var1, class01421 var2, class01237 var3, class06959 var4) {
      var2.N();
      var2.y(this.y, this.y, this.y);
      var2.N(var4.i);
      var1.N.N(var2, var3, var1.G, class01384.u, var1.l);
      var2.y();
      super.method_3936(var1, var2, var3, var4);
   }

   @Override
   protected int method_24087(T var1, class07209 var2) {
      return this.L ? 15 : super.method_24087((T)var1, var2);
   }
}
