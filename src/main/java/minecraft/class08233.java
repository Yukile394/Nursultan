package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class class08233 {
   private static final int N = 2;
   private int y = 2;
   private final List<class03354> L = new ObjectArrayList();

   public class08233() {
      super();
   }

   public synchronized void y() {
      Iterator<class03354> iterator = this.L.iterator();

      while (iterator.hasNext()) {
         iterator.next().N();
      }

      this.L.clear();
   }

   public int N() {
      return this.L.size();
   }

   private class03354 N(int var1) {
      return var1 >= 0 ? this.L.remove(var1) : null;
   }

   public synchronized void N(class03354 var1) {
      this.L.add(var1);
   }

   public synchronized class03354 N(class06889 var1) {
      int i = -1;
      int j = -1;
      double d0 = Double.MAX_VALUE;
      double d1 = Double.MAX_VALUE;
      ListIterator<class03354> listiterator = this.L.listIterator();

      while (listiterator.hasNext()) {
         int k = listiterator.nextIndex();
         class03354 class03354 = listiterator.next();
         if (class03354.N.get()) {
            listiterator.remove();
         } else {
            double d2 = class03354.u().method_19770(var1);
            if (!class03354.L() && d2 < d0) {
               d0 = d2;
               i = k;
            }

            if (class03354.L() && d2 < d1) {
               d1 = d2;
               j = k;
            }
         }
      }

      boolean flag = j >= 0;
      boolean flag1 = i >= 0;
      if (!flag || flag1 && (this.y <= 0 || !(d1 < d0))) {
         this.y = 2;
         return this.N(i);
      } else {
         this.y--;
         return this.N(j);
      }
   }
}
