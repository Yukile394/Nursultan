package minecraft;

import com.google.common.collect.UnmodifiableIterator;

public class class04684 {
   public static final class04651 N = N("empty", new class05806());
   public static final class05787 y = N("flowing_water", new class04661());
   public static final class05787 L = N("water", new class04676());
   public static final class05787 u = N("flowing_lava", new class04656());
   public static final class05787 i = N("lava", new class04652());

   public class04684() {
      super();
   }

   private static <T extends class04651> T N(String var0, T var1) {
      return class00751.N(class04206.L, var0, (T)var1);
   }

   static {
      for (class04651 class04651 : class04206.L) {
         UnmodifiableIterator unmodifiableiterator = class04651.R().N().iterator();

         while (unmodifiableiterator.hasNext()) {
            class04688 class04688 = (class04688)unmodifiableiterator.next();
            class04651.L.y(class04688);
         }
      }
   }
}
