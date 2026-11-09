package minecraft;

import com.mojang.datafixers.util.Either;
import java.util.Optional;

record class03775<T>(class03529<T> value) implements class03782<T> {
   public class03529<T> L() {
      return this.value;
   }

   class03775(class03529<T> value) {
      this.value = value;
   }

   @Override
   public String y() {
      return this.value.B().N().toString();
   }

   public boolean test(class03556<T> var1) {
      return var1.equals(this.value);
   }

   @Override
   public Either<class03529<T>, class03552<T>> N() {
      return Either.left(this.value);
   }

   @Override
   public <E> Optional<class03782<E>> N(class05946<? extends class00751<E>> var1) {
      return this.value.B().L(var1) ? Optional.of((class03782<E>)this) : Optional.empty();
   }
}
