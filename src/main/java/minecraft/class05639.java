package minecraft;

import org.jspecify.annotations.Nullable;

public abstract class class05639 extends class08039 implements class05640 {
   private static final float u = 12.25F;
   private static final class02131<class06584> R = class03289.N(class05639.class, class02154.B);

   @Override
   public class06584 L() {
      return this.method_5841().N(R);
   }

   private class06584 M() {
      return new class06584(class06570.GZ);
   }

   @Nullable
   @Override
   public class04803 method_32318(int var1) {
      return var1 == 0 ? class04803.N(this::L, this::N) : super.method_32318(var1);
   }

   @Override
   protected void method_5693(class04293 var1) {
      var1.N(R, this.M());
   }

   @Override
   protected void method_36975() {
   }

   @Override
   protected void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("Item", class06584.y, this.L());
   }

   @Override
   public boolean method_5640(double var1) {
      return this.field_6012 < 2 && var1 < 12.25 ? false : super.method_5640(var1);
   }

   @Override
   protected void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.N(var1.<class06584>N("Item", class06584.y).orElse(this.M()));
   }

   public class05639(class07078<? extends class05639> var1, double var2, double var4, double var6, class06889 var8, class07299 var9) {
      super(var1, var2, var4, var6, var8, var9);
   }

   public class05639(class07078<? extends class05639> var1, class07438 var2, class06889 var3, class07299 var4) {
      super(var1, var2, var3, var4);
   }

   public class05639(class07078<? extends class05639> var1, class07299 var2) {
      super(var1, var2);
   }

   public void N(class06584 var1) {
      if (var1.R()) {
         this.method_5841().N(R, this.M());
      } else {
         this.method_5841().N(R, var1.L(1));
      }
   }
}
