package minecraft;

import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class class01139 {
   private Int2ObjectMap<class07049> N = new Int2ObjectLinkedOpenHashMap();
   private Int2ObjectMap<class07049> y = new Int2ObjectLinkedOpenHashMap();
   @Nullable
   private Int2ObjectMap<class07049> L;

   public boolean L(class07049 var1) {
      return this.N.containsKey(var1.method_5628());
   }

   public class01139() {
      super();
   }

   public void y(class07049 var1) {
      this.N();
      this.N.remove(var1.method_5628());
   }

   private void N() {
      if (this.L == this.N) {
         this.y = this.N;
         this.N = ((Int2ObjectLinkedOpenHashMap)this.N).clone();
      }
   }

   public void N(Consumer<class07049> var1) {
      if (this.L != null) {
         throw new UnsupportedOperationException("Only one concurrent iteration supported");
      } else {
         this.L = this.N;

         try {
            ObjectIterator<class07049> objectiterator = this.N.values().iterator();

            while (objectiterator.hasNext()) {
               class07049 class07049 = (class07049)objectiterator.next();
               var1.accept(class07049);
            }
         } finally {
            this.L = null;
         }
      }
   }

   public void N(class07049 var1) {
      this.N();
      this.N.put(var1.method_5628(), var1);
   }
}
