package Nursultan;

import com.google.common.base.Suppliers;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import minecraft.class02362;

public class class09701<B, T> implements class02362<B, T> {
   private final Supplier<class02362<B, T>> y;

   public class09701(UnaryOperator var1) {
      super();
      this.N = var1;
      this.y = Suppliers.memoize(() -> var1x.apply(this));
   }

   @Override
   public T decode(B var1) {
      return this.y.get().decode((B)var1);
   }

   @Override
   public void encode(B var1, T var2) {
      this.y.get().encode((B)var1, (T)var2);
   }
}
