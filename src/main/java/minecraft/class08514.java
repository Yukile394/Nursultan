package minecraft;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Collection;
import java.util.List;

public class class08514 {
   private final Builder<class02022> N = ImmutableList.builder();
   private final Multimap<class07211, class02022> y = ArrayListMultimap.create();

   public class08514() {
      super();
   }

   public class08496 N() {
      ImmutableList<class02022> immutablelist = this.N.build();
      if (this.y.isEmpty()) {
         return immutablelist.isEmpty()
            ? class08496.field_57012
            : new class08496(immutablelist, immutablelist, List.of(), List.of(), List.of(), List.of(), List.of(), List.of());
      } else {
         Builder builder = ImmutableList.builder();
         builder.addAll(immutablelist);
         Collection<class02022> collection = this.y.get(class07211.field_11043);
         builder.addAll(collection);
         Collection<class02022> collection1 = this.y.get(class07211.field_11035);
         builder.addAll(collection1);
         Collection<class02022> collection2 = this.y.get(class07211.field_11034);
         builder.addAll(collection2);
         Collection<class02022> collection3 = this.y.get(class07211.field_11039);
         builder.addAll(collection3);
         Collection<class02022> collection4 = this.y.get(class07211.field_11036);
         builder.addAll(collection4);
         Collection<class02022> collection5 = this.y.get(class07211.field_11033);
         builder.addAll(collection5);
         return N(
            builder.build(),
            immutablelist.size(),
            collection.size(),
            collection1.size(),
            collection2.size(),
            collection3.size(),
            collection4.size(),
            collection5.size()
         );
      }
   }

   private static class08496 N(List<class02022> var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int i = 0;
      int j;
      List list = var0.subList(i, j = i + var1);
      List list1 = var0.subList(j, i = j + var2);
      int k;
      List list2 = var0.subList(i, k = i + var3);
      List list3 = var0.subList(k, i = k + var4);
      int l;
      List list4 = var0.subList(i, l = i + var5);
      List list5 = var0.subList(l, i = l + var6);
      List list6 = var0.subList(i, i + var7);
      return new class08496(var0, list, list1, list2, list3, list4, list5, list6);
   }

   public class08514 N(class02022 var1) {
      this.N.add(var1);
      return this;
   }

   public class08514 N(class07211 var1, class02022 var2) {
      this.y.put(var1, var2);
      return this;
   }
}
