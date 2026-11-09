package minecraft;

import com.mojang.serialization.Codec;

public record class00598<Value>() implements class00619<Value, Value> {
   static final class00598<?> i = new class00598();

   public class00598() {
      super();
   }

   @Override
   public Value apply(Value var1, Value var2) {
      return (Value)var2;
   }

   @Override
   public Codec<Value> argumentCodec(class00607<Value> var1) {
      return var1.L();
   }

   @Override
   public class00610<Value> argumentKeyframeLerp(class00607<Value> var1) {
      return var1.N().u();
   }
}
