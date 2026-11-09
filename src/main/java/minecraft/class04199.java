package minecraft;

import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record class04199(class02129 type, class02108 properties) {
   public static final Codec<class04199> N = class02129.y.dispatchStable(class04199::N, class02129::L);

   public class04199(class02129 type, class02108 properties) {
      properties.y().forEach(var1x -> {
         if (!var1.N((class02117<?>)var1x)) {
            throw new IllegalArgumentException("Property '" + var1x.y() + "' not expected for event: '" + var1.N() + "'");
         }
      });
      this.type = type;
      this.properties = properties;
   }

   public class02108 y() {
      return this.properties;
   }

   public class02129 N() {
      return this.type;
   }

   public TelemetryEvent N(TelemetrySession var1) {
      return this.type.N(var1, this.properties);
   }
}
