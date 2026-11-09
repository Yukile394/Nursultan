package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class07108 extends class04978 implements class07132 {
   public static final MapCodec<class07108> N = y(class07108::new);

   @Override
   protected class04983 L() {
      return (class04983)class00869.Wh;
   }

   public class07108(class01362 var1) {
      super(var1, class07211.field_11036, class00389.y(), true);
   }

   @Override
   protected boolean U(class00500 var1) {
      return this.L().U(var1);
   }

   @Override
   protected class04688 u(class00500 var1) {
      return class04684.L.N(false);
   }

   @Override
   public MapCodec<class07108> N() {
      return N;
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
