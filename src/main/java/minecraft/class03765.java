package minecraft;

import com.mojang.datafixers.util.Either;
import java.util.Optional;

record class03765<T>(class03552<T> tag) implements class03782<T> {
   public class03552<T> L() {
      return this.tag;
   }

   class03765(class03552<T> tag) {
      this.tag = tag;
   }

   @Override
   public String y() {
      return "#" + this.tag.B().y();
   }

   public boolean test(class03556<T> var1) {
      return this.tag.N(var1);
   }

   @Override
   public Either<class03529<T>, class03552<T>> N() {
      return Either.right(this.tag);
   }

   @Override
   public <E> Optional<class03782<E>> N(class05946<? extends class00751<E>> var1) {
      return this.tag.B().u(var1) ? Optional.of((class03782<E>)this) : Optional.empty();
   }
}
