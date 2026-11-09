package minecraft;

import com.mojang.serialization.Codec;
import java.util.Map;

public interface class00619<Subject, Argument> {
   Map<class00609, class00619<Boolean, ?>> N = Map.of(
      class00609.field_63778,
      class00591.field_63788,
      class00609.field_63779,
      class00591.field_63789,
      class00609.field_63780,
      class00591.field_63790,
      class00609.field_63781,
      class00591.field_63791,
      class00609.field_63782,
      class00591.field_63792,
      class00609.field_63783,
      class00591.field_63793
   );
   Map<class00609, class00619<Float, ?>> y = Map.of(
      class00609.field_63772,
      class00585.i,
      class00609.field_63773,
      class00585.R,
      class00609.field_63774,
      class00585.M,
      class00609.field_63775,
      class00585.B,
      class00609.field_63776,
      class00585.Z,
      class00609.field_63777,
      class00585.z
   );
   Map<class00609, class00619<Integer, ?>> L = Map.of(
      class00609.field_63772,
      class00589.i,
      class00609.field_63773,
      class00589.R,
      class00609.field_63774,
      class00589.M,
      class00609.field_63775,
      class00589.B,
      class00609.field_64353,
      class00589.z
   );
   Map<class00609, class00619<Integer, ?>> u = Map.of(
      class00609.field_63772,
      class00589.i,
      class00609.field_63773,
      class00589.R,
      class00609.field_63774,
      class00589.M,
      class00609.field_63775,
      class00589.Z,
      class00609.field_64353,
      class00589.z
   );

   Subject apply(Subject var1, Argument var2);

   static <Value> class00619<Value, Value> N() {
      return class00598.i;
   }

   Codec<Argument> argumentCodec(class00607<Subject> var1);

   class00610<Argument> argumentKeyframeLerp(class00607<Subject> var1);
}
