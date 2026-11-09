package minecraft;

import org.joml.Quaternionf;

public abstract class class00275 extends class04507<class00250, class08790> {
   public class00275(class04832 var1) {
      super(var1);
      this.field_4673 = 0.8F;
   }

   protected abstract class07311 method_64520();

   public void method_64519(class08790 var1, class01421 var2, class01237 var3, class06959 var4) {
      var2.N();
      var2.N(0.0F, 0.375F, 0.0F);
      var2.N(class02058.u.N(180.0F - var1.N));
      float f = var1.L;
      if (f > 0.0F) {
         var2.N(class02058.y.N(class04995.m(f) * f * var1.u / 10.0F * var1.y));
      }

      if (!var1.R && !class04995.y(var1.i, 0.0F)) {
         var2.N(new Quaternionf().setAngleAxis(var1.i * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      var2.y(-1.0F, -1.0F, 1.0F);
      var2.N(class02058.u.N(90.0F));
      var3.N(this.method_64517(), var1, var2, this.method_64520(), var1.G, class01384.u, var1.l, null);
      this.method_64521(var1, var2, var3, var1.G);
      var2.y();
      super.method_3936(var1, var2, var3, var4);
   }

   protected abstract class06078<class08790> method_64517();

   public void method_62354(class00250 var1, class08790 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.method_61415(var3);
      var2.L = var1.G() - var3;
      var2.y = var1.l();
      var2.u = Math.max(var1.t() - var3, 0.0F);
      var2.i = var1.N(var3);
      var2.R = var1.method_5869();
      var2.M = var1.N(0, var3);
      var2.B = var1.N(1, var3);
   }

   protected void method_64521(class08790 var1, class01421 var2, class01237 var3, int var4) {
   }

   public class08790 method_64522() {
      return new class08790();
   }
}
