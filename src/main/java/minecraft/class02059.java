package minecraft;

import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

class class02059<T> extends class04113<T> {
   class02059(class02042 var1, class05946 var2, Lifecycle var3, Map var4) {
      super(var1);
      this.N = var2;
      this.y = var3;
      this.L = var4;
   }

   @Override
   public class05946<? extends class00751<? extends T>> i() {
      return this.N;
   }

   @Override
   public Stream<class03529<T>> z() {
      return this.L.values().stream();
   }

   @Override
   public Optional<class03529<T>> N(class05946<T> var1) {
      return Optional.ofNullable((class03529<T>)this.L.get(var1));
   }

   @Override
   public Lifecycle R() {
      return this.y;
   }
}
