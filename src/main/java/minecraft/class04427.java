package minecraft;

import com.mojang.datafixers.util.Either;
import java.util.Optional;

record class04427<T>(class03530<T> key) implements class04428<T> {
   public class03530<T> L() {
      return this.key;
   }

   class04427(class03530<T> key) {
      super();
      this.key = key;
   }

   @Override
   public String y() {
      return "#" + this.key.y();
   }

   public boolean test(class03556<T> var1) {
      return var1.N(this.key);
   }

   @Override
   public Either<class05946<T>, class03530<T>> N() {
      return Either.right(this.key);
   }

   @Override
   public <E> Optional<class04428<E>> N(class05946<? extends class00751<E>> var1) {
      return this.key.<T>i(var1).map(class04427::new);
   }
}
