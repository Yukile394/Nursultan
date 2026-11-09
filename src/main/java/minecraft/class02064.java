package minecraft;

import com.mojang.serialization.Lifecycle;

class class02064<T> implements class04116<T> {
   class02064(class02036 var1) {
      super();
      this.N = var1;
   }

   @Override
   public class03529<T> N(class05946<T> var1, T var2, Lifecycle var3) {
      class02082<?> class02082 = this.N.B().put(var1, new class02082<>(var2, var3));
      if (class02082 != null) {
         this.N.Z().add(new IllegalStateException("Duplicate registration for " + var1 + ", new=" + var2 + ", old=" + class02082.N()));
      }

      return this.N.R().L(var1);
   }

   @Override
   public <S> class02055<S> N(class05946<? extends class00751<? extends S>> var1) {
      return (class02055<S>)this.N.M().getOrDefault(var1.N(), this.N.R());
   }
}
