package minecraft;

import java.util.function.Supplier;

public class class06856 {
   private final String i;
   private final Supplier<class08066> R;
   public static final class06856 N = new class06856("main_target", () -> class06202.Nq().e());
   public static final class06856 y = new class06856("outline_target", () -> ((class03063)class06202.Nq().B_2).m());
   public static final class06856 L = new class06856("weather_target", () -> ((class03063)class06202.Nq().B_2).b());
   public static final class06856 u = new class06856("item_entity_target", () -> ((class03063)class06202.Nq().B_2).s());

   public class06856(String var1, Supplier<class08066> var2) {
      super();
      this.i = var1;
      this.R = var2;
   }

   @Override
   public String toString() {
      return "OutputTarget[" + this.i + "]";
   }

   public class08066 N() {
      class08066 class08066 = this.R.get();
      return class08066 != null ? class08066 : class06202.Nq().e();
   }
}
