package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;

public interface class06363<T> {
   List<T> y();

   static <T> class06363<T> N(BooleanSupplier var0, List<T> var1, List<T> var2) {
      ImmutableList immutablelist = ImmutableList.copyOf(var1);
      ImmutableList immutablelist1 = ImmutableList.copyOf(var2);
      return new class06367<>(var0, immutablelist1, immutablelist);
   }

   static <T> class06363<T> N(Collection<T> var0) {
      ImmutableList immutablelist = ImmutableList.copyOf(var0);
      return new class06375<>(immutablelist);
   }

   List<T> N();
}
