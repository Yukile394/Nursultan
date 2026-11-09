package minecraft;

import java.util.Optional;

class class00188 implements class02042<Object>, class02055<Object> {
   private class03552<Object> L(class03530<Object> var1) {
      return this.N.u.computeIfAbsent(var1, var1x -> class03543.N(this, (class03530<Object>)var1x));
   }

   private class03529<Object> L(class05946<Object> var1) {
      return this.N.L.computeIfAbsent(var1, var1x -> class03529.N_40(this, (class05946<Object>)var1x));
   }

   class00188(class00191 var1) {
      super();
      this.N = var1;
   }

   @Override
   public class03552<Object> y(class03530<Object> var1) {
      return this.L(var1);
   }

   @Override
   public class03529<Object> y(class05946<Object> var1) {
      return this.L(var1);
   }

   public <T> class02042<T> y() {
      return this;
   }

   @Override
   public Optional<class03552<Object>> N(class03530<Object> var1) {
      return Optional.of(this.L(var1));
   }

   @Override
   public Optional<class03529<Object>> N(class05946<Object> var1) {
      return Optional.of(this.L(var1));
   }

   public <T> class02055<T> N() {
      return this;
   }
}
