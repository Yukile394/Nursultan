package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class07110 extends class04983 implements class07132 {
   public static final MapCodec<class07110> N = y(class07110::new);
   private static final double M = 0.14;
   private static final class00494 B = class00891.y(16.0, 0.0, 9.0);

   public class07110(class01362 var1) {
      super(var1, class07211.field_11036, B, true, 0.14);
   }

   @Override
   protected boolean U(class00500 var1) {
      return !var1.N(class00869.EI);
   }

   @Override
   protected class04688 u(class00500 var1) {
      return class04684.L.N(false);
   }

   @Override
   protected class00891 u() {
      return class00869.Wr;
   }

   @Override
   protected boolean E(class00500 var1) {
      return var1.N(class00869.K);
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      class04688 class04688 = var1.method_8045().method_8316(var1.method_8037());
      return class04688.N(class01231.N) && class04688.R() == 8 ? super.N(var1) : null;
   }

   @Override
   public MapCodec<class07110> N() {
      return N;
   }

   @Override
   protected int N(class06069 var1) {
      return 1;
   }

   @Override
   public boolean N(class07284 var1, class07209 var2, class00500 var3, class04688 var4) {
      return false;
   }

   @Override
   public boolean N(@Nullable class07438 var1, class07290 var2, class07209 var3, class00500 var4, class04651 var5) {
      return false;
   }
}
