package minecraft;

class class02464 implements class02362<class04247, class02480<?>> {
   class02464() {
      super();
   }

   private static <T> void y(class04247 var0, class02480<T> var1) {
      class02477.y.encode(var0, var1.N());
      var1.N().R().encode(var0, var1.y());
   }

   public void encode(class04247 var1, class02480<?> var2) {
      y(var1, var2);
   }

   private static <T> class02480<T> N(class04247 var0, class02477<T> var1) {
      return new class02480<>(var1, (T)var1.R().decode(var0));
   }

   public class02480<?> decode(class04247 var1) {
      class02477<?> class02477 = class02477.y.decode(var1);
      return N(var1, class02477);
   }
}
