package minecraft;

import Nursultan.class09544;
import Nursultan.class09824;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;

public abstract class class04111<T extends class04111<T>> implements class07297<T> {
   private final Builder<class05957> N = ImmutableList.builder();

   protected abstract T L();

   public class09824 L(class04111<?> var1) {
      return new class09824(this, var1);
   }

   public class04111() {
      super();
   }

   protected List<class05957> i() {
      return this.N.build();
   }

   public final T M() {
      return this.L();
   }

   public abstract class04129 y();

   public class09544 y(class04111<?> var1) {
      return new class09544(this, var1);
   }

   public T y(class05952 var1) {
      this.N.add(var1.build());
      return this.L();
   }

   public class04546 N(class04111<?> var1) {
      return new class04546(this, var1);
   }
}
