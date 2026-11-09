package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.BitSet;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class class03046 {
   private final class01993[] N;
   private int y;
   private int L;
   @Nullable
   private class04469 u;

   public int L() {
      return this.L;
   }

   public class03046(int var1) {
      super();
      this.N = new class01993[var1];
   }

   public class03064 y() {
      int i = this.N();
      BitSet bitset = new BitSet(this.N.length);
      ObjectArrayList objectarraylist = new ObjectArrayList(this.N.length);

      for (int j = 0; j < this.N.length; j++) {
         int k = (this.y + j) % this.N.length;
         class01993 class01993 = this.N[k];
         if (class01993 != null) {
            bitset.set(j, true);
            objectarraylist.add(class01993.y());
            this.N[k] = class01993.N();
         }
      }

      class03048 class03048 = new class03048(objectarraylist);
      class03058 class03058 = new class03058(i, bitset, class03048.N());
      return new class03064(class03048, class03058);
   }

   public void N(class04469 var1) {
      for (int i = 0; i < this.N.length; i++) {
         class01993 class01993 = this.N[i];
         if (class01993 != null && class01993.L() && var1.equals(class01993.y())) {
            this.N[i] = null;
            break;
         }
      }
   }

   public int N() {
      int i = this.L;
      this.L = 0;
      return i;
   }

   public boolean N(class04469 var1, boolean var2) {
      if (Objects.equals(var1, this.u)) {
         return false;
      } else {
         this.u = var1;
         this.N(var2 ? new class01993(var1, true) : null);
         return true;
      }
   }

   private void N(@Nullable class01993 var1) {
      int i = this.y;
      this.y = (i + 1) % this.N.length;
      this.L++;
      this.N[i] = var1;
   }
}
