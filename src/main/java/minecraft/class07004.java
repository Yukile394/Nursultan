package minecraft;

import com.mojang.serialization.MapCodec;

public class class07004 extends class00891 {
   public static final MapCodec<class07004> y = y(class07004::new);
   public static final class08064<class07185> L = class06665.V;

   public class07004(class01362 var1) {
      super(var1);
      this.P(this.W().y(L, class07185.field_11052));
   }

   public static class00500 y(class00500 var0, class06993 var1) {
      switch (var1) {
         case field_11465:
         case field_11463:
            switch ((class07185)var0.L(L)) {
               case field_11048:
                  return var0.y(L, class07185.field_11051);
               case field_11051:
                  return var0.y(L, class07185.field_11048);
               default:
                  return var0;
            }
         default:
            return var0;
      }
   }

   @Override
   public MapCodec<? extends class07004> N() {
      return y;
   }

   @Override
   public class00500 N(class06942 var1) {
      return this.W().y(L, var1.method_8038().z());
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L);
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return y(var1, var2);
   }
}
