package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;

public abstract class class00471<T extends class00471<T>> implements class07297<T>, class08137 {
   private final Builder<class05957> N = ImmutableList.builder();

   protected abstract T L();

   public class00471() {
      super();
   }

   public final T M() {
      return this.L();
   }

   public T y(class05952 var1) {
      this.N.add(var1.build());
      return this.L();
   }

   protected List<class05957> R() {
      return this.N.build();
   }
}
