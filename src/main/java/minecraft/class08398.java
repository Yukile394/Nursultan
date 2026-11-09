package minecraft;

import java.util.Map;
import java.util.function.BiFunction;
import org.jspecify.annotations.Nullable;

record class08398<K, U, V>(BiFunction<K, U, V> operation, Object[] keys, Object[] values) {
   @Nullable
   private V L(int var1) {
      return (V)this.values[var1];
   }

   public Object[] L() {
      return this.keys;
   }

   public class08398(BiFunction<K, U, V> var1, int var2) {
      this(var1, new Object[var2], new Object[var2]);
   }

   private class08398(BiFunction<K, U, V> operation, Object[] keys, Object[] values) {
      this.operation = operation;
      this.keys = keys;
      this.values = values;
   }

   public Object[] u() {
      return this.values;
   }

   @Nullable
   private U u(int var1) {
      return (U)this.values[var1];
   }

   public BiFunction<K, U, V> y() {
      return this.operation;
   }

   @Nullable
   private K y(int var1) {
      return (K)this.keys[var1];
   }

   public void N(int var1, K var2, U var3) {
      this.keys[var1] = var2;
      this.values[var1] = var3;
   }

   public void N(int var1, Map<K, V> var2) {
      Object object = this.L(var1);
      if (object != null) {
         Object object1 = this.y(var1);
         var2.put(object1, object);
      }
   }

   public int N() {
      return this.keys.length;
   }

   public void N(int var1) {
      this.values[var1] = this.operation.apply(this.y(var1), this.u(var1));
   }
}
