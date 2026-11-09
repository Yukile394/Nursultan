package minecraft;

import com.mojang.serialization.Lifecycle;
import java.util.Optional;
import java.util.stream.Stream;

public interface class01903<T> extends class01921<T> {
   @Override
   default class05946<? extends class00751<? extends T>> i() {
      return this.N().i();
   }

   @Override
   default Stream<class03529<T>> z() {
      return this.N().z();
   }

   @Override
   default Stream<class03552<T>> u() {
      return this.N().u();
   }

   @Override
   default Optional<class03552<T>> N(class03530<T> var1) {
      return this.N().N(var1);
   }

   class01921<T> N();

   @Override
   default Optional<class03529<T>> N(class05946<T> var1) {
      return this.N().N(var1);
   }

   @Override
   default Lifecycle R() {
      return this.N().R();
   }
}
