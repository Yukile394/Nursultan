package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class class03496 extends class06505 {
   public static final MapCodec<class03496> i = N(class03496::new);
   public static final Codec<class03496> R = y(class03496::new);

   class03496(List<class05957> var1) {
      super(var1, class07536.N(var1));
   }

   public static class03496 N(List<class05957> var0) {
      return new class03496(List.copyOf(var0));
   }

   public static class03474 N(class05952... var0) {
      return new class03474(var0);
   }

   @Override
   public class05955 N() {
      return class07693.L;
   }
}
