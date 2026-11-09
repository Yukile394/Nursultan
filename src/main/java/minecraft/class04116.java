package minecraft;

import com.mojang.serialization.Lifecycle;

public interface class04116<T> {
   class03529<T> N(class05946<T> var1, T var2, Lifecycle var3);

   default class03529<T> N(class05946<T> var1, T var2) {
      return this.N(var1, (T)var2, Lifecycle.stable());
   }

   <S> class02055<S> N(class05946<? extends class00751<? extends S>> var1);
}
