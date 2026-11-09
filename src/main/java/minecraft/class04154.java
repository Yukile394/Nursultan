package minecraft;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public class class04154 implements class01622 {
   private final class01622 N;
   private final List<class01622> u;

   public class04154(class01622 var1, List<class01622> var2) {
      super();
      this.N = var1;
      ArrayList arraylist = new ArrayList(var2.size() + 1);
      arraylist.addAll(Lists.reverse(var2));
      arraylist.add(var1);
      this.u = List.copyOf(arraylist);
   }

   @Override
   public void close() {
      this.u.forEach(class01622::close);
   }

   @Nullable
   @Override
   public class03652<InputStream> method_14410(String... var1) {
      return this.N.method_14410(var1);
   }

   @Override
   public class02267 method_56926() {
      return this.N.method_56926();
   }

   @Override
   public Set<String> method_14406(class01603 var1) {
      HashSet hashset = new HashSet();

      for (class01622 class01622 : this.u) {
         hashset.addAll(class01622.method_14406(var1));
      }

      return hashset;
   }

   @Nullable
   @Override
   public class03652<InputStream> method_14405(class01603 var1, class01894 var2) {
      Iterator<class01622> iterator = this.u.iterator();

      while (iterator.hasNext()) {
         class03652<InputStream> class03652 = iterator.next().method_14405(var1, var2);
         if (class03652 != null) {
            return class03652;
         }
      }

      return null;
   }

   @Override
   public void method_14408(class01603 var1, String var2, String var3, class01593 var4) {
      HashMap hashmap = new HashMap();
      Iterator<class01622> iterator = this.u.iterator();

      while (iterator.hasNext()) {
         iterator.next().method_14408(var1, var2, var3, hashmap::putIfAbsent);
      }

      hashmap.forEach(var4);
   }

   @Nullable
   @Override
   public <T> T method_14407(class02968<T> var1) throws IOException {
      return this.N.method_14407(var1);
   }
}
