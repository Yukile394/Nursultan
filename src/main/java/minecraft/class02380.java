package minecraft;

import java.util.Optional;

class class02380<B, V> implements class02362<B, Optional<V>> {
   class02380(class02362 var1) {
      super();
      this.N = var1;
   }

   public Optional<V> decode(B var1) {
      return var1.readBoolean() ? Optional.of(this.N.decode((B)var1)) : Optional.empty();
   }

   public void encode(B var1, Optional<V> var2) {
      if (var2.isPresent()) {
         var1.writeBoolean(true);
         this.N.encode((B)var1, (V)var2.get());
      } else {
         var1.writeBoolean(false);
      }
   }
}
