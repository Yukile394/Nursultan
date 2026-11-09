package minecraft;

import Nursultan.class10104;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import org.jspecify.annotations.Nullable;

public class class03060 {
   private final int N;
   private final ObjectList<class01993> y = new ObjectArrayList();
   @Nullable
   private class04469 L;

   public class03060(int var1) {
      super();
      this.N = var1;

      for (int i = 0; i < var1; i++) {
         this.y.add(null);
      }
   }

   public class03048 N(class03058 var1) throws class10104 {
      this.N(var1.N());
      ObjectArrayList objectarraylist = new ObjectArrayList(var1.y().cardinality());
      if (var1.y().length() > this.N) {
         throw new class10104("Last seen update contained " + var1.y().length() + " messages, but maximum window size is " + this.N);
      } else {
         for (int i = 0; i < this.N; i++) {
            boolean flag = var1.y().get(i);
            class01993 class01993 = (class01993)this.y.get(i);
            if (flag) {
               if (class01993 == null) {
                  throw new class10104("Last seen update acknowledged unknown or previously ignored message at index " + i);
               }

               this.y.set(i, class01993.N());
               objectarraylist.add(class01993.y());
            } else {
               if (class01993 != null && !class01993.L()) {
                  throw new class10104("Last seen update ignored previously acknowledged message at index " + i + " and signature " + class01993.y());
               }

               this.y.set(i, null);
            }
         }

         class03048 class03048 = new class03048(objectarraylist);
         if (!var1.N(class03048)) {
            throw new class10104("Checksum mismatch on last seen update: the client and server must have desynced");
         } else {
            return class03048;
         }
      }
   }

   public void N(int var1) throws class10104 {
      int i = this.y.size() - this.N;
      if (var1 >= 0 && var1 <= i) {
         this.y.removeElements(0, var1);
      } else {
         throw new class10104("Advanced last seen window by " + var1 + " messages, but expected at most " + i);
      }
   }

   public int N() {
      return this.y.size();
   }

   public void N(class04469 var1) {
      if (!var1.equals(this.L)) {
         this.y.add(new class01993(var1, true));
         this.L = var1;
      }
   }
}
