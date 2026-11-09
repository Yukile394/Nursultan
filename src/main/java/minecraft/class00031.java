package minecraft;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.Table;
import com.google.common.collect.Tables;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.Sets.SetView;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class class00031 implements class00016<class00042> {
   private final Set<class00042> N = new HashSet<>();
   private final Set<class04770> y = new HashSet<>();
   private final Table<class04770, class00042, class00038> L = HashBasedTable.create();

   public void L(class04770 var1) {
      this.L.row(var1).values().removeIf(var0 -> {
         var0.u();
         return true;
      });
      this.L((class00042)var1);
      this.y.remove(var1);
   }

   public void L(class00042 var1) {
      this.L.column(var1).forEach((var0, var1x) -> var1x.u());
      Tables.transpose(this.L).row(var1).clear();
      this.N.remove(var1);
   }

   public class00031() {
      super();
   }

   public void u(class00042 var1) {
      for (class04770 class04770 : this.y) {
         this.N(class04770, var1);
      }
   }

   private static boolean u(class04770 var0) {
      return var0.method_51469().method_64395().N(class07305.t);
   }

   public void y(class04770 var1) {
      Map<class00042, class00038> map = this.L.row(var1);
      SetView<class00042> setview = Sets.difference(this.N, map.keySet());
      UnmodifiableIterator<class00042> unmodifiableiterator = ImmutableSet.copyOf(map.entrySet()).iterator();

      while (unmodifiableiterator.hasNext()) {
         Entry entry = (Entry)unmodifiableiterator.next();
         this.N(var1, (class00042)entry.getKey(), (class00038)entry.getValue());
      }

      unmodifiableiterator = setview.iterator();

      while (unmodifiableiterator.hasNext()) {
         class00042 class00042 = (class00042)unmodifiableiterator.next();
         this.N(var1, class00042);
      }
   }

   public void y(class00042 var1) {
      if (this.N.contains(var1)) {
         Map<class04770, class00038> map = Tables.transpose(this.L).row(var1);
         SetView<class04770> setview = Sets.difference(this.y, map.keySet());
         UnmodifiableIterator<class04770> unmodifiableiterator = ImmutableSet.copyOf(map.entrySet()).iterator();

         while (unmodifiableiterator.hasNext()) {
            Entry entry = (Entry)unmodifiableiterator.next();
            this.N((class04770)entry.getKey(), var1, (class00038)entry.getValue());
         }

         unmodifiableiterator = setview.iterator();

         while (unmodifiableiterator.hasNext()) {
            class04770 class04770 = (class04770)unmodifiableiterator.next();
            this.N(class04770, var1);
         }
      }
   }

   public Set<class00042> y() {
      return this.N;
   }

   public void N(class00042 var1) {
      this.N.add(var1);

      for (class04770 class04770 : this.y) {
         this.N(class04770, var1);
      }
   }

   public void N(class04770 var1) {
      this.y.add(var1);

      for (class00042 class00042 : this.N) {
         this.N(var1, class00042);
      }

      if (var1.method_70674()) {
         this.N((class00042)var1);
      }
   }

   public void N() {
      this.L.values().forEach(class00038::u);
      this.L.clear();
   }

   private void N(class04770 var1, class00042 var2) {
      if (var1 != var2) {
         if (u(var1)) {
            var2.method_70672(var1).ifPresentOrElse(var3 -> {
               this.L.put(var1, var2, var3);
               var3.L();
            }, () -> {
               class00038 class00038 = (class00038)this.L.remove(var1, var2);
               if (class00038 != null) {
                  class00038.u();
               }
            });
         }
      }
   }

   private void N(class04770 var1, class00042 var2, class00038 var3) {
      if (var1 != var2) {
         if (u(var1)) {
            if (!var3.y()) {
               var3.i();
            } else {
               var2.method_70672(var1).ifPresentOrElse(var3x -> {
                  var3x.L();
                  this.L.put(var1, var2, var3x);
               }, () -> {
                  var3.u();
                  this.L.remove(var1, var2);
               });
            }
         }
      }
   }
}
