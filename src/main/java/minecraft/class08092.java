package minecraft;

import com.google.common.base.MoreObjects;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public abstract class class08092<T extends Comparable<T>> {
   private final Class<T> N;
   private final String y;
   @Nullable
   private Integer L;
   private final Codec<T> u = Codec.STRING
      .comapFlatMap(
         var1x -> this.y(var1x)
            .<DataResult>map(DataResult::success)
            .orElseGet(() -> DataResult.error(() -> "Unable to read property: " + this + " with value: " + var1x)),
         this::y
      );
   private final Codec<class08084<T>> i = this.u.xmap(this::L, class08084::y);

   public class08084<T> L(T var1) {
      return new class08084<>(this, var1);
   }

   public Stream<class08084<T>> L() {
      return this.N().stream().map(this::L);
   }

   public Class<T> M() {
      return this.N;
   }

   public class08092(String var1, Class<T> var2) {
      super();
      this.N = var2;
      this.y = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof class08092 class08092) ? false : this.N.equals(class08092.N) && this.y.equals(class08092.y);
      }
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("name", this.y).add("clazz", this.N).add("values", this.N()).toString();
   }

   @Override
   public final int hashCode() {
      if (this.L == null) {
         this.L = this.y();
      }

      return this.L;
   }

   public Codec<class08084<T>> i() {
      return this.i;
   }

   public Codec<T> u() {
      return this.u;
   }

   public int y() {
      return 31 * this.N.hashCode() + this.y.hashCode();
   }

   public abstract Optional<T> y(String var1);

   public abstract String y(T var1);

   public class08084<T> N(class00522<?, ?> var1) {
      return new class08084<>(this, var1.L(this));
   }

   public abstract List<T> N();

   public abstract int N(T var1);

   public <U, S extends class00522<?, S>> DataResult<S> N(DynamicOps<U> var1, S var2, U var3) {
      return this.u.parse(var1, var3).map(var2x -> (class00522)var2.y(this, var2x)).setPartial(var2);
   }

   public String R() {
      return this.y;
   }
}
