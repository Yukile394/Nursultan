package minecraft;

import com.mojang.datafixers.util.Either;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public final class class03522<T> extends class03550<T> {
   static final class03522<?> N = new class03522(List.of());
   private final List<class03556<T>> y;
   @Nullable
   private Set<class03556<T>> L;

   @Override
   public boolean L() {
      return true;
   }

   @Override
   protected List<class03556<T>> M() {
      return this.y;
   }

   class03522(List<class03556<T>> var1) {
      super();
      this.y = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class03522 class03522 && this.y.equals(class03522.y);
   }

   @Override
   public String toString() {
      return "DirectSet[" + this.y + "]";
   }

   @Override
   public int hashCode() {
      return this.y.hashCode();
   }

   @Override
   public Optional<class03530<T>> i() {
      return Optional.empty();
   }

   @Override
   public Either<class03530<T>, List<class03556<T>>> u() {
      return Either.right(this.y);
   }

   @Override
   public boolean N(class03556<T> var1) {
      if (this.L == null) {
         this.L = Set.copyOf(this.y);
      }

      return this.L.contains(var1);
   }
}
