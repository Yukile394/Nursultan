package minecraft;

import Nursultan.class10082;
import com.mojang.serialization.Codec;

public record class02968<T>(String name, Codec<T> codec) {
   public class02968(String name, Codec<T> codec) {
      super();
      this.name = name;
      this.codec = codec;
   }

   public Codec<T> y() {
      return this.codec;
   }

   public String N() {
      return this.name;
   }

   public class10082<T> N(T var1) {
      return new class10082<>(this, (T)var1);
   }
}
