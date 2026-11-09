package minecraft;

import com.mojang.serialization.DynamicOps;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class class00191 implements class02063 {
   final class01929 N;
   final class00188 y = new class00188(this);
   final Map<class05946<Object>, class03529<Object>> L = new HashMap<>();
   final Map<class03530<Object>, class03552<Object>> u = new HashMap<>();

   public class00191(class01929 var1) {
      super();
      this.N = var1;
   }

   public boolean y() {
      return !this.L.isEmpty() || !this.u.isEmpty();
   }

   public class00203 N() {
      return new class00216(this);
   }

   public <V> class03519<V> N(DynamicOps<V> var1) {
      return class03519.N(var1, new class00187(this));
   }

   @Override
   public <T> Optional<? extends class02055<T>> method_46759(class05946<? extends class00751<? extends T>> var1) {
      return Optional.of(this.y.N());
   }
}
