package minecraft;

import Nursultan.class09763;
import Nursultan.class09764;
import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Queue;

public class class02576 {
   private static final int N = 8;
   private final Queue<class09763> y = new class04189<>();
   private final Object2IntLinkedOpenHashMap<class09764> L = new Object2IntLinkedOpenHashMap();

   public class02576() {
      super();
   }

   private static long y() {
      return System.currentTimeMillis();
   }

   public synchronized String N() {
      long i = y();
      StringBuilder stringbuilder = new StringBuilder();
      if (!this.y.isEmpty()) {
         stringbuilder.append("\n\t\tLatest entries:\n");

         for (class09763 class09763 : this.y) {
            stringbuilder.append("\t\t\t")
               .append(class09763.y())
               .append(":")
               .append(class09763.L())
               .append(": ")
               .append(class09763.u())
               .append(" (")
               .append(i - class09763.N())
               .append("ms ago)")
               .append("\n");
         }
      }

      if (!this.L.isEmpty()) {
         if (stringbuilder.isEmpty()) {
            stringbuilder.append("\n");
         }

         stringbuilder.append("\t\tEntry counts:\n");
         ObjectIterator objectiterator = Object2IntMaps.fastIterable(this.L).iterator();

         while (objectiterator.hasNext()) {
            Entry entry = (Entry)objectiterator.next();
            stringbuilder.append("\t\t\t")
               .append(((class09764)entry.getKey()).N())
               .append(":")
               .append(((class09764)entry.getKey()).y())
               .append(" x ")
               .append(entry.getIntValue())
               .append("\n");
         }
      }

      return stringbuilder.isEmpty() ? "~~NONE~~" : stringbuilder.toString();
   }

   public synchronized void N(String var1, Throwable var2) {
      long i = y();
      String s = var2.getMessage();
      this.y.add(new class09763(i, var1, (Class<? extends Throwable>)var2.getClass(), s));

      while (this.y.size() > 8) {
         this.y.remove();
      }

      class09764 class09764 = new class09764(var1, (Class<? extends Throwable>)var2.getClass());
      int j = this.L.getInt(class09764);
      this.L.putAndMoveToFirst(class09764, j + 1);
   }
}
