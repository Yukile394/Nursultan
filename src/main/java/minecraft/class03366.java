package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;

public abstract class class03366<T extends class03366<T>> extends class04111<T> implements class08967<T> {
   protected int N = 1;
   protected int y = 0;
   private final Builder<class08122> L = ImmutableList.builder();

   public class03366() {
      super();
   }

   public T y(int var1) {
      this.y = var1;
      return this.L();
   }

   public T N(class08137 var1) {
      this.L.add(var1.y());
      return this.L();
   }

   public T N(int var1) {
      this.N = var1;
      return this.L();
   }

   protected List<class08122> R() {
      return this.L.build();
   }
}
