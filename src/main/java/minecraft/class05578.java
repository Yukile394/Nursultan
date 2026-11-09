package minecraft;

import com.mojang.serialization.MapCodec;

public class class05578 extends class04978 implements class05568 {
   public static final MapCodec<class05578> i = y(class05578::new);

   @Override
   protected class04983 L() {
      return (class04983)class00869.vA;
   }

   public class05578(class01362 var1) {
      super(var1, class07211.field_11033, N, false);
      this.P(this.Q.y().y(x_, false));
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return !var3.L(x_);
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return true;
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      var1.method_8652(var3, var4.y(x_, true), 2);
   }

   @Override
   public MapCodec<class05578> N() {
      return i;
   }

   @Override
   protected class00500 N(class00500 var1, class00500 var2) {
      return var2.y(x_, var1.L(x_));
   }

   @Override
   public class06584 N(class05487 var1, class07209 var2, class00500 var3, boolean var4) {
      return new class06584(class06570.wy);
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      return class05568.N(var4, var1, var2, var3);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(x_);
   }
}
