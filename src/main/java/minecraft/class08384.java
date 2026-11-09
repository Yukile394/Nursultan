package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class class08384<T extends class08387> {
   private static final Comparator<class08345<?>> N = Comparator.<class08345<?>, Integer>comparing(var0 -> -var0.height)
      .thenComparing(var0 -> -var0.width)
      .thenComparing(var0 -> var0.N().method_45816());
   private final int y;
   private final List<class08345<T>> L = new ArrayList<>();
   private final List<class08376<T>> u = new ArrayList<>();
   private int i;
   private int R;
   private final int M;
   private final int B;
   private final int Z;

   public void L() {
      ArrayList arraylist = new ArrayList<>(this.L);
      arraylist.sort(N);

      for (class08345 class08345 : arraylist) {
         if (!this.N(class08345)) {
            throw new class08383(class08345.N(), arraylist.stream().map(var0 -> var0.N()).collect(ImmutableList.toImmutableList()));
         }
      }
   }

   public class08384(int var1, int var2, int var3, int var4) {
      super();
      this.y = var3;
      this.M = var1;
      this.B = var2;
      this.Z = 1 << var3 << class04995.N(var4 - 1, 0, 4);
   }

   private boolean y(class08345<T> var1) {
      int ix = class04995.L(this.i);
      int j = class04995.L(this.R);
      int k = class04995.L(this.i + var1.y());
      int l = class04995.L(this.R + var1.L());
      boolean flag1 = k <= this.M;
      boolean flag2 = l <= this.B;
      if (!flag1 && !flag2) {
         return false;
      } else {
         boolean flag3 = flag1 && ix != k;
         boolean flag4 = flag2 && j != l;
         boolean flag;
         if (flag3 ^ flag4) {
            flag = flag3;
         } else {
            flag = flag1 && ix <= j;
         }

         class08376 class08376;
         if (flag) {
            if (this.R == 0) {
               this.R = l;
            }

            class08376 = new class08376(this.i, 0, k - this.i, this.R);
            this.i = k;
         } else {
            class08376 = new class08376(0, this.R, this.i, l - this.R);
            this.R = l;
         }

         class08376.N(var1);
         this.u.add(class08376);
         return true;
      }
   }

   public int y() {
      return this.R;
   }

   public int N() {
      return this.i;
   }

   private boolean N(class08345<T> var1) {
      Iterator iterator = this.u.iterator();

      while (iterator.hasNext()) {
         if (((class08376)iterator.next()).N(var1)) {
            return true;
         }
      }

      return this.y(var1);
   }

   public void N(T var1) {
      class08345 class08345 = new class08345<>(var1, N(var1.method_45807() + this.Z * 2, this.y), N(var1.method_45815() + this.Z * 2, this.y));
      this.L.add(class08345);
   }

   public void N(class08368<T> var1) {
      Iterator iterator = this.u.iterator();

      while (iterator.hasNext()) {
         ((class08376)iterator.next()).N(var1, this.Z);
      }
   }

   private static int N(int var0, int var1) {
      return (var0 >> var1) + ((var0 & (1 << var1) - 1) == 0 ? 0 : 1) << var1;
   }
}
