package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;

public class class07585<T> {
   private final Builder<class07581<T>> N = ImmutableList.builder();
   private class07586 y = class07586.u;

   public class07585() {
      super();
   }

   public class07606<T> N() {
      List list = (List)class07606.N(this.N.build()).getOrThrow();
      return new class07606<>(list, this.y);
   }

   public class07585<T> N(class07586 var1) {
      this.y = var1;
      return this;
   }

   public class07585<T> N(int var1, T var2) {
      this.N.add(new class07581<>(var1, var2));
      return this;
   }
}
