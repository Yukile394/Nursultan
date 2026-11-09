package minecraft;

import org.jspecify.annotations.Nullable;

public abstract class class04430 extends class05096 {
   private static final int y = 100;
   private final class00392 L;
   @Nullable
   private final class00392 u;
   private final class00392 i;
   @Nullable
   protected class05725 N;
   @Nullable
   private class04161 R;
   private final class02077 M;

   protected class04430(class00392 var1, class00392 var2, class00392 var3) {
      this(var1, var2, null, var3);
   }

   protected class04430(class00392 var1, class00392 var2, @Nullable class00392 var3, class00392 var4) {
      super(var1);
      this.L = var2;
      this.u = var3;
      this.i = var4;
      this.M = new class02077(0, 0, this.field_22789, this.field_22790);
   }

   protected abstract class03695 N();

   @Override
   public void method_25426() {
      class01885 class01885x = this.M.N(class01885.u().N(8));
      class01885x.L().y();
      class01885x.N(new class02071(this.method_25440(), this.field_22793));
      this.R = class01885x.N(new class04161(0, 0, this.field_22789 - 100, this.field_22790 - 100, this.L, this.field_22793), var0 -> var0.N(12));
      class01885 class01885x = class01885x.N(class01885.u().N(8));
      class01885x.L().y();
      if (this.u != null) {
         this.N = class01885x.N(class05725.y(this.u, this.field_22793).N());
      }

      class01885x.N(this.N());
      this.M.method_48206(var1x -> {
         class06478 class06478 = this.method_37063(var1x);
      });
      this.method_48640();
   }

   @Override
   public void method_48640() {
      if (this.R != null) {
         this.R.method_25358(this.field_22789 - 100);
         this.R.method_53533(this.field_22790 - 100);
         this.R.y();
      }

      this.M.N();
      class02077.N(this.M, this.method_48202());
   }

   @Override
   public class00392 method_25435() {
      return this.i;
   }
}
