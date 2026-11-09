package minecraft;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class class08265 implements AutoCloseable {
   private final Int2ObjectMap<class08258> y = new Int2ObjectOpenHashMap();
   final class08627 N;

   private class08258 L(class02265 var1, class07769 var2) {
      return (class08258)this.y.compute(var1.y(), (var2x, var3) -> {
         if (var3 == null) {
            return new class08258(this, var2x, var2);
         } else {
            var3.N(var2);
            return var3;
         }
      });
   }

   public class08265(class08627 var1) {
      super();
      this.N = var1;
   }

   @Override
   public void close() {
      this.N();
   }

   public class01894 y(class02265 var1, class07769 var2) {
      class08258 class08258 = this.L(var1, var2);
      class08258.y();
      return class08258.N;
   }

   public void N() {
      ObjectIterator<class08258> objectiterator = this.y.values().iterator();

      while (objectiterator.hasNext()) {
         ((class08258)objectiterator.next()).close();
      }

      this.y.clear();
   }

   public void N(class02265 var1, class07769 var2) {
      this.L(var1, var2).N();
   }
}
