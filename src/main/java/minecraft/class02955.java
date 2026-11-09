package minecraft;

import java.util.Map;

public class class02955 {
   private static final class02955 N = new class02955(Map.of());
   private final Map<class02968<?>, ?> y;

   private class02955(Map<class02968<?>, ?> var1) {
      super();
      this.y = var1;
   }

   public static <T> class02955 N(class02968<T> var0, T var1) {
      return new class02955(Map.of(var0, var1));
   }

   public static <T1, T2> class02955 N(class02968<T1> var0, T1 var1, class02968<T2> var2, T2 var3) {
      return new class02955(Map.of(var0, var1, var2, var3));
   }

   public <T> T N(class02968<T> var1) {
      return (T)this.y.get(var1);
   }

   public static class02955 N() {
      return N;
   }
}
