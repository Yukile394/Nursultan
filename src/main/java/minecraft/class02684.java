package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Optional;

public class class02684 extends class00471<class02684> {
   private final class06841<class02666> N;
   private Optional<Builder<class02477<?>>> y = Optional.empty();
   private Optional<Builder<class02477<?>>> L = Optional.empty();

   class02684(class06841<class02666> var1) {
      super();
      this.N = var1;
   }

   @Override
   public class08122 y() {
      return new class02683(this.R(), this.N, this.y.map(Builder::build), this.L.map(Builder::build));
   }

   public class02684 y(class02477<?> var1) {
      if (this.L.isEmpty()) {
         this.L = Optional.of(ImmutableList.builder());
      }

      this.L.get().add(var1);
      return this;
   }

   public class02684 N(class02477<?> var1) {
      if (this.y.isEmpty()) {
         this.y = Optional.of(ImmutableList.builder());
      }

      this.y.get().add(var1);
      return this;
   }

   protected class02684 L() {
      return this;
   }
}
