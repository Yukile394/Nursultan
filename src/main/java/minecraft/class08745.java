package minecraft;

import java.util.function.Consumer;

public class class08745 implements class03241 {
   private final class00392 y;
   private final class00392 L;
   protected final class01885 N = class01885.u();

   @Override
   public class00392 method_48610() {
      return this.y;
   }

   @Override
   public class00392 method_71245() {
      return this.L;
   }

   @Override
   public void method_48612(Consumer<class06478> var1) {
      this.N.method_48206(var1);
   }

   @Override
   public void method_48611(class03255 var1) {
      this.N.N();
      class02077.N(this.N, var1, 0.5F, 0.5F);
   }

   public class08745(class01590 var1, class00392 var2, class00392 var3) {
      super();
      this.y = var2;
      this.L = var3;
      class01860 class01860 = new class01860(var1, var3);
      this.N.L().i().y();
      this.N.N(class01860, var0 -> var0.i(30));
   }
}
