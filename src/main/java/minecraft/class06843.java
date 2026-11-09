package minecraft;

import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public interface class06843 {
   @Nullable
   class04803 method_32318(int var1);

   default class06838 N_66(IntList var1) {
      return class06838.N(var1.intStream().mapToObj(this::method_32318).filter(Objects::nonNull).toList());
   }
}
