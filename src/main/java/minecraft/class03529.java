package minecraft;

import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class class03529<T> implements class03556<T> {
   private final class02042<T> N;
   @Nullable
   private Set<class03530<T>> y;
   private final class03527 L;
   @Nullable
   private class05946<T> u;
   @Nullable
   private T i;

   @Override
   public Stream<class03530<T>> L() {
      return this.Z().stream();
   }

   protected class03529(class03527 var1, class02042<T> var2, @Nullable class05946<T> var3, @Nullable T var4) {
      super();
      this.N = var2;
      this.L = var1;
      this.u = var3;
      this.i = (T)var4;
   }

   @Override
   public String toString() {
      return "Reference{" + this.u + "=" + this.i + "}";
   }

   public class05946<T> B() {
      if (this.u == null) {
         throw new IllegalStateException("Trying to access unbound value '" + this.i + "' from registry " + this.N);
      } else {
         return this.u;
      }
   }

   private Set<class03530<T>> Z() {
      if (this.y == null) {
         throw new IllegalStateException("Tags not bound");
      } else {
         return this.y;
      }
   }

   @Override
   public Optional<class05946<T>> i() {
      return Optional.of(this.B());
   }

   @Override
   public Either<class05946<T>, T> u() {
      return Either.left(this.B());
   }

   @Override
   public boolean y() {
      return this.u != null && this.i != null;
   }

   public void y(T var1) {
      if (this.L == class03527.field_36455 && this.i != var1) {
         throw new IllegalStateException("Can't change holder " + this.u + " value: existing=" + this.i + ", new=" + var1);
      } else {
         this.i = (T)var1;
      }
   }

   void y(class05946<T> var1) {
      if (this.u != null && var1 != this.u) {
         throw new IllegalStateException("Can't change holder key: existing=" + this.u + ", new=" + var1);
      } else {
         this.u = var1;
      }
   }

   @Override
   public boolean N(Predicate<class05946<T>> var1) {
      return var1.test(this.B());
   }

   @Override
   public T N() {
      if (this.i == null) {
         throw new IllegalStateException("Trying to access unbound value '" + this.u + "' from registry " + this.N);
      } else {
         return this.i;
      }
   }

   public static <T> class03529<T> N_40(class02042<T> var0, class05946<T> var1) {
      return new class03529<>(class03527.field_36454, var0, var1, null);
   }

   void N(Collection<class03530<T>> var1) {
      this.y = Set.copyOf(var1);
   }

   @Override
   public boolean N(class05946<T> var1) {
      return this.B() == var1;
   }

   @Override
   public boolean N(class03530<T> var1) {
      return this.Z().contains(var1);
   }

   @Override
   public boolean N(class03556<T> var1) {
      return var1.N(this.B());
   }

   @Override
   public boolean N(class01894 var1) {
      return this.B().N().equals(var1);
   }

   @Override
   public boolean N(class02042<T> var1) {
      return this.N.N(var1);
   }

   @Deprecated
   public static <T> class03529<T> N(class02042<T> var0, @Nullable T var1) {
      return new class03529<>(class03527.field_36455, var0, null, (T)var1);
   }

   @Override
   public class03535 R() {
      return class03535.field_36446;
   }
}
