package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;

record class02908<A, T>(Codec<A> codec, A value, DynamicOps<T> ops) {
   public A L() {
      return this.value;
   }

   class02908(Codec<A> codec, A value, DynamicOps<T> ops) {
      this.codec = codec;
      this.value = (A)value;
      this.ops = ops;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof class02908 class02908)
            ? false
            : this.codec == class02908.codec && this.value.equals(class02908.value) && this.ops.equals(class02908.ops);
      }
   }

   @Override
   public int hashCode() {
      int i = System.identityHashCode(this.codec);
      i = 31 * i + this.value.hashCode();
      return 31 * i + this.ops.hashCode();
   }

   public DynamicOps<T> u() {
      return this.ops;
   }

   public Codec<A> y() {
      return this.codec;
   }

   public DataResult<T> N() {
      return this.codec.encodeStart(this.ops, this.value);
   }
}
