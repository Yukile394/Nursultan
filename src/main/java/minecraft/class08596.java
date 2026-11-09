package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class class08596 extends class00864 implements class08614 {
   public static final MapCodec<class08596> N = y(class08596::new);
   public static final class08064<class07211> y = class06665.f;
   private final Function<class00500, class00494> L;

   public class08596(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, class07211.field_11043).y(this.u(), 1));
      this.L = this.y();
   }

   private Function<class00500, class00494> y() {
      return this.N(this.N(y, this.u()));
   }

   @Override
   public boolean N(class00500 var1, class06942 var2) {
      return this.N(var1, var2, this.u()) ? true : super.N(var1, var2);
   }

   @Override
   public class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return this.L.apply(var1);
   }

   @Override
   public class00500 N(class06942 var1) {
      return this.N(var1, this, this.u(), y);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, this.u());
   }

   @Override
   protected MapCodec<class08596> N() {
      return N;
   }

   @Override
   public class00500 N(class00500 var1, class06993 var2) {
      return var1.y(y, var2.N(var1.L(y)));
   }

   @Override
   public class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(y)));
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      class07209 class07209 = var3.method_10074();
      return var2.method_8320(class07209).L(var2, class07209, class07211.field_11036);
   }
}
