package minecraft;

import com.mojang.serialization.MapCodec;

public final class class02481 extends class02467<class06741> {
   private final class06741 L;

   public class02481(class06741 var1) {
      super(MapCodec.unitCodec(var1));
      this.L = var1;
   }

   public class02477<?> y() {
      return this.L.N();
   }

   public class06741 N() {
      return this.L;
   }

   public static class02481 N(class02477<?> var0) {
      return new class02481(new class06741(var0));
   }
}
