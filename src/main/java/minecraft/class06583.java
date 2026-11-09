package minecraft;

import com.mojang.serialization.Codec;

public interface class06583<T extends class06516> {
   void y(class03704 var1, class06588<T> var2);

   default class06915<T> N(T var1) {
      return new class06915<>(this, (T)var1);
   }

   Codec<T> N();

   void N(class03704 var1);

   void N(class03704 var1, class06588<T> var2);
}
