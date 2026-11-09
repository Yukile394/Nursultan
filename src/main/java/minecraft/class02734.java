package minecraft;

import Nursultan.class09881;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

public class class02734 {
   private final List<class02746<?>> N = new ArrayList<>();
   private final List<class09881<?>> y = new ArrayList<>();
   private final List<class02748> L = new ArrayList<>();

   public class02734() {
      super();
   }

   private void N(class02748 var1, BitSet var2, Deque<class02748> var3) {
      var3.add(var1);

      while (!var3.isEmpty()) {
         class02748 class02748 = (class02748)var3.poll();
         if (!var2.get(class02748.N)) {
            var2.set(class02748.N);

            for (int i = class02748.i.nextSetBit(0); i >= 0; i = class02748.i.nextSetBit(i + 1)) {
               var3.add(this.L.get(i));
            }
         }
      }
   }

   private BitSet N() {
      ArrayDeque arraydeque = new ArrayDeque(this.L.size());
      BitSet bitset = new BitSet(this.L.size());

      for (class02760<?> class02760 : this.y) {
         class02748 class02748x = class02760.L.y;
         if (class02748x != null) {
            this.N(class02748x, bitset, arraydeque);
         }
      }

      for (class02748 class02748 : this.L) {
         if (class02748.Z) {
            this.N(class02748, bitset, arraydeque);
         }
      }

      return bitset;
   }

   public void N(class02762 var1, class02731 var2) {
      BitSet bitset = this.N();
      ArrayList arraylist = new ArrayList(bitset.cardinality());
      BitSet bitset1 = new BitSet(this.L.size());

      for (class02748 class02748x : this.L) {
         this.N(class02748x, bitset, bitset1, arraylist);
      }

      this.N(arraylist);

      for (class02748 class02748 : arraylist) {
         for (class02746<?> class02746 : class02748.M) {
            var2.L(class02746.y);
            class02746.N(var1);
         }

         var2.N(class02748.y);
         class02748.R.run();
         var2.y(class02748.y);

         for (int i = class02748.B.nextSetBit(0); i >= 0; i = class02748.B.nextSetBit(i + 1)) {
            class02746 class02746 = this.N.get(i);
            var2.u(class02746.y);
            class02746.y(var1);
         }
      }
   }

   private void N(class02748 var1, BitSet var2, BitSet var3, List<class02748> var4) {
      if (var3.get(var1.N)) {
         String s = var3.stream().mapToObj(var1x -> this.L.get(var1x).y).collect(Collectors.joining(", "));
         throw new IllegalStateException("Frame graph cycle detected between " + s);
      } else if (var2.get(var1.N)) {
         var3.set(var1.N);
         var2.clear(var1.N);

         for (int var5 = var1.i.nextSetBit(0); var5 >= 0; var5 = var1.i.nextSetBit(var5 + 1)) {
            this.N(this.L.get(var5), var2, var3, var4);
         }

         for (class02751<?> class02751 : var1.L) {
            for (int j = class02751.L.nextSetBit(0); j >= 0; j = class02751.L.nextSetBit(j + 1)) {
               if (j != var1.N) {
                  this.N(this.L.get(j), var2, var3, var4);
               }
            }
         }

         var4.add(var1);
         var3.clear(var1.N);
      }
   }

   private void N(Collection<class02748> var1) {
      class02748[] aclass02748 = new class02748[this.N.size()];

      for (class02748 class02748x : var1) {
         for (int i = class02748x.u.nextSetBit(0); i >= 0; i = class02748x.u.nextSetBit(i + 1)) {
            class02746<?> class02746 = this.N.get(i);
            class02748 class02748x = aclass02748[i];
            aclass02748[i] = class02748x;
            if (class02748x == null) {
               class02748x.M.add(class02746);
            } else {
               class02748x.B.clear(i);
            }

            class02748x.B.set(i);
         }
      }
   }

   public class02725 N(String var1) {
      class02748 class02748 = new class02748(this, this.L.size(), var1);
      this.L.add(class02748);
      return class02748;
   }

   public <T> class02452<T> N(String var1, T var2) {
      class09881 class09881 = new class09881<>(var1, null, var2);
      this.y.add(class09881);
      return class09881.L;
   }

   public <T> class02452<T> N(String var1, class02418<T> var2) {
      return this.N(var1, var2, null).L;
   }

   <T> class02746<T> N(String var1, class02418<T> var2, class02748 var3) {
      int i = this.N.size();
      class02746 class02746 = new class02746(i, var1, var3, var2);
      this.N.add(class02746);
      return class02746;
   }

   public void N(class02762 var1) {
      this.N(var1, class02731.y);
   }
}
