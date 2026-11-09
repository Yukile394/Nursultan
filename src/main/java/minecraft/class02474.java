package minecraft;

import com.mojang.serialization.Codec;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public abstract class class02474 implements class02465<class02710> {
   private final List<class00800> N;

   protected class02474(List<class00800> var1) {
      super();
      this.N = var1;
   }

   public static class02468 y(List<class00800> var0) {
      return new class02468(var0);
   }

   public static class02490 N(List<class00800> var0) {
      return new class02490(var0);
   }

   public boolean N(class02710 var1) {
      Iterator<class00800> iterator = this.N.iterator();

      while (iterator.hasNext()) {
         if (!iterator.next().N(var1)) {
            return false;
         }
      }

      return true;
   }

   protected List<class00800> N() {
      return this.N;
   }

   public static <T extends class02474> Codec<T> N(Function<List<class00800>, T> var0) {
      return class00800.N.listOf().xmap(var0, class02474::N);
   }
}
