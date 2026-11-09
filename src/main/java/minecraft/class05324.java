package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class class05324 {
   private final class07284 N;
   private final class05934 y;
   private final class03179 L;

   public class05324(class07284 var1, class05934 var2, class03179 var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   public class01042 y() {
      return this.N.method_30349();
   }

   public Map<class04748, LongSet> y(class07209 var1) {
      class01296 class01296 = class01296.N(var1);
      return this.N.method_22342(class01296.N(), class01296.L(), class00549.i).B();
   }

   public class04932 y(class07209 var1, class04748 var2) {
      for (class04932 class04932 : this.N(class01296.N(var1), var2)) {
         if (this.N(var1, class04932)) {
            return class04932;
         }
      }

      return class04932.y;
   }

   public boolean N(class07209 var1, class04932 var2) {
      Iterator<class04890> iterator = var2.Z().iterator();

      while (iterator.hasNext()) {
         if (iterator.next().L().y(var1)) {
            return true;
         }
      }

      return false;
   }

   public class04932 N(class07209 var1, Predicate<class03556<class04748>> var2) {
      class00751 class00751 = this.y().L(class04227.yj);

      for (class04932 class04932 : this.N(new class07321(var1), var2x -> class00751.L(class00751.N(var2x)).map(var2::test).orElse(false))) {
         if (this.N(var1, class04932)) {
            return class04932;
         }
      }

      return class04932.y;
   }

   public class04932 N(class07209 var1, class03543<class04748> var2) {
      return this.N(var1, var2::N);
   }

   public void N(class04932 var1) {
      var1.i();
      this.L.N(var1.L(), var1.B());
   }

   public class03167 N(class07321 var1, class04748 var2, class03532 var3, boolean var4) {
      return this.L.N(var1, var2, var3, var4);
   }

   public boolean N(class07209 var1) {
      class01296 class01296 = class01296.N(var1);
      return this.N.method_22342(class01296.N(), class01296.L(), class00549.i).G();
   }

   @Nullable
   public class04932 N(class01296 var1, class04748 var2, class00529 var3) {
      return var3.N(var2);
   }

   public void N(class04748 var1, LongSet var2, Consumer<class04932> var3) {
      LongIterator longiterator = var2.iterator();

      while (longiterator.hasNext()) {
         long i = (Long)longiterator.next();
         class01296 class01296 = class01296.N(new class07321(i), this.N.method_32891());
         class04932 class04932 = this.N(class01296, var1, this.N.method_22342(class01296.N(), class01296.L(), class00549.u));
         if (class04932 != null && class04932.y()) {
            var3.accept(class04932);
         }
      }
   }

   public List<class04932> N(class01296 var1, class04748 var2) {
      LongSet longset = this.N.method_22342(var1.N(), var1.L(), class00549.i).y(var2);
      Builder builder = ImmutableList.builder();
      this.N(var2, longset, builder::add);
      return builder.build();
   }

   public List<class04932> N(class07321 var1, Predicate<class04748> var2) {
      Map<class04748, LongSet> map = this.N.method_22342(var1.B, var1.Z, class00549.i).B();
      Builder builder = ImmutableList.builder();

      for (Entry entry : map.entrySet()) {
         class04748 class04748 = (class04748)entry.getKey();
         if (var2.test(class04748)) {
            this.N(class04748, (LongSet)entry.getValue(), builder::add);
         }
      }

      return builder.build();
   }

   public class05324 N(class01607 var1) {
      if (var1.method_8410() != this.N) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + var1.method_8410() + ", region: " + var1);
      } else {
         return new class05324(var1, this.y, this.L);
      }
   }

   public class04932 N(class07209 var1, class03530<class04748> var2) {
      return this.N(var1, var1x -> var1x.N(var2));
   }

   public class04932 N(class07209 var1, class04748 var2) {
      for (class04932 class04932 : this.N(class01296.N(var1), var2)) {
         if (class04932.N().y(var1)) {
            return class04932;
         }
      }

      return class04932.y;
   }

   public boolean N() {
      return this.y.u();
   }

   public void N(class01296 var1, class04748 var2, long var3, class00529 var5) {
      var5.N(var2, var3);
   }

   public void N(class01296 var1, class04748 var2, class04932 var3, class00529 var4) {
      var4.N(var2, var3);
   }
}
